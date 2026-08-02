package com.google.android.gms.dynamite;

import android.os.Process;

/* loaded from: classes4.dex */
public final class zza extends Thread {
    public final /* synthetic */ int $r8$classId = 1;

    public /* synthetic */ zza(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.$r8$classId) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            case 1:
                Process.setThreadPriority(9);
                super.run();
                return;
            default:
                super.run();
                return;
        }
    }

    public /* synthetic */ zza(Runnable runnable, String str) {
        super(runnable, str);
    }

    public /* synthetic */ zza(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
