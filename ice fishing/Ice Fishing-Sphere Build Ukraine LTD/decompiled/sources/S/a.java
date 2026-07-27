package S;

import D.A;
import D0.p;
import L0.InterfaceC0063v;
import O0.d;
import U.i;
import o.g;
import t0.C0252g;
import x0.f;

/* loaded from: classes.dex */
public final class a extends f implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f945i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f946j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f947k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, i iVar, v0.d dVar2) {
        super(2, dVar2);
        this.f946j = dVar;
        this.f947k = iVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((a) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new a(this.f946j, this.f947k, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f945i;
        if (i2 == 0) {
            g.z(obj);
            A a2 = new A(2, this.f947k);
            this.f945i = 1;
            if (this.f946j.c(a2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.z(obj);
        }
        return C0252g.f2994a;
    }
}
