package com.google.android.play.core.review;

import android.app.PendingIntent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zza extends ReviewInfo {
    public final PendingIntent zza;
    public final boolean zzb;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null pendingIntent");
            throw null;
        }
        this.zza = pendingIntent;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            zza zzaVar = (zza) ((ReviewInfo) obj);
            if (this.zza.equals(zzaVar.zza) && this.zzb == zzaVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.zzb ? 1237 : 1231) ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("ReviewInfo{pendingIntent=", this.zza.toString(), ", isNoOp="), this.zzb, "}");
    }
}
