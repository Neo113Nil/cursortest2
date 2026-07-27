package r0;

import D.InterfaceC0008i;
import K0.InterfaceC0045v;
import android.content.Context;

/* loaded from: classes.dex */
public final class r extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public E0.p f2910j;

    /* renamed from: k, reason: collision with root package name */
    public int f2911k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2912l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0238L f2913m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E0.p f2914n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, C0238L c0238l, E0.p pVar, v0.d dVar) {
        super(2, dVar);
        this.f2912l = str;
        this.f2913m = c0238l;
        this.f2914n = pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((r) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new r(this.f2912l, this.f2913m, this.f2914n, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        E0.p pVar;
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f2911k;
        if (i2 == 0) {
            o.g.C(obj);
            G.d dVar = new G.d(this.f2912l);
            Context context = this.f2913m.f2861f;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            q qVar = new q(((InterfaceC0008i) AbstractC0239M.a(context).f30g).k(), dVar, 0);
            E0.p pVar2 = this.f2914n;
            this.f2910j = pVar2;
            this.f2911k = 1;
            Object c2 = N0.r.c(qVar, this);
            if (c2 == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = c2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f2910j;
            o.g.C(obj);
        }
        pVar.f312f = obj;
        return t0.g.f2989a;
    }
}
