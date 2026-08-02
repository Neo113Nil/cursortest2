package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import com.squareup.wire.GrpcMethod;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzos implements AsyncFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzos(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.zza;
        switch (i) {
            case 0:
                zzpg zzpgVar = (zzpg) obj2;
                int i2 = ((zzmk) obj).zza;
                if ((i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544) && !zzpgVar.zzk.zzb()) {
                    zzpgVar.zzr();
                }
                return ImmediateFuture.NULL;
            case 1:
                final GrpcMethod grpcMethod = (GrpcMethod) obj2;
                final zzqv zzqvVar = (zzqv) obj;
                grpcMethod.getClass();
                Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.zzqq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzqv zzqvVar2 = zzqvVar;
                        GrpcMethod grpcMethod2 = GrpcMethod.this;
                        zzlk zzlkVar = (zzlk) grpcMethod2.requestAdapter;
                        zzz zzzVar = new zzz(3);
                        try {
                            zzru zzruVar = (zzru) zzlkVar.zzl.get();
                            Uri uri = (Uri) grpcMethod2.responseAdapter;
                            zzz zzzVar2 = new zzz(zzqvVar2);
                            zzzVar2.zzb = new zzz[]{zzzVar};
                            return null;
                        } catch (IOException | RuntimeException e) {
                            zzlf.zzc(Level.WARNING, zzlkVar.zzg(), e, "Failed to update snapshot for %s flags may be stale.", (String) grpcMethod2.path);
                            return null;
                        }
                    }
                };
                MoreExecutors$ScheduledListeningDecorator zzg = ((zzlk) grpcMethod.requestAdapter).zzg();
                TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(callable);
                zzg.execute(trustedListenableFutureTask);
                return trustedListenableFutureTask;
            case 2:
                return Futures.immediateFuture(((zzow) obj2).apply(obj));
            case 3:
                return ((zztp) obj2).zze.zza();
            default:
                IOException iOException = (IOException) obj2;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
