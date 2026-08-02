package com.yandex.passport.data.network;

import defpackage.tlm;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class va {

    @NotNull
    public static final ua Companion = new ua();
    public final String a;
    public final long b;
    public final String c;
    public final int d;

    public /* synthetic */ va(int i, String str, long j, String str2, int i2) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, ta.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = -1;
        } else {
            this.d = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va)) {
            return false;
        }
        va vaVar = (va) obj;
        return Intrinsics.d(this.a, vaVar.a) && this.b == vaVar.b && Intrinsics.d(this.c, vaVar.c) && this.d == vaVar.d;
    }

    public final int hashCode() {
        int c = tlm.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Integer.hashCode(this.d) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", denyResendUntil=");
        sb.append(this.b);
        sb.append(", callingNumberTemplate=");
        sb.append(this.c);
        sb.append(", codeLength=");
        return vz1.r(sb, this.d, ')');
    }
}
