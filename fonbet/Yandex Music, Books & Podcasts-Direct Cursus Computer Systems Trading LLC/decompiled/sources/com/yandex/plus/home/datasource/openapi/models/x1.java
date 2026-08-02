package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class x1 {

    @NotNull
    public static final u1 Companion = new u1();
    public static final arf[] h;
    public final h8 a;
    public final List b;
    public final t c;
    public final Integer d;
    public final t3 e;
    public final v1 f;
    public final w1 g;

    static {
        bwf bwfVar = bwf.b;
        h = new arf[]{null, btf.a(bwfVar, new k0(4)), null, null, null, btf.a(bwfVar, new k0(5)), btf.a(bwfVar, new k0(6))};
    }

    public /* synthetic */ x1(int i, h8 h8Var, List list, t tVar, Integer num, t3 t3Var, v1 v1Var, w1 w1Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, t1.a.getDescriptor());
            throw null;
        }
        this.a = h8Var;
        this.b = list;
        this.c = tVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = t3Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = v1Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = w1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.d(this.a, x1Var.a) && Intrinsics.d(this.b, x1Var.b) && Intrinsics.d(this.c, x1Var.c) && Intrinsics.d(this.d, x1Var.d) && Intrinsics.d(this.e, x1Var.e) && this.f == x1Var.f && this.g == x1Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        t3 t3Var = this.e;
        int hashCode3 = (hashCode2 + (t3Var == null ? 0 : t3Var.hashCode())) * 31;
        v1 v1Var = this.f;
        int hashCode4 = (hashCode3 + (v1Var == null ? 0 : v1Var.hashCode())) * 31;
        w1 w1Var = this.g;
        return hashCode4 + (w1Var != null ? w1Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkDisplayRulesModel(widthType=" + this.a + ", backgroundColors=" + this.b + ", backgroundShape=" + this.c + ", opacity=" + this.d + ", indents=" + this.e + ", horizontalGravity=" + this.f + ", verticalGravity=" + this.g + ')';
    }
}
