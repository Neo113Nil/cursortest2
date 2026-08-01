package com.onesignal.debug.internal.crash;

import B7.h;
import D.RunnableC0282a;
import F5.m;
import I0.j;
import I7.l;
import I7.p;
import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import a.AbstractC0422a;
import g1.C4522b;
import kotlin.jvm.internal.i;
import u7.InterfaceC5087e;
import u7.v;
import z7.C5273j;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b implements com.onesignal.core.internal.startup.b {
    private final x4.f applicationService;
    private final D4.e featureManager;
    private final InterfaceC5087e uploader$delegate;

    public static final class a extends h implements l {
        int label;

        public a(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return b.this.new a(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.d.k(obj);
                    I5.f uploader = b.this.getUploader();
                    this.label = 1;
                    if (uploader.c(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("OneSignal: Crash uploader failed to start: " + th.getMessage(), th);
            }
            return v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((a) create(interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    /* renamed from: com.onesignal.debug.internal.crash.b$b, reason: collision with other inner class name */
    public static final class C0196b extends h implements p {
        int label;

        public C0196b(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new C0196b(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C0196b) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                I5.f uploader = b.this.getUploader();
                this.label = 1;
                if (uploader.c(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41353a;
        }
    }

    public static final class c extends i implements I7.a {

        public static final class a extends i implements I7.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // I7.a
            public final D4.e invoke() {
                return this.this$0.featureManager;
            }
        }

        public c() {
            super(0);
        }

        @Override // I7.a
        public final I5.f invoke() {
            com.onesignal.debug.internal.logging.otel.android.c platformProvider = com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(b.this.applicationService.getAppContext(), new a(b.this));
            com.onesignal.debug.internal.logging.otel.android.a aVar = new com.onesignal.debug.internal.logging.otel.android.a();
            kotlin.jvm.internal.h.e(platformProvider, "platformProvider");
            return new I5.f(new m(platformProvider, new C4522b(4, platformProvider), new j(5, platformProvider)), platformProvider, aVar);
        }
    }

    public b(x4.f applicationService, D4.e featureManager) {
        kotlin.jvm.internal.h.e(applicationService, "applicationService");
        kotlin.jvm.internal.h.e(featureManager, "featureManager");
        this.applicationService = applicationService;
        this.featureManager = featureManager;
        this.uploader$delegate = AbstractC0422a.q(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final I5.f getUploader() {
        return (I5.f) this.uploader$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(b this$0) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        try {
            AbstractC0406y.s(C5273j.f42272n, this$0.new C0196b(null));
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Crash uploader failed to start: " + th.getMessage(), th);
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        if (f.INSTANCE.isSupported()) {
            if (this.featureManager.isEnabled(D4.b.SDK_BACKGROUND_THREADING)) {
                com.onesignal.common.threading.b.INSTANCE.launchOnIO(new a(null));
            } else {
                new Thread(new RunnableC0282a(20, this)).start();
            }
        }
    }
}
