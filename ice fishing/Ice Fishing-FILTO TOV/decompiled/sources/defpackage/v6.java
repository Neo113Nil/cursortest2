package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v6 extends YmKjaVtbfp5Z {
    public final Thread JFJ3QoxA;
    public final qq rQPn8YBR;

    public v6(gh ghVar, Thread thread, qq qqVar) {
        super(ghVar, true);
        this.JFJ3QoxA = thread;
        this.rQPn8YBR = qqVar;
    }

    @Override // defpackage.m40
    public final void WdrkLMV3xh(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.JFJ3QoxA;
        if (o30.rQPn8YBR(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
