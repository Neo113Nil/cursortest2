package com.onesignal.inAppMessages.internal.display.impl;

import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.onesignal.common.AndroidUtils;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n implements q8.d {
    public static final String EVENT_TYPE_ACTION_TAKEN = "action_taken";
    public static final String EVENT_TYPE_KEY = "type";
    public static final String EVENT_TYPE_PAGE_CHANGE = "page_change";
    public static final String EVENT_TYPE_RENDERING_COMPLETE = "rendering_complete";
    public static final String EVENT_TYPE_RESIZE = "resize";
    public static final String GET_PAGE_META_DATA_JS_FUNCTION = "getPageMetaData()";
    public static final String IAM_DISPLAY_LOCATION_KEY = "displayLocation";
    public static final String IAM_DRAG_TO_DISMISS_DISABLED_KEY = "dragToDismissDisabled";
    public static final String IAM_PAGE_META_DATA_KEY = "pageMetaData";
    public static final String JS_OBJ_NAME = "OSAndroid";
    public static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
    public static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";
    public static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";
    private final q8.f _applicationService;
    private final n9.b _lifecycle;
    private final q9.a _promptFactory;
    private Activity activity;
    private boolean closing;
    private String currentActivityName;
    private boolean dismissFired;
    private Integer lastPageHeight;
    private final com.onesignal.inAppMessages.internal.a message;
    private final com.onesignal.inAppMessages.internal.d messageContent;
    private com.onesignal.inAppMessages.internal.display.impl.d messageView;
    private final gd.a messageViewMutex;
    private com.onesignal.inAppMessages.internal.display.impl.i webView;
    public static final a Companion = new a(null);
    private static final int MARGIN_PX_SIZE = com.onesignal.common.n.INSTANCE.dpToPx(24);

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public final class b {
        public b() {
        }

        private final c getDisplayLocation(JSONObject jSONObject) {
            c cVar = c.FULL_SCREEN;
            try {
                if (jSONObject.has(n.IAM_DISPLAY_LOCATION_KEY) && !pc.j.a(jSONObject.get(n.IAM_DISPLAY_LOCATION_KEY), "")) {
                    String optString = jSONObject.optString(n.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                    pc.j.d(optString, "jsonObject.optString(\n  …                        )");
                    Locale locale = Locale.getDefault();
                    pc.j.d(locale, "getDefault()");
                    String upperCase = optString.toUpperCase(locale);
                    pc.j.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    return c.valueOf(upperCase);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return cVar;
        }

        private final boolean getDragToDismissDisabled(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean(n.IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private final int getPageHeightData(JSONObject jSONObject) {
            try {
                n nVar = n.this;
                Activity activity = nVar.activity;
                JSONObject jSONObject2 = jSONObject.getJSONObject(n.IAM_PAGE_META_DATA_KEY);
                pc.j.d(jSONObject2, "jsonObject.getJSONObject(IAM_PAGE_META_DATA_KEY)");
                return nVar.pageRectToViewHeight(activity, jSONObject2);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            pc.j.d(jSONObject2, "body");
            String safeString = com.onesignal.common.f.safeString(jSONObject2, "id");
            n.this.closing = jSONObject2.getBoolean("close");
            if (n.this.message.isPreview()) {
                n.this._lifecycle.messageActionOccurredOnPreview(n.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, n.this._promptFactory));
            } else if (safeString != null) {
                n.this._lifecycle.messageActionOccurredOnMessage(n.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, n.this._promptFactory));
            }
            if (n.this.closing) {
                n.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jSONObject) {
            n.this._lifecycle.messagePageChanged(n.this.message, new com.onesignal.inAppMessages.internal.g(jSONObject));
        }

        private final void handleRenderComplete(JSONObject jSONObject) {
            c displayLocation = getDisplayLocation(jSONObject);
            int pageHeightData = displayLocation == c.FULL_SCREEN ? -1 : getPageHeightData(jSONObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jSONObject);
            n.this.messageContent.setDisplayLocation(displayLocation);
            n.this.messageContent.setPageHeight(pageHeightData);
            n.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void postMessage(String str) {
            com.onesignal.inAppMessages.internal.display.impl.d dVar;
            pc.j.e(str, "message");
            try {
                com.onesignal.debug.internal.logging.b.debug$default("OSJavaScriptInterface:postMessage: ".concat(str), null, 2, null);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(n.EVENT_TYPE_KEY);
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1484226720:
                            if (!string.equals(n.EVENT_TYPE_PAGE_CHANGE)) {
                                break;
                            } else {
                                handlePageChange(jSONObject);
                                break;
                            }
                        case -934437708:
                            string.equals(n.EVENT_TYPE_RESIZE);
                            break;
                        case 42998156:
                            if (string.equals(n.EVENT_TYPE_RENDERING_COMPLETE)) {
                                handleRenderComplete(jSONObject);
                                break;
                            }
                            break;
                        case 1851145598:
                            if (string.equals(n.EVENT_TYPE_ACTION_TAKEN) && (dVar = n.this.messageView) != null && !dVar.isDragging()) {
                                handleActionTaken(jSONObject);
                                break;
                            }
                            break;
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public enum c {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        public final boolean isBanner() {
            int i10 = o.$EnumSwitchMapping$0[ordinal()];
            return i10 == 1 || i10 == 2;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.j implements oc.c {
        int label;

        public d(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return n.this.new d(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((d) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                n nVar = n.this;
                this.label = 1;
                Object dismissAndAwaitNextMessage = nVar.dismissAndAwaitNextMessage(this);
                gc.a aVar = gc.a.f2559g;
                if (dismissAndAwaitNextMessage == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.calculateHeightAndShowWebViewAfterNewActivity(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends hc.j implements oc.c {
        final /* synthetic */ int $pagePxHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, fc.d dVar) {
            super(1, dVar);
            this.$pagePxHeight = i10;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return n.this.new f(this.$pagePxHeight, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((f) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                n nVar = n.this;
                Integer num = new Integer(this.$pagePxHeight);
                this.label = 1;
                Object showMessageView = nVar.showMessageView(num, this);
                gc.a aVar = gc.a.f2559g;
                if (showMessageView == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g implements com.onesignal.inAppMessages.internal.display.impl.e {
        final /* synthetic */ n $self;

        public g(n nVar) {
            this.$self = nVar;
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWasDismissed() {
            n.this._lifecycle.messageWasDismissed(n.this.message);
            n.this._applicationService.removeActivityLifecycleHandler(this.$self);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWasDisplayed() {
            n.this._lifecycle.messageWasDisplayed(n.this.message);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWillDismiss() {
            n.this._lifecycle.messageWillDismiss(n.this.message);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.dismissAndAwaitNextMessage(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class i extends hc.j implements oc.c {
        final /* synthetic */ String $lastActivityName;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, n nVar, fc.d dVar) {
            super(1, dVar);
            this.$lastActivityName = str;
            this.this$0 = nVar;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return new i(this.$lastActivityName, this.this$0, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((i) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        
            if (r5.showMessageView(null, r4) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        
            if (r5.showMessageView(r1, r4) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (r5.calculateHeightAndShowWebViewAfterNewActivity(r4) == r0) goto L28;
         */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                String str = this.$lastActivityName;
                gc.a aVar = gc.a.f2559g;
                if (str == null) {
                    n nVar = this.this$0;
                    this.label = 1;
                } else if (pc.j.a(str, this.this$0.currentActivityName)) {
                    n nVar2 = this.this$0;
                    this.label = 3;
                } else if (!this.this$0.closing) {
                    if (this.this$0.messageView != null) {
                        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.this$0.messageView;
                        pc.j.b(dVar);
                        dVar.removeAllViews();
                    }
                    n nVar3 = this.this$0;
                    Integer num = nVar3.lastPageHeight;
                    this.label = 2;
                }
            } else {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class j extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public j(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.setupWebView(null, null, false, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class k extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public k(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.showMessageView(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class l extends hc.j implements oc.e {
        int label;

        public l(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return n.this.new l(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            int[] cutoutAndStatusBarInsets = com.onesignal.common.n.INSTANCE.getCutoutAndStatusBarInsets(n.this.activity);
            String format = String.format(n.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{String.format(n.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{new Integer(cutoutAndStatusBarInsets[n.MARGIN_PX_SIZE]), new Integer(cutoutAndStatusBarInsets[1]), new Integer(cutoutAndStatusBarInsets[2]), new Integer(cutoutAndStatusBarInsets[3])}, 4))}, 1));
            com.onesignal.inAppMessages.internal.display.impl.i iVar = n.this.webView;
            pc.j.b(iVar);
            iVar.evaluateJavascript(format, null);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((l) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    public n(com.onesignal.inAppMessages.internal.a aVar, Activity activity, com.onesignal.inAppMessages.internal.d dVar, n9.b bVar, q8.f fVar, q9.a aVar2) {
        pc.j.e(aVar, "message");
        pc.j.e(activity, "activity");
        pc.j.e(dVar, "messageContent");
        pc.j.e(bVar, "_lifecycle");
        pc.j.e(fVar, "_applicationService");
        pc.j.e(aVar2, "_promptFactory");
        this.message = aVar;
        this.activity = activity;
        this.messageContent = dVar;
        this._lifecycle = bVar;
        this._applicationService = fVar;
        this._promptFactory = aVar2;
        this.messageViewMutex = new gd.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateHeightAndShowWebViewAfterNewActivity(fc.d dVar) {
        e eVar;
        int i10;
        final n nVar;
        n nVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.label = i11 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                i10 = eVar.label;
                ac.o oVar = ac.o.f277a;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar2 = this.messageView;
                    if (dVar2 != null) {
                        if (dVar2.getDisplayPosition() != c.FULL_SCREEN || this.messageContent.isFullBleed()) {
                            com.onesignal.debug.internal.logging.b.debug$default("In app message new activity, calculate height and show ", null, 2, null);
                            q8.f fVar = this._applicationService;
                            eVar.L$0 = this;
                            eVar.label = 2;
                            if (fVar.waitUntilActivityReady(eVar) != aVar) {
                                nVar = this;
                            }
                        } else {
                            eVar.label = 1;
                            if (showMessageView(null, eVar) == aVar) {
                            }
                        }
                        return aVar;
                    }
                    return oVar;
                }
                if (i10 == 1) {
                    v6.a.W(obj);
                    return oVar;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar2 = (n) eVar.L$0;
                    v6.a.W(obj);
                    nVar = nVar2;
                    com.onesignal.inAppMessages.internal.display.impl.i iVar = nVar.webView;
                    pc.j.b(iVar);
                    iVar.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.m
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj2) {
                            n.m11calculateHeightAndShowWebViewAfterNewActivity$lambda0(n.this, (String) obj2);
                        }
                    });
                    return oVar;
                }
                nVar = (n) eVar.L$0;
                v6.a.W(obj);
                nVar.setWebViewToMaxSize(nVar.activity);
                if (nVar.messageContent.isFullBleed()) {
                    eVar.L$0 = nVar;
                    eVar.label = 3;
                    if (nVar.updateSafeAreaInsets(eVar) != aVar) {
                        nVar2 = nVar;
                        nVar = nVar2;
                    }
                    return aVar;
                }
                com.onesignal.inAppMessages.internal.display.impl.i iVar2 = nVar.webView;
                pc.j.b(iVar2);
                iVar2.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.m
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        n.m11calculateHeightAndShowWebViewAfterNewActivity$lambda0(n.this, (String) obj2);
                    }
                });
                return oVar;
            }
        }
        eVar = new e(dVar);
        Object obj2 = eVar.result;
        i10 = eVar.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        nVar.setWebViewToMaxSize(nVar.activity);
        if (nVar.messageContent.isFullBleed()) {
        }
        com.onesignal.inAppMessages.internal.display.impl.i iVar22 = nVar.webView;
        pc.j.b(iVar22);
        iVar22.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.m
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj22) {
                n.m11calculateHeightAndShowWebViewAfterNewActivity$lambda0(n.this, (String) obj22);
            }
        });
        return oVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeightAndShowWebViewAfterNewActivity$lambda-0, reason: not valid java name */
    public static final void m11calculateHeightAndShowWebViewAfterNewActivity$lambda0(n nVar, String str) {
        pc.j.e(nVar, "this$0");
        try {
            com.onesignal.common.threading.b.suspendifyOnThread$default(MARGIN_PX_SIZE, nVar.new f(nVar.pageRectToViewHeight(nVar.activity, new JSONObject(str)), null), 1, null);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (com.onesignal.debug.internal.logging.b.atLogLevel(g9.c.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private final int getWebViewMaxSizeX(Activity activity) {
        if (this.messageContent.isFullBleed()) {
            return com.onesignal.common.n.INSTANCE.getFullbleedWindowWidth(activity);
        }
        return com.onesignal.common.n.INSTANCE.getWindowWidth(activity) - (MARGIN_PX_SIZE * 2);
    }

    private final int getWebViewMaxSizeY(Activity activity) {
        return com.onesignal.common.n.INSTANCE.getWindowHeight(activity) - (this.messageContent.isFullBleed() ? MARGIN_PX_SIZE : MARGIN_PX_SIZE * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity, JSONObject jSONObject) {
        try {
            int dpToPx = com.onesignal.common.n.INSTANCE.dpToPx(jSONObject.getJSONObject("rect").getInt("height"));
            com.onesignal.debug.internal.logging.b.debug$default("getPageHeightData:pxHeight: " + dpToPx, null, 2, null);
            int webViewMaxSizeY = getWebViewMaxSizeY(activity);
            if (dpToPx <= webViewMaxSizeY) {
                return dpToPx;
            }
            com.onesignal.debug.internal.logging.b.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, null, 2, null);
            return webViewMaxSizeY;
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.b.error("pageRectToViewHeight could not get page height", e10);
            return -1;
        }
    }

    private final void setMessageView(com.onesignal.inAppMessages.internal.display.impl.d dVar) {
        this.messageView = dVar;
    }

    private final void setWebViewToMaxSize(Activity activity) {
        com.onesignal.inAppMessages.internal.display.impl.i iVar = this.webView;
        pc.j.b(iVar);
        iVar.layout(MARGIN_PX_SIZE, MARGIN_PX_SIZE, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f3, code lost:
    
        if (r12.checkIfShouldDismiss(r1) == r9) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:29:0x0059, B:30:0x00ce, B:32:0x00d2, B:36:0x0088, B:38:0x008c, B:39:0x0097, B:41:0x00aa, B:43:0x00b4, B:45:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:29:0x0059, B:30:0x00ce, B:32:0x00d2, B:36:0x0088, B:38:0x008c, B:39:0x0097, B:41:0x00aa, B:43:0x00b4, B:45:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:29:0x0059, B:30:0x00ce, B:32:0x00d2, B:36:0x0088, B:38:0x008c, B:39:0x0097, B:41:0x00aa, B:43:0x00b4, B:45:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:29:0x0059, B:30:0x00ce, B:32:0x00d2, B:36:0x0088, B:38:0x008c, B:39:0x0097, B:41:0x00aa, B:43:0x00b4, B:45:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageView(Integer num, fc.d dVar) {
        k kVar;
        int i10;
        n nVar;
        Integer num2;
        gd.a aVar;
        n nVar2;
        com.onesignal.inAppMessages.internal.display.impl.d dVar2;
        com.onesignal.inAppMessages.internal.display.impl.d dVar3;
        try {
            if (dVar instanceof k) {
                kVar = (k) dVar;
                int i11 = kVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    kVar.label = i11 - Integer.MIN_VALUE;
                    Object obj = kVar.result;
                    i10 = kVar.label;
                    ac.o oVar = ac.o.f277a;
                    gc.a aVar2 = gc.a.f2559g;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        gd.a aVar3 = this.messageViewMutex;
                        kVar.L$0 = this;
                        kVar.L$1 = num;
                        kVar.L$2 = aVar3;
                        kVar.label = 1;
                        gd.d dVar4 = (gd.d) aVar3;
                        if (dVar4.c(kVar) != aVar2) {
                            nVar = this;
                            num2 = num;
                            aVar = dVar4;
                        }
                        return aVar2;
                    }
                    if (i10 != 1) {
                        if (i10 == 2) {
                            aVar = (gd.a) kVar.L$1;
                            nVar2 = (n) kVar.L$0;
                            v6.a.W(obj);
                            dVar2 = nVar2.messageView;
                            if (dVar2 != null) {
                                Activity activity = nVar2.activity;
                                kVar.L$0 = nVar2;
                                kVar.L$1 = aVar;
                                kVar.L$2 = null;
                                kVar.label = 3;
                                if (dVar2.showView(activity, kVar) == aVar2) {
                                    return aVar2;
                                }
                            }
                            dVar3 = nVar2.messageView;
                            if (dVar3 != null) {
                            }
                            ((gd.d) aVar).d(null);
                            return oVar;
                        }
                        if (i10 != 3) {
                            if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (gd.a) kVar.L$0;
                            v6.a.W(obj);
                            ((gd.d) aVar).d(null);
                            return oVar;
                        }
                        aVar = (gd.a) kVar.L$1;
                        nVar2 = (n) kVar.L$0;
                        v6.a.W(obj);
                        dVar3 = nVar2.messageView;
                        if (dVar3 != null) {
                            kVar.L$0 = aVar;
                            kVar.L$1 = null;
                            kVar.L$2 = null;
                            kVar.label = 4;
                        } else {
                            oVar = null;
                        }
                        ((gd.d) aVar).d(null);
                        return oVar;
                    }
                    aVar = (gd.a) kVar.L$2;
                    num2 = (Integer) kVar.L$1;
                    nVar = (n) kVar.L$0;
                    v6.a.W(obj);
                    if (nVar.messageView != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("No messageView found to update a with a new height.", null, 2, null);
                        ((gd.d) aVar).d(null);
                        return oVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("In app message, showing first one with height: " + num2, null, 2, null);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar5 = nVar.messageView;
                    if (dVar5 != null) {
                        com.onesignal.inAppMessages.internal.display.impl.i iVar = nVar.webView;
                        pc.j.b(iVar);
                        dVar5.setWebView(iVar);
                    }
                    if (num2 != null) {
                        nVar.lastPageHeight = num2;
                        com.onesignal.inAppMessages.internal.display.impl.d dVar6 = nVar.messageView;
                        if (dVar6 != null) {
                            int intValue = num2.intValue();
                            kVar.L$0 = nVar;
                            kVar.L$1 = aVar;
                            kVar.L$2 = null;
                            kVar.label = 2;
                            if (dVar6.updateHeight(intValue, kVar) == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                    nVar2 = nVar;
                    dVar2 = nVar2.messageView;
                    if (dVar2 != null) {
                    }
                    dVar3 = nVar2.messageView;
                    if (dVar3 != null) {
                    }
                    ((gd.d) aVar).d(null);
                    return oVar;
                }
            }
            if (i10 != 0) {
            }
            if (nVar.messageView != null) {
            }
        } catch (Throwable th) {
            ((gd.d) num).d(null);
            throw th;
        }
        kVar = new k(dVar);
        Object obj2 = kVar.result;
        i10 = kVar.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar22 = gc.a.f2559g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(fc.d dVar) {
        fd.e eVar = i0.f8859a;
        Object A = a0.A(dd.o.f1880a, new l(null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        com.onesignal.common.threading.b.suspendifyOnThread$default(MARGIN_PX_SIZE, new d(null), 1, null);
    }

    public final void createNewInAppMessageView(boolean z10) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        com.onesignal.inAppMessages.internal.display.impl.i iVar = this.webView;
        pc.j.b(iVar);
        setMessageView(new com.onesignal.inAppMessages.internal.display.impl.d(iVar, this.messageContent, z10, manifestMetaBoolean));
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        pc.j.b(dVar);
        dVar.setMessageController(new g(this));
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismissAndAwaitNextMessage(fc.d dVar) {
        h hVar;
        int i10;
        n nVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i11 = hVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.label = i11 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                i10 = hVar.label;
                ac.o oVar = ac.o.f277a;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar2 = this.messageView;
                    if (dVar2 != null && !this.dismissFired) {
                        this.dismissFired = true;
                        this._lifecycle.messageWillDismiss(this.message);
                        hVar.L$0 = this;
                        hVar.label = 1;
                        Object dismissAndAwaitNextMessage = dVar2.dismissAndAwaitNextMessage(hVar);
                        gc.a aVar = gc.a.f2559g;
                        if (dismissAndAwaitNextMessage == aVar) {
                            return aVar;
                        }
                        nVar = this;
                    }
                    return oVar;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = (n) hVar.L$0;
                v6.a.W(obj);
                nVar.dismissFired = false;
                nVar.setMessageView(null);
                return oVar;
            }
        }
        hVar = new h(dVar);
        Object obj2 = hVar.result;
        i10 = hVar.label;
        ac.o oVar2 = ac.o.f277a;
        if (i10 != 0) {
        }
        nVar.dismissFired = false;
        nVar.setMessageView(null);
        return oVar2;
    }

    @Override // q8.d
    public void onActivityAvailable(Activity activity) {
        pc.j.e(activity, "activity");
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        com.onesignal.debug.internal.logging.b.debug$default("In app message activity available currentActivityName: " + this.currentActivityName + " lastActivityName: " + str, null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnMain(new i(str, this, null));
    }

    @Override // q8.d
    public void onActivityStopped(Activity activity) {
        pc.j.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default(xc.c.m("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !pc.j.a(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        pc.j.b(dVar);
        dVar.removeAllViews();
    }

    public final void setContentSafeAreaInsets(com.onesignal.inAppMessages.internal.d dVar, Activity activity) {
        pc.j.e(dVar, "content");
        pc.j.e(activity, "activity");
        String contentHtml = dVar.getContentHtml();
        int[] cutoutAndStatusBarInsets = com.onesignal.common.n.INSTANCE.getCutoutAndStatusBarInsets(activity);
        dVar.setContentHtml(contentHtml + String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[MARGIN_PX_SIZE]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4))}, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupWebView(Activity activity, String str, boolean z10, fc.d dVar) {
        j jVar;
        int i10;
        n nVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i11 = jVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.label = i11 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                i10 = jVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    enableWebViewRemoteDebugging();
                    com.onesignal.inAppMessages.internal.display.impl.i iVar = new com.onesignal.inAppMessages.internal.display.impl.i(activity);
                    this.webView = iVar;
                    iVar.setOverScrollMode(2);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar2 = this.webView;
                    pc.j.b(iVar2);
                    iVar2.setVerticalScrollBarEnabled(false);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar3 = this.webView;
                    pc.j.b(iVar3);
                    iVar3.setHorizontalScrollBarEnabled(false);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar4 = this.webView;
                    pc.j.b(iVar4);
                    iVar4.getSettings().setJavaScriptEnabled(true);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar5 = this.webView;
                    pc.j.b(iVar5);
                    iVar5.addJavascriptInterface(new b(), JS_OBJ_NAME);
                    if (z10) {
                        com.onesignal.inAppMessages.internal.display.impl.i iVar6 = this.webView;
                        pc.j.b(iVar6);
                        iVar6.setSystemUiVisibility(3074);
                        if (Build.VERSION.SDK_INT >= 30) {
                            com.onesignal.inAppMessages.internal.display.impl.i iVar7 = this.webView;
                            pc.j.b(iVar7);
                            iVar7.setFitsSystemWindows(false);
                        }
                    }
                    this._lifecycle.messageWillDisplay(this.message);
                    q8.f fVar = this._applicationService;
                    jVar.L$0 = this;
                    jVar.L$1 = activity;
                    jVar.L$2 = str;
                    jVar.label = 1;
                    Object waitUntilActivityReady = fVar.waitUntilActivityReady(jVar);
                    gc.a aVar = gc.a.f2559g;
                    if (waitUntilActivityReady == aVar) {
                        return aVar;
                    }
                    nVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) jVar.L$2;
                    activity = (Activity) jVar.L$1;
                    nVar = (n) jVar.L$0;
                    v6.a.W(obj);
                }
                nVar.setWebViewToMaxSize(activity);
                com.onesignal.inAppMessages.internal.display.impl.i iVar8 = nVar.webView;
                pc.j.b(iVar8);
                iVar8.loadData(str, "text/html; charset=utf-8", "base64");
                return ac.o.f277a;
            }
        }
        jVar = new j(dVar);
        Object obj2 = jVar.result;
        i10 = jVar.label;
        if (i10 != 0) {
        }
        nVar.setWebViewToMaxSize(activity);
        com.onesignal.inAppMessages.internal.display.impl.i iVar82 = nVar.webView;
        pc.j.b(iVar82);
        iVar82.loadData(str, "text/html; charset=utf-8", "base64");
        return ac.o.f277a;
    }
}
