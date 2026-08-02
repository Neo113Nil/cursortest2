package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class r1 {

    @NotNull
    public static final q1 Companion = new q1();
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 a;

    public /* synthetic */ r1(int i, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var) {
        if (1 == (i & 1)) {
            this.a = m1Var;
        } else {
            u7g.V(i, 1, p1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && Intrinsics.d(this.a, ((r1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentPromoLegalInfoDto(legalText=" + this.a + ')';
    }
}
