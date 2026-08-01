package com.onesignal.core.internal.startup;

import B7.h;
import D.RunnableC0282a;
import D4.e;
import I7.l;
import java.util.Iterator;
import u7.v;
import v4.d;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class c {
    private final d services;

    public static final class a extends h implements l {
        int label;

        public a(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return c.this.new a(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            for (b bVar : c.this.services.getAllServices(b.class)) {
                try {
                    bVar.start();
                } catch (Throwable th) {
                    com.onesignal.debug.internal.logging.b.error("OneSignal: Startable service failed: ".concat(bVar.getClass().getSimpleName()), th);
                }
            }
            return v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((a) create(interfaceC5267d)).invokeSuspend(v.f41353a);
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
        boolean z3;
        try {
            z3 = ((e) this.services.getService(e.class)).isEnabled(D4.b.SDK_BACKGROUND_THREADING);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to resolve BACKGROUND_THREADING in StartupService. Falling back to legacy thread.", th);
            z3 = false;
        }
        if (z3) {
            com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new a(null));
        } else {
            new Thread(new RunnableC0282a(19, this)).start();
        }
    }
}
