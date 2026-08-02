package io.appmetrica.analytics.impl;

import defpackage.yvw;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0754wi implements Runnable {
    public final File a;
    public final Function b;
    public final Consumer c;
    public final Consumer d;
    public final C0314hb e;
    public final Cdo f;

    public RunnableC0754wi(File file, Function function, Consumer consumer, Consumer consumer2, C0314hb c0314hb, Cdo cdo) {
        this.a = file;
        this.b = function;
        this.c = consumer;
        this.d = consumer2;
        this.e = c0314hb;
        this.f = cdo;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.exists()) {
            Fa b = this.e.b(this.a.getName());
            Consumer consumer = this.c;
            try {
                b.a.lock();
                b.b.a();
            } catch (Throwable unused) {
            }
            if (!this.a.exists()) {
                consumer.consume(this.a);
                b.c();
                C0314hb c0314hb = this.e;
                String name = this.a.getName();
                synchronized (c0314hb) {
                    c0314hb.b.remove(name);
                }
                return;
            }
            Object apply = this.b.apply(this.a);
            if (apply != null) {
                if (this.f.a(apply)) {
                    this.d.consume(apply);
                } else {
                    consumer = new yvw();
                }
            }
            consumer.consume(this.a);
            b.c();
            this.e.a(this.a.getName());
        }
    }
}
