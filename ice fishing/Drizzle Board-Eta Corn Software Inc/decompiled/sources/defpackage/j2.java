package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class j2 extends jb9XjC4I {
    public final cg P7K7Inc8;
    public final Thread VgvYg0wo;

    public j2(l9 l9Var, Thread thread, cg cgVar) {
        super(l9Var, true);
        this.VgvYg0wo = thread;
        this.P7K7Inc8 = cgVar;
    }

    @Override // defpackage.vn
    public final void sjUBp5pO(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.VgvYg0wo;
        if (fn.qoPGr6Ce(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
