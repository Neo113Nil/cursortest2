package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ymu implements zmu {
    public final rr5 a;
    public final String b;
    public final String c;
    public final d85 d;
    public final qkl e;

    public ymu(rr5 rr5Var, String str, String str2, d85 d85Var, qkl qklVar) {
        str.getClass();
        this.a = rr5Var;
        this.b = str;
        this.c = str2;
        this.d = d85Var;
        this.e = qklVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymu)) {
            return false;
        }
        ymu ymuVar = (ymu) obj;
        return this.a.equals(ymuVar.a) && Intrinsics.d(this.b, ymuVar.b) && Intrinsics.d(this.c, ymuVar.c) && Intrinsics.d(this.d, ymuVar.d) && Intrinsics.d(this.e, ymuVar.e);
    }

    public final int hashCode() {
        int hashCode;
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode2 = (c + (str == null ? 0 : str.hashCode())) * 31;
        d85 d85Var = this.d;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int i = (hashCode2 + hashCode) * 31;
        qkl qklVar = this.e;
        return i + (qklVar != null ? qklVar.hashCode() : 0);
    }

    public final String toString() {
        return "Success(compositeTrackId=" + this.a + ", title=" + this.b + ", bgImageUrl=" + this.c + ", coverAverageColor=" + this.d + ", analyticsPayload=" + this.e + ")";
    }
}
