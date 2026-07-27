package W3;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3448a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3449b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f3448a = str;
        this.f3449b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3448a.equals(aVar.f3448a) && this.f3449b.equals(aVar.f3449b);
    }

    public final int hashCode() {
        return ((this.f3448a.hashCode() ^ 1000003) * 1000003) ^ this.f3449b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f3448a + ", usedDates=" + this.f3449b + "}";
    }
}
