package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zas implements PendingResult$StatusListener {
    public final /* synthetic */ BasePendingResult zaa;
    public final /* synthetic */ TaskCompletionSource zab;

    public zas(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, com.google.mlkit.vision.text.zzd zzdVar) {
        this.zaa = basePendingResult;
        this.zab = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.PendingResult$StatusListener
    public final void onComplete(Status status) {
        Result result;
        if (!status.isSuccess()) {
            this.zab.setException(zzae.fromStatus(status));
            return;
        }
        BasePendingResult basePendingResult = this.zaa;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zzae.checkState("Result has already been consumed.", !basePendingResult.zal);
        try {
            if (!basePendingResult.zaf.await(0L, timeUnit)) {
                basePendingResult.forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            basePendingResult.forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        zzae.checkState("Result is not ready.", basePendingResult.isReady());
        synchronized (basePendingResult.zae) {
            zzae.checkState("Result has already been consumed.", !basePendingResult.zal);
            zzae.checkState("Result is not ready.", basePendingResult.isReady());
            result = basePendingResult.zaj;
            basePendingResult.zaj = null;
            basePendingResult.zal = true;
        }
        zact zactVar = (zact) basePendingResult.zai.getAndSet(null);
        if (zactVar != null) {
            ((Set) zactVar.zaa.f62zaa).remove(basePendingResult);
        }
        zzae.checkNotNull(result);
        this.zab.setResult(null);
    }
}
