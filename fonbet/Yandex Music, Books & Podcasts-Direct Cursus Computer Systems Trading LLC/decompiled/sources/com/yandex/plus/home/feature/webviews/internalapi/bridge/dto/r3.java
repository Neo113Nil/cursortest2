package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class r3 implements r6 {

    @NotNull
    public static final q3 Companion = new q3();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ r3(int i, String str, String str2, String str3, String str4) {
        if (12 != (i & 12)) {
            u7g.V(i, 12, p3.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return Intrinsics.d(this.a, r3Var.a) && Intrinsics.d(this.b, r3Var.b) && Intrinsics.d(this.c, r3Var.c) && Intrinsics.d(this.d, r3Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + k5r.c((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenNativeSharing(trackId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", mimeType=");
        return dfi.i(sb, this.d, ')');
    }
}
