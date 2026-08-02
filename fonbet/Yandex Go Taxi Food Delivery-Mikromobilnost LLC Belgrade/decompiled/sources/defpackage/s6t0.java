package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.preorder.summary.solid.l;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class s6t0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ s6t0(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.O.a((ird) obj);
                break;
            case 1:
                this.b.S.b((k610) obj);
                break;
            case 2:
                this.b.P.b((r6d0) obj);
                break;
            case 3:
                ((qht0) this.b.V2).c((f4e) obj);
                break;
            case 4:
                this.b.N1.a(pfv0.a);
                break;
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                l lVar = this.b;
                if (booleanValue) {
                    lVar.y.a(null, lVar.z);
                } else {
                    lVar.y.b(null, lVar.z);
                }
                break;
            default:
                if (jl40.l(((fnx0) obj).d, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                    fnx0 fnx0Var = ((k) this.b.x).j.g;
                    if (!jl40.l(fnx0Var != null ? fnx0Var.d : null, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY) && !((Boolean) this.b.V3.a.b()).booleanValue()) {
                        l lVar2 = this.b;
                        pcm pcmVar = lVar2.N3;
                        fnx0 fnx0Var2 = ((k) lVar2.x).j.g;
                        ((qcm) pcmVar).a(fnx0Var2 != null ? fnx0Var2.d : null);
                    }
                }
                break;
        }
        return zy11.a;
    }
}
