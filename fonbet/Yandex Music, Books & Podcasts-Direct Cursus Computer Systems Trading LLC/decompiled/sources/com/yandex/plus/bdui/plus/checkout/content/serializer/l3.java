package com.yandex.plus.bdui.plus.checkout.content.serializer;

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
/* loaded from: classes4.dex */
public final class l3 {

    @NotNull
    public static final k3 Companion = new k3();
    public static final arf[] j = {null, null, btf.a(bwf.b, new q0(15)), null, null, null, null, null, null};
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 a;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 b;
    public final List c;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 d;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 e;
    public final String f;
    public final String g;
    public final Integer h;
    public final c i;

    public /* synthetic */ l3(int i, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2, List list, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var4, String str, String str2, Integer num, c cVar) {
        if (511 != (i & 511)) {
            u7g.V(i, 511, j3.a.getDescriptor());
            throw null;
        }
        this.a = m1Var;
        this.b = m1Var2;
        this.c = list;
        this.d = m1Var3;
        this.e = m1Var4;
        this.f = str;
        this.g = str2;
        this.h = num;
        this.i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return Intrinsics.d(this.a, l3Var.a) && Intrinsics.d(this.b, l3Var.b) && Intrinsics.d(this.c, l3Var.c) && Intrinsics.d(this.d, l3Var.d) && Intrinsics.d(this.e, l3Var.e) && Intrinsics.d(this.f, l3Var.f) && Intrinsics.d(this.g, l3Var.g) && Intrinsics.d(this.h, l3Var.h) && Intrinsics.d(this.i, l3Var.i);
    }

    public final int hashCode() {
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var = this.a;
        int hashCode = (m1Var == null ? 0 : m1Var.hashCode()) * 31;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2 = this.b;
        int d = k5r.d((hashCode + (m1Var2 == null ? 0 : m1Var2.hashCode())) * 31, 31, this.c);
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3 = this.d;
        int hashCode2 = (d + (m1Var3 == null ? 0 : m1Var3.hashCode())) * 31;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var4 = this.e;
        int hashCode3 = (hashCode2 + (m1Var4 == null ? 0 : m1Var4.hashCode())) * 31;
        String str = this.f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.h;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        c cVar = this.i;
        return hashCode6 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "DataDto(title=" + this.a + ", subtitle=" + this.b + ", assets=" + this.c + ", alternativeActionText=" + this.d + ", supportText=" + this.e + ", errorCode=" + this.f + ", errorCodeContentDescription=" + this.g + ", prioritizedAssetIndex=" + this.h + ", user=" + this.i + ')';
    }
}
