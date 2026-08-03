package id;

import qd.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public i f3268g;

    /* renamed from: h, reason: collision with root package name */
    public l f3269h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3270i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f3271j;

    /* renamed from: k, reason: collision with root package name */
    public int f3272k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, hc.c cVar) {
        super(cVar);
        this.f3271j = iVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f3270i = obj;
        this.f3272k |= Integer.MIN_VALUE;
        return this.f3271j.g(null, this);
    }
}
