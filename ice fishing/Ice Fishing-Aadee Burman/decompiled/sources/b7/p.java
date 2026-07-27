package b7;

import a7.C0443b;
import c7.InterfaceC0545a;
import d1.C4445c;
import f6.C4512a;
import k6.C4636a;
import p7.C4853a;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final C4853a f5463a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f5464b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5465c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5466d;

    /* renamed from: e, reason: collision with root package name */
    public final C4636a f5467e;

    /* renamed from: f, reason: collision with root package name */
    public final l6.i f5468f;

    /* renamed from: g, reason: collision with root package name */
    public final f6.f f5469g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5470h = new Object();
    public final C0443b i;

    public p(C4853a c4853a, Y6.a aVar, long j6, long j9, C4636a c4636a, l6.i iVar, f6.f fVar, C0443b c0443b) {
        this.f5463a = c4853a;
        this.f5464b = aVar;
        this.f5465c = j6;
        this.f5466d = j9;
        this.f5467e = c4636a;
        this.f5468f = iVar;
        this.f5469g = fVar;
        this.i = c0443b;
    }

    public final C4512a a() {
        synchronized (this.f5470h) {
            try {
                C0443b c0443b = this.i;
                if (c0443b != null && !c0443b.isEmpty()) {
                    C0443b c0443b2 = this.i;
                    c0443b2.getClass();
                    C4445c c4445c = new C4445c();
                    c4445c.g(c0443b2);
                    return c4445c.d();
                }
                return C4512a.f37513w;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC0545a b() {
        C0523c c0523c;
        synchronized (this.f5470h) {
            C4853a c4853a = this.f5463a;
            Y6.a aVar = this.f5464b;
            long j6 = this.f5465c;
            long j9 = this.f5466d;
            C4636a c4636a = this.f5467e;
            l6.i iVar = this.f5468f;
            f6.f fVar = this.f5469g;
            C4512a a9 = a();
            C0443b c0443b = this.i;
            c0523c = new C0523c(c4853a, aVar, j6, j9, c4636a, iVar, a9, c0443b == null ? 0 : c0443b.f4355v, fVar);
        }
        return c0523c;
    }
}
