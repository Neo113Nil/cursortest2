package com.gamericefishpro.space.xa;

import android.os.Bundle;
import com.gamericefishpro.space.i9.a1;
import com.gamericefishpro.space.i9.c1;
import com.gamericefishpro.space.i9.e1;
import com.gamericefishpro.space.i9.g0;
import com.gamericefishpro.space.i9.j1;
import com.gamericefishpro.space.i9.w0;
import com.gamericefishpro.space.i9.x0;
import com.gamericefishpro.space.i9.y0;
import com.gamericefishpro.space.i9.z0;
import com.gamericefishpro.space.n9.u2;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements u2 {
    public final /* synthetic */ j1 a;

    public c(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final void a(String str, String str2, Bundle bundle) {
        j1 j1Var = this.a;
        j1Var.a(new x0(j1Var, str, str2, bundle, 1));
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final long b() {
        g0 g0Var = new g0();
        j1 j1Var = this.a;
        j1Var.a(new c1(j1Var, g0Var, 2));
        Long l = (Long) g0.H(g0Var.G(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = j1Var.c + 1;
        j1Var.c = i;
        return jNextLong + ((long) i);
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final void c(String str, String str2, Bundle bundle) {
        j1 j1Var = this.a;
        j1Var.a(new x0(j1Var, str, str2, bundle, 0));
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final String d() {
        g0 g0Var = new g0();
        j1 j1Var = this.a;
        j1Var.a(new c1(j1Var, g0Var, 3));
        return g0Var.F(500L);
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final String e() {
        g0 g0Var = new g0();
        j1 j1Var = this.a;
        j1Var.a(new c1(j1Var, g0Var, 4));
        return g0Var.F(500L);
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final List f(String str, String str2) {
        g0 g0Var = new g0();
        j1 j1Var = this.a;
        j1Var.a(new y0(j1Var, str, str2, g0Var));
        List list = (List) g0.H(g0Var.G(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final void g(Bundle bundle) {
        j1 j1Var = this.a;
        j1Var.a(new w0(j1Var, bundle, 1));
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final int h(String str) {
        g0 g0Var = new g0();
        j1 j1Var = this.a;
        j1Var.a(new z0(j1Var, str, g0Var, 2));
        Integer num = (Integer) g0.H(g0Var.G(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final String i() {
        g0 g0Var = new g0();
        j1 j1Var = this.a;
        j1Var.a(new c1(j1Var, g0Var, 1));
        return g0Var.F(50L);
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final void j(String str) {
        j1 j1Var = this.a;
        j1Var.a(new a1(j1Var, str, 1));
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final String k() {
        g0 g0Var = new g0();
        j1 j1Var = this.a;
        j1Var.a(new c1(j1Var, g0Var, 0));
        return g0Var.F(500L);
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final Map l(String str, String str2, boolean z) {
        g0 g0Var = new g0();
        j1 j1Var = this.a;
        j1Var.a(new e1(j1Var, str, str2, z, g0Var));
        Bundle bundleG = g0Var.G(5000L);
        if (bundleG == null || bundleG.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleG.size());
        for (String str3 : bundleG.keySet()) {
            Object obj = bundleG.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final void m(String str) {
        j1 j1Var = this.a;
        j1Var.a(new a1(j1Var, str, 0));
    }
}
