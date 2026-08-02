package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.splitcompat.zzc;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class ExecutorDelivery$1 implements Executor {
    public static volatile ExecutorDelivery$1 sExecutor;
    public final /* synthetic */ int $r8$classId;
    public final Object val$handler;

    public ExecutorDelivery$1(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 3:
                this.val$handler = Executors.newSingleThreadExecutor(new zzc(1));
                break;
            default:
                this.val$handler = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$r8$classId;
        Object obj = this.val$handler;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            case 1:
                ((Handler) obj).post(runnable);
                break;
            case 2:
                ((Handler) obj).post(runnable);
                break;
            default:
                ((ExecutorService) obj).execute(runnable);
                break;
        }
    }

    public /* synthetic */ ExecutorDelivery$1(int i, Handler handler) {
        this.$r8$classId = i;
        this.val$handler = handler;
    }
}
