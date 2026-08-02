package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 a;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 b;

    public /* synthetic */ g1(int i, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, e1.a.getDescriptor());
            throw null;
        }
        this.a = m1Var;
        this.b = m1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.d(this.a, g1Var.a) && Intrinsics.d(this.b, g1Var.b);
    }

    public final int hashCode() {
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var = this.a;
        int hashCode = (m1Var == null ? 0 : m1Var.hashCode()) * 31;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2 = this.b;
        return hashCode + (m1Var2 != null ? m1Var2.hashCode() : 0);
    }

    public final String toString() {
        return "Asset(badgeText=" + this.a + ", subtitleText=" + this.b + ')';
    }
}
