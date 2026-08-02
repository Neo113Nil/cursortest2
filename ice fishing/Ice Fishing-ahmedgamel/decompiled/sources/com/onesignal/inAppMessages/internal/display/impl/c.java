package com.onesignal.inAppMessages.internal.display.impl;

import I7.p;
import S7.AbstractC0410y;
import S7.F;
import S7.InterfaceC0408w;
import X7.o;
import android.app.Activity;
import android.util.Base64;
import java.nio.charset.Charset;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class c implements R4.a {
    public static final a Companion = new a(null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final x4.f _applicationService;
    private final P4.b _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final K5.a _influenceManager;
    private final F4.a _languageContext;
    private final T4.b _lifecycle;
    private final W4.a _promptFactory;
    private final K4.a _time;
    private m lastInstance;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayMessage(null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.c$c, reason: collision with other inner class name */
    public static final class C0204c extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0204c(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayPreviewMessage(null, this);
        }
    }

    public static final class d extends B7.c {
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.initInAppMessage(null, null, null, this);
        }
    }

    public static final class e extends B7.h implements p {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ com.onesignal.inAppMessages.internal.d $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ m $webViewManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m mVar, Activity activity, String str, com.onesignal.inAppMessages.internal.d dVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$webViewManager = mVar;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = dVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new e(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((e) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    m mVar = this.$webViewManager;
                    Activity activity = this.$currentActivity;
                    String base64Str = this.$base64Str;
                    kotlin.jvm.internal.h.d(base64Str, "$base64Str");
                    boolean isFullBleed = this.$content.isFullBleed();
                    this.label = 1;
                    if (mVar.setupWebView(activity, base64Str, isFullBleed, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
            } catch (Exception e9) {
                if (e9.getMessage() != null) {
                    String message = e9.getMessage();
                    kotlin.jvm.internal.h.b(message);
                    if (Q7.j.k0(message, "No WebView installed", false)) {
                        com.onesignal.debug.internal.logging.b.info("Error setting up WebView: ", e9);
                    }
                }
                throw e9;
            }
            return v.f41073a;
        }
    }

    public static final class f extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showMessageContent(null, null, this);
        }
    }

    public c(x4.f _applicationService, T4.b _lifecycle, W4.a _promptFactory, P4.b _backend, K5.a _influenceManager, com.onesignal.core.internal.config.c _configModelStore, F4.a _languageContext, K4.a _time) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_lifecycle, "_lifecycle");
        kotlin.jvm.internal.h.e(_promptFactory, "_promptFactory");
        kotlin.jvm.internal.h.e(_backend, "_backend");
        kotlin.jvm.internal.h.e(_influenceManager, "_influenceManager");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_languageContext, "_languageContext");
        kotlin.jvm.internal.h.e(_time, "_time");
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
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(5:16|17|(1:19)(1:23)|20|(1:22))|11|12))|26|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        com.onesignal.debug.internal.logging.b.error("Catch on initInAppMessage: ", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initInAppMessage(Activity activity, com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, InterfaceC5240d interfaceC5240d) {
        d dVar2;
        int i;
        Activity activity2;
        com.onesignal.inAppMessages.internal.d dVar3;
        if (interfaceC5240d instanceof d) {
            dVar2 = (d) interfaceC5240d;
            int i4 = dVar2.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i4 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                A7.a aVar2 = A7.a.f215n;
                i = dVar2.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    String contentHtml = dVar.getContentHtml();
                    kotlin.jvm.internal.h.b(contentHtml);
                    Charset forName = Charset.forName("UTF-8");
                    kotlin.jvm.internal.h.d(forName, "forName(...)");
                    byte[] bytes = contentHtml.getBytes(forName);
                    kotlin.jvm.internal.h.d(bytes, "getBytes(...)");
                    String encodeToString = Base64.encodeToString(bytes, 2);
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
                    Z7.e eVar = F.f2998a;
                    T7.e eVar2 = o.f3811a;
                    e eVar3 = new e(mVar, activity2, encodeToString, dVar3, null);
                    dVar2.label = 1;
                    if (AbstractC0410y.y(eVar2, eVar3, dVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                return v.f41073a;
            }
        }
        dVar2 = new d(interfaceC5240d);
        Object obj2 = dVar2.result;
        A7.a aVar22 = A7.a.f215n;
        i = dVar2.label;
        if (i != 0) {
        }
        return v.f41073a;
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
    public final Object showMessageContent(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, InterfaceC5240d interfaceC5240d) {
        f fVar;
        int i;
        c cVar;
        c cVar2;
        com.onesignal.inAppMessages.internal.a aVar2;
        Activity activity;
        if (interfaceC5240d instanceof f) {
            fVar = (f) interfaceC5240d;
            int i4 = fVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fVar.label = i4 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                A7.a aVar3 = A7.a.f215n;
                i = fVar.label;
                v vVar = v.f41073a;
                if (i != 0) {
                    Q3.b.s(obj);
                    Activity current = this._applicationService.getCurrent();
                    com.onesignal.debug.internal.logging.b.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
                    if (current == null) {
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.label = 4;
                        if (AbstractC0410y.f(200L, fVar) != aVar3) {
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
                        m mVar = this.lastInstance;
                        kotlin.jvm.internal.h.b(mVar);
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.L$3 = current;
                        fVar.label = 1;
                        if (mVar.dismissAndAwaitNextMessage(fVar) != aVar3) {
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
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        Q3.b.s(obj);
                        return vVar;
                    }
                    if (i != 4) {
                        if (i == 5) {
                            Q3.b.s(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                    aVar = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                    cVar = (c) fVar.L$0;
                    Q3.b.s(obj);
                    fVar.L$0 = null;
                    fVar.L$1 = null;
                    fVar.L$2 = null;
                    fVar.label = 5;
                    return cVar.showMessageContent(aVar, dVar, fVar) != aVar3 ? aVar3 : vVar;
                }
                activity = (Activity) fVar.L$3;
                dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                aVar2 = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                cVar2 = (c) fVar.L$0;
                Q3.b.s(obj);
                cVar2.lastInstance = null;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.label = 2;
                if (cVar2.initInAppMessage(activity, aVar2, dVar, fVar) == aVar3) {
                    return vVar;
                }
            }
        }
        fVar = new f(interfaceC5240d);
        Object obj2 = fVar.result;
        A7.a aVar32 = A7.a.f215n;
        i = fVar.label;
        v vVar2 = v.f41073a;
        if (i != 0) {
        }
    }

    @Override // R4.a
    public void dismissCurrentInAppMessage() {
        com.onesignal.debug.internal.logging.b.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        m mVar = this.lastInstance;
        if (mVar != null) {
            kotlin.jvm.internal.h.b(mVar);
            mVar.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        if (r2.showMessageContent(r9, r10, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // R4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayMessage(com.onesignal.inAppMessages.internal.a aVar, InterfaceC5240d interfaceC5240d) {
        b bVar;
        int i;
        c cVar;
        P4.a aVar2;
        if (interfaceC5240d instanceof b) {
            bVar = (b) interfaceC5240d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                A7.a aVar3 = A7.a.f215n;
                i = bVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    P4.b bVar2 = this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    String messageId = aVar.getMessageId();
                    String variantIdForMessage = Q4.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    bVar.L$0 = this;
                    bVar.L$1 = aVar;
                    bVar.label = 1;
                    obj = bVar2.getIAMData(appId, messageId, variantIdForMessage, bVar);
                    if (obj != aVar3) {
                        cVar = this;
                    }
                    return aVar3;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    return Boolean.TRUE;
                }
                aVar = (com.onesignal.inAppMessages.internal.a) bVar.L$1;
                cVar = (c) bVar.L$0;
                Q3.b.s(obj);
                aVar2 = (P4.a) obj;
                if (aVar2.getContent() != null) {
                    if (aVar2.getShouldRetry()) {
                        return null;
                    }
                    return Boolean.FALSE;
                }
                com.onesignal.inAppMessages.internal.d content = aVar2.getContent();
                kotlin.jvm.internal.h.b(content);
                Double displayDuration = content.getDisplayDuration();
                kotlin.jvm.internal.h.b(displayDuration);
                aVar.setDisplayDuration(displayDuration.doubleValue());
                cVar._influenceManager.onInAppMessageDisplayed(aVar.getMessageId());
                com.onesignal.inAppMessages.internal.d content2 = aVar2.getContent();
                kotlin.jvm.internal.h.b(content2);
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 2;
            }
        }
        bVar = new b(interfaceC5240d);
        Object obj2 = bVar.result;
        A7.a aVar32 = A7.a.f215n;
        i = bVar.label;
        if (i != 0) {
        }
        aVar2 = (P4.a) obj2;
        if (aVar2.getContent() != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r2.showMessageContent(r8, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // R4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayPreviewMessage(String str, InterfaceC5240d interfaceC5240d) {
        C0204c c0204c;
        int i;
        com.onesignal.inAppMessages.internal.a aVar;
        c cVar;
        com.onesignal.inAppMessages.internal.d dVar;
        if (interfaceC5240d instanceof C0204c) {
            c0204c = (C0204c) interfaceC5240d;
            int i4 = c0204c.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0204c.label = i4 - Integer.MIN_VALUE;
                Object obj = c0204c.result;
                A7.a aVar2 = A7.a.f215n;
                i = c0204c.label;
                boolean z6 = true;
                if (i != 0) {
                    Q3.b.s(obj);
                    com.onesignal.inAppMessages.internal.a aVar3 = new com.onesignal.inAppMessages.internal.a(true, this._time);
                    P4.b bVar = this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    c0204c.L$0 = this;
                    c0204c.L$1 = aVar3;
                    c0204c.label = 1;
                    Object iAMPreviewData = bVar.getIAMPreviewData(appId, str, c0204c);
                    if (iAMPreviewData != aVar2) {
                        obj = iAMPreviewData;
                        aVar = aVar3;
                        cVar = this;
                    }
                    return aVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    return Boolean.valueOf(z6);
                }
                aVar = (com.onesignal.inAppMessages.internal.a) c0204c.L$1;
                cVar = (c) c0204c.L$0;
                Q3.b.s(obj);
                dVar = (com.onesignal.inAppMessages.internal.d) obj;
                if (dVar != null) {
                    z6 = false;
                } else {
                    Double displayDuration = dVar.getDisplayDuration();
                    kotlin.jvm.internal.h.b(displayDuration);
                    aVar.setDisplayDuration(displayDuration.doubleValue());
                    c0204c.L$0 = null;
                    c0204c.L$1 = null;
                    c0204c.label = 2;
                }
                return Boolean.valueOf(z6);
            }
        }
        c0204c = new C0204c(interfaceC5240d);
        Object obj2 = c0204c.result;
        A7.a aVar22 = A7.a.f215n;
        i = c0204c.label;
        boolean z62 = true;
        if (i != 0) {
        }
        dVar = (com.onesignal.inAppMessages.internal.d) obj2;
        if (dVar != null) {
        }
        return Boolean.valueOf(z62);
    }
}
