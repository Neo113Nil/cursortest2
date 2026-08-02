package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.media3.common.util.StuckPlayerDetector;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzua implements AsyncFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StuckPlayerDetector zza;

    public /* synthetic */ zzua(StuckPlayerDetector stuckPlayerDetector, int i) {
        this.$r8$classId = i;
        this.zza = stuckPlayerDetector;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        ListenableFuture listenableFuture;
        int i = this.$r8$classId;
        StuckPlayerDetector stuckPlayerDetector = this.zza;
        switch (i) {
            case 0:
                synchronized (stuckPlayerDetector.stuckPlayingDetector) {
                    listenableFuture = (ListenableFuture) stuckPlayerDetector.stuckSuppressedDetector;
                }
                return listenableFuture;
            case 1:
                return Futures.immediateFuture(stuckPlayerDetector.zzm((Uri) Futures.getDone((ListenableFuture) stuckPlayerDetector.playerListener)));
            case 2:
                stuckPlayerDetector.zzn((Uri) Futures.getDone((ListenableFuture) stuckPlayerDetector.playerListener), obj);
                return ImmediateFuture.NULL;
            default:
                Uri uri = (Uri) obj;
                Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    zzru zzruVar = (zzru) stuckPlayerDetector.period;
                    zzzm zze = zzruVar.zze(build);
                    if (((zzsx) zze.zzc).zze((Uri) zze.zzf)) {
                        zzzm zze2 = zzruVar.zze(build);
                        zzzm zze3 = zzruVar.zze(uri);
                        zzsx zzsxVar = (zzsx) zze2.zzc;
                        if (zzsxVar != ((zzsx) zze3.zzc)) {
                            throw new zzsk("Cannot rename file across backends");
                        }
                        zzsxVar.zzl((Uri) zze2.zzf, (Uri) zze3.zzf);
                    }
                    return ImmediateFuture.NULL;
                } catch (IOException e) {
                    return new ImmediateFuture.ImmediateFailedFuture(e);
                }
        }
    }
}
