package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0543mm extends Aj {
    public C0543mm(S5 s5) {
        super(s5);
        s5.a().a();
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        Object remove;
        for (Map.Entry entry : k6.p.entrySet()) {
            Cdo cdo = this.a.u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                cdo.getClass();
                if (bArr.length != 0) {
                    remove = cdo.b.put(str, bArr);
                    C0401ho c0401ho = cdo.a;
                    c0401ho.d.insert(c0401ho.a, c0401ho.c.toByteArray((C0372go) c0401ho.b.fromModel(cdo.b)));
                }
            }
            remove = cdo.b.remove(str);
            C0401ho c0401ho2 = cdo.a;
            c0401ho2.d.insert(c0401ho2.a, c0401ho2.c.toByteArray((C0372go) c0401ho2.b.fromModel(cdo.b)));
        }
        return true;
    }
}
