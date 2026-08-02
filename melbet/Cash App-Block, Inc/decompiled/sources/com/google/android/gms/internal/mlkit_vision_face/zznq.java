package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zznq {
    public final String zza;

    public zznq(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zznq) && this.zza.equals(((zznq) obj).zza);
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MLKitLoggingOptions{libraryName=", this.zza, ", enableFirelog=true, firelogEventType=1}");
    }
}
