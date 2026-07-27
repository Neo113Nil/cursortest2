package r0;

import K0.InterfaceC0045v;
import android.content.Context;

/* renamed from: r0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230D extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f2831j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2832k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0238L f2833l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2834m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230D(String str, C0238L c0238l, boolean z2, v0.d dVar) {
        super(2, dVar);
        this.f2832k = str;
        this.f2833l = c0238l;
        this.f2834m = z2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0230D) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0230D(this.f2832k, this.f2833l, this.f2834m, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f2831j;
        if (i2 == 0) {
            o.g.C(obj);
            G.d dVar = new G.d(this.f2832k);
            Context context = this.f2833l.f2861f;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            A.j a2 = AbstractC0239M.a(context);
            C0229C c0229c = new C0229C(dVar, this.f2834m, null);
            this.f2831j = 1;
            if (a2.o(new G.h(c0229c, null), this) == aVar) {
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
