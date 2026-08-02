package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;

/* loaded from: classes4.dex */
public abstract class zzbtm extends zzboz {
    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(zze(), "delegate");
        return stringHelper.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzd() {
        zze().zzd();
    }

    public abstract zzboz zze();
}
