package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzwd {
    public final String zza;
    public final int zzc;

    public zzwd(String str, int i) {
        this.zza = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzwd)) {
            return false;
        }
        zzwd zzwdVar = (zzwd) obj;
        return this.zza.equals(zzwdVar.zza) && this.zzc == zzwdVar.zzc;
    }

    public final int hashCode() {
        return this.zzc ^ ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.zza);
        sb.append(", enableFirelog=true, firelogEventType=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.zzc, "}", sb);
    }
}
