package f1;

import n1.AbstractC0991b;

/* renamed from: f1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191y extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2990d;

    /* renamed from: e, reason: collision with root package name */
    public int f2991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0182p f2992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191y(C0182p c0182p, l1.d dVar) {
        super(dVar);
        this.f2992f = c0182p;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f2990d = obj;
        this.f2991e |= Integer.MIN_VALUE;
        return this.f2992f.a(null, this);
    }
}
