package F;

import A1.C0011l;
import n1.AbstractC0991b;

/* renamed from: F.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048y extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public Object f565d;

    /* renamed from: e, reason: collision with root package name */
    public P f566e;

    /* renamed from: f, reason: collision with root package name */
    public C0011l f567f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f568g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P f569h;

    /* renamed from: i, reason: collision with root package name */
    public int f570i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0048y(P p2, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f569h = p2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f568g = obj;
        this.f570i |= Integer.MIN_VALUE;
        return P.b(this.f569h, null, this);
    }
}
