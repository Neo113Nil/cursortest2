package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class u3 {

    @NotNull
    public static final l3 Companion = new l3();
    public static final arf[] e = {btf.a(bwf.b, new c1(15)), null, null, null};
    public final n3 a;
    public final String b;
    public final q3 c;
    public final t3 d;

    public /* synthetic */ u3(int i, n3 n3Var, String str, q3 q3Var, t3 t3Var) {
        this.a = (i & 1) == 0 ? n3.d : n3Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = q3Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = t3Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return this.a == u3Var.a && Intrinsics.d(this.b, u3Var.b) && Intrinsics.d(this.c, u3Var.c) && Intrinsics.d(this.d, u3Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        q3 q3Var = this.c;
        int hashCode3 = (hashCode2 + (q3Var == null ? 0 : q3Var.hashCode())) * 31;
        t3 t3Var = this.d;
        return hashCode3 + (t3Var != null ? t3Var.hashCode() : 0);
    }

    public final String toString() {
        return "SubscriptionInfoDto(status=" + this.a + ", statusCode=" + this.b + ", synchronizationState=" + this.c + ", trust3dsInfo=" + this.d + ')';
    }
}
