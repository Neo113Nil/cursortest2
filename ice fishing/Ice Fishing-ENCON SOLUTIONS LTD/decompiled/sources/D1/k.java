package D1;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class k extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public l f267d;

    /* renamed from: e, reason: collision with root package name */
    public Object f268e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f270g;

    /* renamed from: h, reason: collision with root package name */
    public int f271h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, l1.d dVar) {
        super(dVar);
        this.f270g = lVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f269f = obj;
        this.f271h |= Integer.MIN_VALUE;
        return this.f270g.a(null, this);
    }
}
