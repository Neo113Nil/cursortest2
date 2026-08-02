package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes.dex */
public final class z8x extends AbstractOwnableSynchronizer implements Runnable {
    public final zat a;

    public /* synthetic */ z8x(zat zatVar) {
        this.a = zatVar;
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
