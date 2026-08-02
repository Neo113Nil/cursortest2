package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class x1 {

    @NotNull
    public static final w1 Companion = new w1();
    public static final arf[] k;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final u1 f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final l1 j;

    static {
        bwf bwfVar = bwf.b;
        k = new arf[]{null, null, null, null, btf.a(bwfVar, new b(18)), null, btf.a(bwfVar, new b(19)), btf.a(bwfVar, new b(20)), btf.a(bwfVar, new b(21)), null};
    }

    public /* synthetic */ x1(int i, String str, String str2, boolean z, boolean z2, List list, u1 u1Var, Map map, Map map2, Map map3, l1 l1Var) {
        if (1023 != (i & 1023)) {
            u7g.V(i, 1023, v1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = list;
        this.f = u1Var;
        this.g = map;
        this.h = map2;
        this.i = map3;
        this.j = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.d(this.a, x1Var.a) && Intrinsics.d(this.b, x1Var.b) && this.c == x1Var.c && this.d == x1Var.d && Intrinsics.d(this.e, x1Var.e) && Intrinsics.d(this.f, x1Var.f) && Intrinsics.d(this.g, x1Var.g) && Intrinsics.d(this.h, x1Var.h) && Intrinsics.d(this.i, x1Var.i) && Intrinsics.d(this.j, x1Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + k5r.d(k5r.e(k5r.e(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        Map map = this.g;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.h;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.i;
        return this.j.hashCode() + ((hashCode3 + (map3 != null ? map3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PayloadDto(baseUrl=" + this.a + ", entryPath=" + this.b + ", ignoreJSInterfaces=" + this.c + ", disableJS=" + this.d + ", plugins=" + this.e + ", loading=" + this.f + ", transitionUrlActions=" + this.g + ", transitionAnchorActions=" + this.h + ", webActions=" + this.i + ", actions=" + this.j + ')';
    }
}
