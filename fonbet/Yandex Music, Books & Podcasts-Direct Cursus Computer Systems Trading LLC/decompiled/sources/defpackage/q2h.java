package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q2h {
    public final int a;
    public final String b;
    public final String c;
    public final List d;
    public final r7h e;

    public q2h(int i, String str, String str2, ArrayList arrayList, r7h r7hVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = r7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2h)) {
            return false;
        }
        q2h q2hVar = (q2h) obj;
        return this.a == q2hVar.a && this.b.equals(q2hVar.b) && this.c.equals(q2hVar.c) && Intrinsics.d(this.d, q2hVar.d) && this.e.equals(q2hVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        List list = this.d;
        return this.e.hashCode() + ((c + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = k5r.r(this.a, "LyricsDownloadInfo(id=", ", externalId=", this.b, ", url=");
        r.append(this.c);
        r.append(", writers=");
        r.append(this.d);
        r.append(", major=");
        r.append(this.e);
        r.append(")");
        return r.toString();
    }
}
