package g0;

import f1.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f2415a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2416b;

    public c(long j3, long j6) {
        this.f2415a = j3;
        this.f2416b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return q.c(this.f2415a, cVar.f2415a) && q.c(this.f2416b, cVar.f2416b);
    }

    public final int hashCode() {
        int i10 = q.f2284i;
        return Long.hashCode(this.f2416b) + (Long.hashCode(this.f2415a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        a4.d.q(this.f2415a, sb, ", selectionBackgroundColor=");
        sb.append((Object) q.i(this.f2416b));
        sb.append(')');
        return sb.toString();
    }
}
