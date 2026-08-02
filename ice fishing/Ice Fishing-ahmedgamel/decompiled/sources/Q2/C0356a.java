package Q2;

import java.util.Arrays;

/* renamed from: Q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2536a;

    /* renamed from: b, reason: collision with root package name */
    public final P2.e f2537b;

    /* renamed from: c, reason: collision with root package name */
    public final P2.b f2538c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2539d;

    public C0356a(P2.e eVar, P2.b bVar, String str) {
        this.f2537b = eVar;
        this.f2538c = bVar;
        this.f2539d = str;
        this.f2536a = Arrays.hashCode(new Object[]{eVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0356a)) {
            return false;
        }
        C0356a c0356a = (C0356a) obj;
        return R2.w.l(this.f2537b, c0356a.f2537b) && R2.w.l(this.f2538c, c0356a.f2538c) && R2.w.l(this.f2539d, c0356a.f2539d);
    }

    public final int hashCode() {
        return this.f2536a;
    }
}
