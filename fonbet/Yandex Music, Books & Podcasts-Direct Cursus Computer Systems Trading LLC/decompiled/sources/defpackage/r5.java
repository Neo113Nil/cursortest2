package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class r5 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object W0 = ((s5) this.b).W0(pfmVar, continuation);
                if (W0 != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object v = xee.v(pfmVar, new pg0((qg0) this.b, null, 0), continuation);
                if (v != nm6.a) {
                    break;
                }
                break;
            case 2:
                x8a x8aVar = new x8a();
                hoa hoaVar = (hoa) this.b;
                Object Q = gld.Q(new f44(hoaVar, pfmVar, new yl0(4, hoaVar, x8aVar), new lma(1, x8aVar, pfmVar, hoaVar), new yna(hoaVar, 0), new yna(hoaVar, 1), new s30(21, x8aVar, hoaVar), (Continuation) null, 2), continuation);
                if (Q != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object Q2 = gld.Q(new ptd(pfmVar, (o3k) this.b, null, 19), continuation);
                if (Q2 != nm6.a) {
                    break;
                }
                break;
            default:
                Object v2 = xee.v(pfmVar, new rna((pmr) this.b, (Continuation) null, 4), continuation);
                if (v2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
