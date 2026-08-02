package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mzj implements drf {
    public final nrf a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;

    public mzj(nrf nrfVar, String str, String str2, boolean z, int i) {
        this.a = nrfVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzj)) {
            return false;
        }
        mzj mzjVar = (mzj) obj;
        return this.a.equals(mzjVar.a) && Intrinsics.d(this.b, mzjVar.b) && this.c.equals(mzjVar.c) && this.d == mzjVar.d && this.e == mzjVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.e) + k5r.e(k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverviewBlock(meta=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append(this.c);
        sb.append(", expandable=");
        sb.append(this.d);
        sb.append(", visibleLines=");
        return f1d.i(sb, this.e, ")");
    }
}
