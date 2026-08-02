package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class v5 implements c6 {

    @NotNull
    public static final u5 Companion = new u5();
    public static final arf[] e = {null, null, btf.a(bwf.b, new w4(15)), null};
    public final String a;
    public final d0 b;
    public final i c;
    public final t0 d;

    public /* synthetic */ v5(int i, String str, d0 d0Var, i iVar, t0 t0Var) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, t5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
    }

    @Override // com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6
    public final t0 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        return Intrinsics.d(this.a, v5Var.a) && Intrinsics.d(this.b, v5Var.b) && Intrinsics.d(this.c, v5Var.c) && Intrinsics.d(this.d, v5Var.d);
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
        return this.d.hashCode() + ((hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Spacer(id=" + this.a + ", contentDescription=" + this.b + ", action=" + this.c + ", displayRules=" + this.d + ')';
    }

    public v5(String str, d0 d0Var, i iVar, t0 t0Var) {
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
    }
}
