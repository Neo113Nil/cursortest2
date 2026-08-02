package com.google.android.libraries.places.internal;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class zzbtr implements Comparator {
    public final /* synthetic */ zzbts zza;

    public zzbtr(zzbts zzbtsVar) {
        this.zza = zzbtsVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzbts zzbtsVar = this.zza;
        zzbtsVar.zza(obj);
        zzbtsVar.zza(obj2);
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
