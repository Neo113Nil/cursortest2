package O0;

import L.Q;
import r0.C0242n;

/* loaded from: classes.dex */
public final class m extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f791h;

    /* renamed from: i, reason: collision with root package name */
    public int f792i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f793j;

    /* renamed from: k, reason: collision with root package name */
    public C0242n f794k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Q q2, v0.d dVar) {
        super(dVar);
        this.f793j = q2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f791h = obj;
        this.f792i |= Integer.MIN_VALUE;
        return this.f793j.c(null, this);
    }
}
