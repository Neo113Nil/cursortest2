package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class umu implements vmu {
    public final rr5 a;
    public final String b;
    public final String c;
    public final d85 d;
    public final mwk e;

    public umu(rr5 rr5Var, String str, String str2, d85 d85Var, mwk mwkVar) {
        str.getClass();
        mwkVar.getClass();
        this.a = rr5Var;
        this.b = str;
        this.c = str2;
        this.d = d85Var;
        this.e = mwkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umu)) {
            return false;
        }
        umu umuVar = (umu) obj;
        return this.a.equals(umuVar.a) && Intrinsics.d(this.b, umuVar.b) && Intrinsics.d(this.c, umuVar.c) && Intrinsics.d(this.d, umuVar.d) && Intrinsics.d(this.e, umuVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        d85 d85Var = this.d;
        if (d85Var != null) {
            long j = d85Var.a;
            met metVar = net.b;
            i = Long.hashCode(j);
        }
        return this.e.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        return "Success(compositeTrackId=" + this.a + ", title=" + this.b + ", bgImageUrl=" + this.c + ", coverAverageColor=" + this.d + ", playable=" + this.e + ")";
    }
}
