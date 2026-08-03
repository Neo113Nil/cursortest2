package androidx.compose.foundation;

import m0.r;
import oc.f;
import pc.k;
import w.b1;
import x.e0;
import y0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends k implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1 f512g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b1 b1Var) {
        super(3);
        this.f512g = b1Var;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj2;
        ((Number) obj3).intValue();
        rVar.X(1478351300);
        b1 b1Var = this.f512g;
        n d10 = u2.b.n(new ScrollSemanticsElement(b1Var), b1Var, e0.f7769g, true, null, b1Var.f7384c, rVar).d(new ScrollingLayoutElement(b1Var));
        rVar.q(false);
        return d10;
    }
}
