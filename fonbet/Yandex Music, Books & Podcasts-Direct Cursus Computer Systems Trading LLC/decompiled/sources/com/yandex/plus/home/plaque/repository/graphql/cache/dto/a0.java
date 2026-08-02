package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.f1d;
import defpackage.nsa;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();
    public static final arf[] k;
    public final String a;
    public final c6 b;
    public final Map c;
    public final t1 d;
    public final Map e;
    public final int f;
    public final nsa g;
    public final nsa h;
    public final String i;
    public final p4 j;

    static {
        bwf bwfVar = bwf.b;
        k = new arf[]{null, btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(18)), btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(19)), btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(20)), btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(21)), null, null, null, null, btf.a(bwfVar, new com.yandex.plus.home.graphql.configuration.a(22))};
    }

    public /* synthetic */ a0(int i, String str, c6 c6Var, Map map, t1 t1Var, Map map2, int i2, nsa nsaVar, nsa nsaVar2, String str2, p4 p4Var) {
        if (1023 != (i & 1023)) {
            u7g.V(i, 1023, y.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = c6Var;
        this.c = map;
        this.d = t1Var;
        this.e = map2;
        this.f = i2;
        this.g = nsaVar;
        this.h = nsaVar2;
        this.i = str2;
        this.j = p4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.a, a0Var.a) && Intrinsics.d(this.b, a0Var.b) && Intrinsics.d(this.c, a0Var.c) && Intrinsics.d(this.d, a0Var.d) && Intrinsics.d(this.e, a0Var.e) && this.f == a0Var.f && Intrinsics.d(this.g, a0Var.g) && Intrinsics.d(this.h, a0Var.h) && Intrinsics.d(this.i, a0Var.i) && Intrinsics.d(this.j, a0Var.j);
    }

    public final int hashCode() {
        int b = f1d.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        t1 t1Var = this.d;
        int a = f1d.a(this.f, f1d.b(this.e, (b + (t1Var == null ? 0 : t1Var.hashCode())) * 31, 31), 31);
        nsa nsaVar = this.g;
        int hashCode = (a + (nsaVar == null ? 0 : Long.hashCode(nsaVar.a))) * 31;
        nsa nsaVar2 = this.h;
        int hashCode2 = (hashCode + (nsaVar2 == null ? 0 : Long.hashCode(nsaVar2.a))) * 31;
        String str = this.i;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        p4 p4Var = this.j;
        return hashCode3 + (p4Var != null ? p4Var.hashCode() : 0);
    }

    public final String toString() {
        return "ConditionalPlaqueDto(id=" + this.a + ", rootWidget=" + this.b + ", metricContext=" + this.c + ", notification=" + this.d + ", serviceMeta=" + this.e + ", priority=" + this.f + ", showAfter=" + this.g + ", closeAfter=" + this.h + ", seenContext=" + this.i + ", rootPredicate=" + this.j + ')';
    }

    public a0(String str, i5 i5Var, Map map, t1 t1Var, Map map2, int i, nsa nsaVar, nsa nsaVar2, String str2, p4 p4Var) {
        this.a = str;
        this.b = i5Var;
        this.c = map;
        this.d = t1Var;
        this.e = map2;
        this.f = i;
        this.g = nsaVar;
        this.h = nsaVar2;
        this.i = str2;
        this.j = p4Var;
    }
}
