package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i3h {
    public final String a;
    public final h3h b;

    public i3h(h3h h3hVar) {
        phn.a.getClass();
        long f = phn.b.f();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder l = tlm.l(f, "v", "_t");
        l.append(currentTimeMillis);
        this.a = l.toString();
        this.b = h3hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3h)) {
            return false;
        }
        i3h i3hVar = (i3h) obj;
        return Intrinsics.d(this.a, i3hVar.a) && Intrinsics.d(this.b, i3hVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "LyricsReportResult(reportId=" + this.a + ", lyricsBundle=" + this.b + ", clicks=null)";
    }
}
