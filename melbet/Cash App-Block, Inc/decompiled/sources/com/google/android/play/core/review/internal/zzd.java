package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public final class zzd implements zzf, IInterface {
    public final IBinder zza;

    public zzd(IBinder iBinder) {
        this.zza = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }
}
