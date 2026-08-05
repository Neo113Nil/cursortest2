package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class HzhOLUMW implements Executor {
    public final ArrayDeque MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final Executor P7K7Inc8;
    public final Object VgvYg0wo;
    public Runnable wxUZMvaN;

    public HzhOLUMW(Executor executor) {
        this.NCTxEWno = 1;
        this.P7K7Inc8 = executor;
        this.MdtA4re8 = new ArrayDeque();
        this.VgvYg0wo = new Object();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.NCTxEWno) {
            case 0:
                synchronized (this.VgvYg0wo) {
                    try {
                        this.MdtA4re8.add(new a1GxQO7H(this, 0, runnable));
                        if (this.wxUZMvaN == null) {
                            qoPGr6Ce();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.VgvYg0wo) {
                    this.MdtA4re8.offer(new a1GxQO7H(runnable, this));
                    if (this.wxUZMvaN == null) {
                        qoPGr6Ce();
                    }
                }
                return;
        }
    }

    public final void qoPGr6Ce() {
        switch (this.NCTxEWno) {
            case 0:
                synchronized (this.VgvYg0wo) {
                    try {
                        Runnable runnable = (Runnable) this.MdtA4re8.poll();
                        this.wxUZMvaN = runnable;
                        if (runnable != null) {
                            ((IxsfNS3D) this.P7K7Inc8).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.VgvYg0wo) {
                    Object poll = this.MdtA4re8.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.wxUZMvaN = runnable2;
                    if (poll != null) {
                        this.P7K7Inc8.execute(runnable2);
                    }
                }
                return;
        }
    }

    public HzhOLUMW(IxsfNS3D ixsfNS3D) {
        this.NCTxEWno = 0;
        this.VgvYg0wo = new Object();
        this.MdtA4re8 = new ArrayDeque();
        this.P7K7Inc8 = ixsfNS3D;
    }
}
