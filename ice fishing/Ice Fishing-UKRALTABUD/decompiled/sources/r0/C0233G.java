package r0;

import K0.InterfaceC0045v;
import android.content.Context;

/* renamed from: r0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233G extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f2842j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2843k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0238L f2844l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f2845m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0233G(String str, C0238L c0238l, double d2, v0.d dVar) {
        super(2, dVar);
        this.f2843k = str;
        this.f2844l = c0238l;
        this.f2845m = d2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0233G) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0233G(this.f2843k, this.f2844l, this.f2845m, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f2842j;
        if (i2 == 0) {
            o.g.C(obj);
            G.d dVar = new G.d(this.f2843k);
            Context context = this.f2844l.f2861f;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            A.j a2 = AbstractC0239M.a(context);
            C0232F c0232f = new C0232F(dVar, this.f2845m, null);
            this.f2842j = 1;
            if (a2.o(new G.h(c0232f, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return t0.g.f2989a;
    }
}
