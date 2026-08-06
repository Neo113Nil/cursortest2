package F;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class B extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public P f349d;

    /* renamed from: e, reason: collision with root package name */
    public int f350e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f352g;

    /* renamed from: h, reason: collision with root package name */
    public int f353h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(P p2, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f352g = p2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f351f = obj;
        this.f353h |= Integer.MIN_VALUE;
        return this.f352g.g(this);
    }
}
