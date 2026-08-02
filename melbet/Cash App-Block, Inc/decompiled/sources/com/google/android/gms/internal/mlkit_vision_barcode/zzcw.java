package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.room.TransactorKt;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzcw implements Iterator {
    public static final zzcw zza;
    public static final /* synthetic */ zzcw[] zzb;

    static {
        zzcw zzcwVar = new zzcw("INSTANCE", 0);
        zza = zzcwVar;
        zzb = new zzcw[]{zzcwVar};
    }

    public static zzcw[] values() {
        return (zzcw[]) zzb.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        TransactorKt.zzf("no calls to next() since the last call to remove()", false);
    }
}
