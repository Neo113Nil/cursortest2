package D1;

import A1.S;
import m1.EnumC0985a;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class q extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public r f291d;

    /* renamed from: e, reason: collision with root package name */
    public e f292e;

    /* renamed from: f, reason: collision with root package name */
    public t f293f;

    /* renamed from: g, reason: collision with root package name */
    public S f294g;

    /* renamed from: h, reason: collision with root package name */
    public Object f295h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f296i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f297j;

    /* renamed from: k, reason: collision with root package name */
    public int f298k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, l1.d dVar) {
        super(dVar);
        this.f297j = rVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f296i = obj;
        this.f298k |= Integer.MIN_VALUE;
        this.f297j.r(null, this);
        return EnumC0985a.f8194a;
    }
}
