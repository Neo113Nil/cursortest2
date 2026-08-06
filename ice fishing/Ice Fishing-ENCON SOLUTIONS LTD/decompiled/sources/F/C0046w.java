package F;

import n1.AbstractC0991b;

/* renamed from: F.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046w extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public P f558d;

    /* renamed from: e, reason: collision with root package name */
    public I1.d f559e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f561g;

    /* renamed from: h, reason: collision with root package name */
    public int f562h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046w(P p2, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f561g = p2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f560f = obj;
        this.f562h |= Integer.MIN_VALUE;
        return P.a(this.f561g, this);
    }
}
