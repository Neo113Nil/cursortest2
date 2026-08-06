package D1;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class j extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f261d;

    /* renamed from: e, reason: collision with root package name */
    public int f262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.e f263f;

    /* renamed from: g, reason: collision with root package name */
    public x0.e f264g;

    /* renamed from: h, reason: collision with root package name */
    public e f265h;

    /* renamed from: i, reason: collision with root package name */
    public E1.n f266i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x0.e eVar, l1.d dVar) {
        super(dVar);
        this.f263f = eVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f261d = obj;
        this.f262e |= Integer.MIN_VALUE;
        return this.f263f.r(null, this);
    }
}
