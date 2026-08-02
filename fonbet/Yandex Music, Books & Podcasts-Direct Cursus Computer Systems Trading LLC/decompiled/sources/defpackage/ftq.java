package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ftq {
    public final String a;
    public final d85 b;

    public ftq(String str, d85 d85Var) {
        this.a = str;
        this.b = d85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftq)) {
            return false;
        }
        ftq ftqVar = (ftq) obj;
        return this.a.equals(ftqVar.a) && Intrinsics.d(this.b, ftqVar.b);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        d85 d85Var = this.b;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "SlideDisclaimerUiData(text=" + this.a + ", textColor=" + this.b + ")";
    }
}
