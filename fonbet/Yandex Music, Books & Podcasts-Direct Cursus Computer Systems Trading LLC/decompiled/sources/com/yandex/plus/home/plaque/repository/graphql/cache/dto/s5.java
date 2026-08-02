package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class s5 implements c6 {

    @NotNull
    public static final r5 Companion = new r5();
    public static final arf[] f = {null, null, btf.a(bwf.b, new w4(14)), null, null};
    public final String a;
    public final d0 b;
    public final i c;
    public final t0 d;
    public final String e;

    public /* synthetic */ s5(int i, String str, d0 d0Var, i iVar, t0 t0Var, String str2) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, q5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = str2;
    }

    @Override // com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6
    public final t0 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return Intrinsics.d(this.a, s5Var.a) && Intrinsics.d(this.b, s5Var.b) && Intrinsics.d(this.c, s5Var.c) && Intrinsics.d(this.d, s5Var.d) && Intrinsics.d(this.e, s5Var.e);
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
        StringBuilder sb = new StringBuilder("Icon(id=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", displayRules=");
        sb.append(this.d);
        sb.append(", image=");
        return dfi.i(sb, this.e, ')');
    }

    public s5(String str, d0 d0Var, i iVar, t0 t0Var, String str2) {
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = str2;
    }
}
