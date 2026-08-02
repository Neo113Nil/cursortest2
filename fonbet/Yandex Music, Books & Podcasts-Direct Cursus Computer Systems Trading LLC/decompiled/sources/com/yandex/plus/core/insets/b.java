package com.yandex.plus.core.insets;

import android.os.Build;
import android.view.View;
import defpackage.aqv;
import defpackage.hqv;
import defpackage.jpj;
import defpackage.kqv;
import defpackage.u75;
import defpackage.wpv;
import defpackage.xpv;
import defpackage.ypv;
import defpackage.zne;
import defpackage.zpv;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b implements jpj {
    public static final List c = u75.h(1, 2, 4, 8, 16, 32, 64, 128);
    public final LinkedHashMap a;
    public final int b;

    public b(LinkedHashMap linkedHashMap, int i) {
        this.a = linkedHashMap;
        this.b = i;
    }

    @Override // defpackage.jpj
    public final kqv G(View view, kqv kqvVar) {
        hqv hqvVar = kqvVar.a;
        view.getClass();
        for (Map.Entry entry : this.a.entrySet()) {
            e eVar = (e) entry.getKey();
            zne g = hqvVar.g(((Number) entry.getValue()).intValue());
            g.getClass();
            eVar.a(g);
        }
        zne g2 = hqvVar.g(this.b);
        g2.getClass();
        int i = Build.VERSION.SDK_INT;
        aqv zpvVar = i >= 34 ? new zpv(kqvVar) : i >= 30 ? new ypv(kqvVar) : i >= 29 ? new xpv(kqvVar) : new wpv(kqvVar);
        Iterator it = c.iterator();
        boolean z = true;
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            zne g3 = hqvVar.g(intValue);
            g3.getClass();
            zne c2 = zne.c(g3.a - g2.a, g3.b - g2.b, g3.c - g2.c, g3.d - g2.d);
            zne zneVar = zne.e;
            zne a = zne.a(c2, zneVar);
            if (z && !a.equals(zneVar)) {
                z = false;
            }
            zpvVar.c(intValue, a);
        }
        kqv b = zpvVar.b();
        b.getClass();
        if (!z) {
            return b;
        }
        kqv kqvVar2 = kqv.b;
        kqvVar2.getClass();
        return kqvVar2;
    }
}
