package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final w0.t f8130a;

    /* renamed from: b, reason: collision with root package name */
    public final e f8131b = e.f8015q;

    /* renamed from: c, reason: collision with root package name */
    public final e f8132c = e.f8016r;

    /* renamed from: d, reason: collision with root package name */
    public final e f8133d = e.f8017s;

    /* renamed from: e, reason: collision with root package name */
    public final e f8134e = e.f8011m;

    /* renamed from: f, reason: collision with root package name */
    public final e f8135f = e.f8012n;

    /* renamed from: g, reason: collision with root package name */
    public final e f8136g = e.f8013o;

    /* renamed from: h, reason: collision with root package name */
    public final e f8137h = e.f8014p;

    public o1(y1.p pVar) {
        this.f8130a = new w0.t(pVar);
    }

    public final void a(n1 n1Var, oc.c cVar, oc.a aVar) {
        Object obj;
        w0.s sVar;
        w0.t tVar = this.f8130a;
        synchronized (tVar.f7612g) {
            o0.e eVar = tVar.f7611f;
            Object[] objArr = eVar.f5134g;
            int i10 = eVar.f5136i;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    obj = null;
                    break;
                }
                obj = objArr[i11];
                if (((w0.s) obj).f7594a == cVar) {
                    break;
                } else {
                    i11++;
                }
            }
            sVar = (w0.s) obj;
            if (sVar == null) {
                pc.j.c(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                pc.v.c(1, cVar);
                sVar = new w0.s(cVar);
                eVar.b(sVar);
            }
        }
        w0.s sVar2 = tVar.f7614i;
        long j3 = tVar.f7615j;
        if (j3 != -1 && j3 != u0.e.c()) {
            m0.s1.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j3 + "), currentThread={id=" + u0.e.c() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            tVar.f7614i = sVar;
            tVar.f7615j = u0.e.c();
            sVar.a(n1Var, tVar.f7610e, aVar);
        } finally {
            tVar.f7614i = sVar2;
            tVar.f7615j = j3;
        }
    }
}
