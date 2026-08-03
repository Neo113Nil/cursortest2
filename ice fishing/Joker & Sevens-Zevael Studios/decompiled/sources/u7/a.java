package u7;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6714a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6715b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f6714a = str;
        this.f6715b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6714a.equals(aVar.f6714a) && this.f6715b.equals(aVar.f6715b);
    }

    public final int hashCode() {
        return ((this.f6714a.hashCode() ^ 1000003) * 1000003) ^ this.f6715b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f6714a + ", usedDates=" + this.f6715b + "}";
    }
}
