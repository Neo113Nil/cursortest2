package F;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class g0 extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public Object f485d;

    /* renamed from: e, reason: collision with root package name */
    public I1.d f486e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f488g;

    /* renamed from: h, reason: collision with root package name */
    public int f489h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f488g = j0Var;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f487f = obj;
        this.f489h |= Integer.MIN_VALUE;
        return this.f488g.b(null, this);
    }
}
