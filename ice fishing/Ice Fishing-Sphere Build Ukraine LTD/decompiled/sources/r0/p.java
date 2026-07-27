package r0;

import D.InterfaceC0008i;
import L0.InterfaceC0063v;
import android.content.Context;
import t0.C0252g;

/* loaded from: classes.dex */
public final class p extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public E0.p f2909i;

    /* renamed from: j, reason: collision with root package name */
    public int f2910j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2911k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f2912l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E0.p f2913m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, J j2, E0.p pVar, v0.d dVar) {
        super(2, dVar);
        this.f2911k = str;
        this.f2912l = j2;
        this.f2913m = pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((p) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new p(this.f2911k, this.f2912l, this.f2913m, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        E0.p pVar;
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f2910j;
        if (i2 == 0) {
            o.g.z(obj);
            G.d dVar = new G.d(this.f2911k);
            Context context = this.f2912l.f2863e;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            o oVar = new o(((InterfaceC0008i) K.a(context).f30f).l(), dVar, 0);
            E0.p pVar2 = this.f2913m;
            this.f2909i = pVar2;
            this.f2910j = 1;
            Object c2 = O0.r.c(oVar, this);
            if (c2 == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = c2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f2909i;
            o.g.z(obj);
        }
        pVar.f313e = obj;
        return C0252g.f2994a;
    }
}
