package com.onesignal.core.internal.startup;

import A3.p;
import B7.h;
import D4.e;
import I7.l;
import java.util.Iterator;
import u7.v;
import v4.d;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class c {
    private final d services;

    public static final class a extends h implements l {
        int label;

        public a(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return c.this.new a(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            for (b bVar : c.this.services.getAllServices(b.class)) {
                try {
                    bVar.start();
                } catch (Throwable th) {
                    com.onesignal.debug.internal.logging.b.error("OneSignal: Startable service failed: ".concat(bVar.getClass().getSimpleName()), th);
                }
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
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
        boolean z6;
        try {
            z6 = ((e) this.services.getService(e.class)).isEnabled(D4.b.SDK_BACKGROUND_THREADING);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to resolve BACKGROUND_THREADING in StartupService. Falling back to legacy thread.", th);
            z6 = false;
        }
        if (z6) {
            com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new a(null));
        } else {
            new Thread(new p(20, this)).start();
        }
    }
}
