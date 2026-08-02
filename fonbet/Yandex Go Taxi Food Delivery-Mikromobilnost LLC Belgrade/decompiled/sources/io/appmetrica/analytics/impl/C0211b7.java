package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.qoi0;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0211b7 implements Consumer {
    public final Executor a;
    public final Dj b;

    public C0211b7(Context context, Y6 y6, Hc hc, InterfaceC0892yo interfaceC0892yo, Executor executor, String str, InterfaceC0441j7 interfaceC0441j7) {
        this.a = executor;
        this.b = new Dj(context, y6, hc, interfaceC0892yo, interfaceC0441j7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.a;
        Dj dj = this.b;
        C0246cd c0246cd = dj.d;
        Consumer consumer = dj.f;
        Context context = dj.a;
        if (C0648qb.c == null) {
            synchronized (qoi0.a(C0648qb.class)) {
                if (C0648qb.c == null) {
                    C0648qb.c = new C0648qb(context);
                }
            }
        }
        C0648qb c0648qb = C0648qb.c;
        if (c0648qb == null) {
            c0648qb = null;
        }
        executor.execute(new Ni(file, c0246cd, c0246cd, consumer, c0648qb, dj.b));
    }
}
