package f1;

import F.C0044u;
import n1.AbstractC0991b;

/* renamed from: f1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151B extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2873d;

    /* renamed from: e, reason: collision with root package name */
    public int f2874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0044u f2875f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0151B(C0044u c0044u, l1.d dVar) {
        super(dVar);
        this.f2875f = c0044u;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f2873d = obj;
        this.f2874e |= Integer.MIN_VALUE;
        return this.f2875f.a(null, this);
    }
}
