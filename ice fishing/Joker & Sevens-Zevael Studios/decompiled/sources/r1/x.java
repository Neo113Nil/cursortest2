package r1;

import yc.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public r1 f5997g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5998h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f5999i;

    /* renamed from: j, reason: collision with root package name */
    public int f6000j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, hc.a aVar) {
        super(aVar);
        this.f5999i = yVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f5998h = obj;
        this.f6000j |= Integer.MIN_VALUE;
        return this.f5999i.b(0L, null, this);
    }
}
