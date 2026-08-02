package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.media3.common.util.StuckPlayerDetector;
import com.google.common.base.Present;
import com.google.common.util.concurrent.AbstractCatchingFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SequentialExecutor;
import java.io.IOException;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzub implements AsyncCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StuckPlayerDetector zza;

    public /* synthetic */ zzub(StuckPlayerDetector stuckPlayerDetector, int i) {
        this.$r8$classId = i;
        this.zza = stuckPlayerDetector;
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public final ListenableFuture call() {
        ListenableFuture createAsync;
        int i = this.$r8$classId;
        StuckPlayerDetector stuckPlayerDetector = this.zza;
        int i2 = 4;
        switch (i) {
            case 0:
                SequentialExecutor sequentialExecutor = (SequentialExecutor) stuckPlayerDetector.clock;
                try {
                    return Futures.immediateFuture(stuckPlayerDetector.zzm((Uri) Futures.getDone((ListenableFuture) stuckPlayerDetector.playerListener)));
                } catch (IOException e) {
                    Present present = (Present) stuckPlayerDetector.handler;
                    present.getClass();
                    if ((e instanceof zzsg) || (e.getCause() instanceof zzsg)) {
                        return new ImmediateFuture.ImmediateFailedFuture(e);
                    }
                    zzvb zzvbVar = (zzvb) present.reference;
                    zzvbVar.getClass();
                    if (e.getCause() instanceof zzaeh) {
                        ImmediateFuture immediateFuture = Futures.immediateFuture(zzvbVar.zza);
                        zzua zzuaVar = new zzua(stuckPlayerDetector, 2);
                        int i3 = zzxa.$r8$clinit;
                        createAsync = AbstractCatchingFuture.createAsync(Futures.transformAsync(immediateFuture, new zzqa(i2, zzvy.zzb(), zzuaVar), sequentialExecutor), IOException.class, new zzos(e, i2), DirectExecutor.INSTANCE);
                    } else {
                        createAsync = new ImmediateFuture.ImmediateFailedFuture(e);
                    }
                    zzua zzuaVar2 = new zzua(stuckPlayerDetector, 1);
                    int i4 = zzxa.$r8$clinit;
                    return Futures.transformAsync(createAsync, new zzqa(i2, zzvy.zzb(), zzuaVar2), sequentialExecutor);
                }
            default:
                zzua zzuaVar3 = new zzua(stuckPlayerDetector, 3);
                int i5 = zzxa.$r8$clinit;
                return Futures.nonCancellationPropagating(Futures.transformAsync((ListenableFuture) stuckPlayerDetector.playerListener, new zzqa(i2, zzvy.zzb(), zzuaVar3), (SequentialExecutor) stuckPlayerDetector.clock));
        }
    }
}
