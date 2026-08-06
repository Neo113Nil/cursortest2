package F;

import n1.AbstractC0991b;

/* renamed from: F.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034j extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public C0038n f501d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0038n f503f;

    /* renamed from: g, reason: collision with root package name */
    public int f504g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0034j(C0038n c0038n, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f503f = c0038n;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f502e = obj;
        this.f504g |= Integer.MIN_VALUE;
        return this.f503f.b(this);
    }
}
