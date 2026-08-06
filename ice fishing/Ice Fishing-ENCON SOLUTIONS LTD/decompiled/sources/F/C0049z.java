package F;

import n1.AbstractC0991b;

/* renamed from: F.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049z extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public P f571d;

    /* renamed from: e, reason: collision with root package name */
    public I1.d f572e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f574g;

    /* renamed from: h, reason: collision with root package name */
    public int f575h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0049z(P p2, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f574g = p2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f573f = obj;
        this.f575h |= Integer.MIN_VALUE;
        return P.c(this.f574g, this);
    }
}
