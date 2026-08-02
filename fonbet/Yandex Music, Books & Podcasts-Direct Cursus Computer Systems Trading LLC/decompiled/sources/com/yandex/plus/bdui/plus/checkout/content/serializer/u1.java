package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class u1 {

    @NotNull
    public static final t1 Companion = new t1();
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 a;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.q1 b;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 c;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t d;
    public final String e;

    public /* synthetic */ u1(int i, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.q1 q1Var, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar, String str) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, s1.a.getDescriptor());
            throw null;
        }
        this.a = m1Var;
        this.b = q1Var;
        this.c = m1Var2;
        this.d = tVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return Intrinsics.d(this.a, u1Var.a) && Intrinsics.d(this.b, u1Var.b) && Intrinsics.d(this.c, u1Var.c) && Intrinsics.d(this.d, u1Var.d) && Intrinsics.d(this.e, u1Var.e);
    }

    public final int hashCode() {
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var = this.a;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((m1Var == null ? 0 : m1Var.hashCode()) * 31)) * 31)) * 31;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar = this.d;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoBadgeDto(additionalTitle=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", benefitTitle=");
        sb.append(this.c);
        sb.append(", iconImage=");
        sb.append(this.d);
        sb.append(", paymentMethodId=");
        return dfi.i(sb, this.e, ')');
    }
}
