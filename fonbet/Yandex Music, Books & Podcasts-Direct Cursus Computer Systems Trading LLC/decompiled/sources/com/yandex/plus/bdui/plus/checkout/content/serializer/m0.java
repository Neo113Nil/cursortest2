package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.k5r;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();
    public static final arf[] f;
    public final List a;
    public final String b;
    public final String c;
    public final List d;
    public final z0 e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(28)), null, null, btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(29)), null};
    }

    public m0(int i, List list, String str, String str2, List list2, z0 z0Var) {
        this.a = (i & 1) == 0 ? c5b.a : list;
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
        if ((i & 8) == 0) {
            this.d = c5b.a;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = z0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.a, m0Var.a) && Intrinsics.d(this.b, m0Var.b) && Intrinsics.d(this.c, m0Var.c) && Intrinsics.d(this.d, m0Var.d) && Intrinsics.d(this.e, m0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int d = k5r.d((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        z0 z0Var = this.e;
        return d + (z0Var != null ? z0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalOffersDto(offers=" + this.a + ", eventSessionId=" + this.b + ", title=" + this.c + ", passedUpsaleSteps=" + this.d + ", offerSwitchToggle=" + this.e + ')';
    }
}
