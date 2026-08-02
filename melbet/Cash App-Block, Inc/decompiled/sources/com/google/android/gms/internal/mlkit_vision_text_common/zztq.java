package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zztq {
    public final String zza;

    public zztq(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zztq) && this.zza.equals(((zztq) obj).zza);
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("MLKitLoggingOptions{libraryName="), this.zza, ", enableFirelog=true, firelogEventType=1}");
    }
}
