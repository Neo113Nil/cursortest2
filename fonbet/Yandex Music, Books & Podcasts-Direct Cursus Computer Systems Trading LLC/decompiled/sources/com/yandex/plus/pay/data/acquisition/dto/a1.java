package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class a1 {

    @NotNull
    public static final n0 Companion = new n0();
    public static final arf[] k = {null, null, null, null, null, btf.a(bwf.b, new f(11)), null, null, null, null};
    public final m0 a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final Set f;
    public final Boolean g;
    public final z0 h;
    public final w0 i;
    public final v j;

    public /* synthetic */ a1(int i, m0 m0Var, String str, String str2, int i2, String str3, Set set, Boolean bool, z0 z0Var, w0 w0Var, v vVar) {
        if (921 != (i & 921)) {
            u7g.V(i, 921, j0.a.getDescriptor());
            throw null;
        }
        this.a = m0Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        this.d = i2;
        this.e = str3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = set;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        this.h = z0Var;
        this.i = w0Var;
        this.j = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.a, a1Var.a) && Intrinsics.d(this.b, a1Var.b) && Intrinsics.d(this.c, a1Var.c) && this.d == a1Var.d && Intrinsics.d(this.e, a1Var.e) && Intrinsics.d(this.f, a1Var.f) && Intrinsics.d(this.g, a1Var.g) && Intrinsics.d(this.h, a1Var.h) && Intrinsics.d(this.i, a1Var.i) && Intrinsics.d(this.j, a1Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int c = k5r.c(f1d.a(this.d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.e);
        Set set = this.f;
        int hashCode3 = (c + (set == null ? 0 : set.hashCode())) * 31;
        Boolean bool = this.g;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SmartOffer(analytics=" + this.a + ", purchaseToken=" + this.b + ", place=" + this.c + ", priority=" + this.d + ", target=" + this.e + ", requestedFeatures=" + this.f + ", isOneClickEnabled=" + this.g + ", texts=" + this.h + ", legals=" + this.i + ", compositeOffer=" + this.j + ')';
    }
}
