package io.appmetrica.analytics.impl;

import defpackage.tcc;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class Me {
    public final ArrayList a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.a;
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C0498l6) it.next()).a);
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
        return kotlin.collections.a.I(arrayList);
    }

    public final synchronized void a(C0498l6... c0498l6Arr) {
        ycc.t(this.a, c0498l6Arr);
    }
}
