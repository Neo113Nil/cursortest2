package com.onesignal.core.internal.startup;

import D.RunnableC0281a;
import E7.l;
import com.bumptech.glide.f;
import java.util.Iterator;
import q7.v;
import r4.d;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;
import z4.e;

/* loaded from: classes2.dex */
public final class c {
    private final d services;

    public static final class a extends h implements l {
        int label;

        public a(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return c.this.new a(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.r(obj);
            for (b bVar : c.this.services.getAllServices(b.class)) {
                try {
                    bVar.start();
                } catch (Throwable th) {
                    com.onesignal.debug.internal.logging.b.error("OneSignal: Startable service failed: ".concat(bVar.getClass().getSimpleName()), th);
                }
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public c(d services) {
        kotlin.jvm.internal.h.e(services, "services");
        this.services = services;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleStart$lambda$2(c this$0) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        for (b bVar : this$0.services.getAllServices(b.class)) {
            try {
                bVar.start();
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("OneSignal: Startable service failed: ".concat(bVar.getClass().getSimpleName()), th);
            }
        }
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(com.onesignal.core.internal.startup.a.class).iterator();
        while (it.hasNext()) {
            ((com.onesignal.core.internal.startup.a) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        boolean z8;
        try {
            z8 = ((e) this.services.getService(e.class)).isEnabled(z4.b.SDK_BACKGROUND_THREADING);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to resolve BACKGROUND_THREADING in StartupService. Falling back to legacy thread.", th);
            z8 = false;
        }
        if (z8) {
            com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new a(null));
        } else {
            new Thread(new RunnableC0281a(19, this)).start();
        }
    }
}
