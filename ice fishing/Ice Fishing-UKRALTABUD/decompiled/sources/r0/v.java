package r0;

import D.InterfaceC0008i;
import K0.InterfaceC0045v;
import android.content.Context;

/* loaded from: classes.dex */
public final class v extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public E0.p f2926j;

    /* renamed from: k, reason: collision with root package name */
    public int f2927k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2928l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0238L f2929m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E0.p f2930n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, C0238L c0238l, E0.p pVar, v0.d dVar) {
        super(2, dVar);
        this.f2928l = str;
        this.f2929m = c0238l;
        this.f2930n = pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((v) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new v(this.f2928l, this.f2929m, this.f2930n, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        E0.p pVar;
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f2927k;
        if (i2 == 0) {
            o.g.C(obj);
            G.d dVar = new G.d(this.f2928l);
            Context context = this.f2929m.f2861f;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            q qVar = new q(((InterfaceC0008i) AbstractC0239M.a(context).f30g).k(), dVar, 1);
            E0.p pVar2 = this.f2930n;
            this.f2926j = pVar2;
            this.f2927k = 1;
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
            pVar = this.f2926j;
            o.g.C(obj);
        }
        pVar.f312f = obj;
        return t0.g.f2989a;
    }
}
