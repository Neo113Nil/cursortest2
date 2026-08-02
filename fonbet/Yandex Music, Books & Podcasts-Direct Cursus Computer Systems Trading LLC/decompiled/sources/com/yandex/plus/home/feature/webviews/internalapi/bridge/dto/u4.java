package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class u4 implements r6 {

    @NotNull
    public static final t4 Companion = new t4();
    public static final arf[] f = {null, btf.a(bwf.b, new g4(3)), null, null, null};
    public final String a;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 b;
    public final String c;
    public final String d;
    public final Boolean e;

    public /* synthetic */ u4(int i, String str, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var, String str2, String str3, Boolean bool) {
        if (6 != (i & 6)) {
            u7g.V(i, 6, s4.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = k0Var;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return Intrinsics.d(this.a, u4Var.a) && this.b == u4Var.b && Intrinsics.d(this.c, u4Var.c) && Intrinsics.d(this.d, u4Var.d) && Intrinsics.d(this.e, u4Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int c = k5r.c((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseProductRequest(trackId=");
        sb.append(this.a);
        sb.append(", purchaseType=");
        sb.append(this.b);
        sb.append(", productId=");
        sb.append(this.c);
        sb.append(", target=");
        sb.append(this.d);
        sb.append(", forceSelectCard=");
        return com.appsflyer.internal.k.p(sb, this.e, ')');
    }
}
