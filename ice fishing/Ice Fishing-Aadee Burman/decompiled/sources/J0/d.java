package J0;

import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.Set;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class d {
    public static final d i = new d(1, false, false, false, false, -1, -1, v7.r.f41441n);

    /* renamed from: a, reason: collision with root package name */
    public final int f1374a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1375b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1376c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1377d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1378e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1379f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1380g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f1381h;

    public d(int i6, boolean z3, boolean z6, boolean z9, boolean z10, long j6, long j9, Set contentUriTriggers) {
        AbstractC4404f.l(i6, "requiredNetworkType");
        kotlin.jvm.internal.h.e(contentUriTriggers, "contentUriTriggers");
        this.f1374a = i6;
        this.f1375b = z3;
        this.f1376c = z6;
        this.f1377d = z9;
        this.f1378e = z10;
        this.f1379f = j6;
        this.f1380g = j9;
        this.f1381h = contentUriTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1375b == dVar.f1375b && this.f1376c == dVar.f1376c && this.f1377d == dVar.f1377d && this.f1378e == dVar.f1378e && this.f1379f == dVar.f1379f && this.f1380g == dVar.f1380g && this.f1374a == dVar.f1374a) {
            return kotlin.jvm.internal.h.a(this.f1381h, dVar.f1381h);
        }
        return false;
    }

    public final int hashCode() {
        int d2 = ((((((((AbstractC5049e.d(this.f1374a) * 31) + (this.f1375b ? 1 : 0)) * 31) + (this.f1376c ? 1 : 0)) * 31) + (this.f1377d ? 1 : 0)) * 31) + (this.f1378e ? 1 : 0)) * 31;
        long j6 = this.f1379f;
        int i6 = (d2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j9 = this.f1380g;
        return this.f1381h.hashCode() + ((i6 + ((int) (j9 ^ (j9 >>> 32)))) * 31);
    }
}
