package F;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class C extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public P f354d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f355e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f356f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f357g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P f358h;

    /* renamed from: i, reason: collision with root package name */
    public int f359i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(P p2, l1.d dVar) {
        super(dVar);
        this.f358h = p2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f357g = obj;
        this.f359i |= Integer.MIN_VALUE;
        return P.d(this.f358h, false, this);
    }
}
