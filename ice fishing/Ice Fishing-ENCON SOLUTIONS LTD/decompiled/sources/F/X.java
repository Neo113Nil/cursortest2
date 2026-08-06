package F;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class X extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public Y f444d;

    /* renamed from: e, reason: collision with root package name */
    public Object f445e;

    /* renamed from: f, reason: collision with root package name */
    public Object f446f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f447g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f448h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y f449i;

    /* renamed from: j, reason: collision with root package name */
    public int f450j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y2, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f449i = y2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f448h = obj;
        this.f450j |= Integer.MIN_VALUE;
        return this.f449i.b(null, this);
    }
}
