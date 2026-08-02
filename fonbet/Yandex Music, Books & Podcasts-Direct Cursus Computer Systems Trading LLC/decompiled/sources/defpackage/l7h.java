package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class l7h {
    public static final eu1 a = new eu1(null);

    public static final void a() {
        Object obj;
        ci0 ci0Var;
        while (true) {
            eu1 eu1Var = a;
            obj = eu1Var.get();
            if (obj != null) {
                break;
            }
            try {
                ci0Var = new ci0(Looper.getMainLooper().getThread().getId());
            } catch (Throwable th) {
                sj2.z("Unable to determine Main thread id: " + th.getMessage());
                ci0Var = null;
            }
            if (ci0Var == null) {
                sj2.z("Main thread id is undefined, main thread assert is disabled");
            }
            m7h m7hVar = new m7h(ci0Var);
            if (eu1Var.compareAndSet(null, m7hVar)) {
                obj = m7hVar;
                break;
            }
        }
        ci0 ci0Var2 = ((m7h) obj).a;
        if (ci0Var2 == null || ci0Var2.a == Thread.currentThread().getId()) {
            return;
        }
        String thread = Thread.currentThread().toString();
        thread.getClass();
        xq0.o("Not on Main thread, current thread is: ".concat(thread));
    }
}
