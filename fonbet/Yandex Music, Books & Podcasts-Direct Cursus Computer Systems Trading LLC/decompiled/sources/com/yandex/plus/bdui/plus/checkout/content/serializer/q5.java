package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class q5 {

    @NotNull
    public static final p5 Companion = new p5();
    public final long a;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 b;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 c;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 d;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 e;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 f;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 g;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 h;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 i;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 j;
    public final c k;

    public /* synthetic */ q5(int i, long j, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var5, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var6, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var7, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var8, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var9, c cVar) {
        if (2047 != (i & 2047)) {
            u7g.V(i, 2047, o5.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = m1Var;
        this.c = m1Var2;
        this.d = m1Var3;
        this.e = m1Var4;
        this.f = m1Var5;
        this.g = m1Var6;
        this.h = m1Var7;
        this.i = m1Var8;
        this.j = m1Var9;
        this.k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return this.a == q5Var.a && Intrinsics.d(this.b, q5Var.b) && Intrinsics.d(this.c, q5Var.c) && Intrinsics.d(this.d, q5Var.d) && Intrinsics.d(this.e, q5Var.e) && Intrinsics.d(this.f, q5Var.f) && Intrinsics.d(this.g, q5Var.g) && Intrinsics.d(this.h, q5Var.h) && Intrinsics.d(this.i, q5Var.i) && Intrinsics.d(this.j, q5Var.j) && Intrinsics.d(this.k, q5Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var = this.c;
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (m1Var == null ? 0 : m1Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2 = this.h;
        int hashCode3 = (this.i.hashCode() + ((hashCode2 + (m1Var2 == null ? 0 : m1Var2.hashCode())) * 31)) * 31;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3 = this.j;
        int hashCode4 = (hashCode3 + (m1Var3 == null ? 0 : m1Var3.hashCode())) * 31;
        c cVar = this.k;
        return hashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "DataDto(loadingDelayMillis=" + this.a + ", loadingTitle=" + this.b + ", benefitTitle=" + this.c + ", periodTitle=" + this.d + ", price=" + this.e + ", presaleAdditionalTitle=" + this.f + ", acceptButtonText=" + this.g + ", acceptAdditionalButtonText=" + this.h + ", rejectButtonText=" + this.i + ", legalText=" + this.j + ", user=" + this.k + ')';
    }
}
