package F;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class h0 extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public I1.d f496d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f497e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f499g;

    /* renamed from: h, reason: collision with root package name */
    public int f500h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f499g = j0Var;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f498f = obj;
        this.f500h |= Integer.MIN_VALUE;
        return this.f499g.c(null, this);
    }
}
