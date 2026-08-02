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
public final class j7 implements e8 {

    @NotNull
    public static final i7 Companion = new i7();
    public static final arf[] g = {null, null, null, null, btf.a(bwf.b, new u6(6)), null};
    public final x1 a;
    public final w0 b;
    public final String c;
    public final String d;
    public final List e;
    public final g f;

    public /* synthetic */ j7(int i, x1 x1Var, w0 w0Var, String str, String str2, List list, g gVar) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, h7.a.getDescriptor());
            throw null;
        }
        this.a = x1Var;
        this.b = w0Var;
        this.c = str;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = gVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return Intrinsics.d(this.a, j7Var.a) && Intrinsics.d(this.b, j7Var.b) && Intrinsics.d(this.c, j7Var.c) && Intrinsics.d(this.d, j7Var.d) && Intrinsics.d(this.e, j7Var.e) && Intrinsics.d(this.f, j7Var.f);
    }

    @Override // com.yandex.plus.home.datasource.openapi.models.e8
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        List list = this.e;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        g gVar = this.f;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkSpacerWidgetModel(displayRules=" + this.a + ", contentDescription=" + this.b + ", id=" + this.c + ", type=" + this.d + ", templates=" + this.e + ", action=" + this.f + ')';
    }
}
