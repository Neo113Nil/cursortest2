package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280ag implements Wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0383eg f5567a;

    public C0280ag(C0383eg c0383eg) {
        this.f5567a = c0383eg;
    }

    @Override // io.appmetrica.analytics.impl.Wf
    public final void a() {
        C0383eg c0383eg = this.f5567a;
        ArrayList arrayList = c0383eg.f5942g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C0616ng c0616ng = (C0616ng) next;
            c0383eg.f5938c.getClass();
            String str = c0616ng != null ? c0616ng.f6624a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 != null) {
                arrayList3.add(next2);
            }
        }
        c0383eg.a(c0383eg.f5938c.a(arrayList3));
    }
}
