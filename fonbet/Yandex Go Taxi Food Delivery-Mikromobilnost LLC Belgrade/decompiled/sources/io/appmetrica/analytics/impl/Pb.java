package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class Pb extends AbstractC0668r3 {
    public final Sb b;

    public Pb(int i, Sb sb) {
        super(i);
        this.b = sb;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0668r3, io.appmetrica.analytics.impl.Sb
    public final C0490kr a(List<Object> list) {
        int i;
        int i2 = 0;
        if (list == null || (list.size() <= this.a && this.b == null)) {
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i = 0;
            int i3 = 0;
            for (Object obj : list) {
                if (i3 < this.a) {
                    Sb sb = this.b;
                    if (sb != null) {
                        C0490kr a = sb.a(obj);
                        Object obj2 = a.a;
                        i += a.b.getBytesTruncated();
                        Or.a(obj, a.a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i2++;
                    i += b(obj);
                }
                i3++;
            }
            list = arrayList;
        }
        return new C0490kr(list, new C0411i5(i2, i));
    }

    public final Sb b() {
        return this.b;
    }

    public int b(Object obj) {
        return 0;
    }

    public Pb(int i) {
        this(i, null);
    }
}
