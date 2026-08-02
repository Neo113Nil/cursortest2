package b7;

import a7.C0447b;
import c7.InterfaceC0556a;
import f6.C4522a;
import k6.C4647a;
import p7.C4853a;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final C4853a f5611a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f5612b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5613c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5614d;

    /* renamed from: e, reason: collision with root package name */
    public final C4647a f5615e;

    /* renamed from: f, reason: collision with root package name */
    public final l6.i f5616f;

    /* renamed from: g, reason: collision with root package name */
    public final f6.f f5617g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5618h = new Object();
    public final C0447b i;

    public o(C4853a c4853a, Y6.a aVar, long j6, long j9, C4647a c4647a, l6.i iVar, f6.f fVar, C0447b c0447b) {
        this.f5611a = c4853a;
        this.f5612b = aVar;
        this.f5613c = j6;
        this.f5614d = j9;
        this.f5615e = c4647a;
        this.f5616f = iVar;
        this.f5617g = fVar;
        this.i = c0447b;
    }

    public final C4522a a() {
        synchronized (this.f5618h) {
            try {
                C0447b c0447b = this.i;
                if (c0447b != null && !c0447b.isEmpty()) {
                    C0447b c0447b2 = this.i;
                    c0447b2.getClass();
                    K1.c cVar = new K1.c(1);
                    cVar.d(c0447b2);
                    return cVar.a();
                }
                return C4522a.f37475w;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC0556a b() {
        C0531c c0531c;
        synchronized (this.f5618h) {
            C4853a c4853a = this.f5611a;
            Y6.a aVar = this.f5612b;
            long j6 = this.f5613c;
            long j9 = this.f5614d;
            C4647a c4647a = this.f5615e;
            l6.i iVar = this.f5616f;
            f6.f fVar = this.f5617g;
            C4522a a9 = a();
            C0447b c0447b = this.i;
            c0531c = new C0531c(c4853a, aVar, j6, j9, c4647a, iVar, a9, c0447b == null ? 0 : c0447b.f4323v, fVar);
        }
        return c0531c;
    }
}
