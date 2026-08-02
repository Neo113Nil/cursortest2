package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ s(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, q.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.a, sVar.a) && Intrinsics.d(this.b, sVar.b) && Intrinsics.d(this.c, sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayAcquisitionOfferAssetsDto(purchaseButtonText=");
        sb.append(this.a);
        sb.append(", purchaseButtonAdditionalText=");
        sb.append(this.b);
        sb.append(", subscriptionName=");
        return dfi.i(sb, this.c, ')');
    }
}
