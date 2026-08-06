package D1;

import f1.C0182p;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class n extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public C0182p f280d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f281e;

    /* renamed from: f, reason: collision with root package name */
    public int f282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0182p f283g;

    /* renamed from: h, reason: collision with root package name */
    public Object f284h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0182p c0182p, l1.d dVar) {
        super(dVar);
        this.f283g = c0182p;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f281e = obj;
        this.f282f |= Integer.MIN_VALUE;
        return this.f283g.a(null, this);
    }
}
