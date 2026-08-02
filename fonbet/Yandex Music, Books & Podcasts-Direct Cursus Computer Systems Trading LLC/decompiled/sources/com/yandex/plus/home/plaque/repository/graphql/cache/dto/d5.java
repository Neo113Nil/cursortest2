package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class d5 implements j5 {

    @NotNull
    public static final c5 Companion = new c5();
    public static final arf[] f;
    public final String a;
    public final d0 b;
    public final i c;
    public final t0 d;
    public final List e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{null, null, btf.a(bwfVar, new w4(1)), null, btf.a(bwfVar, new w4(2))};
    }

    public /* synthetic */ d5(int i, String str, d0 d0Var, i iVar, t0 t0Var, List list) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, b5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = list;
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
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return Intrinsics.d(this.a, d5Var.a) && Intrinsics.d(this.b, d5Var.b) && Intrinsics.d(this.c, d5Var.c) && Intrinsics.d(this.d, d5Var.d) && Intrinsics.d(this.e, d5Var.e);
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
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Box(id=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", displayRules=");
        sb.append(this.d);
        sb.append(", widgetIds=");
        return eta.h(sb, this.e, ')');
    }

    public d5(String str, d0 d0Var, i iVar, t0 t0Var, ArrayList arrayList) {
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = arrayList;
    }
}
