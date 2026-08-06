package D1;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class h extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f254d;

    /* renamed from: e, reason: collision with root package name */
    public int f255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f256f;

    /* renamed from: g, reason: collision with root package name */
    public Object f257g;

    /* renamed from: h, reason: collision with root package name */
    public e f258h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, l1.d dVar) {
        super(dVar);
        this.f256f = iVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f254d = obj;
        this.f255e |= Integer.MIN_VALUE;
        return this.f256f.r(null, this);
    }
}
