package D;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class G extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public Object f79i;

    /* renamed from: j, reason: collision with root package name */
    public Object f80j;

    /* renamed from: k, reason: collision with root package name */
    public Serializable f81k;

    /* renamed from: l, reason: collision with root package name */
    public E0.p f82l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f83m;

    /* renamed from: n, reason: collision with root package name */
    public int f84n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f85o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ S f86p;

    /* renamed from: q, reason: collision with root package name */
    public int f87q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(S s2, x0.b bVar) {
        super(bVar);
        this.f86p = s2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f85o = obj;
        this.f87q |= Integer.MIN_VALUE;
        return S.e(this.f86p, false, this);
    }
}
