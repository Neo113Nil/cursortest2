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
public final class i5 implements j5 {

    @NotNull
    public static final g5 Companion = new g5();
    public static final arf[] g;
    public final String a;
    public final d0 b;
    public final i c;
    public final t0 d;
    public final List e;
    public final h5 f;

    static {
        bwf bwfVar = bwf.b;
        g = new arf[]{null, null, btf.a(bwfVar, new w4(3)), null, btf.a(bwfVar, new w4(4)), btf.a(bwfVar, new w4(5))};
    }

    public /* synthetic */ i5(int i, String str, d0 d0Var, i iVar, t0 t0Var, List list, h5 h5Var) {
        if (63 != (i & 63)) {
            u7g.V(i, 63, f5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = list;
        this.f = h5Var;
    }

    @Override // com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6
    public final t0 a() {
        return this.d;
    }

    @Override // com.yandex.plus.home.plaque.repository.graphql.cache.dto.j5
    public final List b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return Intrinsics.d(this.a, i5Var.a) && Intrinsics.d(this.b, i5Var.b) && Intrinsics.d(this.c, i5Var.c) && Intrinsics.d(this.d, i5Var.d) && Intrinsics.d(this.e, i5Var.e) && this.f == i5Var.f;
    }

    @Override // com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6
    public final d0 getContentDescription() {
        return this.b;
    }

    @Override // com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d0 d0Var = this.b;
        int hashCode2 = (hashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        i iVar = this.c;
        return this.f.hashCode() + k5r.d((this.d.hashCode() + ((hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "Line(id=" + this.a + ", contentDescription=" + this.b + ", action=" + this.c + ", displayRules=" + this.d + ", widgetIds=" + this.e + ", orientation=" + this.f + ')';
    }

    public i5(String str, d0 d0Var, i iVar, t0 t0Var, ArrayList arrayList, h5 h5Var) {
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = arrayList;
        this.f = h5Var;
    }
}
