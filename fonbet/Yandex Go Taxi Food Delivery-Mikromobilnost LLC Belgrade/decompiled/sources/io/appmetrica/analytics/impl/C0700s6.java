package io.appmetrica.analytics.impl;

import defpackage.scc;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0700s6 implements U9, InterfaceC0387ha {
    public final I7 a;
    public final AtomicLong b;

    public C0700s6(I7 i7) {
        this.a = i7;
        this.b = new AtomicLong(i7.a(AbstractC0924zr.a()));
        i7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0387ha
    public final void a(List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC0924zr.a.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        this.b.addAndGet(i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0387ha
    public final void b(List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC0924zr.a.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        this.b.addAndGet(-i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0387ha
    public final void a() {
        this.b.set(this.a.a(AbstractC0924zr.a));
    }

    @Override // io.appmetrica.analytics.impl.U9
    public final boolean b() {
        return this.b.get() > 0;
    }
}
