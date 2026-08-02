package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.q5f;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();
    public static final arf[] f;
    public final q5f a;
    public final Map b;
    public final Map c;
    public final p0 d;
    public final g0 e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{null, btf.a(bwfVar, new b(11)), btf.a(bwfVar, new b(12)), null, null};
    }

    public /* synthetic */ s0(int i, q5f q5fVar, Map map, Map map2, p0 p0Var, g0 g0Var) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, q0.a.getDescriptor());
            throw null;
        }
        this.a = q5fVar;
        this.b = map;
        this.c = map2;
        this.d = p0Var;
        this.e = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.a, s0Var.a) && Intrinsics.d(this.b, s0Var.b) && Intrinsics.d(this.c, s0Var.c) && Intrinsics.d(this.d, s0Var.d) && Intrinsics.d(this.e, s0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.c;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        p0 p0Var = this.d;
        int hashCode4 = (hashCode3 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        g0 g0Var = this.e;
        return hashCode4 + (g0Var != null ? g0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PayloadDto(layout=" + this.a + ", layoutParams=" + this.b + ", layoutActions=" + this.c + ", logActions=" + this.d + ", actions=" + this.e + ')';
    }
}
