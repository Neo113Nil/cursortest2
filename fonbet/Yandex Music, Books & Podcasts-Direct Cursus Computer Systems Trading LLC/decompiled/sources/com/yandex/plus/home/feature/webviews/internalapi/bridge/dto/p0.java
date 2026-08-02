package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class p0 implements v1 {

    @NotNull
    public static final m0 Companion = new m0();
    public static final arf[] d;
    public final String a;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 b;
    public final o0 c;

    static {
        bwf bwfVar = bwf.b;
        d = new arf[]{null, btf.a(bwfVar, new b0(7)), btf.a(bwfVar, new b0(8))};
    }

    public /* synthetic */ p0(int i, String str, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var, o0 o0Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, l0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = k0Var;
        this.c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.a, p0Var.a) && this.b == p0Var.b && this.c == p0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "PurchaseProductClick(trackId=" + this.a + ", purchaseType=" + this.b + ", type=" + this.c + ')';
    }

    public p0(String str, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var) {
        o0 o0Var = o0.b;
        this.a = str;
        this.b = k0Var;
        this.c = o0Var;
    }
}
