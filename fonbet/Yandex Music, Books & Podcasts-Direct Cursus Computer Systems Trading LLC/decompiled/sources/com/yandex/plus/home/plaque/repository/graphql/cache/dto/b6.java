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
public final class b6 implements c6 {

    @NotNull
    public static final a6 Companion = new a6();
    public static final arf[] h;
    public final String a;
    public final d0 b;
    public final i c;
    public final t0 d;
    public final List e;
    public final List f;
    public final Integer g;

    static {
        bwf bwfVar = bwf.b;
        h = new arf[]{null, null, btf.a(bwfVar, new w4(19)), null, btf.a(bwfVar, new w4(20)), btf.a(bwfVar, new w4(21)), null};
    }

    public /* synthetic */ b6(int i, String str, d0 d0Var, i iVar, t0 t0Var, List list, List list2, Integer num) {
        if (127 != (i & 127)) {
            u7g.V(i, 127, z5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = list;
        this.f = list2;
        this.g = num;
    }

    @Override // com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6
    public final t0 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return Intrinsics.d(this.a, b6Var.a) && Intrinsics.d(this.b, b6Var.b) && Intrinsics.d(this.c, b6Var.c) && Intrinsics.d(this.d, b6Var.d) && Intrinsics.d(this.e, b6Var.e) && Intrinsics.d(this.f, b6Var.f) && Intrinsics.d(this.g, b6Var.g);
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
        int d = k5r.d(k5r.d((this.d.hashCode() + ((hashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
        Integer num = this.g;
        return d + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Text(id=" + this.a + ", contentDescription=" + this.b + ", action=" + this.c + ", displayRules=" + this.d + ", text=" + this.e + ", templates=" + this.f + ", lineHeight=" + this.g + ')';
    }

    public b6(String str, d0 d0Var, i iVar, t0 t0Var, ArrayList arrayList, List list, Integer num) {
        list.getClass();
        this.a = str;
        this.b = d0Var;
        this.c = iVar;
        this.d = t0Var;
        this.e = arrayList;
        this.f = list;
        this.g = num;
    }
}
