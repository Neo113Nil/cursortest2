package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Xi extends Rg {
    public Xi(X4 x4) {
        super(x4);
        x4.b().a();
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        Object remove;
        for (Map.Entry entry : p5.f4919p.entrySet()) {
            Jk jk = this.f4998a.f5365u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                jk.getClass();
                if (bArr.length != 0) {
                    remove = jk.f4605b.put(str, bArr);
                    Nk nk = jk.f4604a;
                    nk.f4833d.insert(nk.f4830a, nk.f4832c.toByteArray((Mk) nk.f4831b.fromModel(jk.f4605b)));
                }
            }
            remove = jk.f4605b.remove(str);
            Nk nk2 = jk.f4604a;
            nk2.f4833d.insert(nk2.f4830a, nk2.f4832c.toByteArray((Mk) nk2.f4831b.fromModel(jk.f4605b)));
        }
        return true;
    }
}
