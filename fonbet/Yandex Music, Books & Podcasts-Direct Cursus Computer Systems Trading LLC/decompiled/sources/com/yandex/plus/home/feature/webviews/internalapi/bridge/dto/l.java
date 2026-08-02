package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l implements v1 {

    @NotNull
    public static final k Companion = new k();
    public final String a;
    public final String b;
    public final Boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public /* synthetic */ l(int i, String str, String str2, Boolean bool, boolean z, boolean z2, String str3) {
        if (63 != (i & 63)) {
            u7g.V(i, 63, j.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = z;
        this.e = z2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.a, lVar.a) && Intrinsics.d(this.b, lVar.b) && Intrinsics.d(this.c, lVar.c) && this.d == lVar.d && this.e == lVar.e && Intrinsics.d(this.f, lVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int c = k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Boolean bool = this.c;
        int e = k5r.e(k5r.e((c + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeOptionStatusResponse(trackId=");
        sb.append(this.a);
        sb.append(", optionId=");
        sb.append(this.b);
        sb.append(", currentStatus=");
        sb.append(this.c);
        sb.append(", disabled=");
        sb.append(this.d);
        sb.append(", show=");
        sb.append(this.e);
        sb.append(", errorMessage=");
        return dfi.i(sb, this.f, ')');
    }

    public l(String str, String str2, Boolean bool, boolean z, boolean z2, String str3) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = z;
        this.e = z2;
        this.f = str3;
    }
}
