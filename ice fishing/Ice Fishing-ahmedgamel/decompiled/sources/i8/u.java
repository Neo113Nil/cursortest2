package i8;

import com.google.android.gms.internal.ads.C3451jv;
import com.google.android.gms.internal.ads.WP;
import s2.C4945n;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public C4945n f38349a;

    /* renamed from: b, reason: collision with root package name */
    public s f38350b;

    /* renamed from: d, reason: collision with root package name */
    public String f38352d;

    /* renamed from: e, reason: collision with root package name */
    public k f38353e;

    /* renamed from: h, reason: collision with root package name */
    public WP f38356h;
    public v i;

    /* renamed from: j, reason: collision with root package name */
    public v f38357j;

    /* renamed from: k, reason: collision with root package name */
    public v f38358k;

    /* renamed from: l, reason: collision with root package name */
    public long f38359l;

    /* renamed from: m, reason: collision with root package name */
    public long f38360m;

    /* renamed from: n, reason: collision with root package name */
    public C3451jv f38361n;

    /* renamed from: c, reason: collision with root package name */
    public int f38351c = -1;

    /* renamed from: g, reason: collision with root package name */
    public x f38355g = x.f38380n;

    /* renamed from: o, reason: collision with root package name */
    public A f38362o = A.f38185a;

    /* renamed from: f, reason: collision with root package name */
    public I1.d f38354f = new I1.d(3);

    public static void b(String str, v vVar) {
        if (vVar != null) {
            if (vVar.f38364B != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (vVar.f38365C != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (vVar.f38366D != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final v a() {
        int i = this.f38351c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f38351c).toString());
        }
        C4945n c4945n = this.f38349a;
        if (c4945n == null) {
            throw new IllegalStateException("request == null");
        }
        s sVar = this.f38350b;
        if (sVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f38352d;
        if (str != null) {
            return new v(c4945n, sVar, str, i, this.f38353e, this.f38354f.e(), this.f38355g, this.f38356h, this.i, this.f38357j, this.f38358k, this.f38359l, this.f38360m, this.f38361n, this.f38362o);
        }
        throw new IllegalStateException("message == null");
    }
}
