package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class u64 extends yeu {
    public final String a;
    public final ArrayList b;

    public u64(String str, ArrayList arrayList) {
        if (str == null) {
            ny61.t("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    @Override // defpackage.yeu
    public final List b() {
        return this.b;
    }

    @Override // defpackage.yeu
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yeu)) {
            return false;
        }
        yeu yeuVar = (yeu) obj;
        return this.a.equals(yeuVar.c()) && this.b.equals(yeuVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.a);
        sb.append(", usedDates=");
        return b64.n("}", sb, this.b);
    }
}
