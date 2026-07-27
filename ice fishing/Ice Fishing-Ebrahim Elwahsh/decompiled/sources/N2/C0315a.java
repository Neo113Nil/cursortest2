package N2;

import java.util.Arrays;

/* renamed from: N2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2035a;

    /* renamed from: b, reason: collision with root package name */
    public final M2.e f2036b;

    /* renamed from: c, reason: collision with root package name */
    public final M2.b f2037c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2038d;

    public C0315a(M2.e eVar, M2.b bVar, String str) {
        this.f2036b = eVar;
        this.f2037c = bVar;
        this.f2038d = str;
        this.f2035a = Arrays.hashCode(new Object[]{eVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0315a)) {
            return false;
        }
        C0315a c0315a = (C0315a) obj;
        return O2.w.l(this.f2036b, c0315a.f2036b) && O2.w.l(this.f2037c, c0315a.f2037c) && O2.w.l(this.f2038d, c0315a.f2038d);
    }

    public final int hashCode() {
        return this.f2035a;
    }
}
