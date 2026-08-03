package w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public k f7559a;

    /* renamed from: b, reason: collision with root package name */
    public long f7560b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7561c;

    /* renamed from: d, reason: collision with root package name */
    public int f7562d;

    public g(long j3, k kVar) {
        int i10;
        int numberOfTrailingZeros;
        this.f7559a = kVar;
        this.f7560b = j3;
        nd.d dVar = m.f7578a;
        if (j3 != 0) {
            k d10 = d();
            long j6 = d10.f7573i;
            long[] jArr = d10.f7574j;
            if (jArr != null) {
                j3 = jArr[0];
            } else {
                long j10 = d10.f7572h;
                if (j10 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                } else {
                    long j11 = d10.f7571g;
                    if (j11 != 0) {
                        j6 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                    }
                }
                j3 = numberOfTrailingZeros + j6;
            }
            synchronized (m.f7580c) {
                i10 = m.f7583f.a(j3);
            }
        } else {
            i10 = -1;
        }
        this.f7562d = i10;
    }

    public static void q(g gVar) {
        m.f7579b.K(gVar);
    }

    public final void a() {
        synchronized (m.f7580c) {
            b();
            p();
        }
    }

    public void b() {
        m.f7581d = m.f7581d.b(g());
    }

    public abstract void c();

    public k d() {
        return this.f7559a;
    }

    public abstract oc.c e();

    public abstract boolean f();

    public long g() {
        return this.f7560b;
    }

    public int h() {
        return 0;
    }

    public abstract oc.c i();

    public final g j() {
        a5.c cVar = m.f7579b;
        g gVar = (g) cVar.s();
        cVar.K(this);
        return gVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(v vVar);

    public final void o() {
        int i10 = this.f7562d;
        if (i10 >= 0) {
            m.u(i10);
            this.f7562d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(k kVar) {
        this.f7559a = kVar;
    }

    public void s(long j3) {
        this.f7560b = j3;
    }

    public void t(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g u(oc.c cVar);
}
