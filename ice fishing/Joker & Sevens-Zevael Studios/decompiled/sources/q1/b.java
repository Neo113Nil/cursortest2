package q1;

import x4.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5728g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f5729h;

    /* renamed from: i, reason: collision with root package name */
    public int f5730i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, hc.c cVar) {
        super(cVar);
        this.f5729h = iVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f5728g = obj;
        this.f5730i |= Integer.MIN_VALUE;
        return this.f5729h.b(0L, this);
    }
}
