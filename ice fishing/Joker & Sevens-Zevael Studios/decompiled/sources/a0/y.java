package a0;

import w.p0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public b0 f144g;

    /* renamed from: h, reason: collision with root package name */
    public p0 f145h;

    /* renamed from: i, reason: collision with root package name */
    public hc.j f146i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f147j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0 f148k;

    /* renamed from: l, reason: collision with root package name */
    public int f149l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, hc.c cVar) {
        super(cVar);
        this.f148k = b0Var;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f147j = obj;
        this.f149l |= Integer.MIN_VALUE;
        return this.f148k.e(null, null, this);
    }
}
