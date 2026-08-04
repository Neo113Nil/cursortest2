package com.gamericefishpro.space.ya;

import android.os.Bundle;
import com.gamericefishpro.space.i9.j1;
import com.gamericefishpro.space.i9.x0;
import com.gamericefishpro.space.m.d;
import com.gamericefishpro.space.ua.h;
import com.gamericefishpro.space.v8.c0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {
    public static volatile b b;
    public final d a;

    public b(d dVar) {
        c0.g(dVar);
        this.a = dVar;
        new ConcurrentHashMap();
    }

    public final void a(String str, Bundle bundle) {
        if (com.gamericefishpro.space.za.a.b.contains("fcm") || com.gamericefishpro.space.za.a.a.contains(str)) {
            return;
        }
        h hVar = com.gamericefishpro.space.za.a.c;
        int i = hVar.v;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean zContainsKey = bundle.containsKey((String) hVar.get(i3));
            i3++;
            if (zContainsKey) {
                return;
            }
        }
        if ("_cmp".equals(str)) {
            if (com.gamericefishpro.space.za.a.b.contains("fcm")) {
                return;
            }
            h hVar2 = com.gamericefishpro.space.za.a.c;
            int i4 = hVar2.v;
            while (i2 < i4) {
                boolean zContainsKey2 = bundle.containsKey((String) hVar2.get(i2));
                i2++;
                if (zContainsKey2) {
                    return;
                }
            }
            bundle.putString("_cis", "fcm_integration");
        }
        j1 j1Var = (j1) this.a.e;
        j1Var.a(new x0(j1Var, "fcm", str, bundle, 1));
    }
}
