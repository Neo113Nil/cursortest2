package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();
    public final String a;
    public final String b;

    public /* synthetic */ z0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, x0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.a, z0Var.a) && Intrinsics.d(this.b, z0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferSwitchToggleDto(text=");
        sb.append(this.a);
        sb.append(", badgeText=");
        return dfi.i(sb, this.b, ')');
    }
}
