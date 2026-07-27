package com.onesignal.debug.internal.crash;

import B5.m;
import D.RunnableC0281a;
import E7.l;
import E7.p;
import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import g1.C4523c;
import g1.C4524d;
import kotlin.jvm.internal.i;
import q7.InterfaceC4936e;
import q7.v;
import v7.C5139j;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class b implements com.onesignal.core.internal.startup.b {
    private final t4.f applicationService;
    private final z4.e featureManager;
    private final InterfaceC4936e uploader$delegate;

    public static final class a extends h implements l {
        int label;

        public a(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return b.this.new a(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E5.f uploader = b.this.getUploader();
                    this.label = 1;
                    if (uploader.c(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("OneSignal: Crash uploader failed to start: " + th.getMessage(), th);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    /* renamed from: com.onesignal.debug.internal.crash.b$b, reason: collision with other inner class name */
    public static final class C0195b extends h implements p {
        int label;

        public C0195b(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new C0195b(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C0195b) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                E5.f uploader = b.this.getUploader();
                this.label = 1;
                if (uploader.c(this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }
    }

    public static final class c extends i implements E7.a {

        public static final class a extends i implements E7.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // E7.a
            public final z4.e invoke() {
                return this.this$0.featureManager;
            }
        }

        public c() {
            super(0);
        }

        @Override // E7.a
        public final E5.f invoke() {
            com.onesignal.debug.internal.logging.otel.android.c platformProvider = com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(b.this.applicationService.getAppContext(), new a(b.this));
            com.onesignal.debug.internal.logging.otel.android.a aVar = new com.onesignal.debug.internal.logging.otel.android.a();
            kotlin.jvm.internal.h.e(platformProvider, "platformProvider");
            return new E5.f(new m(platformProvider, new C4524d(4, platformProvider), new C4523c(3, platformProvider)), platformProvider, aVar);
        }
    }

    public b(t4.f applicationService, z4.e featureManager) {
        kotlin.jvm.internal.h.e(applicationService, "applicationService");
        kotlin.jvm.internal.h.e(featureManager, "featureManager");
        this.applicationService = applicationService;
        this.featureManager = featureManager;
        this.uploader$delegate = com.bumptech.glide.e.q(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E5.f getUploader() {
        return (E5.f) this.uploader$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(b this$0) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        try {
            AbstractC0399y.s(C5139j.f41372n, this$0.new C0195b(null));
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Crash uploader failed to start: " + th.getMessage(), th);
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        if (f.INSTANCE.isSupported()) {
            if (this.featureManager.isEnabled(z4.b.SDK_BACKGROUND_THREADING)) {
                com.onesignal.common.threading.b.INSTANCE.launchOnIO(new a(null));
            } else {
                new Thread(new RunnableC0281a(20, this)).start();
            }
        }
    }
}
