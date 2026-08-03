package e5;

import bd.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2108g;

    /* renamed from: h, reason: collision with root package name */
    public int f2109h;

    /* renamed from: i, reason: collision with root package name */
    public f f2110i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f2111j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, fc.d dVar) {
        super(dVar);
        this.f2111j = cVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f2108g = obj;
        this.f2109h |= Integer.MIN_VALUE;
        return this.f2111j.a(null, this);
    }
}
