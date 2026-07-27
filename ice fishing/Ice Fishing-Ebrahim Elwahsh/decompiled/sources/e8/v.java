package e8;

import com.google.android.gms.internal.ads.C4088vv;
import q2.C4903n;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public C4903n f37508a;

    /* renamed from: b, reason: collision with root package name */
    public t f37509b;

    /* renamed from: d, reason: collision with root package name */
    public String f37511d;

    /* renamed from: e, reason: collision with root package name */
    public l f37512e;

    /* renamed from: h, reason: collision with root package name */
    public S0.c f37515h;
    public w i;

    /* renamed from: j, reason: collision with root package name */
    public w f37516j;

    /* renamed from: k, reason: collision with root package name */
    public w f37517k;

    /* renamed from: l, reason: collision with root package name */
    public long f37518l;

    /* renamed from: m, reason: collision with root package name */
    public long f37519m;

    /* renamed from: n, reason: collision with root package name */
    public C4088vv f37520n;

    /* renamed from: c, reason: collision with root package name */
    public int f37510c = -1;

    /* renamed from: g, reason: collision with root package name */
    public y f37514g = y.f37539n;

    /* renamed from: o, reason: collision with root package name */
    public B f37521o = B.f37343a;

    /* renamed from: f, reason: collision with root package name */
    public I1.b f37513f = new I1.b(4);

    public static void b(String str, w wVar) {
        if (wVar != null) {
            if (wVar.f37523B != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (wVar.f37524C != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (wVar.f37525D != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final w a() {
        int i = this.f37510c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f37510c).toString());
        }
        C4903n c4903n = this.f37508a;
        if (c4903n == null) {
            throw new IllegalStateException("request == null");
        }
        t tVar = this.f37509b;
        if (tVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f37511d;
        if (str != null) {
            return new w(c4903n, tVar, str, i, this.f37512e, this.f37513f.f(), this.f37514g, this.f37515h, this.i, this.f37516j, this.f37517k, this.f37518l, this.f37519m, this.f37520n, this.f37521o);
        }
        throw new IllegalStateException("message == null");
    }
}
