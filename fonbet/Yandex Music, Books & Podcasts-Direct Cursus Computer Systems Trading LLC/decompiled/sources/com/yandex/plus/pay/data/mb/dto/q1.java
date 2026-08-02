package com.yandex.plus.pay.data.mb.dto;

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
public final class q1 {

    @NotNull
    public static final p1 Companion = new p1();
    public static final arf[] g = {null, null, btf.a(bwf.b, new c1(5)), null, null, null};
    public final l1 a;
    public final j3 b;
    public final List c;
    public final String d;
    public final String e;
    public final c2 f;

    public /* synthetic */ q1(int i, l1 l1Var, j3 j3Var, List list, String str, String str2, c2 c2Var) {
        if (47 != (i & 47)) {
            u7g.V(i, 47, o1.a.getDescriptor());
            throw null;
        }
        this.a = l1Var;
        this.b = j3Var;
        this.c = list;
        this.d = str;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        this.f = c2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.d(this.a, q1Var.a) && Intrinsics.d(this.b, q1Var.b) && Intrinsics.d(this.c, q1Var.c) && Intrinsics.d(this.d, q1Var.d) && Intrinsics.d(this.e, q1Var.e) && Intrinsics.d(this.f, q1Var.f);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CounterOffer(offer=" + this.a + ", title=" + this.b + ", benefits=" + this.c + ", buttonText=" + this.d + ", additionalButtonText=" + this.e + ", icon=" + this.f + ')';
    }
}
