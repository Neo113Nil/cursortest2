package r0;

import D.InterfaceC0008i;
import L0.InterfaceC0063v;
import android.content.Context;
import t0.C0252g;

/* loaded from: classes.dex */
public final class x extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public E0.p f2944i;

    /* renamed from: j, reason: collision with root package name */
    public int f2945j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2946k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f2947l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E0.p f2948m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, J j2, E0.p pVar, v0.d dVar) {
        super(2, dVar);
        this.f2946k = str;
        this.f2947l = j2;
        this.f2948m = pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((x) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new x(this.f2946k, this.f2947l, this.f2948m, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        E0.p pVar;
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f2945j;
        if (i2 == 0) {
            o.g.z(obj);
            G.d dVar = new G.d(this.f2946k);
            Context context = this.f2947l.f2863e;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            o oVar = new o(((InterfaceC0008i) K.a(context).f30f).l(), dVar, 2);
            E0.p pVar2 = this.f2948m;
            this.f2944i = pVar2;
            this.f2945j = 1;
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
            pVar = this.f2944i;
            o.g.z(obj);
        }
        pVar.f313e = obj;
        return C0252g.f2994a;
    }
}
