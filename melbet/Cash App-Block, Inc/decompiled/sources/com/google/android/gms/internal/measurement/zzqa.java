package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.util.StuckPlayerDetector;
import com.google.common.base.Functions$ConstantFunction;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzqa implements AsyncFunction {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;
    public final Object zzb;

    public /* synthetic */ zzqa(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                zzqe zzqeVar = (zzqe) this.zza;
                return ((zzmn) zzqeVar.zzd.get()).zze(new zzqd(zzqeVar, (zzqm) this.zzb));
            case 1:
                List list = (List) this.zza;
                zzus zzusVar = (zzus) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it);
                }
                zztk zztkVar = new zztk(this, arrayList, size);
                int i = zzxa.$r8$clinit;
                int i2 = 4;
                zzqa zzqaVar = new zzqa(i2, zzvy.zzb(), zztkVar);
                DirectExecutor directExecutor = DirectExecutor.INSTANCE;
                return Futures.transformAsync(Futures.transform(Futures.transformAsync(Futures.nonCancellationPropagating(zzusVar.zza.zze.zza()), new zzqa(i2, zzvy.zzb(), new zzqa(3, zzusVar, zzqaVar)), directExecutor), new Functions$ConstantFunction(), directExecutor), new zzqa(i2, zzvy.zzb(), new zztk(this, size, arrayList)), directExecutor);
            case 2:
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) this.zza;
                AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture = (AbstractTransformFuture.AsyncTransformFuture) this.zzb;
                stuckPlayerDetector.zzn((Uri) Futures.getDone((ListenableFuture) stuckPlayerDetector.playerListener), obj);
                synchronized (stuckPlayerDetector.stuckPlayingDetector) {
                    stuckPlayerDetector.stuckSuppressedDetector = asyncTransformFuture;
                }
                return Futures.immediateFuture(obj);
            case 3:
                return ((zzus) this.zza).zza.zzc.zzb((zzqa) this.zzb, DirectExecutor.INSTANCE);
            default:
                zzws zzc = zzvy.zzc(zzvy.zzd(), (zzws) this.zza);
                try {
                    ListenableFuture apply = ((AsyncFunction) this.zzb).apply(obj);
                    if (apply != null) {
                        return apply;
                    }
                    throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                } finally {
                }
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 4:
                AsyncFunction asyncFunction = (AsyncFunction) this.zzb;
                StringBuilder sb = new StringBuilder(asyncFunction.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(asyncFunction);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
