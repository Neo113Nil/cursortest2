package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;

/* loaded from: classes4.dex */
public abstract class zzbtl extends zzbpa {
    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(zzf(), "delegate");
        return stringHelper.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public void zzc(int i) {
        zzf().zzc(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public void zzd() {
        zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public void zze(String str, Throwable th) {
        zzf().zze(str, th);
    }

    public abstract zzbpa zzf();
}
