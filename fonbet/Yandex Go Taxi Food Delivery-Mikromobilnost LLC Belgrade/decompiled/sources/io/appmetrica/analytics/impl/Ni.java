package io.appmetrica.analytics.impl;

import defpackage.ua60;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* loaded from: classes4.dex */
public final class Ni implements Runnable {
    public final File a;
    public final Function b;
    public final Consumer c;
    public final Consumer d;
    public final C0648qb e;
    public final InterfaceC0892yo f;

    public Ni(File file, Function function, Consumer consumer, Consumer consumer2, C0648qb c0648qb, InterfaceC0892yo interfaceC0892yo) {
        this.a = file;
        this.b = function;
        this.c = consumer;
        this.d = consumer2;
        this.e = c0648qb;
        this.f = interfaceC0892yo;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.exists()) {
            Ma b = this.e.b(this.a.getName());
            Consumer consumer = this.c;
            try {
                b.a.lock();
                b.b.a();
            } catch (Throwable unused) {
            }
            if (!this.a.exists()) {
                consumer.consume(this.a);
                b.c();
                C0648qb c0648qb = this.e;
                String name = this.a.getName();
                synchronized (c0648qb) {
                    c0648qb.b.remove(name);
                }
                return;
            }
            Object apply = this.b.apply(this.a);
            if (apply != null) {
                if (this.f.a(apply)) {
                    this.d.consume(apply);
                } else {
                    consumer = new ua60();
                }
            }
            consumer.consume(this.a);
            b.c();
            this.e.a(this.a.getName());
        }
    }
}
