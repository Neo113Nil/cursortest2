package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0207b3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Jp fromModel(C0178a3 c0178a3) {
        Hp hp;
        Jp jp = new Jp();
        jp.a = new Ip[c0178a3.a.size()];
        for (int i = 0; i < c0178a3.a.size(); i++) {
            Ip ip = new Ip();
            Pair pair = (Pair) c0178a3.a.get(i);
            ip.a = (String) pair.first;
            if (pair.second != null) {
                ip.b = new Hp();
                Z2 z2 = (Z2) pair.second;
                if (z2 == null) {
                    hp = null;
                } else {
                    Hp hp2 = new Hp();
                    hp2.a = z2.a;
                    hp = hp2;
                }
                ip.b = hp;
            }
            jp.a[i] = ip;
        }
        return jp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0178a3 toModel(Jp jp) {
        ArrayList arrayList = new ArrayList();
        for (Ip ip : jp.a) {
            String str = ip.a;
            Hp hp = ip.b;
            arrayList.add(new Pair(str, hp == null ? null : new Z2(hp.a)));
        }
        return new C0178a3(arrayList);
    }
}
