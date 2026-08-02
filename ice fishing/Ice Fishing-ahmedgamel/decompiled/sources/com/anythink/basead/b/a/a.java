package com.anythink.basead.b.a;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a<R, E> implements e<R, E> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f6485a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f6486b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<Integer> f6487c = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private d<R, E> f6488d;

    @Override // com.anythink.basead.b.a.e
    public final void a(int i) {
        if (this.f6485a.get() || this.f6487c.contains(Integer.valueOf(i))) {
            return;
        }
        this.f6487c.add(Integer.valueOf(i));
        if (this.f6486b.decrementAndGet() == 0) {
            this.f6485a.set(true);
            d<R, E> dVar = this.f6488d;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    @Override // com.anythink.basead.b.a.e
    public final void b(int i) {
        this.f6486b.set(i);
    }

    @Override // com.anythink.basead.b.a.e
    public final void a(E e9) {
        if (this.f6485a.get()) {
            return;
        }
        this.f6485a.set(true);
        d<R, E> dVar = this.f6488d;
        if (dVar != null) {
            dVar.a(e9);
        }
    }

    @Override // com.anythink.basead.b.a.e
    public final void a(d<R, E> dVar) {
        this.f6488d = dVar;
    }
}
