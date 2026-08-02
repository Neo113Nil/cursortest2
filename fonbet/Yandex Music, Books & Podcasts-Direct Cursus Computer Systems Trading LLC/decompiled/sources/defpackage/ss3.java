package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class ss3 extends tc4 {
    public final aur f;

    /* JADX WARN: Multi-variable type inference failed */
    public ss3(Function2 function2, CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        super(function2, coroutineContext, i, oi3Var);
        this.f = (aur) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.tc4, defpackage.sc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ltm ltmVar, Continuation continuation) {
        rs3 rs3Var;
        int i;
        Object obj;
        if (continuation instanceof rs3) {
            rs3Var = (rs3) continuation;
            int i2 = rs3Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rs3Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = rs3Var.k;
                Object obj3 = nm6.a;
                i = rs3Var.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    rs3Var.j = ltmVar;
                    rs3Var.m = 1;
                    Object e = super.e(ltmVar, rs3Var);
                    obj = ltmVar;
                    if (e == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ltm ltmVar2 = rs3Var.j;
                    qgg.h0(obj2);
                    obj = ltmVar2;
                }
                if (!((oc4) obj).d.B()) {
                    return Unit.a;
                }
                xq0.q("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                return null;
            }
        }
        rs3Var = new rs3(this, (cg6) continuation);
        Object obj22 = rs3Var.k;
        Object obj32 = nm6.a;
        i = rs3Var.m;
        if (i != 0) {
        }
        if (!((oc4) obj).d.B()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.tc4, defpackage.sc4
    public final sc4 f(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        return new ss3(this.f, coroutineContext, i, oi3Var);
    }
}
