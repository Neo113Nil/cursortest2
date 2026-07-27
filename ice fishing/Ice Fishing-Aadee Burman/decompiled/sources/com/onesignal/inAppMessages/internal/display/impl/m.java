package com.onesignal.inAppMessages.internal.display.impl;

import D.y;
import I7.p;
import Q7.q;
import S7.AbstractC0406y;
import S7.F;
import S7.InterfaceC0404w;
import X7.o;
import a8.InterfaceC0447a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.onesignal.common.AndroidUtils;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class m implements x4.d {
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
    private static final int LOG_BODY_SNIPPET_MAX_CHARS = 200;
    public static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
    public static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";
    public static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";
    private final x4.f _applicationService;
    private final T4.b _lifecycle;
    private final W4.a _promptFactory;
    private Activity activity;
    private boolean closing;
    private String currentActivityName;
    private boolean dismissFired;
    private Integer lastPageHeight;
    private final com.onesignal.inAppMessages.internal.a message;
    private final com.onesignal.inAppMessages.internal.d messageContent;
    private com.onesignal.inAppMessages.internal.display.impl.d messageView;
    private final InterfaceC0447a messageViewMutex;
    private com.onesignal.inAppMessages.internal.display.impl.i webView;
    public static final a Companion = new a(null);
    private static final int MARGIN_PX_SIZE = com.onesignal.common.m.INSTANCE.dpToPx(24);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public final class b {
        public b() {
        }

        private final c getDisplayLocation(JSONObject jSONObject) {
            c cVar = c.FULL_SCREEN;
            try {
                if (jSONObject.has(m.IAM_DISPLAY_LOCATION_KEY) && !kotlin.jvm.internal.h.a(jSONObject.get(m.IAM_DISPLAY_LOCATION_KEY), "")) {
                    String optString = jSONObject.optString(m.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                    kotlin.jvm.internal.h.d(optString, "optString(...)");
                    Locale locale = Locale.getDefault();
                    kotlin.jvm.internal.h.d(locale, "getDefault(...)");
                    String upperCase = optString.toUpperCase(locale);
                    kotlin.jvm.internal.h.d(upperCase, "toUpperCase(...)");
                    return c.valueOf(upperCase);
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            return cVar;
        }

        private final boolean getDragToDismissDisabled(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean(m.IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private final int getPageHeightData(JSONObject jSONObject) {
            try {
                m mVar = m.this;
                Activity activity = mVar.activity;
                JSONObject jSONObject2 = jSONObject.getJSONObject(m.IAM_PAGE_META_DATA_KEY);
                kotlin.jvm.internal.h.d(jSONObject2, "getJSONObject(...)");
                return mVar.pageRectToViewHeight(activity, jSONObject2);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            kotlin.jvm.internal.h.b(jSONObject2);
            String safeString = com.onesignal.common.e.safeString(jSONObject2, "id");
            m.this.closing = jSONObject2.getBoolean(com.anythink.expressad.foundation.d.d.cs);
            if (m.this.message.isPreview()) {
                m.this._lifecycle.messageActionOccurredOnPreview(m.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, m.this._promptFactory));
            } else if (safeString != null) {
                m.this._lifecycle.messageActionOccurredOnMessage(m.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, m.this._promptFactory));
            }
            if (m.this.closing) {
                m.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jSONObject) {
            m.this._lifecycle.messagePageChanged(m.this.message, new com.onesignal.inAppMessages.internal.g(jSONObject));
        }

        private final void handleRenderComplete(JSONObject jSONObject) {
            c displayLocation = getDisplayLocation(jSONObject);
            int pageHeightData = displayLocation == c.FULL_SCREEN ? -1 : getPageHeightData(jSONObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jSONObject);
            m.this.messageContent.setDisplayLocation(displayLocation);
            m.this.messageContent.setPageHeight(pageHeightData);
            m.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void postMessage(String message) {
            com.onesignal.inAppMessages.internal.display.impl.d dVar;
            kotlin.jvm.internal.h.e(message, "message");
            try {
                com.onesignal.debug.internal.logging.b.debug$default("OSJavaScriptInterface:postMessage: ".concat(message), null, 2, null);
                JSONObject jSONObject = new JSONObject(message);
                String string = jSONObject.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1484226720:
                            if (!string.equals(m.EVENT_TYPE_PAGE_CHANGE)) {
                                break;
                            } else {
                                handlePageChange(jSONObject);
                                break;
                            }
                        case -934437708:
                            string.equals(m.EVENT_TYPE_RESIZE);
                            break;
                        case 42998156:
                            if (string.equals(m.EVENT_TYPE_RENDERING_COMPLETE)) {
                                handleRenderComplete(jSONObject);
                                break;
                            }
                            break;
                        case 1851145598:
                            if (string.equals(m.EVENT_TYPE_ACTION_TAKEN) && (dVar = m.this.messageView) != null && !dVar.isDragging()) {
                                handleActionTaken(jSONObject);
                                break;
                            }
                            break;
                    }
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ C7.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c TOP_BANNER = new c("TOP_BANNER", 0);
        public static final c BOTTOM_BANNER = new c("BOTTOM_BANNER", 1);
        public static final c CENTER_MODAL = new c("CENTER_MODAL", 2);
        public static final c FULL_SCREEN = new c("FULL_SCREEN", 3);

        private static final /* synthetic */ c[] $values() {
            return new c[]{TOP_BANNER, BOTTOM_BANNER, CENTER_MODAL, FULL_SCREEN};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = com.bumptech.glide.e.b($values);
        }

        private c(String str, int i) {
        }

        public static C7.a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final boolean isBanner() {
            int i = n.$EnumSwitchMapping$0[ordinal()];
            return i == 1 || i == 2;
        }
    }

    public static final class d extends B7.h implements I7.l {
        int label;

        public d(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return m.this.new d(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                m mVar = m.this;
                this.label = 1;
                if (mVar.dismissAndAwaitNextMessage(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((d) create(interfaceC5267d)).invokeSuspend(v.f41350a);
        }
    }

    public static final class e extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.calculateHeightAndShowWebViewAfterNewActivity(this);
        }
    }

    public static final class f extends B7.h implements I7.l {
        final /* synthetic */ int $pagePxHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$pagePxHeight = i;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return m.this.new f(this.$pagePxHeight, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                m mVar = m.this;
                Integer num = new Integer(this.$pagePxHeight);
                this.label = 1;
                if (mVar.showMessageView(num, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((f) create(interfaceC5267d)).invokeSuspend(v.f41350a);
        }
    }

    public static final class g implements com.onesignal.inAppMessages.internal.display.impl.e {
        final /* synthetic */ m $self;

        public g(m mVar) {
            this.$self = mVar;
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWasDismissed() {
            m.this._lifecycle.messageWasDismissed(m.this.message);
            m.this._applicationService.removeActivityLifecycleHandler(this.$self);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWasDisplayed() {
            m.this._lifecycle.messageWasDisplayed(m.this.message);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWillDismiss() {
            m.this._lifecycle.messageWillDismiss(m.this.message);
        }
    }

    public static final class h extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.dismissAndAwaitNextMessage(this);
        }
    }

    public static final class i extends B7.h implements I7.l {
        final /* synthetic */ String $lastActivityName;
        int label;
        final /* synthetic */ m this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, m mVar, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$lastActivityName = str;
            this.this$0 = mVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return new i(this.$lastActivityName, this.this$0, interfaceC5267d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        
            if (r6.showMessageView(null, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        
            if (r6.showMessageView(r1, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (r6.calculateHeightAndShowWebViewAfterNewActivity(r5) == r0) goto L28;
         */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                String str = this.$lastActivityName;
                if (str == null) {
                    m mVar = this.this$0;
                    this.label = 1;
                } else if (kotlin.jvm.internal.h.a(str, this.this$0.currentActivityName)) {
                    m mVar2 = this.this$0;
                    this.label = 3;
                } else if (!this.this$0.closing) {
                    if (this.this$0.messageView != null) {
                        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.this$0.messageView;
                        kotlin.jvm.internal.h.b(dVar);
                        dVar.removeAllViews();
                    }
                    m mVar3 = this.this$0;
                    Integer num = mVar3.lastPageHeight;
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((i) create(interfaceC5267d)).invokeSuspend(v.f41350a);
        }
    }

    public static final class j extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.setupWebView(null, null, false, this);
        }
    }

    public static final class k extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public k(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.showMessageView(null, this);
        }
    }

    public static final class l extends B7.h implements p {
        int label;

        public l(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return m.this.new l(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((l) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            int[] cutoutAndStatusBarInsets = com.onesignal.common.m.INSTANCE.getCutoutAndStatusBarInsets(m.this.activity);
            String format = String.format(m.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{String.format(m.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{new Integer(cutoutAndStatusBarInsets[0]), new Integer(cutoutAndStatusBarInsets[1]), new Integer(cutoutAndStatusBarInsets[2]), new Integer(cutoutAndStatusBarInsets[3])}, 4))}, 1));
            com.onesignal.inAppMessages.internal.display.impl.i iVar = m.this.webView;
            kotlin.jvm.internal.h.b(iVar);
            iVar.evaluateJavascript(format, null);
            return v.f41350a;
        }
    }

    public m(com.onesignal.inAppMessages.internal.a message, Activity activity, com.onesignal.inAppMessages.internal.d messageContent, T4.b _lifecycle, x4.f _applicationService, W4.a _promptFactory) {
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(activity, "activity");
        kotlin.jvm.internal.h.e(messageContent, "messageContent");
        kotlin.jvm.internal.h.e(_lifecycle, "_lifecycle");
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_promptFactory, "_promptFactory");
        this.message = message;
        this.activity = activity;
        this.messageContent = messageContent;
        this._lifecycle = _lifecycle;
        this._applicationService = _applicationService;
        this._promptFactory = _promptFactory;
        this.messageViewMutex = new a8.d();
    }

    private final String bodySnippet(String str) {
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String O8 = q.O(q.O(str, '\n', ' '), '\r', ' ');
        return O8.length() <= 200 ? O8 : Q7.j.o0(200, O8).concat("…");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateHeightAndShowWebViewAfterNewActivity(InterfaceC5267d interfaceC5267d) {
        e eVar;
        int i6;
        final m mVar;
        m mVar2;
        if (interfaceC5267d instanceof e) {
            eVar = (e) interfaceC5267d;
            int i9 = eVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                eVar.label = i9 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = eVar.label;
                v vVar = v.f41350a;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
                    if (dVar != null) {
                        if (dVar.getDisplayPosition() != c.FULL_SCREEN || this.messageContent.isFullBleed()) {
                            com.onesignal.debug.internal.logging.b.debug$default("In app message new activity, calculate height and show ", null, 2, null);
                            x4.f fVar = this._applicationService;
                            eVar.L$0 = this;
                            eVar.label = 2;
                            if (fVar.waitUntilActivityReady(eVar) != aVar) {
                                mVar = this;
                            }
                        } else {
                            eVar.label = 1;
                            if (showMessageView(null, eVar) == aVar) {
                            }
                        }
                        return aVar;
                    }
                    return vVar;
                }
                if (i6 == 1) {
                    com.bumptech.glide.d.k(obj);
                    return vVar;
                }
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar2 = (m) eVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    mVar = mVar2;
                    com.onesignal.inAppMessages.internal.display.impl.i iVar = mVar.webView;
                    kotlin.jvm.internal.h.b(iVar);
                    iVar.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.l
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj2) {
                            m.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(m.this, (String) obj2);
                        }
                    });
                    return vVar;
                }
                mVar = (m) eVar.L$0;
                com.bumptech.glide.d.k(obj);
                mVar.setWebViewToMaxSize(mVar.activity);
                if (mVar.messageContent.isFullBleed()) {
                    eVar.L$0 = mVar;
                    eVar.label = 3;
                    if (mVar.updateSafeAreaInsets(eVar) != aVar) {
                        mVar2 = mVar;
                        mVar = mVar2;
                    }
                    return aVar;
                }
                com.onesignal.inAppMessages.internal.display.impl.i iVar2 = mVar.webView;
                kotlin.jvm.internal.h.b(iVar2);
                iVar2.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.l
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        m.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(m.this, (String) obj2);
                    }
                });
                return vVar;
            }
        }
        eVar = new e(interfaceC5267d);
        Object obj2 = eVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = eVar.label;
        v vVar2 = v.f41350a;
        if (i6 != 0) {
        }
        mVar.setWebViewToMaxSize(mVar.activity);
        if (mVar.messageContent.isFullBleed()) {
        }
        com.onesignal.inAppMessages.internal.display.impl.i iVar22 = mVar.webView;
        kotlin.jvm.internal.h.b(iVar22);
        iVar22.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.l
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj22) {
                m.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(m.this, (String) obj22);
            }
        });
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateHeightAndShowWebViewAfterNewActivity$lambda$0(m this$0, String str) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        if (str == null || Q7.j.c0(str) || str.equals("null")) {
            com.onesignal.debug.internal.logging.b.warn$default("calculateHeightAndShowWebViewAfterNewActivity: empty/null page metadata from WebView; skipping height update", null, 2, null);
            return;
        }
        try {
            com.onesignal.common.threading.c.suspendifyOnIO(this$0.new f(this$0.pageRectToViewHeight(this$0.activity, new JSONObject(str)), null));
        } catch (JSONException e9) {
            com.onesignal.debug.internal.logging.b.warn("calculateHeightAndShowWebViewAfterNewActivity: could not parse page metadata; snippet=" + this$0.bodySnippet(str), e9);
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (com.onesignal.debug.internal.logging.b.atLogLevel(M4.c.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private final int getWebViewMaxSizeX(Activity activity) {
        if (this.messageContent.isFullBleed()) {
            return com.onesignal.common.m.INSTANCE.getFullbleedWindowWidth(activity);
        }
        return com.onesignal.common.m.INSTANCE.getWindowWidth(activity) - (MARGIN_PX_SIZE * 2);
    }

    private final int getWebViewMaxSizeY(Activity activity) {
        return com.onesignal.common.m.INSTANCE.getWindowHeight(activity) - (this.messageContent.isFullBleed() ? 0 : MARGIN_PX_SIZE * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("rect");
        int optInt = optJSONObject != null ? optJSONObject.optInt("height", -1) : -1;
        if (optInt < 0) {
            com.onesignal.debug.internal.logging.b.warn$default("pageRectToViewHeight could not get page height (missing/invalid 'rect.height'); snippet=" + bodySnippet(jSONObject.toString()), null, 2, null);
            return -1;
        }
        int dpToPx = com.onesignal.common.m.INSTANCE.dpToPx(optInt);
        com.onesignal.debug.internal.logging.b.debug$default("getPageHeightData:pxHeight: " + dpToPx, null, 2, null);
        int webViewMaxSizeY = getWebViewMaxSizeY(activity);
        if (dpToPx <= webViewMaxSizeY) {
            return dpToPx;
        }
        com.onesignal.debug.internal.logging.b.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, null, 2, null);
        return webViewMaxSizeY;
    }

    private final void setMessageView(com.onesignal.inAppMessages.internal.display.impl.d dVar) {
        this.messageView = dVar;
    }

    private final void setWebViewToMaxSize(Activity activity) {
        com.onesignal.inAppMessages.internal.display.impl.i iVar = this.webView;
        kotlin.jvm.internal.h.b(iVar);
        iVar.layout(0, 0, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f3, code lost:
    
        if (r12.checkIfShouldDismiss(r1) == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:28:0x0059, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:38:0x0097, B:40:0x00aa, B:42:0x00b4, B:44:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:28:0x0059, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:38:0x0097, B:40:0x00aa, B:42:0x00b4, B:44:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:28:0x0059, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:38:0x0097, B:40:0x00aa, B:42:0x00b4, B:44:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:28:0x0059, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:38:0x0097, B:40:0x00aa, B:42:0x00b4, B:44:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageView(Integer num, InterfaceC5267d interfaceC5267d) {
        k kVar;
        int i6;
        m mVar;
        Integer num2;
        InterfaceC0447a interfaceC0447a;
        m mVar2;
        com.onesignal.inAppMessages.internal.display.impl.d dVar;
        com.onesignal.inAppMessages.internal.display.impl.d dVar2;
        try {
            if (interfaceC5267d instanceof k) {
                kVar = (k) interfaceC5267d;
                int i9 = kVar.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    kVar.label = i9 - Integer.MIN_VALUE;
                    Object obj = kVar.result;
                    A7.a aVar = A7.a.f58n;
                    i6 = kVar.label;
                    v vVar = v.f41350a;
                    if (i6 != 0) {
                        com.bumptech.glide.d.k(obj);
                        InterfaceC0447a interfaceC0447a2 = this.messageViewMutex;
                        kVar.L$0 = this;
                        kVar.L$1 = num;
                        kVar.L$2 = interfaceC0447a2;
                        kVar.label = 1;
                        a8.d dVar3 = (a8.d) interfaceC0447a2;
                        if (dVar3.c(kVar) != aVar) {
                            mVar = this;
                            num2 = num;
                            interfaceC0447a = dVar3;
                        }
                        return aVar;
                    }
                    if (i6 != 1) {
                        if (i6 == 2) {
                            interfaceC0447a = (InterfaceC0447a) kVar.L$1;
                            mVar2 = (m) kVar.L$0;
                            com.bumptech.glide.d.k(obj);
                            dVar = mVar2.messageView;
                            if (dVar != null) {
                                Activity activity = mVar2.activity;
                                kVar.L$0 = mVar2;
                                kVar.L$1 = interfaceC0447a;
                                kVar.L$2 = null;
                                kVar.label = 3;
                                if (dVar.showView(activity, kVar) == aVar) {
                                    return aVar;
                                }
                            }
                            dVar2 = mVar2.messageView;
                            if (dVar2 != null) {
                            }
                            ((a8.d) interfaceC0447a).d(null);
                            return vVar;
                        }
                        if (i6 != 3) {
                            if (i6 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0447a = (InterfaceC0447a) kVar.L$0;
                            com.bumptech.glide.d.k(obj);
                            ((a8.d) interfaceC0447a).d(null);
                            return vVar;
                        }
                        interfaceC0447a = (InterfaceC0447a) kVar.L$1;
                        mVar2 = (m) kVar.L$0;
                        com.bumptech.glide.d.k(obj);
                        dVar2 = mVar2.messageView;
                        if (dVar2 != null) {
                            kVar.L$0 = interfaceC0447a;
                            kVar.L$1 = null;
                            kVar.L$2 = null;
                            kVar.label = 4;
                        }
                        ((a8.d) interfaceC0447a).d(null);
                        return vVar;
                    }
                    interfaceC0447a = (InterfaceC0447a) kVar.L$2;
                    num2 = (Integer) kVar.L$1;
                    mVar = (m) kVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    if (mVar.messageView != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("No messageView found to update a with a new height.", null, 2, null);
                        ((a8.d) interfaceC0447a).d(null);
                        return vVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("In app message, showing first one with height: " + num2, null, 2, null);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar4 = mVar.messageView;
                    if (dVar4 != null) {
                        com.onesignal.inAppMessages.internal.display.impl.i iVar = mVar.webView;
                        kotlin.jvm.internal.h.b(iVar);
                        dVar4.setWebView(iVar);
                    }
                    if (num2 != null) {
                        mVar.lastPageHeight = num2;
                        com.onesignal.inAppMessages.internal.display.impl.d dVar5 = mVar.messageView;
                        if (dVar5 != null) {
                            int intValue = num2.intValue();
                            kVar.L$0 = mVar;
                            kVar.L$1 = interfaceC0447a;
                            kVar.L$2 = null;
                            kVar.label = 2;
                            if (dVar5.updateHeight(intValue, kVar) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    mVar2 = mVar;
                    dVar = mVar2.messageView;
                    if (dVar != null) {
                    }
                    dVar2 = mVar2.messageView;
                    if (dVar2 != null) {
                    }
                    ((a8.d) interfaceC0447a).d(null);
                    return vVar;
                }
            }
            if (i6 != 0) {
            }
            if (mVar.messageView != null) {
            }
        } catch (Throwable th) {
            ((a8.d) num).d(null);
            throw th;
        }
        kVar = new k(interfaceC5267d);
        Object obj2 = kVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = kVar.label;
        v vVar2 = v.f41350a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(InterfaceC5267d interfaceC5267d) {
        Z7.e eVar = F.f2915a;
        Object y7 = AbstractC0406y.y(o.f3856a, new l(null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : v.f41350a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        com.onesignal.common.threading.c.suspendifyOnDefault(new d(null));
    }

    public final void createNewInAppMessageView(boolean z3) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        com.onesignal.inAppMessages.internal.display.impl.i iVar = this.webView;
        kotlin.jvm.internal.h.b(iVar);
        setMessageView(new com.onesignal.inAppMessages.internal.display.impl.d(iVar, this.messageContent, z3, manifestMetaBoolean));
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        kotlin.jvm.internal.h.b(dVar);
        dVar.setMessageController(new g(this));
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismissAndAwaitNextMessage(InterfaceC5267d interfaceC5267d) {
        h hVar;
        int i6;
        m mVar;
        if (interfaceC5267d instanceof h) {
            hVar = (h) interfaceC5267d;
            int i9 = hVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                hVar.label = i9 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = hVar.label;
                v vVar = v.f41350a;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
                    if (dVar != null && !this.dismissFired) {
                        this.dismissFired = true;
                        this._lifecycle.messageWillDismiss(this.message);
                        hVar.L$0 = this;
                        hVar.label = 1;
                        if (dVar.dismissAndAwaitNextMessage(hVar) == aVar) {
                            return aVar;
                        }
                        mVar = this;
                    }
                    return vVar;
                }
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (m) hVar.L$0;
                com.bumptech.glide.d.k(obj);
                mVar.dismissFired = false;
                mVar.setMessageView(null);
                return vVar;
            }
        }
        hVar = new h(interfaceC5267d);
        Object obj2 = hVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = hVar.label;
        v vVar2 = v.f41350a;
        if (i6 != 0) {
        }
        mVar.dismissFired = false;
        mVar.setMessageView(null);
        return vVar2;
    }

    @Override // x4.d
    public void onActivityAvailable(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        com.onesignal.debug.internal.logging.b.debug$default(y.s(new StringBuilder("In app message activity available currentActivityName: "), this.currentActivityName, " lastActivityName: ", str), null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnMain(new i(str, this, null));
    }

    @Override // x4.d
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default(Q7.k.H("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !kotlin.jvm.internal.h.a(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        kotlin.jvm.internal.h.b(dVar);
        dVar.removeAllViews();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void secureSetup(WebView webView) {
        kotlin.jvm.internal.h.e(webView, "webView");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
    }

    public final void setContentSafeAreaInsets(com.onesignal.inAppMessages.internal.d content, Activity activity) {
        kotlin.jvm.internal.h.e(content, "content");
        kotlin.jvm.internal.h.e(activity, "activity");
        String contentHtml = content.getContentHtml();
        int[] cutoutAndStatusBarInsets = com.onesignal.common.m.INSTANCE.getCutoutAndStatusBarInsets(activity);
        content.setContentHtml(contentHtml + String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4))}, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupWebView(Activity activity, String str, boolean z3, InterfaceC5267d interfaceC5267d) {
        j jVar;
        int i6;
        m mVar;
        if (interfaceC5267d instanceof j) {
            jVar = (j) interfaceC5267d;
            int i9 = jVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                jVar.label = i9 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = jVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    enableWebViewRemoteDebugging();
                    com.onesignal.inAppMessages.internal.display.impl.i iVar = new com.onesignal.inAppMessages.internal.display.impl.i(activity);
                    this.webView = iVar;
                    iVar.setOverScrollMode(2);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar2 = this.webView;
                    kotlin.jvm.internal.h.b(iVar2);
                    iVar2.setVerticalScrollBarEnabled(false);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar3 = this.webView;
                    kotlin.jvm.internal.h.b(iVar3);
                    iVar3.setHorizontalScrollBarEnabled(false);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar4 = this.webView;
                    kotlin.jvm.internal.h.b(iVar4);
                    secureSetup(iVar4);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar5 = this.webView;
                    kotlin.jvm.internal.h.b(iVar5);
                    iVar5.addJavascriptInterface(new b(), JS_OBJ_NAME);
                    if (z3) {
                        com.onesignal.inAppMessages.internal.display.impl.i iVar6 = this.webView;
                        kotlin.jvm.internal.h.b(iVar6);
                        iVar6.setSystemUiVisibility(3074);
                        if (Build.VERSION.SDK_INT >= 30) {
                            com.onesignal.inAppMessages.internal.display.impl.i iVar7 = this.webView;
                            kotlin.jvm.internal.h.b(iVar7);
                            iVar7.setFitsSystemWindows(false);
                        }
                    }
                    this._lifecycle.messageWillDisplay(this.message);
                    x4.f fVar = this._applicationService;
                    jVar.L$0 = this;
                    jVar.L$1 = activity;
                    jVar.L$2 = str;
                    jVar.label = 1;
                    if (fVar.waitUntilActivityReady(jVar) == aVar) {
                        return aVar;
                    }
                    mVar = this;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) jVar.L$2;
                    activity = (Activity) jVar.L$1;
                    mVar = (m) jVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                mVar.setWebViewToMaxSize(activity);
                com.onesignal.inAppMessages.internal.display.impl.i iVar8 = mVar.webView;
                kotlin.jvm.internal.h.b(iVar8);
                iVar8.loadData(str, "text/html; charset=utf-8", "base64");
                return v.f41350a;
            }
        }
        jVar = new j(interfaceC5267d);
        Object obj2 = jVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = jVar.label;
        if (i6 != 0) {
        }
        mVar.setWebViewToMaxSize(activity);
        com.onesignal.inAppMessages.internal.display.impl.i iVar82 = mVar.webView;
        kotlin.jvm.internal.h.b(iVar82);
        iVar82.loadData(str, "text/html; charset=utf-8", "base64");
        return v.f41350a;
    }
}
