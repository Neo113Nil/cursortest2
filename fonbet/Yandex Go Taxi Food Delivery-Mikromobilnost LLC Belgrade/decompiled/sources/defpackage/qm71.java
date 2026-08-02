package defpackage;

import android.os.Looper;

/* loaded from: classes7.dex */
public final class qm71 {
    public final pp71 a;
    public final cc71 b;

    public qm71() {
        pp71 pp71Var = new pp71();
        cc71 cc71Var = new cc71();
        this.a = pp71Var;
        this.b = cc71Var;
    }

    public final void a(Runnable runnable) {
        this.b.getClass();
        if (jl40.l(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            runnable.run();
        } else {
            this.a.a.post(runnable);
        }
    }
}
