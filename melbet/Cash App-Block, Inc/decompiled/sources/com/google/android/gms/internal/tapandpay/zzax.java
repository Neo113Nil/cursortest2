package com.google.android.gms.internal.tapandpay;

import com.withpersona.sdk2.camera.ContextUtilsKt;

/* loaded from: classes4.dex */
public final class zzax extends zzat {
    public static final zzax zza = new zzax(0, new Object[0]);
    public final transient Object[] zzb;
    public final transient int zzc;

    public zzax(int i, Object[] objArr) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ContextUtilsKt.zza(i, this.zzc);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzat, com.google.android.gms.internal.tapandpay.zzaq
    public final int zza(Object[] objArr) {
        Object[] objArr2 = this.zzb;
        int i = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final Object[] zze() {
        return this.zzb;
    }
}
