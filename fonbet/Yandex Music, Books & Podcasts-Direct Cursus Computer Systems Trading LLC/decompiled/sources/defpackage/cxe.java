package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes3.dex */
public final class cxe extends AbstractOwnableSynchronizer implements Runnable {
    public final zat a;

    public cxe(zat zatVar) {
        this.a = zatVar;
    }

    public static void a(cxe cxeVar, Thread thread) {
        cxeVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
