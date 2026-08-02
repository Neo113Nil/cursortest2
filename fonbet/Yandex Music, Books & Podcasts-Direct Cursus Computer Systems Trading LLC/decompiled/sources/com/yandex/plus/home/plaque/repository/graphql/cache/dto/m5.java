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
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class m5 implements c6 {

    @NotNull
    public static final l5 Companion = new l5();
    public static final arf[] i;
    public final String a;
    public final d0 b;
    public final i c;
    public final t0 d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;

    static {
        bwf bwfVar = bwf.b;
        i = new arf[]{null, null, btf.a(bwfVar, new w4(6)), null, btf.a(bwfVar, new w4(7)), btf.a(bwfVar, new w4(8)), btf.a(bwfVar, new w4(9)), btf.a(bwfVar, new w4(10))};
    }

    public /* synthetic */ m5(int i2, String str, d0 d0Var, i iVar, t0 t0Var, List list, List list2, List list3, List list4) {
        if (255 != (i2 & KotlinVersion.MAX_COMPONENT_VALUE)) {
            u7g.V(i2, KotlinVersion.MAX_COMPONENT_VALUE, k5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = list4;
    }

    @Override // com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6
    public final t0 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return Intrinsics.d(this.a, m5Var.a) && Intrinsics.d(this.b, m5Var.b) && Intrinsics.d(this.c, m5Var.c) && Intrinsics.d(this.d, m5Var.d) && Intrinsics.d(this.e, m5Var.e) && Intrinsics.d(this.f, m5Var.f) && Intrinsics.d(this.g, m5Var.g) && Intrinsics.d(this.h, m5Var.h);
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
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31;
        List list = this.e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return this.h.hashCode() + k5r.d((hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Balance(id=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", displayRules=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", balance=");
        sb.append(this.g);
        sb.append(", templates=");
        return eta.h(sb, this.h, ')');
    }

    public m5(String str, d0 d0Var, i iVar, t0 t0Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, List list) {
        list.getClass();
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = list;
    }
}
