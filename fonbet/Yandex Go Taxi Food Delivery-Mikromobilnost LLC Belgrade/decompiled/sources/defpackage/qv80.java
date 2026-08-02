package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqv80;", "Lpw80;", "Companion", "ov80", "pv80", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class qv80 implements pw80 {
    public static final pv80 Companion = new pv80();
    public final String a;
    public final String b;

    public /* synthetic */ qv80(int i, String str, String str2) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv80)) {
            return false;
        }
        qv80 qv80Var = (qv80) obj;
        return jl40.l(this.a, qv80Var.a) && jl40.l(this.b, qv80Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowServiceInfo(trackId=");
        sb.append(this.a);
        sb.append(", message=");
        return b64.p(sb, this.b, ')');
    }

    public qv80() {
        this.a = null;
        this.b = null;
    }
}
