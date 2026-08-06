package f1;

import n1.AbstractC0991b;

/* renamed from: f1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187u extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2971d;

    /* renamed from: e, reason: collision with root package name */
    public int f2972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0182p f2973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187u(C0182p c0182p, l1.d dVar) {
        super(dVar);
        this.f2973f = c0182p;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f2971d = obj;
        this.f2972e |= Integer.MIN_VALUE;
        return this.f2973f.a(null, this);
    }
}
