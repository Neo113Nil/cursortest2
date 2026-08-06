package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602n2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0622nm fromModel(C0576m2 c0576m2) {
        C0570lm c0570lm;
        C0622nm c0622nm = new C0622nm();
        c0622nm.f6636a = new C0596mm[c0576m2.f6474a.size()];
        for (int i2 = 0; i2 < c0576m2.f6474a.size(); i2++) {
            C0596mm c0596mm = new C0596mm();
            Pair pair = (Pair) c0576m2.f6474a.get(i2);
            c0596mm.f6537a = (String) pair.first;
            if (pair.second != null) {
                c0596mm.f6538b = new C0570lm();
                C0550l2 c0550l2 = (C0550l2) pair.second;
                if (c0550l2 == null) {
                    c0570lm = null;
                } else {
                    C0570lm c0570lm2 = new C0570lm();
                    c0570lm2.f6465a = c0550l2.f6412a;
                    c0570lm = c0570lm2;
                }
                c0596mm.f6538b = c0570lm;
            }
            c0622nm.f6636a[i2] = c0596mm;
        }
        return c0622nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0576m2 toModel(C0622nm c0622nm) {
        ArrayList arrayList = new ArrayList();
        for (C0596mm c0596mm : c0622nm.f6636a) {
            String str = c0596mm.f6537a;
            C0570lm c0570lm = c0596mm.f6538b;
            arrayList.add(new Pair(str, c0570lm == null ? null : new C0550l2(c0570lm.f6465a)));
        }
        return new C0576m2(arrayList);
    }
}
