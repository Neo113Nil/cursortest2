package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* loaded from: classes.dex */
public final class Tf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f5110a;

    /* renamed from: b, reason: collision with root package name */
    public final Function f5111b;

    /* renamed from: c, reason: collision with root package name */
    public final Consumer f5112c;

    /* renamed from: d, reason: collision with root package name */
    public final Consumer f5113d;

    /* renamed from: e, reason: collision with root package name */
    public final Z9 f5114e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0285al f5115f;

    public Tf(File file, Function function, Consumer consumer, Consumer consumer2, Z9 z9, InterfaceC0285al interfaceC0285al) {
        this.f5110a = file;
        this.f5111b = function;
        this.f5112c = consumer;
        this.f5113d = consumer2;
        this.f5114e = z9;
        this.f5115f = interfaceC0285al;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5110a.exists()) {
            C0868x9 b2 = this.f5114e.b(this.f5110a.getName());
            Consumer consumer = this.f5112c;
            try {
                b2.f7194a.lock();
                b2.f7195b.a();
            } catch (Throwable unused) {
            }
            if (!this.f5110a.exists()) {
                consumer.consume(this.f5110a);
                b2.c();
                Z9 z9 = this.f5114e;
                String name = this.f5110a.getName();
                synchronized (z9) {
                    z9.f5492b.remove(name);
                }
                return;
            }
            Object apply = this.f5111b.apply(this.f5110a);
            if (apply != null) {
                if (this.f5115f.a(apply)) {
                    this.f5113d.consume(apply);
                } else {
                    consumer = new Qo();
                }
            }
            consumer.consume(this.f5110a);
            b2.c();
            this.f5114e.a(this.f5110a.getName());
        }
    }
}
