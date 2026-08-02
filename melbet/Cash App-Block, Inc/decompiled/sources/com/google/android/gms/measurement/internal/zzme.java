package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzme extends zzbm implements zzge {
    public final /* synthetic */ AtomicReference zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzme(zznl zznlVar, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.zza = atomicReference;
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        zzbn.zzf(parcel);
        zze(createTypedArrayList);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzge
    public final void zze(List list) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
