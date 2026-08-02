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
public final class p5 implements c6 {

    @NotNull
    public static final o5 Companion = new o5();
    public static final arf[] g;
    public final String a;
    public final d0 b;
    public final i c;
    public final t0 d;
    public final List e;
    public final List f;

    static {
        bwf bwfVar = bwf.b;
        g = new arf[]{null, null, btf.a(bwfVar, new w4(11)), null, btf.a(bwfVar, new w4(12)), btf.a(bwfVar, new w4(13))};
    }

    public /* synthetic */ p5(int i, String str, d0 d0Var, i iVar, t0 t0Var, List list, List list2) {
        if (63 != (i & 63)) {
            u7g.V(i, 63, n5.a.getDescriptor());
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
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return Intrinsics.d(this.a, p5Var.a) && Intrinsics.d(this.b, p5Var.b) && Intrinsics.d(this.c, p5Var.c) && Intrinsics.d(this.d, p5Var.d) && Intrinsics.d(this.e, p5Var.e) && Intrinsics.d(this.f, p5Var.f);
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
        StringBuilder sb = new StringBuilder("Button(id=");
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

    public p5(String str, d0 d0Var, i iVar, t0 t0Var, ArrayList arrayList, List list) {
        list.getClass();
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = arrayList;
        this.f = list;
    }
}
