package com.google.android.gms.measurement.internal;

import androidx.camera.core.CameraExecutor;
import com.bumptech.glide.load.engine.ActiveResources$1$1;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class zzjv implements Executor {
    public static volatile zzjv sExecutor;
    public final /* synthetic */ int $r8$classId;
    public final Object zza;

    public zzjv() {
        this.$r8$classId = 1;
        this.zza = Executors.newFixedThreadPool(2, new CameraExecutor.AnonymousClass1(1));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                zzhz zzhzVar = ((zzic) ((zzlj) obj).$$delegate_0).zzj;
                zzic.zzP(zzhzVar);
                zzhzVar.zzj(runnable);
                break;
            case 1:
                ((ExecutorService) obj).execute(runnable);
                break;
            default:
                ((Executor) obj).execute(new ActiveResources$1$1(2, runnable));
                break;
        }
    }

    public /* synthetic */ zzjv(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }
}
