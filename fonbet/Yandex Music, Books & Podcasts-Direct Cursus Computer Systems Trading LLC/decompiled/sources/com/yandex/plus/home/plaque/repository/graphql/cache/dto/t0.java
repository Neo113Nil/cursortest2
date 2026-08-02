package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class t0 {

    @NotNull
    public static final j0 Companion = new j0();
    public static final arf[] h;
    public final w0 a;
    public final List b;
    public final z4 c;
    public final Integer d;
    public final k0 e;
    public final l0 f;
    public final s0 g;

    static {
        bwf bwfVar = bwf.b;
        h = new arf[]{null, btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(29)), null, null, btf.a(bwfVar, new h0(0)), btf.a(bwfVar, new h0(1)), btf.a(bwfVar, new h0(2))};
    }

    public /* synthetic */ t0(int i, w0 w0Var, List list, z4 z4Var, Integer num, k0 k0Var, l0 l0Var, s0 s0Var) {
        if (127 != (i & 127)) {
            u7g.V(i, 127, i0.a.getDescriptor());
            throw null;
        }
        this.a = w0Var;
        this.b = list;
        this.c = z4Var;
        this.d = num;
        this.e = k0Var;
        this.f = l0Var;
        this.g = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.a, t0Var.a) && Intrinsics.d(this.b, t0Var.b) && Intrinsics.d(this.c, t0Var.c) && Intrinsics.d(this.d, t0Var.d) && this.e == t0Var.e && this.f == t0Var.f && Intrinsics.d(this.g, t0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        k0 k0Var = this.e;
        int hashCode3 = (hashCode2 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        l0 l0Var = this.f;
        return this.g.hashCode() + ((hashCode3 + (l0Var != null ? l0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DisplayRulesDto(indent=" + this.a + ", backgroundColorSettings=" + this.b + ", backgroundShapeSettings=" + this.c + ", opacity=" + this.d + ", horizontalRule=" + this.e + ", verticalRule=" + this.f + ", widthType=" + this.g + ')';
    }

    public t0(w0 w0Var, ArrayList arrayList, z4 z4Var, Integer num, k0 k0Var, l0 l0Var, s0 s0Var) {
        s0Var.getClass();
        this.a = w0Var;
        this.b = arrayList;
        this.c = z4Var;
        this.d = num;
        this.e = k0Var;
        this.f = l0Var;
        this.g = s0Var;
    }
}
