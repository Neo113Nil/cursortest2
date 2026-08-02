package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0794vd {
    public final D3 a;
    public final T2 b;
    public final ArrayList c;

    public C0794vd(D3 d3, T2 t2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = d3;
        arrayList.add(d3);
        this.b = t2;
        arrayList.add(t2);
    }

    public final synchronized void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((Dn) it.next()).onCreate();
        }
    }

    public final synchronized void a(Ib ib) {
        this.c.add(ib);
    }
}
