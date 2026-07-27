package X6;

import b6.C0530a;
import g6.C4531a;
import l7.C4707a;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final C4707a f3876a;

    /* renamed from: b, reason: collision with root package name */
    public final U6.a f3877b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3878c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3879d;

    /* renamed from: e, reason: collision with root package name */
    public final C4531a f3880e;

    /* renamed from: f, reason: collision with root package name */
    public final h6.i f3881f;

    /* renamed from: g, reason: collision with root package name */
    public final b6.f f3882g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3883h = new Object();
    public final W6.b i;

    public o(C4707a c4707a, U6.a aVar, long j9, long j10, C4531a c4531a, h6.i iVar, b6.f fVar, W6.b bVar) {
        this.f3876a = c4707a;
        this.f3877b = aVar;
        this.f3878c = j9;
        this.f3879d = j10;
        this.f3880e = c4531a;
        this.f3881f = iVar;
        this.f3882g = fVar;
        this.i = bVar;
    }

    public final C0530a a() {
        synchronized (this.f3883h) {
            try {
                W6.b bVar = this.i;
                if (bVar != null && !bVar.isEmpty()) {
                    W6.b bVar2 = this.i;
                    bVar2.getClass();
                    I1.f fVar = new I1.f(2);
                    fVar.f(bVar2);
                    return fVar.b();
                }
                return C0530a.f5557w;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Y6.a b() {
        c cVar;
        synchronized (this.f3883h) {
            C4707a c4707a = this.f3876a;
            U6.a aVar = this.f3877b;
            long j9 = this.f3878c;
            long j10 = this.f3879d;
            C4531a c4531a = this.f3880e;
            h6.i iVar = this.f3881f;
            b6.f fVar = this.f3882g;
            C0530a a9 = a();
            W6.b bVar = this.i;
            cVar = new c(c4707a, aVar, j9, j10, c4531a, iVar, a9, bVar == null ? 0 : bVar.f3466v, fVar);
        }
        return cVar;
    }
}
