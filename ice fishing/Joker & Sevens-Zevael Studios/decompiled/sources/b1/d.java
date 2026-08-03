package b1;

import pc.j;
import pc.k;
import pc.o;
import x.j0;
import x1.y1;
import x1.z1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f942g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f943h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f8.c cVar, e eVar, o oVar) {
        super(1);
        this.f943h = oVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f942g) {
            case 0:
                e eVar = (e) obj;
                if (!eVar.f8456t) {
                    return y1.f8219h;
                }
                if (eVar.f945v != null) {
                    u1.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                eVar.f945v = null;
                o oVar = this.f943h;
                oVar.f5679g = oVar.f5679g;
                return y1.f8218g;
            default:
                z1 z1Var = (z1) obj;
                o oVar2 = this.f943h;
                if (!oVar2.f5679g) {
                    j.c(z1Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (!((j0) z1Var).f7829u) {
                        z10 = false;
                        oVar2.f5679g = z10;
                        return Boolean.valueOf(!z10);
                    }
                }
                z10 = true;
                oVar2.f5679g = z10;
                return Boolean.valueOf(!z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar) {
        super(1);
        this.f943h = oVar;
    }
}
