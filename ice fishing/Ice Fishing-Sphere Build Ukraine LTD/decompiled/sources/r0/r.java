package r0;

import D.InterfaceC0008i;
import L.C0026b;
import L0.InterfaceC0063v;
import android.content.Context;
import t0.C0252g;

/* loaded from: classes.dex */
public final class r extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public E0.p f2917i;

    /* renamed from: j, reason: collision with root package name */
    public int f2918j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2919k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f2920l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E0.p f2921m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, J j2, E0.p pVar, v0.d dVar) {
        super(2, dVar);
        this.f2919k = str;
        this.f2920l = j2;
        this.f2921m = pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((r) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new r(this.f2919k, this.f2920l, this.f2921m, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        E0.p pVar;
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f2918j;
        if (i2 == 0) {
            o.g.z(obj);
            G.d dVar = new G.d(this.f2919k);
            J j2 = this.f2920l;
            Context context = j2.f2863e;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            C0026b c0026b = new C0026b(((InterfaceC0008i) K.a(context).f30f).l(), dVar, j2, 10);
            E0.p pVar2 = this.f2921m;
            this.f2917i = pVar2;
            this.f2918j = 1;
            Object c2 = O0.r.c(c0026b, this);
            if (c2 == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = c2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f2917i;
            o.g.z(obj);
        }
        pVar.f313e = obj;
        return C0252g.f2994a;
    }
}
