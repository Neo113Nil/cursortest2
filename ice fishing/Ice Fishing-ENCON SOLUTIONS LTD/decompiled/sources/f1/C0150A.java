package f1;

import n1.AbstractC0991b;

/* renamed from: f1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150A extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2870d;

    /* renamed from: e, reason: collision with root package name */
    public int f2871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0182p f2872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150A(C0182p c0182p, l1.d dVar) {
        super(dVar);
        this.f2872f = c0182p;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f2870d = obj;
        this.f2871e |= Integer.MIN_VALUE;
        return this.f2872f.a(null, this);
    }
}
