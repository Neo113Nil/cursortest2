package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzt implements Executor {
    public static final /* synthetic */ zzt zza = new zzt(2);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzt(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$r8$classId) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
