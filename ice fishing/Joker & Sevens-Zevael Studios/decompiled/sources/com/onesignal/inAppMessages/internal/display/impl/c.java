package com.onesignal.inAppMessages.internal.display.impl;

import android.app.Activity;
import android.util.Base64;
import java.nio.charset.Charset;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements l9.a {
    public static final a Companion = new a(null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final q8.f _applicationService;
    private final j9.b _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final ab.a _influenceManager;
    private final x8.a _languageContext;
    private final n9.b _lifecycle;
    private final q9.a _promptFactory;
    private final e9.a _time;
    private n lastInstance;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayMessage(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.c$c, reason: collision with other inner class name */
    public static final class C0026c extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0026c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayPreviewMessage(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.initInAppMessage(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.j implements oc.e {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ com.onesignal.inAppMessages.internal.d $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ n $webViewManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n nVar, Activity activity, String str, com.onesignal.inAppMessages.internal.d dVar, fc.d dVar2) {
            super(2, dVar2);
            this.$webViewManager = nVar;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = dVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new e(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    v6.a.W(obj);
                    n nVar = this.$webViewManager;
                    Activity activity = this.$currentActivity;
                    String str = this.$base64Str;
                    pc.j.d(str, "base64Str");
                    boolean isFullBleed = this.$content.isFullBleed();
                    this.label = 1;
                    Object obj2 = nVar.setupWebView(activity, str, isFullBleed, this);
                    gc.a aVar = gc.a.f2559g;
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
            } catch (Exception e10) {
                if (e10.getMessage() != null) {
                    String message = e10.getMessage();
                    pc.j.b(message);
                    if (xc.h.n(message, "No WebView installed", false)) {
                        com.onesignal.debug.internal.logging.b.error("Error setting up WebView: ", e10);
                    }
                }
                throw e10;
            }
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((e) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showMessageContent(null, null, this);
        }
    }

    public c(q8.f fVar, n9.b bVar, q9.a aVar, j9.b bVar2, ab.a aVar2, com.onesignal.core.internal.config.b bVar3, x8.a aVar3, e9.a aVar4) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(bVar, "_lifecycle");
        pc.j.e(aVar, "_promptFactory");
        pc.j.e(bVar2, "_backend");
        pc.j.e(aVar2, "_influenceManager");
        pc.j.e(bVar3, "_configModelStore");
        pc.j.e(aVar3, "_languageContext");
        pc.j.e(aVar4, "_time");
        this._applicationService = fVar;
        this._lifecycle = bVar;
        this._promptFactory = aVar;
        this._backend = bVar2;
        this._influenceManager = aVar2;
        this._configModelStore = bVar3;
        this._languageContext = aVar3;
        this._time = aVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(6:16|17|(1:19)(1:24)|20|21|(1:23))|11|12))|27|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        com.onesignal.debug.internal.logging.b.error("Catch on initInAppMessage: ", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initInAppMessage(Activity activity, com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, fc.d dVar2) {
        d dVar3;
        int i10;
        Activity activity2;
        com.onesignal.inAppMessages.internal.d dVar4;
        if (dVar2 instanceof d) {
            dVar3 = (d) dVar2;
            int i11 = dVar3.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar3.label = i11 - Integer.MIN_VALUE;
                Object obj = dVar3.result;
                i10 = dVar3.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    String contentHtml = dVar.getContentHtml();
                    pc.j.b(contentHtml);
                    Charset forName = Charset.forName("UTF-8");
                    pc.j.d(forName, "forName(charsetName)");
                    byte[] bytes = contentHtml.getBytes(forName);
                    pc.j.d(bytes, "this as java.lang.String).getBytes(charset)");
                    String encodeToString = Base64.encodeToString(bytes, 2);
                    n nVar = new n(aVar, activity, dVar, this._lifecycle, this._applicationService, this._promptFactory);
                    this.lastInstance = nVar;
                    if (dVar.isFullBleed()) {
                        activity2 = activity;
                        dVar4 = dVar;
                        nVar.setContentSafeAreaInsets(dVar4, activity2);
                    } else {
                        activity2 = activity;
                        dVar4 = dVar;
                    }
                    fd.e eVar = i0.f8859a;
                    zc.d dVar5 = dd.o.f1880a;
                    e eVar2 = new e(nVar, activity2, encodeToString, dVar4, null);
                    dVar3.label = 1;
                    Object A = a0.A(dVar5, eVar2, dVar3);
                    gc.a aVar2 = gc.a.f2559g;
                    if (A == aVar2) {
                        return aVar2;
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
        dVar3 = new d(dVar2);
        Object obj2 = dVar3.result;
        i10 = dVar3.label;
        if (i10 != 0) {
        }
        return ac.o.f277a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageContent(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, fc.d dVar2) {
        f fVar;
        int i10;
        c cVar;
        c cVar2;
        com.onesignal.inAppMessages.internal.a aVar2;
        Activity activity;
        if (dVar2 instanceof f) {
            fVar = (f) dVar2;
            int i11 = fVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.label = i11 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                i10 = fVar.label;
                ac.o oVar = ac.o.f277a;
                gc.a aVar3 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    Activity current = this._applicationService.getCurrent();
                    com.onesignal.debug.internal.logging.b.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
                    if (current == null) {
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.label = 4;
                        if (a0.f(200L, fVar) != aVar3) {
                            cVar = this;
                            fVar.L$0 = null;
                            fVar.L$1 = null;
                            fVar.L$2 = null;
                            fVar.label = 5;
                            if (cVar.showMessageContent(aVar, dVar, fVar) != aVar3) {
                            }
                        }
                    } else if (this.lastInstance == null || !aVar.isPreview()) {
                        fVar.label = 3;
                        if (initInAppMessage(current, aVar, dVar, fVar) == aVar3) {
                        }
                    } else {
                        n nVar = this.lastInstance;
                        pc.j.b(nVar);
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.L$3 = current;
                        fVar.label = 1;
                        if (nVar.dismissAndAwaitNextMessage(fVar) != aVar3) {
                            cVar2 = this;
                            aVar2 = aVar;
                            activity = current;
                            cVar2.lastInstance = null;
                            fVar.L$0 = null;
                            fVar.L$1 = null;
                            fVar.L$2 = null;
                            fVar.L$3 = null;
                            fVar.label = 2;
                            if (cVar2.initInAppMessage(activity, aVar2, dVar, fVar) == aVar3) {
                            }
                        }
                    }
                }
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        v6.a.W(obj);
                        return oVar;
                    }
                    if (i10 != 4) {
                        if (i10 == 5) {
                            v6.a.W(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                    aVar = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                    cVar = (c) fVar.L$0;
                    v6.a.W(obj);
                    fVar.L$0 = null;
                    fVar.L$1 = null;
                    fVar.L$2 = null;
                    fVar.label = 5;
                    return cVar.showMessageContent(aVar, dVar, fVar) != aVar3 ? aVar3 : oVar;
                }
                activity = (Activity) fVar.L$3;
                dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                aVar2 = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                cVar2 = (c) fVar.L$0;
                v6.a.W(obj);
                cVar2.lastInstance = null;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.label = 2;
                if (cVar2.initInAppMessage(activity, aVar2, dVar, fVar) == aVar3) {
                    return oVar;
                }
            }
        }
        fVar = new f(dVar2);
        Object obj2 = fVar.result;
        i10 = fVar.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar32 = gc.a.f2559g;
        if (i10 != 0) {
        }
    }

    @Override // l9.a
    public void dismissCurrentInAppMessage() {
        com.onesignal.debug.internal.logging.b.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        n nVar = this.lastInstance;
        if (nVar != null) {
            pc.j.b(nVar);
            nVar.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        if (r1.showMessageContent(r9, r10, r0) == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // l9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayMessage(com.onesignal.inAppMessages.internal.a aVar, fc.d dVar) {
        b bVar;
        int i10;
        c cVar;
        j9.a aVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                i10 = bVar.label;
                gc.a aVar3 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    j9.b bVar2 = this._backend;
                    String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                    String messageId = aVar.getMessageId();
                    String variantIdForMessage = k9.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    bVar.L$0 = this;
                    bVar.L$1 = aVar;
                    bVar.label = 1;
                    obj = bVar2.getIAMData(appId, messageId, variantIdForMessage, bVar);
                    if (obj != aVar3) {
                        cVar = this;
                    }
                    return aVar3;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return Boolean.TRUE;
                }
                aVar = (com.onesignal.inAppMessages.internal.a) bVar.L$1;
                cVar = (c) bVar.L$0;
                v6.a.W(obj);
                aVar2 = (j9.a) obj;
                if (aVar2.getContent() != null) {
                    if (aVar2.getShouldRetry()) {
                        return null;
                    }
                    return Boolean.FALSE;
                }
                com.onesignal.inAppMessages.internal.d content = aVar2.getContent();
                pc.j.b(content);
                Double displayDuration = content.getDisplayDuration();
                pc.j.b(displayDuration);
                aVar.setDisplayDuration(displayDuration.doubleValue());
                cVar._influenceManager.onInAppMessageDisplayed(aVar.getMessageId());
                com.onesignal.inAppMessages.internal.d content2 = aVar2.getContent();
                pc.j.b(content2);
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 2;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        i10 = bVar.label;
        gc.a aVar32 = gc.a.f2559g;
        if (i10 != 0) {
        }
        aVar2 = (j9.a) obj2;
        if (aVar2.getContent() != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r1.showMessageContent(r8, r9, r0) == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // l9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayPreviewMessage(String str, fc.d dVar) {
        C0026c c0026c;
        int i10;
        com.onesignal.inAppMessages.internal.a aVar;
        c cVar;
        com.onesignal.inAppMessages.internal.d dVar2;
        if (dVar instanceof C0026c) {
            c0026c = (C0026c) dVar;
            int i11 = c0026c.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0026c.label = i11 - Integer.MIN_VALUE;
                Object obj = c0026c.result;
                i10 = c0026c.label;
                boolean z10 = true;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.inAppMessages.internal.a aVar3 = new com.onesignal.inAppMessages.internal.a(true, this._time);
                    j9.b bVar = this._backend;
                    String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                    c0026c.L$0 = this;
                    c0026c.L$1 = aVar3;
                    c0026c.label = 1;
                    Object iAMPreviewData = bVar.getIAMPreviewData(appId, str, c0026c);
                    if (iAMPreviewData != aVar2) {
                        obj = iAMPreviewData;
                        aVar = aVar3;
                        cVar = this;
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return Boolean.valueOf(z10);
                }
                aVar = (com.onesignal.inAppMessages.internal.a) c0026c.L$1;
                cVar = (c) c0026c.L$0;
                v6.a.W(obj);
                dVar2 = (com.onesignal.inAppMessages.internal.d) obj;
                if (dVar2 != null) {
                    z10 = false;
                } else {
                    Double displayDuration = dVar2.getDisplayDuration();
                    pc.j.b(displayDuration);
                    aVar.setDisplayDuration(displayDuration.doubleValue());
                    c0026c.L$0 = null;
                    c0026c.L$1 = null;
                    c0026c.label = 2;
                }
                return Boolean.valueOf(z10);
            }
        }
        c0026c = new C0026c(dVar);
        Object obj2 = c0026c.result;
        i10 = c0026c.label;
        boolean z102 = true;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
        }
        dVar2 = (com.onesignal.inAppMessages.internal.d) obj2;
        if (dVar2 != null) {
        }
        return Boolean.valueOf(z102);
    }
}
