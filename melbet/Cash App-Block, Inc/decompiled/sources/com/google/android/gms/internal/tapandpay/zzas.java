package com.google.android.gms.internal.tapandpay;

import com.withpersona.sdk2.camera.ContextUtilsKt;

/* loaded from: classes4.dex */
public final class zzas extends zzat {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzat zzc;

    public zzas(zzat zzatVar, int i, int i2) {
        this.zzc = zzatVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ContextUtilsKt.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzat, java.util.List
    /* renamed from: zzf */
    public final zzat subList(int i, int i2) {
        ContextUtilsKt.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
