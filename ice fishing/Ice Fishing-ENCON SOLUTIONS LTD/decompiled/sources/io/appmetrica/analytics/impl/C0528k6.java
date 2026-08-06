package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528k6 implements Fa {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f6350a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(Throwable th, V v2) {
        Iterator it = this.f6350a.iterator();
        while (it.hasNext()) {
            ((Fa) it.next()).a(th, v2);
        }
    }

    public final void a(Fa... faArr) {
        i1.o.F(this.f6350a, faArr);
    }

    public final void a(List<? extends Fa> list) {
        this.f6350a.addAll(list);
    }

    public final void a() {
        this.f6350a.clear();
    }
}
