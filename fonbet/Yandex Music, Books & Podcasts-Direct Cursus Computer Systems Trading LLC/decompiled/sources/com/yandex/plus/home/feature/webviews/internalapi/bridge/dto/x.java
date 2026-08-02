package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class x implements v1 {

    @NotNull
    public static final w Companion = new w();
    public final String a;
    public final String b;
    public final Boolean c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ x(int i, String str, String str2, Boolean bool, boolean z, boolean z2) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, v.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.a, xVar.a) && Intrinsics.d(this.b, xVar.b) && Intrinsics.d(this.c, xVar.c) && this.d == xVar.d && this.e == xVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        int c = k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Boolean bool = this.c;
        return Boolean.hashCode(this.e) + k5r.e((c + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionStatusResponse(trackId=");
        sb.append(this.a);
        sb.append(", optionId=");
        sb.append(this.b);
        sb.append(", currentStatus=");
        sb.append(this.c);
        sb.append(", disabled=");
        sb.append(this.d);
        sb.append(", show=");
        return dfi.j(sb, this.e, ')');
    }

    public x(String str, String str2) {
        Boolean bool = Boolean.FALSE;
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = false;
        this.e = false;
    }
}
