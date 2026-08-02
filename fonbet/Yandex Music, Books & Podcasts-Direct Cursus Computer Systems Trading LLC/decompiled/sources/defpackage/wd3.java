package defpackage;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wd3 extends zd3 {
    public final d85 b;
    public final d85 c;
    public final String d;
    public final String e;

    public wd3(d85 d85Var, d85 d85Var2, String str, String str2) {
        super(Build.VERSION.SDK_INT >= 29 ? 48 : 16);
        this.b = d85Var;
        this.c = d85Var2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd3)) {
            return false;
        }
        wd3 wd3Var = (wd3) obj;
        return Intrinsics.d(this.b, wd3Var.b) && Intrinsics.d(this.c, wd3Var.c) && Intrinsics.d(this.d, wd3Var.d) && Intrinsics.d(this.e, wd3Var.e);
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        d85 d85Var = this.b;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int i2 = hashCode * 31;
        d85 d85Var2 = this.c;
        if (d85Var2 != null) {
            long j2 = d85Var2.a;
            met metVar2 = net.b;
            i = Long.hashCode(j2);
        }
        return this.e.hashCode() + k5r.c((i2 + i) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareButton(bgColor=");
        sb.append(this.b);
        sb.append(", titleColor=");
        sb.append(this.c);
        sb.append(", title=");
        return ouj.q(sb, this.d, ", message=", this.e, ")");
    }
}
