package D1;

import f1.C0182p;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class m extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f276d;

    /* renamed from: e, reason: collision with root package name */
    public int f277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.e f278f;

    /* renamed from: g, reason: collision with root package name */
    public C0182p f279g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(x0.e eVar, l1.d dVar) {
        super(dVar);
        this.f278f = eVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f276d = obj;
        this.f277e |= Integer.MIN_VALUE;
        return this.f278f.r(null, this);
    }
}
