package r0;

import K0.InterfaceC0045v;

/* renamed from: r0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231E extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f2835j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0238L f2836k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2837l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f2838m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0231E(C0238L c0238l, String str, String str2, v0.d dVar) {
        super(2, dVar);
        this.f2836k = c0238l;
        this.f2837l = str;
        this.f2838m = str2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0231E) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0231E(this.f2836k, this.f2837l, this.f2838m, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f2835j;
        if (i2 == 0) {
            o.g.C(obj);
            this.f2835j = 1;
            if (C0238L.r(this.f2836k, this.f2837l, this.f2838m, this) == aVar) {
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
