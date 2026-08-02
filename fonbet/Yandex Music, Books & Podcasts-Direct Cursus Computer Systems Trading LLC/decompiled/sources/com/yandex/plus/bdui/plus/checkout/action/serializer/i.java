package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();
    public final String a;
    public final String b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, g.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.a, iVar.a) && Intrinsics.d(this.b, iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataDto(productId=");
        sb.append(this.a);
        sb.append(", inAppOpaqueData=");
        return dfi.i(sb, this.b, ')');
    }

    public i(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }
}
