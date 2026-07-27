package N0;

import L.Q;
import r0.C0255p;

/* loaded from: classes.dex */
public final class m extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f783i;

    /* renamed from: j, reason: collision with root package name */
    public int f784j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q f785k;

    /* renamed from: l, reason: collision with root package name */
    public C0255p f786l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Q q2, v0.d dVar) {
        super(dVar);
        this.f785k = q2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f783i = obj;
        this.f784j |= Integer.MIN_VALUE;
        return this.f785k.n(null, this);
    }
}
