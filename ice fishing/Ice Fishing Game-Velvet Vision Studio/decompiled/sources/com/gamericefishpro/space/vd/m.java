package com.gamericefishpro.space.vd;

import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.onesignal.common.AndroidUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.gamericefishpro.space.lc.d {
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
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.xd.b _lifecycle;
    private final com.gamericefishpro.space.ce.a _promptFactory;
    private Activity activity;
    private boolean closing;
    private String currentActivityName;
    private boolean dismissFired;
    private Integer lastPageHeight;
    private final com.gamericefishpro.space.qd.a message;
    private final com.gamericefishpro.space.qd.d messageContent;
    private com.gamericefishpro.space.vd.d messageView;
    private final com.gamericefishpro.space.xi.a messageViewMutex;
    private com.gamericefishpro.space.vd.i webView;
    public static final a Companion = new a(null);
    private static final int MARGIN_PX_SIZE = com.gamericefishpro.space.yb.k.INSTANCE.dpToPx(24);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public final class b {
        public b() {
        }

        private final c getDisplayLocation(JSONObject jSONObject) {
            c cVar = c.FULL_SCREEN;
            try {
                if (jSONObject.has(m.IAM_DISPLAY_LOCATION_KEY) && !Intrinsics.a(jSONObject.get(m.IAM_DISPLAY_LOCATION_KEY), "")) {
                    String strOptString = jSONObject.optString(m.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    String upperCase = strOptString.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    return c.valueOf(upperCase);
                }
            } catch (JSONException e) {
                e.printStackTrace();
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
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                return mVar.pageRectToViewHeight(activity, jSONObject2);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            Intrinsics.b(jSONObject2);
            String strSafeString = com.gamericefishpro.space.yb.d.safeString(jSONObject2, "id");
            m.this.closing = jSONObject2.getBoolean("close");
            if (m.this.message.isPreview()) {
                m.this._lifecycle.messageActionOccurredOnPreview(m.this.message, new com.gamericefishpro.space.qd.c(jSONObject2, m.this._promptFactory));
            } else if (strSafeString != null) {
                m.this._lifecycle.messageActionOccurredOnMessage(m.this.message, new com.gamericefishpro.space.qd.c(jSONObject2, m.this._promptFactory));
            }
            if (m.this.closing) {
                m.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jSONObject) {
            m.this._lifecycle.messagePageChanged(m.this.message, new com.gamericefishpro.space.qd.g(jSONObject));
        }

        private final void handleRenderComplete(JSONObject jSONObject) {
            c displayLocation = getDisplayLocation(jSONObject);
            int pageHeightData = displayLocation == c.FULL_SCREEN ? -1 : getPageHeightData(jSONObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jSONObject);
            m.this.messageContent.setDisplayLocation(displayLocation);
            m.this.messageContent.setPageHeight(pageHeightData);
            m.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        @JavascriptInterface
        public final void postMessage(String message) {
            com.gamericefishpro.space.vd.d dVar;
            Intrinsics.checkNotNullParameter(message, "message");
            try {
                com.gamericefishpro.space.od.b.debug$default("OSJavaScriptInterface:postMessage: " + message, null, 2, null);
                JSONObject jSONObject = new JSONObject(message);
                String string = jSONObject.getString(m.EVENT_TYPE_KEY);
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1484226720:
                            if (string.equals(m.EVENT_TYPE_PAGE_CHANGE)) {
                                handlePageChange(jSONObject);
                            }
                            break;
                        case -934437708:
                            string.equals(m.EVENT_TYPE_RESIZE);
                            break;
                        case 42998156:
                            if (string.equals(m.EVENT_TYPE_RENDERING_COMPLETE)) {
                                handleRenderComplete(jSONObject);
                            }
                            break;
                        case 1851145598:
                            if (string.equals(m.EVENT_TYPE_ACTION_TAKEN) && (dVar = m.this.messageView) != null && !dVar.isDragging()) {
                                handleActionTaken(jSONObject);
                            }
                            break;
                        default:
                            break;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public enum c {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());

        public static com.gamericefishpro.space.wh.a getEntries() {
            return $ENTRIES;
        }

        public final boolean isBanner() {
            int i = n.$EnumSwitchMapping$0[ordinal()];
            return i == 1 || i == 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.i implements Function1 {
        int label;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return m.this.new d(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((d) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                m mVar = m.this;
                this.label = 1;
                if (mVar.dismissAndAwaitNextMessage(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.calculateHeightAndShowWebViewAfterNewActivity(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ int $pagePxHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$pagePxHeight = i;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return m.this.new f(this.$pagePxHeight, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((f) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
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
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g implements com.gamericefishpro.space.vd.e {
        final /* synthetic */ m $self;

        public g(m mVar) {
            this.$self = mVar;
        }

        @Override // com.gamericefishpro.space.vd.e
        public void onMessageWasDismissed() {
            m.this._lifecycle.messageWasDismissed(m.this.message);
            m.this._applicationService.removeActivityLifecycleHandler(this.$self);
        }

        @Override // com.gamericefishpro.space.vd.e
        public void onMessageWasDisplayed() {
            m.this._lifecycle.messageWasDisplayed(m.this.message);
        }

        @Override // com.gamericefishpro.space.vd.e
        public void onMessageWillDismiss() {
            m.this._lifecycle.messageWillDismiss(m.this.message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.dismissAndAwaitNextMessage(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class i extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ String $lastActivityName;
        int label;
        final /* synthetic */ m this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, m mVar, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$lastActivityName = str;
            this.this$0 = mVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return new i(this.$lastActivityName, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((i) create(aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            if (r6.showMessageView(null, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        
            if (r6.showMessageView(r1, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (r6.calculateHeightAndShowWebViewAfterNewActivity(r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        
            return r0;
         */
        @Override // com.gamericefishpro.space.vh.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                String str = this.$lastActivityName;
                if (str == null) {
                    m mVar = this.this$0;
                    this.label = 1;
                } else if (Intrinsics.a(str, this.this$0.currentActivityName)) {
                    m mVar2 = this.this$0;
                    this.label = 3;
                } else if (!this.this$0.closing) {
                    if (this.this$0.messageView != null) {
                        com.gamericefishpro.space.vd.d dVar = this.this$0.messageView;
                        Intrinsics.b(dVar);
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
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class j extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public j(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.setupWebView(null, null, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class k extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public k(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.showMessageView(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class l extends com.gamericefishpro.space.vh.i implements Function2 {
        int label;

        public l(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return m.this.new l(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((l) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            int[] cutoutAndStatusBarInsets = com.gamericefishpro.space.yb.k.INSTANCE.getCutoutAndStatusBarInsets(m.this.activity);
            String str = String.format(m.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{new Integer(cutoutAndStatusBarInsets[0]), new Integer(cutoutAndStatusBarInsets[1]), new Integer(cutoutAndStatusBarInsets[2]), new Integer(cutoutAndStatusBarInsets[3])}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            String str2 = String.format(m.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            com.gamericefishpro.space.vd.i iVar = m.this.webView;
            Intrinsics.b(iVar);
            iVar.evaluateJavascript(str2, null);
            return Unit.a;
        }
    }

    public m(com.gamericefishpro.space.qd.a message, Activity activity, com.gamericefishpro.space.qd.d messageContent, com.gamericefishpro.space.xd.b _lifecycle, com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.ce.a _promptFactory) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        Intrinsics.checkNotNullParameter(_lifecycle, "_lifecycle");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_promptFactory, "_promptFactory");
        this.message = message;
        this.activity = activity;
        this.messageContent = messageContent;
        this._lifecycle = _lifecycle;
        this._applicationService = _applicationService;
        this._promptFactory = _promptFactory;
        this.messageViewMutex = new com.gamericefishpro.space.xi.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (showMessageView(null, r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateHeightAndShowWebViewAfterNewActivity(com.gamericefishpro.space.th.a aVar) {
        e eVar;
        final m mVar;
        m mVar2;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i2 = eVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.label = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(aVar);
            }
        } else {
            eVar = new e(aVar);
        }
        Object obj = eVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = eVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.vd.d dVar = this.messageView;
            if (dVar == null) {
                return Unit.a;
            }
            if (dVar.getDisplayPosition() != c.FULL_SCREEN || this.messageContent.isFullBleed()) {
                com.gamericefishpro.space.od.b.debug$default("In app message new activity, calculate height and show ", null, 2, null);
                com.gamericefishpro.space.lc.f fVar = this._applicationService;
                eVar.L$0 = this;
                eVar.label = 2;
                if (fVar.waitUntilActivityReady(eVar) != aVar2) {
                    mVar = this;
                    mVar.setWebViewToMaxSize(mVar.activity);
                    if (mVar.messageContent.isFullBleed()) {
                        eVar.L$0 = mVar;
                        eVar.label = 3;
                        if (mVar.updateSafeAreaInsets(eVar) != aVar2) {
                            mVar2 = mVar;
                            mVar = mVar2;
                        }
                    }
                }
            } else {
                eVar.label = 1;
            }
            return aVar2;
        }
        if (i3 == 1) {
            com.gamericefishpro.space.wa.b.P(obj);
            return Unit.a;
        }
        if (i3 == 2) {
            mVar = (m) eVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            mVar.setWebViewToMaxSize(mVar.activity);
            if (mVar.messageContent.isFullBleed()) {
                eVar.L$0 = mVar;
                eVar.label = 3;
                if (mVar.updateSafeAreaInsets(eVar) != aVar2) {
                    mVar2 = mVar;
                }
                return aVar2;
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar2 = (m) eVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        mVar = mVar2;
        com.gamericefishpro.space.vd.i iVar = mVar.webView;
        Intrinsics.b(iVar);
        iVar.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.gamericefishpro.space.vd.l
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj2) {
                m.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(this.a, (String) obj2);
            }
        });
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateHeightAndShowWebViewAfterNewActivity$lambda$0(m this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, this$0.new f(this$0.pageRectToViewHeight(this$0.activity, new JSONObject(str)), null), 1, null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (com.gamericefishpro.space.od.b.atLogLevel(com.gamericefishpro.space.md.c.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private final int getWebViewMaxSizeX(Activity activity) {
        if (this.messageContent.isFullBleed()) {
            return com.gamericefishpro.space.yb.k.INSTANCE.getFullbleedWindowWidth(activity);
        }
        return com.gamericefishpro.space.yb.k.INSTANCE.getWindowWidth(activity) - (MARGIN_PX_SIZE * 2);
    }

    private final int getWebViewMaxSizeY(Activity activity) {
        return com.gamericefishpro.space.yb.k.INSTANCE.getWindowHeight(activity) - (this.messageContent.isFullBleed() ? 0 : MARGIN_PX_SIZE * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity, JSONObject jSONObject) {
        try {
            int iDpToPx = com.gamericefishpro.space.yb.k.INSTANCE.dpToPx(jSONObject.getJSONObject("rect").getInt("height"));
            com.gamericefishpro.space.od.b.debug$default("getPageHeightData:pxHeight: " + iDpToPx, null, 2, null);
            int webViewMaxSizeY = getWebViewMaxSizeY(activity);
            if (iDpToPx <= webViewMaxSizeY) {
                return iDpToPx;
            }
            com.gamericefishpro.space.od.b.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, null, 2, null);
            return webViewMaxSizeY;
        } catch (JSONException e2) {
            com.gamericefishpro.space.od.b.error("pageRectToViewHeight could not get page height", e2);
            return -1;
        }
    }

    private final void setMessageView(com.gamericefishpro.space.vd.d dVar) {
        this.messageView = dVar;
    }

    private final void setWebViewToMaxSize(Activity activity) {
        com.gamericefishpro.space.vd.i iVar = this.webView;
        Intrinsics.b(iVar);
        iVar.layout(0, 0, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0033, B:57:0x00f3, B:22:0x004b, B:52:0x00e0, B:54:0x00e4, B:25:0x0058, B:47:0x00cb, B:49:0x00cf, B:32:0x0085, B:34:0x0089, B:37:0x0094, B:39:0x00a7, B:41:0x00b1, B:43:0x00b7), top: B:62:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0 A[Catch: all -> 0x0038, PHI: r0 r10
      0x00e0: PHI (r0v5 com.gamericefishpro.space.vd.m) = (r0v4 com.gamericefishpro.space.vd.m), (r0v4 com.gamericefishpro.space.vd.m), (r0v9 com.gamericefishpro.space.vd.m) binds: [B:48:0x00cd, B:50:0x00dd, B:22:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r10v4 com.gamericefishpro.space.xi.a) = (r10v3 com.gamericefishpro.space.xi.a), (r10v3 com.gamericefishpro.space.xi.a), (r10v13 com.gamericefishpro.space.xi.a) binds: [B:48:0x00cd, B:50:0x00dd, B:22:0x004b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0033, B:57:0x00f3, B:22:0x004b, B:52:0x00e0, B:54:0x00e4, B:25:0x0058, B:47:0x00cb, B:49:0x00cf, B:32:0x0085, B:34:0x0089, B:37:0x0094, B:39:0x00a7, B:41:0x00b1, B:43:0x00b7), top: B:62:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0033, B:57:0x00f3, B:22:0x004b, B:52:0x00e0, B:54:0x00e4, B:25:0x0058, B:47:0x00cb, B:49:0x00cf, B:32:0x0085, B:34:0x0089, B:37:0x0094, B:39:0x00a7, B:41:0x00b1, B:43:0x00b7), top: B:62:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r11.checkIfShouldDismiss(r1) == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageView(Integer num, com.gamericefishpro.space.th.a aVar) {
        k kVar;
        m mVar;
        Integer num2;
        com.gamericefishpro.space.xi.a aVar2;
        m mVar2;
        com.gamericefishpro.space.vd.d dVar;
        Activity activity;
        com.gamericefishpro.space.vd.d dVar2;
        if (aVar instanceof k) {
            kVar = (k) aVar;
            int i2 = kVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.label = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(aVar);
            }
        } else {
            kVar = new k(aVar);
        }
        Object obj = kVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = kVar.label;
        try {
            if (i3 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.xi.a aVar4 = this.messageViewMutex;
                kVar.L$0 = this;
                kVar.L$1 = num;
                kVar.L$2 = aVar4;
                kVar.label = 1;
                if (aVar4.c(kVar) != aVar3) {
                    mVar = this;
                    num2 = num;
                    aVar2 = aVar4;
                }
                return aVar3;
            }
            if (i3 == 1) {
                aVar2 = (com.gamericefishpro.space.xi.a) kVar.L$2;
                Integer num3 = (Integer) kVar.L$1;
                mVar = (m) kVar.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                num2 = num3;
            } else {
                if (i3 == 2) {
                    aVar2 = (com.gamericefishpro.space.xi.a) kVar.L$1;
                    mVar2 = (m) kVar.L$0;
                    com.gamericefishpro.space.wa.b.P(obj);
                    dVar = mVar2.messageView;
                    if (dVar != null) {
                        activity = mVar2.activity;
                        kVar.L$0 = mVar2;
                        kVar.L$1 = aVar2;
                        kVar.L$2 = null;
                        kVar.label = 3;
                        if (dVar.showView(activity, kVar) == aVar3) {
                            dVar2 = mVar2.messageView;
                            if (dVar2 != null) {
                                kVar.L$0 = aVar2;
                                kVar.L$1 = null;
                                kVar.L$2 = null;
                                kVar.label = 4;
                            }
                        }
                        return aVar3;
                    }
                    dVar2 = mVar2.messageView;
                    if (dVar2 != null) {
                        kVar.L$0 = aVar2;
                        kVar.L$1 = null;
                        kVar.L$2 = null;
                        kVar.label = 4;
                    }
                    aVar2.b(null);
                    return Unit.a;
                }
                if (i3 == 3) {
                    aVar2 = (com.gamericefishpro.space.xi.a) kVar.L$1;
                    mVar2 = (m) kVar.L$0;
                    com.gamericefishpro.space.wa.b.P(obj);
                    dVar2 = mVar2.messageView;
                    if (dVar2 != null) {
                        kVar.L$0 = aVar2;
                        kVar.L$1 = null;
                        kVar.L$2 = null;
                        kVar.label = 4;
                    }
                    aVar2.b(null);
                    return Unit.a;
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (com.gamericefishpro.space.xi.a) kVar.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            Unit unit = Unit.a;
            aVar2.b(null);
            return Unit.a;
            if (mVar.messageView == null) {
                com.gamericefishpro.space.od.b.warn$default("No messageView found to update a with a new height.", null, 2, null);
                Unit unit2 = Unit.a;
                aVar2.b(null);
                return unit2;
            }
            com.gamericefishpro.space.od.b.debug$default("In app message, showing first one with height: " + num2, null, 2, null);
            com.gamericefishpro.space.vd.d dVar3 = mVar.messageView;
            if (dVar3 != null) {
                com.gamericefishpro.space.vd.i iVar = mVar.webView;
                Intrinsics.b(iVar);
                dVar3.setWebView(iVar);
            }
            if (num2 != null) {
                mVar.lastPageHeight = num2;
                com.gamericefishpro.space.vd.d dVar4 = mVar.messageView;
                if (dVar4 != null) {
                    int iIntValue = num2.intValue();
                    kVar.L$0 = mVar;
                    kVar.L$1 = aVar2;
                    kVar.L$2 = null;
                    kVar.label = 2;
                    if (dVar4.updateHeight(iIntValue, kVar) == aVar3) {
                    }
                    return aVar3;
                }
            }
            mVar2 = mVar;
            dVar = mVar2.messageView;
            if (dVar != null) {
                activity = mVar2.activity;
                kVar.L$0 = mVar2;
                kVar.L$1 = aVar2;
                kVar.L$2 = null;
                kVar.label = 3;
                if (dVar.showView(activity, kVar) == aVar3) {
                    dVar2 = mVar2.messageView;
                    if (dVar2 != null) {
                        kVar.L$0 = aVar2;
                        kVar.L$1 = null;
                        kVar.L$2 = null;
                        kVar.label = 4;
                    }
                }
                return aVar3;
            }
            dVar2 = mVar2.messageView;
            if (dVar2 != null) {
                kVar.L$0 = aVar2;
                kVar.L$1 = null;
                kVar.L$2 = null;
                kVar.label = 4;
            }
            aVar2.b(null);
            return Unit.a;
        } catch (Throwable th) {
            num.b(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = a0.D(com.gamericefishpro.space.ui.m.a, new l(null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new d(null), 1, null);
    }

    public final void createNewInAppMessageView(boolean z) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        com.gamericefishpro.space.vd.i iVar = this.webView;
        Intrinsics.b(iVar);
        setMessageView(new com.gamericefishpro.space.vd.d(iVar, this.messageContent, z, manifestMetaBoolean));
        com.gamericefishpro.space.vd.d dVar = this.messageView;
        Intrinsics.b(dVar);
        dVar.setMessageController(new g(this));
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dismissAndAwaitNextMessage(com.gamericefishpro.space.th.a aVar) {
        h hVar;
        m mVar;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(aVar);
            }
        } else {
            hVar = new h(aVar);
        }
        Object obj = hVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = hVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.vd.d dVar = this.messageView;
            if (dVar == null || this.dismissFired) {
                return Unit.a;
            }
            this.dismissFired = true;
            this._lifecycle.messageWillDismiss(this.message);
            hVar.L$0 = this;
            hVar.label = 1;
            if (dVar.dismissAndAwaitNextMessage(hVar) == aVar2) {
                return aVar2;
            }
            mVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) hVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        mVar.dismissFired = false;
        mVar.setMessageView(null);
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.lc.d
    public void onActivityAvailable(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        com.gamericefishpro.space.od.b.debug$default(com.gamericefishpro.space.m5.a.j(new StringBuilder("In app message activity available currentActivityName: "), this.currentActivityName, " lastActivityName: ", str), null, 2, null);
        com.gamericefishpro.space.ic.b.suspendifyOnMain(new i(str, this, null));
    }

    @Override // com.gamericefishpro.space.lc.d
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.gamericefishpro.space.od.b.debug$default(com.gamericefishpro.space.mi.h.c("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !Intrinsics.a(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        com.gamericefishpro.space.vd.d dVar = this.messageView;
        Intrinsics.b(dVar);
        dVar.removeAllViews();
    }

    public final void secureSetup(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
    }

    public final void setContentSafeAreaInsets(com.gamericefishpro.space.qd.d content, Activity activity) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(activity, "activity");
        String contentHtml = content.getContentHtml();
        int[] cutoutAndStatusBarInsets = com.gamericefishpro.space.yb.k.INSTANCE.getCutoutAndStatusBarInsets(activity);
        String str = String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String str2 = String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        content.setContentHtml(contentHtml + str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setupWebView(Activity activity, String str, boolean z, com.gamericefishpro.space.th.a aVar) {
        j jVar;
        m mVar;
        if (aVar instanceof j) {
            jVar = (j) aVar;
            int i2 = jVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.label = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(aVar);
            }
        } else {
            jVar = new j(aVar);
        }
        Object obj = jVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = jVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            enableWebViewRemoteDebugging();
            com.gamericefishpro.space.vd.i iVar = new com.gamericefishpro.space.vd.i(activity);
            this.webView = iVar;
            iVar.setOverScrollMode(2);
            com.gamericefishpro.space.vd.i iVar2 = this.webView;
            Intrinsics.b(iVar2);
            iVar2.setVerticalScrollBarEnabled(false);
            com.gamericefishpro.space.vd.i iVar3 = this.webView;
            Intrinsics.b(iVar3);
            iVar3.setHorizontalScrollBarEnabled(false);
            com.gamericefishpro.space.vd.i iVar4 = this.webView;
            Intrinsics.b(iVar4);
            secureSetup(iVar4);
            com.gamericefishpro.space.vd.i iVar5 = this.webView;
            Intrinsics.b(iVar5);
            iVar5.addJavascriptInterface(new b(), JS_OBJ_NAME);
            if (z) {
                com.gamericefishpro.space.vd.i iVar6 = this.webView;
                Intrinsics.b(iVar6);
                iVar6.setSystemUiVisibility(3074);
                if (Build.VERSION.SDK_INT >= 30) {
                    com.gamericefishpro.space.vd.i iVar7 = this.webView;
                    Intrinsics.b(iVar7);
                    iVar7.setFitsSystemWindows(false);
                }
            }
            this._lifecycle.messageWillDisplay(this.message);
            com.gamericefishpro.space.lc.f fVar = this._applicationService;
            jVar.L$0 = this;
            jVar.L$1 = activity;
            jVar.L$2 = str;
            jVar.label = 1;
            if (fVar.waitUntilActivityReady(jVar) == aVar2) {
                return aVar2;
            }
            mVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) jVar.L$2;
            activity = (Activity) jVar.L$1;
            mVar = (m) jVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        mVar.setWebViewToMaxSize(activity);
        com.gamericefishpro.space.vd.i iVar8 = mVar.webView;
        Intrinsics.b(iVar8);
        iVar8.loadData(str, "text/html; charset=utf-8", "base64");
        return Unit.a;
    }
}
