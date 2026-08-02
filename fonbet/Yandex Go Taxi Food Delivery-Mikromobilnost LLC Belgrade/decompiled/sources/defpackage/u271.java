package defpackage;

import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Action;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow;
import ru.rt.ebs.cryptosdk.presentation.esiaAuth.d;

/* loaded from: classes4.dex */
public final class u271 implements vpr {
    public final /* synthetic */ ebo a;

    public u271(ebo eboVar) {
        this.a = eboVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Action action, Continuation continuation) {
        d dVar;
        int i;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
                Object obj = dVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dVar.d;
                if (i != 0) {
                    b.b(obj);
                    if (action == Action.PROCESSING) {
                        IFlow currentFlow = this.a.E.getCurrentFlow();
                        dVar.a = this;
                        dVar.d = 1;
                        if (currentFlow.startProcessingStateUpdatingIfNotStarted(dVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = dVar.a;
                b.b(obj);
                ebo eboVar = this.a;
                cbo cboVar = new cbo(zt41.b, eboVar.b0());
                r0 r0Var = (r0) eboVar.c0();
                r0Var.getClass();
                r0Var.m(null, cboVar);
                return zy11.a;
            }
        }
        dVar = new d(this, continuation);
        Object obj2 = dVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.d;
        if (i != 0) {
        }
        ebo eboVar2 = this.a;
        cbo cboVar2 = new cbo(zt41.b, eboVar2.b0());
        r0 r0Var2 = (r0) eboVar2.c0();
        r0Var2.getClass();
        r0Var2.m(null, cboVar2);
        return zy11.a;
    }
}
