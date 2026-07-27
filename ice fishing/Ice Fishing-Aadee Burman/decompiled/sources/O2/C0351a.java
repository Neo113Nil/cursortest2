package O2;

import java.util.Arrays;

/* renamed from: O2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2218a;

    /* renamed from: b, reason: collision with root package name */
    public final N2.e f2219b;

    /* renamed from: c, reason: collision with root package name */
    public final N2.b f2220c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2221d;

    public C0351a(N2.e eVar, N2.b bVar, String str) {
        this.f2219b = eVar;
        this.f2220c = bVar;
        this.f2221d = str;
        this.f2218a = Arrays.hashCode(new Object[]{eVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0351a)) {
            return false;
        }
        C0351a c0351a = (C0351a) obj;
        return P2.w.l(this.f2219b, c0351a.f2219b) && P2.w.l(this.f2220c, c0351a.f2220c) && P2.w.l(this.f2221d, c0351a.f2221d);
    }

    public final int hashCode() {
        return this.f2218a;
    }
}
