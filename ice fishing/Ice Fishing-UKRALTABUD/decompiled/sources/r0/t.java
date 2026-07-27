package r0;

import D.InterfaceC0008i;
import K0.InterfaceC0045v;
import L.C0051b;
import android.content.Context;

/* loaded from: classes.dex */
public final class t extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public E0.p f2918j;

    /* renamed from: k, reason: collision with root package name */
    public int f2919k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2920l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0238L f2921m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E0.p f2922n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, C0238L c0238l, E0.p pVar, v0.d dVar) {
        super(2, dVar);
        this.f2920l = str;
        this.f2921m = c0238l;
        this.f2922n = pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((t) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new t(this.f2920l, this.f2921m, this.f2922n, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        E0.p pVar;
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f2919k;
        if (i2 == 0) {
            o.g.C(obj);
            G.d dVar = new G.d(this.f2920l);
            C0238L c0238l = this.f2921m;
            Context context = c0238l.f2861f;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            C0051b c0051b = new C0051b(((InterfaceC0008i) AbstractC0239M.a(context).f30g).k(), dVar, c0238l, 10);
            E0.p pVar2 = this.f2922n;
            this.f2918j = pVar2;
            this.f2919k = 1;
            Object c2 = N0.r.c(c0051b, this);
            if (c2 == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = c2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f2918j;
            o.g.C(obj);
        }
        pVar.f312f = obj;
        return t0.g.f2989a;
    }
}
