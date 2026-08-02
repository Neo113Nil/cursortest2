package J0;

import com.google.android.gms.internal.ads.Wv;
import java.util.Set;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class d {
    public static final d i = new d(1, false, false, false, false, -1, -1, v7.r.f41223n);

    /* renamed from: a, reason: collision with root package name */
    public final int f1403a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1404b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1405c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1406d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1407e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1408f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1409g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f1410h;

    public d(int i4, boolean z6, boolean z9, boolean z10, boolean z11, long j6, long j9, Set contentUriTriggers) {
        Wv.n(i4, "requiredNetworkType");
        kotlin.jvm.internal.h.e(contentUriTriggers, "contentUriTriggers");
        this.f1403a = i4;
        this.f1404b = z6;
        this.f1405c = z9;
        this.f1406d = z10;
        this.f1407e = z11;
        this.f1408f = j6;
        this.f1409g = j9;
        this.f1410h = contentUriTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1404b == dVar.f1404b && this.f1405c == dVar.f1405c && this.f1406d == dVar.f1406d && this.f1407e == dVar.f1407e && this.f1408f == dVar.f1408f && this.f1409g == dVar.f1409g && this.f1403a == dVar.f1403a) {
            return kotlin.jvm.internal.h.a(this.f1410h, dVar.f1410h);
        }
        return false;
    }

    public final int hashCode() {
        int d9 = ((((((((AbstractC5050e.d(this.f1403a) * 31) + (this.f1404b ? 1 : 0)) * 31) + (this.f1405c ? 1 : 0)) * 31) + (this.f1406d ? 1 : 0)) * 31) + (this.f1407e ? 1 : 0)) * 31;
        long j6 = this.f1408f;
        int i4 = (d9 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j9 = this.f1409g;
        return this.f1410h.hashCode() + ((i4 + ((int) (j9 ^ (j9 >>> 32)))) * 31);
    }
}
