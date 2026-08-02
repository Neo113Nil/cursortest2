package com.google.android.gms.measurement.internal;

import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.work.impl.constraints.IndividualNetworkCallback;
import com.android.volley.Response;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$2;
import com.bumptech.glide.util.Util;
import com.google.android.libraries.places.internal.zzbyi;
import com.google.common.base.Stopwatch;
import com.google.mlkit.common.sdkinternal.zzb;
import com.squareup.cash.blockers.views.FileBlockerView;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzjy implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public boolean zza;
    public final /* synthetic */ Object zzb;

    public zzjy(zzlj zzljVar, boolean z) {
        this.$r8$classId = 0;
        this.zza = z;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r5 != r1) goto L37;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z = true;
        switch (this.$r8$classId) {
            case 0:
                zzlj zzljVar = (zzlj) this.zzb;
                zzic zzicVar = (zzic) zzljVar.$$delegate_0;
                boolean zzB = zzicVar.zzB();
                boolean z2 = zzicVar.zzB != null && zzicVar.zzB.booleanValue();
                boolean z3 = this.zza;
                zzicVar.zzB = Boolean.valueOf(z3);
                if (z2 == z3) {
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zzb(Boolean.valueOf(z3), "Default data collection state already set to");
                }
                if (zzicVar.zzB() != zzB) {
                    boolean zzB2 = zzicVar.zzB();
                    if (zzicVar.zzB == null || !zzicVar.zzB.booleanValue()) {
                        z = false;
                        break;
                    }
                }
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzi.zzc("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(zzB));
                zzljVar.zzar();
                break;
            case 1:
                this.zza = false;
                int i = AspectRatioFrameLayout.$r8$clinit;
                break;
            case 2:
                IndividualNetworkCallback individualNetworkCallback = (IndividualNetworkCallback) this.zzb;
                boolean z4 = this.zza;
                Util.assertMainThread();
                Response response = (Response) individualNetworkCallback.onConstraintState;
                boolean z5 = response.intermediate;
                response.intermediate = z4;
                if (z5 != z4) {
                    ((SingletonConnectivityReceiver$2) response.result).onConnectivityChanged(z4);
                    break;
                }
                break;
            case 3:
                zzb zzbVar = (zzb) this.zzb;
                if (this.zza) {
                    zzbyi zzbyiVar = (zzbyi) zzbVar.zzb;
                    zzbyiVar.zzg = true;
                    if (zzbyiVar.zzu > 0) {
                        Stopwatch stopwatch = zzbyiVar.zzx;
                        stopwatch.isRunning = false;
                        stopwatch.start();
                    }
                }
                ((zzbyi) zzbVar.zzb).zzA = false;
                break;
            default:
                ((FileBlockerView) this.zzb).loadingHelper.setLoading(this.zza);
                break;
        }
    }

    public /* synthetic */ zzjy(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.zzb = obj;
        this.zza = z;
    }

    public zzjy(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.$r8$classId = 1;
        this.zzb = aspectRatioFrameLayout;
    }
}
