package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class y5 implements c6 {

    @NotNull
    public static final x5 Companion = new x5();
    public static final arf[] g;
    public final String a;
    public final d0 b;
    public final i c;
    public final t0 d;
    public final List e;
    public final List f;

    static {
        bwf bwfVar = bwf.b;
        g = new arf[]{null, null, btf.a(bwfVar, new w4(16)), null, btf.a(bwfVar, new w4(17)), btf.a(bwfVar, new w4(18))};
    }

    public /* synthetic */ y5(int i, String str, d0 d0Var, i iVar, t0 t0Var, List list, List list2) {
        if (63 != (i & 63)) {
            u7g.V(i, 63, w5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = list;
        this.f = list2;
    }

    @Override // com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6
    public final t0 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return Intrinsics.d(this.a, y5Var.a) && Intrinsics.d(this.b, y5Var.b) && Intrinsics.d(this.c, y5Var.c) && Intrinsics.d(this.d, y5Var.d) && Intrinsics.d(this.e, y5Var.e) && Intrinsics.d(this.f, y5Var.f);
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
        StringBuilder sb = new StringBuilder("Switch(id=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", displayRules=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", templates=");
        return eta.h(sb, this.f, ')');
    }

    public y5(String str, d0 d0Var, i iVar, t0 t0Var, ArrayList arrayList, List list) {
        list.getClass();
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = arrayList;
        this.f = list;
    }
}
