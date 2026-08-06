package D1;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class a extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public E1.n f235d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C.j f237f;

    /* renamed from: g, reason: collision with root package name */
    public int f238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C.j jVar, l1.d dVar) {
        super(dVar);
        this.f237f = jVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f236e = obj;
        this.f238g |= Integer.MIN_VALUE;
        return this.f237f.r(null, this);
    }
}
