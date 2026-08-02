package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0133b3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0616rp fromModel(@NonNull C0104a3 c0104a3) {
        C0559pp c0559pp;
        C0616rp c0616rp = new C0616rp();
        c0616rp.a = new C0588qp[c0104a3.a.size()];
        for (int i = 0; i < c0104a3.a.size(); i++) {
            C0588qp c0588qp = new C0588qp();
            Pair pair = (Pair) c0104a3.a.get(i);
            c0588qp.a = (String) pair.first;
            if (pair.second != null) {
                c0588qp.b = new C0559pp();
                Z2 z2 = (Z2) pair.second;
                if (z2 == null) {
                    c0559pp = null;
                } else {
                    C0559pp c0559pp2 = new C0559pp();
                    c0559pp2.a = z2.a;
                    c0559pp = c0559pp2;
                }
                c0588qp.b = c0559pp;
            }
            c0616rp.a[i] = c0588qp;
        }
        return c0616rp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0104a3 toModel(@NonNull C0616rp c0616rp) {
        ArrayList arrayList = new ArrayList();
        for (C0588qp c0588qp : c0616rp.a) {
            String str = c0588qp.a;
            C0559pp c0559pp = c0588qp.b;
            arrayList.add(new Pair(str, c0559pp == null ? null : new Z2(c0559pp.a)));
        }
        return new C0104a3(arrayList);
    }
}
