package com.google.android.gms.internal.measurement;

import androidx.emoji2.text.MetadataRepo;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.tracing.Trace;
import com.fillr.e0;
import com.google.common.base.Functions$ConstantFunction;
import com.google.common.base.Ticker;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.google.zxing.BinaryBitmap;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zztp {
    public final String zza;
    public final AbstractTransformFuture.AsyncTransformFuture zzb;
    public final StuckPlayerDetector zzc;
    public final BinaryBitmap zzd;
    public final e0 zze;
    public final e0 zzf = new e0(new zzz(this));
    public final Object zzg;
    public final zztw zzh;
    public List zzi;

    public zztp(StuckPlayerDetector stuckPlayerDetector, AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture) {
        Object obj = new Object();
        this.zzg = obj;
        this.zzi = new ArrayList();
        this.zzc = stuckPlayerDetector;
        this.zzb = asyncTransformFuture;
        this.zza = (String) stuckPlayerDetector.player;
        this.zze = new e0(new zzub(stuckPlayerDetector, 1));
        this.zzd = new BinaryBitmap(4);
        this.zzh = new zztw(12);
        zzos zzosVar = new zzos(this, 3);
        synchronized (obj) {
            this.zzi.add(zzosVar);
        }
    }

    public final AbstractTransformFuture.TransformFuture zzb(zzow zzowVar, MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator) {
        zzos zzosVar = new zzos(zzowVar, 2);
        int i = zzxa.$r8$clinit;
        zzqa zzqaVar = new zzqa(4, zzvy.zzb(), zzosVar);
        Ticker ticker = zzxh.zza;
        Trace.checkNotNull(ticker, "ticker");
        ticker.read();
        String concat = "Update ".concat(String.valueOf(this.zza));
        this.zzh.getClass();
        zzwi zza = zztw.zza(concat);
        try {
            AbstractFuture zza2 = this.zzf.zza();
            BinaryBitmap binaryBitmap = this.zzd;
            zzj zzjVar = new zzj(zza2, 10);
            DirectExecutor directExecutor = DirectExecutor.INSTANCE;
            binaryBitmap.submitAsync(zzjVar, directExecutor);
            ListenableFuture submitAsync = binaryBitmap.submitAsync(zzxa.zzb(new MetadataRepo(this, zza2, zzqaVar, moreExecutors$ScheduledListeningDecorator)), directExecutor);
            Futures.propagateCancellation(submitAsync, zza2);
            Futures.nonCancellationPropagating(this.zzb);
            AbstractTransformFuture.TransformFuture transform = Futures.transform(submitAsync, new Functions$ConstantFunction(), directExecutor);
            zza.zza(transform);
            zza.close();
            return transform;
        } catch (Throwable th) {
            try {
                zza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
