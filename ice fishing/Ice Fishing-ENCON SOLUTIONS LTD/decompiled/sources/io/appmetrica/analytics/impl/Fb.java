package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Fb {

    /* renamed from: a, reason: collision with root package name */
    public final O2 f4378a;

    /* renamed from: b, reason: collision with root package name */
    public final C0421g2 f4379b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4380c;

    public Fb(O2 o2, C0421g2 c0421g2) {
        ArrayList arrayList = new ArrayList();
        this.f4380c = arrayList;
        this.f4378a = o2;
        arrayList.add(o2);
        this.f4379b = c0421g2;
        arrayList.add(c0421g2);
    }

    public final synchronized void a() {
        Iterator it = this.f4380c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0568lk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C0584ma c0584ma) {
        this.f4380c.add(c0584ma);
    }
}
