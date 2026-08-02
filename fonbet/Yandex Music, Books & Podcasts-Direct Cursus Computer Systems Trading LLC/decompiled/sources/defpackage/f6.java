package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public abstract class f6 implements pjc, cu3 {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        e6 e6Var;
        int i;
        Throwable th;
        xmo xmoVar;
        if (continuation instanceof e6) {
            e6Var = (e6) continuation;
            int i2 = e6Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e6Var.m = i2 - Integer.MIN_VALUE;
                Object obj = e6Var.k;
                Object obj2 = nm6.a;
                i = e6Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    xmo xmoVar2 = new xmo(rjcVar, e6Var.getContext());
                    try {
                        e6Var.j = xmoVar2;
                        e6Var.m = 1;
                        if (d(xmoVar2, e6Var) == obj2) {
                            return obj2;
                        }
                        xmoVar = xmoVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        xmoVar = xmoVar2;
                        xmoVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xmoVar = e6Var.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        xmoVar.releaseIntercepted();
                        throw th;
                    }
                }
                xmoVar.releaseIntercepted();
                return Unit.a;
            }
        }
        e6Var = new e6(this, continuation);
        Object obj3 = e6Var.k;
        Object obj22 = nm6.a;
        i = e6Var.m;
        if (i != 0) {
        }
        xmoVar.releaseIntercepted();
        return Unit.a;
    }

    public abstract Object d(xmo xmoVar, Continuation continuation);
}
