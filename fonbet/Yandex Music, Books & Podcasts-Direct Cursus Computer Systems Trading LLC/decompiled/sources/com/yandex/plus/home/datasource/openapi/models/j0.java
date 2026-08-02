package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class j0 implements e8 {

    @NotNull
    public static final i0 Companion = new i0();
    public static final arf[] h;
    public final x1 a;
    public final w0 b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final g g;

    static {
        bwf bwfVar = bwf.b;
        h = new arf[]{null, null, null, null, btf.a(bwfVar, new com.yandex.plus.core.graphql.daily.progress.s(28)), btf.a(bwfVar, new com.yandex.plus.core.graphql.daily.progress.s(29)), null};
    }

    public /* synthetic */ j0(int i, g gVar, w0 w0Var, x1 x1Var, String str, String str2, List list, List list2) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, h0.a.getDescriptor());
            throw null;
        }
        this.a = x1Var;
        this.b = w0Var;
        this.c = str;
        this.d = str2;
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = gVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.a, j0Var.a) && Intrinsics.d(this.b, j0Var.b) && Intrinsics.d(this.c, j0Var.c) && Intrinsics.d(this.d, j0Var.d) && Intrinsics.d(this.e, j0Var.e) && Intrinsics.d(this.f, j0Var.f) && Intrinsics.d(this.g, j0Var.g);
    }

    @Override // com.yandex.plus.home.datasource.openapi.models.e8
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int d = k5r.d(k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        List list = this.f;
        int hashCode = (d + (list == null ? 0 : list.hashCode())) * 31;
        g gVar = this.g;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkButtonWidgetModel(displayRules=" + this.a + ", contentDescription=" + this.b + ", id=" + this.c + ", type=" + this.d + ", textItems=" + this.e + ", templates=" + this.f + ", action=" + this.g + ')';
    }
}
