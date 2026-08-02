package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.zzae;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzi implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Runnable zza;

    public /* synthetic */ zzi(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Runnable runnable = this.zza;
        switch (i) {
            case 0:
                Deque deque = (Deque) MlKitThreadPool.zza.get();
                zzae.checkNotNull(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                MlKitThreadPool.zza.set(new ArrayDeque());
                runnable.run();
                break;
        }
    }
}
