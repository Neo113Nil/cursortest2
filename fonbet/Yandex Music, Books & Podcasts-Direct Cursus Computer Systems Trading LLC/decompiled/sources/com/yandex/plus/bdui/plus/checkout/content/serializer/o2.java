package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class o2 {

    @NotNull
    public static final n2 Companion = new n2();
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 a;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t b;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 c;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 d;

    public /* synthetic */ o2(int i, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, m2.a.getDescriptor());
            throw null;
        }
        this.a = m1Var;
        this.b = tVar;
        this.c = m1Var2;
        this.d = m1Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return Intrinsics.d(this.a, o2Var.a) && Intrinsics.d(this.b, o2Var.b) && Intrinsics.d(this.c, o2Var.c) && Intrinsics.d(this.d, o2Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var = this.d;
        return hashCode + (m1Var == null ? 0 : m1Var.hashCode());
    }

    public final String toString() {
        return "AssetDto(title=" + this.a + ", icon=" + this.b + ", price=" + this.c + ", buttonAdditionalText=" + this.d + ')';
    }
}
