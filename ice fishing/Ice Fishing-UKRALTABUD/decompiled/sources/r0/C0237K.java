package r0;

import K0.InterfaceC0045v;

/* renamed from: r0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237K extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f2857j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0238L f2858k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2859l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f2860m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0237K(C0238L c0238l, String str, String str2, v0.d dVar) {
        super(2, dVar);
        this.f2858k = c0238l;
        this.f2859l = str;
        this.f2860m = str2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0237K) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0237K(this.f2858k, this.f2859l, this.f2860m, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f2857j;
        if (i2 == 0) {
            o.g.C(obj);
            this.f2857j = 1;
            if (C0238L.r(this.f2858k, this.f2859l, this.f2860m, this) == aVar) {
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
