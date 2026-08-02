package com.yandex.passport.data.network.token;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class r implements com.yandex.passport.data.models.r {

    @NotNull
    public static final q Companion = new q();
    public final String a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ r(int i, String str, Long l, String str2, String str3, String str4) {
        if (13 != (i & 13)) {
            u7g.V(i, 13, p.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        this.c = str2;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
    }

    @Override // com.yandex.passport.data.models.r
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.a, rVar.a) && Intrinsics.d(this.b, rVar.b) && Intrinsics.d(this.c, rVar.c) && Intrinsics.d(this.d, rVar.d) && Intrinsics.d(this.e, rVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return this.e.hashCode() + k5r.c(k5r.c((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(accessToken=");
        sb.append(this.a);
        sb.append(", expiresIn=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", tokenType=");
        sb.append(this.d);
        sb.append(", scope=");
        return dfi.i(sb, this.e, ')');
    }
}
