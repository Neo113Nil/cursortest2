package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzlk {
    public static final Object zzb = new Object();
    public static final AtomicReference zzc = new AtomicReference();
    public static volatile zzlk zzd = null;
    public static final Supplier zzf = Strings.memoize(zzlp.zza);
    public final GrpcMethod zzg = new GrpcMethod(21, false);
    public final Context zzh;
    public final Supplier zzi;
    public final Supplier zzj;
    public final Supplier zzk;
    public final Supplier zzl;
    public final zzrf zzm;
    public final Supplier zzn;
    public final zzqe zzo;

    public zzlk(Context context, Supplier supplier, Supplier supplier2, Supplier supplier3, Supplier supplier4, Supplier supplier5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        supplier.getClass();
        supplier2.getClass();
        supplier3.getClass();
        supplier4.getClass();
        supplier5.getClass();
        Supplier memoize = Strings.memoize(supplier);
        Supplier memoize2 = Strings.memoize(supplier2);
        Supplier memoize3 = Strings.memoize(new zzlq(supplier3, 0));
        Supplier memoize4 = Strings.memoize(supplier4);
        Supplier memoize5 = Strings.memoize(supplier5);
        this.zzh = applicationContext;
        this.zzi = memoize;
        this.zzj = memoize2;
        this.zzk = memoize3;
        this.zzl = memoize4;
        this.zzm = new zzrf(applicationContext, memoize, memoize4, memoize2);
        this.zzn = memoize5;
        this.zzo = new zzqe(applicationContext, memoize, memoize3, memoize2);
    }

    public static void zzl() {
        synchronized (zzky.zza) {
        }
        if (zzc.get() == null && zzky.zzc == null) {
            zzky.zzc = new zzlr();
        }
    }

    public final MoreExecutors$ScheduledListeningDecorator zzg() {
        return (MoreExecutors$ScheduledListeningDecorator) this.zzi.get();
    }
}
