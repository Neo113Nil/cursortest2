package D1;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class b extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public C1.r f239d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f241f;

    /* renamed from: g, reason: collision with root package name */
    public int f242g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f241f = cVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f240e = obj;
        this.f242g |= Integer.MIN_VALUE;
        return this.f241f.a(null, this);
    }
}
