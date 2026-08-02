package com.bumptech.glide.util;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class Executors$1 implements Executor {
    public static volatile Executors$1 sDirectExecutor;
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$r8$classId) {
            case 0:
                Util.getUiThreadHandler().post(runnable);
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
