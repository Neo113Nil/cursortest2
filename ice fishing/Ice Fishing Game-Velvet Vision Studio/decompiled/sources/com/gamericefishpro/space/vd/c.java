package com.gamericefishpro.space.vd;

import android.app.Activity;
import android.util.Base64;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.ud.a {
    public static final a Companion = new a(null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.rd.b _backend;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.mg.a _influenceManager;
    private final com.gamericefishpro.space.zc.a _languageContext;
    private final com.gamericefishpro.space.xd.b _lifecycle;
    private final com.gamericefishpro.space.ce.a _promptFactory;
    private final com.gamericefishpro.space.kd.a _time;
    private m lastInstance;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.vd.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0064c extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0064c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayPreviewMessage(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.initInAppMessage(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ com.gamericefishpro.space.qd.d $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ m $webViewManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m mVar, Activity activity, String str, com.gamericefishpro.space.qd.d dVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$webViewManager = mVar;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = dVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new e(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) throws Exception {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            try {
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    m mVar = this.$webViewManager;
                    Activity activity = this.$currentActivity;
                    String base64Str = this.$base64Str;
                    Intrinsics.checkNotNullExpressionValue(base64Str, "$base64Str");
                    boolean zIsFullBleed = this.$content.isFullBleed();
                    this.label = 1;
                    if (mVar.setupWebView(activity, base64Str, zIsFullBleed, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    String message = e.getMessage();
                    Intrinsics.b(message);
                    if (StringsKt.r(message, "No WebView installed")) {
                        com.gamericefishpro.space.od.b.error("Error setting up WebView: ", e);
                    }
                }
                throw e;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showMessageContent(null, null, this);
        }
    }

    public c(com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.xd.b _lifecycle, com.gamericefishpro.space.ce.a _promptFactory, com.gamericefishpro.space.rd.b _backend, com.gamericefishpro.space.mg.a _influenceManager, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.zc.a _languageContext, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_lifecycle, "_lifecycle");
        Intrinsics.checkNotNullParameter(_promptFactory, "_promptFactory");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._lifecycle = _lifecycle;
        this._promptFactory = _promptFactory;
        this._backend = _backend;
        this._influenceManager = _influenceManager;
        this._configModelStore = _configModelStore;
        this._languageContext = _languageContext;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object initInAppMessage(Activity activity, com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.qd.d dVar, com.gamericefishpro.space.th.a aVar2) {
        d dVar2;
        Activity activity2;
        com.gamericefishpro.space.qd.d dVar3;
        if (aVar2 instanceof d) {
            dVar2 = (d) aVar2;
            int i = dVar2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar2.label = i - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(aVar2);
            }
        } else {
            dVar2 = new d(aVar2);
        }
        Object obj = dVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = dVar2.label;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                String contentHtml = dVar.getContentHtml();
                Intrinsics.b(contentHtml);
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                byte[] bytes = contentHtml.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                String strEncodeToString = Base64.encodeToString(bytes, 2);
                m mVar = new m(aVar, activity, dVar, this._lifecycle, this._applicationService, this._promptFactory);
                this.lastInstance = mVar;
                if (dVar.isFullBleed()) {
                    activity2 = activity;
                    dVar3 = dVar;
                    mVar.setContentSafeAreaInsets(dVar3, activity2);
                } else {
                    activity2 = activity;
                    dVar3 = dVar;
                }
                com.gamericefishpro.space.wi.e eVar = k0.a;
                com.gamericefishpro.space.qi.d dVar4 = com.gamericefishpro.space.ui.m.a;
                e eVar2 = new e(mVar, activity2, strEncodeToString, dVar3, null);
                dVar2.label = 1;
                if (a0.D(dVar4, eVar2, dVar2) == aVar3) {
                    return aVar3;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
        } catch (UnsupportedEncodingException e2) {
            com.gamericefishpro.space.od.b.error("Catch on initInAppMessage: ", e2);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r3.initInAppMessage(r11, r2, r12, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (initInAppMessage(r13, r11, r12, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
    
        if (r2.showMessageContent(r11, r12, r0) == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageContent(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.qd.d dVar, com.gamericefishpro.space.th.a aVar2) {
        f fVar;
        c cVar;
        c cVar2;
        com.gamericefishpro.space.qd.a aVar3;
        Activity activity;
        if (aVar2 instanceof f) {
            fVar = (f) aVar2;
            int i = fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.label = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(aVar2);
            }
        } else {
            fVar = new f(aVar2);
        }
        Object obj = fVar.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i2 = fVar.label;
        if (i2 != 0) {
            if (i2 == 1) {
                activity = (Activity) fVar.L$3;
                dVar = (com.gamericefishpro.space.qd.d) fVar.L$2;
                aVar3 = (com.gamericefishpro.space.qd.a) fVar.L$1;
                cVar2 = (c) fVar.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                cVar2.lastInstance = null;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.label = 2;
            } else {
                if (i2 != 2 && i2 != 3) {
                    if (i2 == 4) {
                        dVar = (com.gamericefishpro.space.qd.d) fVar.L$2;
                        aVar = (com.gamericefishpro.space.qd.a) fVar.L$1;
                        cVar = (c) fVar.L$0;
                        com.gamericefishpro.space.wa.b.P(obj);
                        fVar.L$0 = null;
                        fVar.L$1 = null;
                        fVar.L$2 = null;
                        fVar.label = 5;
                    } else {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        Activity current = this._applicationService.getCurrent();
        com.gamericefishpro.space.od.b.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
        if (current == null) {
            fVar.L$0 = this;
            fVar.L$1 = aVar;
            fVar.L$2 = dVar;
            fVar.label = 4;
            if (a0.i(200L, fVar) != aVar4) {
                cVar = this;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.label = 5;
            }
        } else if (this.lastInstance == null || !aVar.isPreview()) {
            fVar.label = 3;
        } else {
            m mVar = this.lastInstance;
            Intrinsics.b(mVar);
            fVar.L$0 = this;
            fVar.L$1 = aVar;
            fVar.L$2 = dVar;
            fVar.L$3 = current;
            fVar.label = 1;
            if (mVar.dismissAndAwaitNextMessage(fVar) != aVar4) {
                cVar2 = this;
                aVar3 = aVar;
                activity = current;
                cVar2.lastInstance = null;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.label = 2;
            }
        }
        return aVar4;
    }

    @Override // com.gamericefishpro.space.ud.a
    public void dismissCurrentInAppMessage() {
        com.gamericefishpro.space.od.b.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        m mVar = this.lastInstance;
        if (mVar != null) {
            Intrinsics.b(mVar);
            mVar.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r2.showMessageContent(r9, r10, r0) == r1) goto L24;
     */
    @Override // com.gamericefishpro.space.ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayMessage(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.th.a aVar2) {
        b bVar;
        c cVar;
        if (aVar2 instanceof b) {
            bVar = (b) aVar2;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar2);
            }
        } else {
            bVar = new b(aVar2);
        }
        Object iAMData = bVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar.label;
        if (i2 != 0) {
            if (i2 == 1) {
                aVar = (com.gamericefishpro.space.qd.a) bVar.L$1;
                cVar = (c) bVar.L$0;
                com.gamericefishpro.space.wa.b.P(iAMData);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(iAMData);
            }
            return Boolean.TRUE;
        }
        com.gamericefishpro.space.wa.b.P(iAMData);
        com.gamericefishpro.space.rd.b bVar2 = this._backend;
        String appId = ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId();
        String messageId = aVar.getMessageId();
        String strVariantIdForMessage = com.gamericefishpro.space.td.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
        bVar.L$0 = this;
        bVar.L$1 = aVar;
        bVar.label = 1;
        iAMData = bVar2.getIAMData(appId, messageId, strVariantIdForMessage, bVar);
        if (iAMData != aVar3) {
            cVar = this;
        }
        return aVar3;
        com.gamericefishpro.space.rd.a aVar4 = (com.gamericefishpro.space.rd.a) iAMData;
        if (aVar4.getContent() == null) {
            if (aVar4.getShouldRetry()) {
                return null;
            }
            return Boolean.FALSE;
        }
        com.gamericefishpro.space.qd.d content = aVar4.getContent();
        Intrinsics.b(content);
        Double displayDuration = content.getDisplayDuration();
        Intrinsics.b(displayDuration);
        aVar.setDisplayDuration(displayDuration.doubleValue());
        cVar._influenceManager.onInAppMessageDisplayed(aVar.getMessageId());
        com.gamericefishpro.space.qd.d content2 = aVar4.getContent();
        Intrinsics.b(content2);
        bVar.L$0 = null;
        bVar.L$1 = null;
        bVar.label = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r2.showMessageContent(r8, r9, r0) == r1) goto L25;
     */
    @Override // com.gamericefishpro.space.ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayPreviewMessage(String str, com.gamericefishpro.space.th.a aVar) {
        C0064c c0064c;
        com.gamericefishpro.space.qd.a aVar2;
        c cVar;
        if (aVar instanceof C0064c) {
            c0064c = (C0064c) aVar;
            int i = c0064c.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0064c.label = i - Integer.MIN_VALUE;
            } else {
                c0064c = new C0064c(aVar);
            }
        } else {
            c0064c = new C0064c(aVar);
        }
        Object obj = c0064c.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0064c.label;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                aVar2 = (com.gamericefishpro.space.qd.a) c0064c.L$1;
                cVar = (c) c0064c.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Boolean.valueOf(z);
        }
        com.gamericefishpro.space.wa.b.P(obj);
        com.gamericefishpro.space.qd.a aVar4 = new com.gamericefishpro.space.qd.a(true, this._time);
        com.gamericefishpro.space.rd.b bVar = this._backend;
        String appId = ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId();
        c0064c.L$0 = this;
        c0064c.L$1 = aVar4;
        c0064c.label = 1;
        Object iAMPreviewData = bVar.getIAMPreviewData(appId, str, c0064c);
        if (iAMPreviewData != aVar3) {
            obj = iAMPreviewData;
            aVar2 = aVar4;
            cVar = this;
        }
        return aVar3;
        com.gamericefishpro.space.qd.d dVar = (com.gamericefishpro.space.qd.d) obj;
        if (dVar == null) {
            z = false;
        } else {
            Double displayDuration = dVar.getDisplayDuration();
            Intrinsics.b(displayDuration);
            aVar2.setDisplayDuration(displayDuration.doubleValue());
            c0064c.L$0 = null;
            c0064c.L$1 = null;
            c0064c.label = 2;
        }
        return Boolean.valueOf(z);
    }
}
