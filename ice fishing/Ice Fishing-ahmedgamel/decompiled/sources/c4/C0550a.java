package c4;

import java.util.ArrayList;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0550a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5729a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5730b;

    public C0550a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f5729a = str;
        this.f5730b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0550a)) {
            return false;
        }
        C0550a c0550a = (C0550a) obj;
        return this.f5729a.equals(c0550a.f5729a) && this.f5730b.equals(c0550a.f5730b);
    }

    public final int hashCode() {
        return ((this.f5729a.hashCode() ^ 1000003) * 1000003) ^ this.f5730b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f5729a + ", usedDates=" + this.f5730b + "}";
    }
}
