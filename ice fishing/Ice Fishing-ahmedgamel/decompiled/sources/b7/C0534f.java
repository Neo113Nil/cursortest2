package b7;

import c7.InterfaceC0556a;
import g6.C4535a;
import k6.C4647a;
import p7.C4853a;

/* renamed from: b7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0534f extends o {

    /* renamed from: j, reason: collision with root package name */
    public final Object f5584j;

    /* renamed from: k, reason: collision with root package name */
    public final a7.f f5585k;

    public C0534f(C4853a c4853a, Y6.a aVar, long j6, long j9, C4647a c4647a, l6.i iVar, f6.f fVar, a7.f fVar2) {
        super(c4853a, aVar, j6, j9, c4647a, iVar, fVar, null);
        this.f5584j = new Object();
        this.f5585k = fVar2;
    }

    @Override // b7.o
    public final InterfaceC0556a b() {
        C4535a i;
        C0529a c0529a;
        synchronized (this.f5584j) {
            C4853a c4853a = this.f5611a;
            Y6.a aVar = this.f5612b;
            long j6 = this.f5613c;
            long j9 = this.f5614d;
            C4647a c4647a = this.f5615e;
            l6.i iVar = this.f5616f;
            f6.f fVar = this.f5617g;
            synchronized (this.f5584j) {
                try {
                    a7.f fVar2 = this.f5585k;
                    i = fVar2 == null ? C4535a.f37682x : fVar2.i();
                } finally {
                }
            }
            C4535a c4535a = i;
            a7.f fVar3 = this.f5585k;
            c0529a = new C0529a(c4853a, aVar, j6, j9, c4647a, iVar, fVar3 == null ? 0 : fVar3.f4329v, c4535a, fVar);
        }
        return c0529a;
    }
}
