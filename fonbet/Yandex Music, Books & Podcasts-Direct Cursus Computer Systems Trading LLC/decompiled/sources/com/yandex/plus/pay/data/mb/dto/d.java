package com.yandex.plus.pay.data.mb.dto;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public final j3 a;
    public final j3 b;
    public final c2 c;
    public final j3 d;

    public /* synthetic */ d(int i, j3 j3Var, j3 j3Var2, c2 c2Var, j3 j3Var3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, b.a.getDescriptor());
            throw null;
        }
        this.a = j3Var;
        this.b = j3Var2;
        this.c = c2Var;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = j3Var3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b) && Intrinsics.d(this.c, dVar.c) && Intrinsics.d(this.d, dVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        j3 j3Var = this.d;
        return hashCode + (j3Var == null ? 0 : j3Var.hashCode());
    }

    public final String toString() {
        return "ClosingOfferAsset(title=" + this.a + ", price=" + this.b + ", icon=" + this.c + ", additionalButtonText=" + this.d + ')';
    }
}
