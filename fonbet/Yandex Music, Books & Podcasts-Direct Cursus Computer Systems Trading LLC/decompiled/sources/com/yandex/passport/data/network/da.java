package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class da {

    @NotNull
    public static final ca Companion = new ca();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ da(String str, int i, String str2, String str3) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, ba.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return Intrinsics.d(this.a, daVar.a) && Intrinsics.d(this.b, daVar.b) && Intrinsics.d(this.c, daVar.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", masterToken=");
        sb.append(this.b);
        sb.append(", clientToken=");
        return dfi.i(sb, this.c, ')');
    }
}
