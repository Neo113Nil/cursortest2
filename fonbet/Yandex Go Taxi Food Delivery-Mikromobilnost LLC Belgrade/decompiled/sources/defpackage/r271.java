package defpackage;

import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Action;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording.d;

/* loaded from: classes4.dex */
public final class r271 implements vpr {
    public final /* synthetic */ oib0 a;

    public r271(oib0 oib0Var) {
        this.a = oib0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r1.cancelProcessingStateUpdating(r2) == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r1.startProcessingStateUpdatingIfNotStarted(r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Action action, Continuation continuation) {
        d dVar;
        int i;
        r271 r271Var = this;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
                Object obj = dVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dVar.d;
                int i3 = 1;
                if (i != 0) {
                    b.b(obj);
                    int i4 = nib0.a[action.ordinal()];
                    oib0 oib0Var = r271Var.a;
                    if (i4 == 1) {
                        IFlow currentFlow = oib0Var.E.getCurrentFlow();
                        dVar.a = r271Var;
                        dVar.d = 1;
                    } else if (i4 == 2) {
                        IFlow currentFlow2 = oib0Var.E.getCurrentFlow();
                        dVar.a = r271Var;
                        dVar.d = 2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    r271Var = dVar.a;
                    b.b(obj);
                    oib0 oib0Var2 = r271Var.a;
                    lib0 a = lib0.a((lib0) oib0Var2.a0(), null, null, false, true, false, oib0Var2.b0(), 7);
                    r0 r0Var = (r0) oib0Var2.c0();
                    r0Var.getClass();
                    r0Var.m(null, a);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r271Var = dVar.a;
                    b.b(obj);
                    oib0 oib0Var3 = r271Var.a;
                    lib0 a2 = lib0.a((lib0) oib0Var3.a0(), null, null, false, false, true, 0, 39);
                    r0 r0Var2 = (r0) oib0Var3.c0();
                    r0Var2.getClass();
                    r0Var2.m(null, a2);
                    oib0 oib0Var4 = r271Var.a;
                    oib0Var4.g0(1500L, new mib0(oib0Var4, i3));
                }
                return zy11.a;
            }
        }
        dVar = new d(r271Var, continuation);
        Object obj2 = dVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.d;
        int i32 = 1;
        if (i != 0) {
        }
        return zy11.a;
    }
}
