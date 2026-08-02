package com.yandex.plus.pay.data.mb.dto;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ m(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, k.a.getDescriptor());
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
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.a, mVar.a) && Intrinsics.d(this.b, mVar.b) && Intrinsics.d(this.c, mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset(buttonText=");
        sb.append(this.a);
        sb.append(", buttonTextWithDetails=");
        sb.append(this.b);
        sb.append(", subscriptionName=");
        return dfi.i(sb, this.c, ')');
    }
}
