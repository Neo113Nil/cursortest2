package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.f1d;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();
    public static final arf[] h;
    public final String a;
    public final c6 b;
    public final Map c;
    public final t1 d;
    public final Map e;
    public final int f;
    public final p4 g;

    static {
        bwf bwfVar = bwf.b;
        h = new arf[]{null, btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(24)), btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(25)), btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(26)), btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(27)), null, btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(28))};
    }

    public /* synthetic */ g0(int i, String str, c6 c6Var, Map map, t1 t1Var, Map map2, int i2, p4 p4Var) {
        if (127 != (i & 127)) {
            u7g.V(i, 127, e0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = c6Var;
        this.c = map;
        this.d = t1Var;
        this.e = map2;
        this.f = i2;
        this.g = p4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.a, g0Var.a) && Intrinsics.d(this.b, g0Var.b) && Intrinsics.d(this.c, g0Var.c) && Intrinsics.d(this.d, g0Var.d) && Intrinsics.d(this.e, g0Var.e) && this.f == g0Var.f && Intrinsics.d(this.g, g0Var.g);
    }

    public final int hashCode() {
        int b = f1d.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        t1 t1Var = this.d;
        int a = f1d.a(this.f, f1d.b(this.e, (b + (t1Var == null ? 0 : t1Var.hashCode())) * 31, 31), 31);
        p4 p4Var = this.g;
        return a + (p4Var != null ? p4Var.hashCode() : 0);
    }

    public final String toString() {
        return "DefaultPlaqueDto(id=" + this.a + ", rootWidget=" + this.b + ", metricContext=" + this.c + ", notification=" + this.d + ", serviceMeta=" + this.e + ", priority=" + this.f + ", rootPredicate=" + this.g + ')';
    }

    public g0(String str, i5 i5Var, Map map, t1 t1Var, Map map2, int i, p4 p4Var) {
        this.a = str;
        this.b = i5Var;
        this.c = map;
        this.d = t1Var;
        this.e = map2;
        this.f = i;
        this.g = p4Var;
    }
}
