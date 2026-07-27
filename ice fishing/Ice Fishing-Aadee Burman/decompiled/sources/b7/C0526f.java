package b7;

import c7.InterfaceC0545a;
import g6.C4531a;
import k6.C4636a;
import p7.C4853a;

/* renamed from: b7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0526f extends p {

    /* renamed from: j, reason: collision with root package name */
    public final Object f5434j;

    /* renamed from: k, reason: collision with root package name */
    public final a7.f f5435k;

    public C0526f(C4853a c4853a, Y6.a aVar, long j6, long j9, C4636a c4636a, l6.i iVar, f6.f fVar, a7.f fVar2) {
        super(c4853a, aVar, j6, j9, c4636a, iVar, fVar, null);
        this.f5434j = new Object();
        this.f5435k = fVar2;
    }

    @Override // b7.p
    public final InterfaceC0545a b() {
        C4531a i;
        C0521a c0521a;
        synchronized (this.f5434j) {
            C4853a c4853a = this.f5463a;
            Y6.a aVar = this.f5464b;
            long j6 = this.f5465c;
            long j9 = this.f5466d;
            C4636a c4636a = this.f5467e;
            l6.i iVar = this.f5468f;
            f6.f fVar = this.f5469g;
            synchronized (this.f5434j) {
                try {
                    a7.f fVar2 = this.f5435k;
                    i = fVar2 == null ? C4531a.f37657x : fVar2.i();
                } finally {
                }
            }
            C4531a c4531a = i;
            a7.f fVar3 = this.f5435k;
            c0521a = new C0521a(c4853a, aVar, j6, j9, c4636a, iVar, fVar3 == null ? 0 : fVar3.f4361v, c4531a, fVar);
        }
        return c0521a;
    }
}
