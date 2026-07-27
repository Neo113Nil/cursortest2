package r0;

import java.util.List;

/* renamed from: r0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236h {

    /* renamed from: a, reason: collision with root package name */
    public final String f2887a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2888b;

    public C0236h(String str, boolean z2) {
        this.f2887a = str;
        this.f2888b = z2;
    }

    public final List a() {
        return u0.e.B(this.f2887a, Boolean.valueOf(this.f2888b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0236h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return o.g.k(a(), ((C0236h) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f2887a + ", useDataStore=" + this.f2888b + ")";
    }
}
