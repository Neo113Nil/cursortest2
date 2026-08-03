package b0;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.List;
import x1.y1;
import x1.z1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f899g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pc.s f900h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(pc.s sVar, int i10) {
        super(1);
        this.f899g = i10;
        this.f900h = sVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f899g) {
            case 0:
                z1 z1Var = (z1) obj;
                pc.j.c(z1Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                d0 d0Var = ((w0) z1Var).f925u;
                pc.s sVar = this.f900h;
                List list = (List) sVar.f5683g;
                if (list != null) {
                    list.add(d0Var);
                } else {
                    list = bc.n.M(d0Var);
                }
                sVar.f5683g = list;
                return y1.f8219h;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                x1.l lVar = (z1) obj;
                if (((y0.m) lVar).f8443g.f8456t) {
                    this.f900h.f5683g = lVar;
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                this.f900h.f5683g = (d1.r) obj;
                return Boolean.TRUE;
        }
    }
}
