package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class gh2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(gh2.class, "notCompletedCount$volatile");
    public final mu7[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public gh2(mu7[] mu7VarArr) {
        this.a = mu7VarArr;
        this.notCompletedCount$volatile = mu7VarArr.length;
    }

    public final Object a(Continuation continuation) {
        zt3 zt3Var = new zt3(1, qxe.b(continuation));
        zt3Var.s();
        mu7[] mu7VarArr = this.a;
        int length = mu7VarArr.length;
        eh2[] eh2VarArr = new eh2[length];
        for (int i = 0; i < length; i++) {
            mu7 mu7Var = mu7VarArr[i];
            mu7Var.start();
            eh2 eh2Var = new eh2(this, zt3Var);
            eh2Var.f = saf.W(mu7Var, true, eh2Var);
            eh2VarArr[i] = eh2Var;
        }
        fh2 fh2Var = new fh2(eh2VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            eh2 eh2Var2 = eh2VarArr[i2];
            eh2Var2.getClass();
            eh2.h.set(eh2Var2, fh2Var);
        }
        if (zt3Var.y()) {
            fh2Var.a();
        } else {
            zt3Var.v(fh2Var);
        }
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }
}
