package com.google.android.libraries.places.internal;

import android.widget.LinearLayout;
import coil3.request.OneShotDisposable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzb;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.DirectExecutor;

/* loaded from: classes4.dex */
public abstract class zzib {
    public static final zzez zza = new zzez(2);
    public static final zzez zza$1 = new zzez(8);

    public static com.google.android.gms.tasks.zzw zza(AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture) {
        OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource((zzb) oneShotDisposable.job);
        asyncTransformFuture.addListener(new com.google.mlkit.common.sdkinternal.zzb(asyncTransformFuture, new com.google.android.gms.maps.zzah(23, taskCompletionSource, asyncTransformFuture, oneShotDisposable), false, 15), DirectExecutor.INSTANCE);
        return taskCompletionSource.zza;
    }

    public static /* synthetic */ String zzb(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public abstract void zza(int i, int i2, byte[] bArr);

    public static zzcan zza() {
        if (zzcdy.zzd == null) {
            return new zzcdy();
        }
        return new zzbuz();
    }

    public static final void zzb(LinearLayout linearLayout) {
        linearLayout.setAccessibilityDelegate(new zzpi());
    }
}
