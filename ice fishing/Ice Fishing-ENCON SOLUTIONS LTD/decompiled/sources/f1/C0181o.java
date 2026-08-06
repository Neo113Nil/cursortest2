package f1;

import n1.AbstractC0991b;

/* renamed from: f1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181o extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2949d;

    /* renamed from: e, reason: collision with root package name */
    public int f2950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0182p f2951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181o(C0182p c0182p, l1.d dVar) {
        super(dVar);
        this.f2951f = c0182p;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f2949d = obj;
        this.f2950e |= Integer.MIN_VALUE;
        return this.f2951f.a(null, this);
    }
}
