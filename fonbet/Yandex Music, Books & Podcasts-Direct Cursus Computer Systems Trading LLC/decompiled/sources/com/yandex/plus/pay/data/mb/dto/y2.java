package com.yandex.plus.pay.data.mb.dto;

import defpackage.k5r;
import defpackage.tlm;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class y2 {

    @NotNull
    public static final x2 Companion = new x2();
    public final j3 a;
    public final j3 b;
    public final j3 c;
    public final j3 d;
    public final j3 e;
    public final long f;
    public final j3 g;
    public final j3 h;
    public final j3 i;
    public final String j;
    public final String k;
    public final String l;
    public final l1 m;

    public /* synthetic */ y2(int i, j3 j3Var, j3 j3Var2, j3 j3Var3, j3 j3Var4, j3 j3Var5, long j, j3 j3Var6, j3 j3Var7, j3 j3Var8, String str, String str2, String str3, l1 l1Var) {
        if (8191 != (i & 8191)) {
            u7g.V(i, 8191, w2.a.getDescriptor());
            throw null;
        }
        this.a = j3Var;
        this.b = j3Var2;
        this.c = j3Var3;
        this.d = j3Var4;
        this.e = j3Var5;
        this.f = j;
        this.g = j3Var6;
        this.h = j3Var7;
        this.i = j3Var8;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return Intrinsics.d(this.a, y2Var.a) && Intrinsics.d(this.b, y2Var.b) && Intrinsics.d(this.c, y2Var.c) && Intrinsics.d(this.d, y2Var.d) && Intrinsics.d(this.e, y2Var.e) && this.f == y2Var.f && Intrinsics.d(this.g, y2Var.g) && Intrinsics.d(this.h, y2Var.h) && Intrinsics.d(this.i, y2Var.i) && Intrinsics.d(this.j, y2Var.j) && Intrinsics.d(this.k, y2Var.k) && Intrinsics.d(this.l, y2Var.l) && Intrinsics.d(this.m, y2Var.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j3 j3Var = this.b;
        return this.m.hashCode() + k5r.c(k5r.c(k5r.c((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + tlm.c(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (j3Var == null ? 0 : j3Var.hashCode())) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        return "PresaleDto(loadingTitle=" + this.a + ", benefitTitle=" + this.b + ", periodTitle=" + this.c + ", price=" + this.d + ", presaleAdditionalTitle=" + this.e + ", loadingDelayMillis=" + this.f + ", acceptAdditionalButtonText=" + this.g + ", acceptButtonText=" + this.h + ", rejectButtonText=" + this.i + ", batchId=" + this.j + ", eventSessionId=" + this.k + ", presaleTarget=" + this.l + ", offer=" + this.m + ')';
    }
}
