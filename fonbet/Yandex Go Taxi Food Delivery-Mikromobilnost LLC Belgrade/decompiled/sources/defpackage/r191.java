package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.tf;
import yads.uf;
import yads.wf;
import yads.yf;

/* loaded from: classes7.dex */
public final class r191 {
    public final gg71 a;
    public final np71 b;

    public r191(Context context) {
        this.a = new gg71(context);
        py71 py71Var = a281.b;
        this.b = (py71Var == null ? a281.a : py71Var).c(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        wf wfVar;
        int i;
        if (continuationImpl instanceof wf) {
            wfVar = (wf) continuationImpl;
            int i2 = wfVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wfVar.d = i2 - Integer.MIN_VALUE;
                Object obj = wfVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wfVar.d;
                if (i != 0) {
                    b.b(obj);
                    wfVar.d = 1;
                    j18 j18Var = new j18(1, dvw.b(wfVar));
                    j18Var.u();
                    bp5 bp5Var = new bp5(j18Var);
                    this.b.C(sp61.a, new aj31(20, bp5Var));
                    obj = j18Var.s();
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        wfVar = new wf(this, continuationImpl);
        Object obj2 = wfVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wfVar.d;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        yf yfVar;
        int i;
        try {
            if (continuationImpl instanceof yf) {
                yfVar = (yf) continuationImpl;
                int i2 = yfVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yfVar.d = i2 - Integer.MIN_VALUE;
                    Object obj = yfVar.b;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = yfVar.d;
                    if (i != 0) {
                        b.b(obj);
                        yfVar.d = 1;
                        Object a = a(yfVar);
                        return a == obj2 ? obj2 : a;
                    }
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (uf e2) {
            return new Result.Failure(e2);
        } catch (Throwable unused) {
            return new Result.Failure(new uf(tf.b));
        }
        yfVar = new yf(this, continuationImpl);
        Object obj3 = yfVar.b;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yfVar.d;
    }
}
