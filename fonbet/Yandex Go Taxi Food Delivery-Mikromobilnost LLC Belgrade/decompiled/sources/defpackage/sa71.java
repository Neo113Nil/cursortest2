package defpackage;

import android.content.Context;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.dl2;
import yads.el2;
import yads.fl2;

/* loaded from: classes7.dex */
public final class sa71 {
    public final Context a;
    public final pv81 b;
    public final i671 c;

    public sa71(Context context, pv81 pv81Var, i671 i671Var) {
        this.a = context;
        this.b = pv81Var;
        this.c = i671Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        dl2 dl2Var;
        int i;
        if (continuationImpl instanceof dl2) {
            dl2Var = (dl2) continuationImpl;
            int i2 = dl2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dl2Var.d = i2 - Integer.MIN_VALUE;
                Object obj = dl2Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dl2Var.d;
                if (i != 0) {
                    b.b(obj);
                    dl2Var.d = 1;
                    j18 j18Var = new j18(1, dvw.b(dl2Var));
                    j18Var.u();
                    a441 a441Var = new a441(17, new el2(j18Var), new fl2(j18Var));
                    Context context = this.a;
                    i671 i671Var = this.c;
                    StringBuilder sb = new StringBuilder();
                    String str = i671Var.a.d;
                    if (str == null) {
                        str = "https://yandex.com/ads";
                    }
                    sb.append(str);
                    Character y0 = gvu0.y0(sb);
                    if (y0 == null || y0.charValue() != '/') {
                        sb.append('/');
                    }
                    sb.append("v1/debugpanel");
                    i671Var.a.getClass();
                    he71 he71Var = new he71(context, sb.toString(), this.b, this.c.a.b, a441Var);
                    ys81 c = mka1.c();
                    Context context2 = this.a;
                    synchronized (c) {
                        hba1.b(context2).b(he71Var);
                    }
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
        dl2Var = new dl2(this, continuationImpl);
        Object obj2 = dl2Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dl2Var.d;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
