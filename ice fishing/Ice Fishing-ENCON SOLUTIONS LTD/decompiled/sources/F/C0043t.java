package F;

import n1.AbstractC0991b;

/* renamed from: F.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043t extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f549d;

    /* renamed from: e, reason: collision with root package name */
    public int f550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0044u f551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0043t(C0044u c0044u, l1.d dVar) {
        super(dVar);
        this.f551f = c0044u;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f549d = obj;
        this.f550e |= Integer.MIN_VALUE;
        return this.f551f.a(null, this);
    }
}
