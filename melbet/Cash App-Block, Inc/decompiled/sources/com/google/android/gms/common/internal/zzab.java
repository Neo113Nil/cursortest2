package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes4.dex */
public final class zzab extends zaa implements zzad {
    public final boolean zzg() {
        Parcel zzB = zzB(zza(), 7);
        int i = zzc.$r8$clinit;
        boolean z = zzB.readInt() != 0;
        zzB.recycle();
        return z;
    }
}
