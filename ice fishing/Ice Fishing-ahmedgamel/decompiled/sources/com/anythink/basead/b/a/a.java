package com.anythink.basead.b.a;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a<R, E> implements e<R, E> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f5699a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f5700b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<Integer> f5701c = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private d<R, E> f5702d;

    @Override // com.anythink.basead.b.a.e
    public final void a(int i) {
        if (this.f5699a.get() || this.f5701c.contains(Integer.valueOf(i))) {
            return;
        }
        this.f5701c.add(Integer.valueOf(i));
        if (this.f5700b.decrementAndGet() == 0) {
            this.f5699a.set(true);
            d<R, E> dVar = this.f5702d;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    @Override // com.anythink.basead.b.a.e
    public final void b(int i) {
        this.f5700b.set(i);
    }

    @Override // com.anythink.basead.b.a.e
    public final void a(E e9) {
        if (this.f5699a.get()) {
            return;
        }
        this.f5699a.set(true);
        d<R, E> dVar = this.f5702d;
        if (dVar != null) {
            dVar.a(e9);
        }
    }

    @Override // com.anythink.basead.b.a.e
    public final void a(d<R, E> dVar) {
        this.f5702d = dVar;
    }
}
