package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcdi implements Comparable {
    public final zzbqd zza;
    public final double zzb;

    public zzcdi(zzbqd zzbqdVar, double d) {
        this.zza = zzbqdVar;
        this.zzb = d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(this.zzb, ((zzcdi) obj).zzb);
    }
}
