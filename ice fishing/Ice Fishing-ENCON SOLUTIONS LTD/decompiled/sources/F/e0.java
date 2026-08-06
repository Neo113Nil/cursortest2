package F;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class e0 extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public C0038n f472d;

    /* renamed from: e, reason: collision with root package name */
    public I1.a f473e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0038n f475g;

    /* renamed from: h, reason: collision with root package name */
    public int f476h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(C0038n c0038n, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f475g = c0038n;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f474f = obj;
        this.f476h |= Integer.MIN_VALUE;
        return this.f475g.f(this);
    }
}
