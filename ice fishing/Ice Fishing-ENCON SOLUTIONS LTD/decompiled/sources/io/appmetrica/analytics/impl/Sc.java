package io.appmetrica.analytics.impl;

import i1.AbstractC0252i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Sc {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5054a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.f5054a;
            ArrayList arrayList3 = new ArrayList(i1.k.E(arrayList2));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Rc) it.next()).a());
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC0252i.R(AbstractC0252i.U(arrayList));
    }

    public final synchronized void a(Rc... rcArr) {
        i1.o.F(this.f5054a, rcArr);
    }
}
