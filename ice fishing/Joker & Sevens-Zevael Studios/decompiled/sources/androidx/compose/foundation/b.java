package androidx.compose.foundation;

import e2.g;
import m0.l;
import m0.r;
import oc.f;
import pc.k;
import w.i0;
import y.i;
import y0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends k implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0 f507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f508h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f509i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ oc.a f510j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i0 i0Var, boolean z10, g gVar, oc.a aVar) {
        super(3);
        this.f507g = i0Var;
        this.f508h = z10;
        this.f509i = gVar;
        this.f510j = aVar;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj2;
        ((Number) obj3).intValue();
        rVar.X(-1525724089);
        Object M = rVar.M();
        if (M == l.f4646a) {
            M = new i();
            rVar.i0(M);
        }
        i iVar = (i) M;
        n d10 = c.a(this.f507g, iVar).d(new ClickableElement(iVar, null, this.f508h, this.f509i, this.f510j));
        rVar.q(false);
        return d10;
    }
}
