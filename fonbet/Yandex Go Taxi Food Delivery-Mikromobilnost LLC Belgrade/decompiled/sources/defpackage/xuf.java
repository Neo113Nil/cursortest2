package defpackage;

import com.yandex.payment.divkit.select.h;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class xuf implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ xuf(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                Object o = hVar.R.o(vpv.a, continuation);
                return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : zy11Var;
            default:
                qyj0 qyj0Var = (qyj0) obj;
                if (!(qyj0Var instanceof hyj0)) {
                    if (qyj0Var instanceof kyj0) {
                        h.Y(hVar, (sm0) ((kyj0) qyj0Var).a);
                        return zy11Var;
                    }
                    w511.b();
                    return null;
                }
                hVar.getClass();
                r0 r0Var = hVar.P;
                eeq0 eeq0Var = new eeq0(((hyj0) qyj0Var).a);
                r0Var.getClass();
                r0Var.m(null, eeq0Var);
                return zy11Var;
        }
    }
}
