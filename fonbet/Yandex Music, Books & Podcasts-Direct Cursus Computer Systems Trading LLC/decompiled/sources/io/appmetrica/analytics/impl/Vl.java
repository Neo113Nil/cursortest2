package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Vl extends AbstractC0697uj {
    public Vl(@NotNull P5 p5) {
        super(p5);
        p5.b().a();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NotNull H6 h6) {
        Object remove;
        for (Map.Entry entry : h6.p.entrySet()) {
            Kn kn = this.a.u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                kn.getClass();
                if (bArr.length != 0) {
                    remove = kn.b.put(str, bArr);
                    On on = kn.a;
                    on.d.insert(on.a, on.c.toByteArray((Nn) on.b.fromModel(kn.b)));
                }
            }
            remove = kn.b.remove(str);
            On on2 = kn.a;
            on2.d.insert(on2.a, on2.c.toByteArray((Nn) on2.b.fromModel(kn.b)));
        }
        return true;
    }
}
