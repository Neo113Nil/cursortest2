package a4;

import java.util.ArrayList;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0433a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4336a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4337b;

    public C0433a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f4336a = str;
        this.f4337b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0433a)) {
            return false;
        }
        C0433a c0433a = (C0433a) obj;
        return this.f4336a.equals(c0433a.f4336a) && this.f4337b.equals(c0433a.f4337b);
    }

    public final int hashCode() {
        return ((this.f4336a.hashCode() ^ 1000003) * 1000003) ^ this.f4337b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f4336a + ", usedDates=" + this.f4337b + "}";
    }
}
