package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class c8s implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8s b;

    public /* synthetic */ c8s(e8s e8sVar, int i) {
        this.a = i;
        this.b = e8sVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                if (((cge) obj) != cge.d) {
                    break;
                } else {
                    e8s e8sVar = this.b;
                    ((zhk) e8sVar.n.a.getValue()).c();
                    Object emit = e8sVar.w.emit(suo.a, continuation);
                    if (emit != nm6.a) {
                        break;
                    }
                }
                break;
            default:
                if (((x66) obj).a) {
                    e8s e8sVar2 = this.b;
                    rar rarVar = e8sVar2.B;
                    Continuation continuation2 = null;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    e8sVar2.B = x97.y(ot0.F(e8sVar2), null, null, new b8s(e8sVar2, continuation2, 3), 3);
                }
                break;
        }
        return Unit.a;
    }
}
