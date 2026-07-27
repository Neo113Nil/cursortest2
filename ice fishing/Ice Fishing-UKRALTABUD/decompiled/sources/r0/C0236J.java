package r0;

import K0.InterfaceC0045v;
import android.content.Context;

/* renamed from: r0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236J extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f2853j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2854k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0238L f2855l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2856m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0236J(String str, C0238L c0238l, long j2, v0.d dVar) {
        super(2, dVar);
        this.f2854k = str;
        this.f2855l = c0238l;
        this.f2856m = j2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0236J) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0236J(this.f2854k, this.f2855l, this.f2856m, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f2853j;
        if (i2 == 0) {
            o.g.C(obj);
            G.d dVar = new G.d(this.f2854k);
            Context context = this.f2855l.f2861f;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            A.j a2 = AbstractC0239M.a(context);
            C0235I c0235i = new C0235I(dVar, this.f2856m, null);
            this.f2853j = 1;
            if (a2.o(new G.h(c0235i, null), this) == aVar) {
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
