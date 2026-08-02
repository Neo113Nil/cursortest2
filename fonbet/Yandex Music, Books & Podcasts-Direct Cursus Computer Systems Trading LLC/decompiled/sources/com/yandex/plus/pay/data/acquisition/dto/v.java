package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();
    public static final arf[] f = {null, null, null, btf.a(bwf.b, new f(5)), null};
    public final String a;
    public final p b;
    public final e1 c;
    public final List d;
    public final s e;

    public v(int i, String str, p pVar, e1 e1Var, List list, s sVar) {
        if (17 != (i & 17)) {
            u7g.V(i, 17, t.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = pVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = e1Var;
        }
        if ((i & 8) == 0) {
            this.d = c5b.a;
        } else {
            this.d = list;
        }
        this.e = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.a, vVar.a) && Intrinsics.d(this.b, vVar.b) && Intrinsics.d(this.c, vVar.c) && Intrinsics.d(this.d, vVar.d) && Intrinsics.d(this.e, vVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p pVar = this.b;
        int hashCode2 = (hashCode + (pVar == null ? 0 : pVar.a.hashCode())) * 31;
        e1 e1Var = this.c;
        return this.e.hashCode() + k5r.d((hashCode2 + (e1Var != null ? e1Var.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        return "PlusPayAcquisitionOfferDto(positionId=" + this.a + ", currentTariffName=" + this.b + ", tariff=" + this.c + ", options=" + this.d + ", assets=" + this.e + ')';
    }
}
