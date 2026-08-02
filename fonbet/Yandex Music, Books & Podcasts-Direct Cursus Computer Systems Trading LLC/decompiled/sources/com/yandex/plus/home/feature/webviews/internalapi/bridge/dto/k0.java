package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class k0 implements v1 {

    @NotNull
    public static final j0 Companion = new j0();
    public static final arf[] f;
    public final String a;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 b;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0 c;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0 d;
    public final String e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{null, btf.a(bwfVar, new b0(4)), btf.a(bwfVar, new b0(5)), btf.a(bwfVar, new b0(6)), null};
    }

    public /* synthetic */ k0(int i, String str, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0 i0Var, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0 g0Var, String str2) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, i0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = k0Var;
        this.c = i0Var;
        this.d = g0Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.a, k0Var.a) && this.b == k0Var.b && this.c == k0Var.c && this.d == k0Var.d && Intrinsics.d(this.e, k0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0 g0Var = this.d;
        int hashCode2 = (hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseProductButtonStatus(trackId=");
        sb.append(this.a);
        sb.append(", purchaseType=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", errorType=");
        sb.append(this.d);
        sb.append(", errorMessage=");
        return dfi.i(sb, this.e, ')');
    }

    public k0(String str, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0 i0Var, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0 g0Var) {
        this.a = str;
        this.b = k0Var;
        this.c = i0Var;
        this.d = g0Var;
        this.e = null;
    }
}
