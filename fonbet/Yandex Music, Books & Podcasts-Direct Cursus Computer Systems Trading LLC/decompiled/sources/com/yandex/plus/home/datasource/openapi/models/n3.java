package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class n3 implements e8 {

    @NotNull
    public static final m3 Companion = new m3();
    public static final arf[] h = {null, null, null, null, null, btf.a(bwf.b, new k0(15)), null};
    public final x1 a;
    public final w0 b;
    public final String c;
    public final String d;
    public final URI e;
    public final List f;
    public final g g;

    public /* synthetic */ n3(int i, x1 x1Var, w0 w0Var, String str, String str2, URI uri, List list, g gVar) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, l3.a.getDescriptor());
            throw null;
        }
        this.a = x1Var;
        this.b = w0Var;
        this.c = str;
        this.d = str2;
        this.e = uri;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
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
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return Intrinsics.d(this.a, n3Var.a) && Intrinsics.d(this.b, n3Var.b) && Intrinsics.d(this.c, n3Var.c) && Intrinsics.d(this.d, n3Var.d) && Intrinsics.d(this.e, n3Var.e) && Intrinsics.d(this.f, n3Var.f) && Intrinsics.d(this.g, n3Var.g);
    }

    @Override // com.yandex.plus.home.datasource.openapi.models.e8
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31;
        List list = this.f;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        g gVar = this.g;
        return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkImageWidgetModel(displayRules=" + this.a + ", contentDescription=" + this.b + ", id=" + this.c + ", type=" + this.d + ", imageUrl=" + this.e + ", templates=" + this.f + ", action=" + this.g + ')';
    }
}
