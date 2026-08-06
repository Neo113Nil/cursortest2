package J1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public v f987a;

    /* renamed from: b, reason: collision with root package name */
    public t f988b;

    /* renamed from: d, reason: collision with root package name */
    public String f990d;

    /* renamed from: e, reason: collision with root package name */
    public k f991e;

    /* renamed from: g, reason: collision with root package name */
    public z f993g;

    /* renamed from: h, reason: collision with root package name */
    public y f994h;

    /* renamed from: i, reason: collision with root package name */
    public y f995i;

    /* renamed from: j, reason: collision with root package name */
    public y f996j;

    /* renamed from: k, reason: collision with root package name */
    public long f997k;

    /* renamed from: l, reason: collision with root package name */
    public long f998l;

    /* renamed from: m, reason: collision with root package name */
    public N1.e f999m;

    /* renamed from: c, reason: collision with root package name */
    public int f989c = -1;

    /* renamed from: f, reason: collision with root package name */
    public l f992f = new l(0);

    public static void b(y yVar, String str) {
        if (yVar == null) {
            return;
        }
        if (yVar.f1006g != null) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(".body != null", str).toString());
        }
        if (yVar.f1007h != null) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(".networkResponse != null", str).toString());
        }
        if (yVar.f1008i != null) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(".cacheResponse != null", str).toString());
        }
        if (yVar.f1009j != null) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(".priorResponse != null", str).toString());
        }
    }

    public final y a() {
        int i2 = this.f989c;
        if (i2 < 0) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i2), "code < 0: ").toString());
        }
        v vVar = this.f987a;
        if (vVar == null) {
            throw new IllegalStateException("request == null");
        }
        t tVar = this.f988b;
        if (tVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f990d;
        if (str != null) {
            return new y(vVar, tVar, str, i2, this.f991e, this.f992f.b(), this.f993g, this.f994h, this.f995i, this.f996j, this.f997k, this.f998l, this.f999m);
        }
        throw new IllegalStateException("message == null");
    }
}
