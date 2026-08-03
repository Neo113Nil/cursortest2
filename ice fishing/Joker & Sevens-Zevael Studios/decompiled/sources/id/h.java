package id;

import qd.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public i f3278g;

    /* renamed from: h, reason: collision with root package name */
    public l f3279h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3280i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f3281j;

    /* renamed from: k, reason: collision with root package name */
    public int f3282k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, hc.c cVar) {
        super(cVar);
        this.f3281j = iVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f3280i = obj;
        this.f3282k |= Integer.MIN_VALUE;
        return this.f3281j.i(null, this);
    }
}
