package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.qoi0;
import defpackage.tls;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.C0739tg;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0739tg implements NativeCrashHandler {
    public final tls a;
    public final IHandlerExecutor b = Jb.k().w().g();
    public final C0826wg c;

    public C0739tg(Context context, Bj bj, tls tlsVar, Cg cg, Hc hc, String str, InterfaceC0913zg interfaceC0913zg) {
        this.a = tlsVar;
        this.c = new C0826wg(context, bj, cg, hc, interfaceC0913zg);
    }

    public static final void a(C0739tg c0739tg, NativeCrash nativeCrash, File file) {
        c0739tg.a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        W0 w0;
        try {
            w0 = new W0(nativeCrash.getSource(), nativeCrash.getHandlerVersion(), nativeCrash.getUuid(), nativeCrash.getDumpFile(), nativeCrash.getCreationTime(), Y0.a(nativeCrash.getKju0.j java.lang.String()));
        } catch (Throwable unused) {
            w0 = null;
        }
        if (w0 == null) {
            this.a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(w0.f.a).info("Detected native crash with uuid = " + w0.c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.b;
        C0826wg c0826wg = this.c;
        Consumer consumer = new Consumer() { // from class: gf81
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C0739tg.a(C0739tg.this, nativeCrash, (File) obj);
            }
        };
        c0826wg.getClass();
        C0624pg c0624pg = new C0624pg(new C0681rg(w0.a, w0.b), c0826wg.g);
        C0537mg c0537mg = new C0537mg(c0826wg.b, w0.f, new C0797vg(w0, c0826wg.d, c0826wg.e));
        C0676rb c0676rb = c0826wg.f;
        String str = w0.d;
        c0676rb.getClass();
        File file = new File(str);
        Context context = c0826wg.a;
        if (C0648qb.c == null) {
            synchronized (qoi0.a(C0648qb.class)) {
                if (C0648qb.c == null) {
                    C0648qb.c = new C0648qb(context);
                }
            }
        }
        C0648qb c0648qb = C0648qb.c;
        iHandlerExecutor.execute(new Ni(file, c0624pg, consumer, c0537mg, c0648qb == null ? null : c0648qb, c0826wg.c.a(w0)));
    }
}
