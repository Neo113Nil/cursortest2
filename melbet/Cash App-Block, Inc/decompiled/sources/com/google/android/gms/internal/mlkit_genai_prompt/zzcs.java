package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.VideoCapture;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzcs {
    public final zzad zza;
    public final VideoCapture.AnonymousClass3 zzb;

    public zzcs(zzad zzadVar, VideoCapture.AnonymousClass3 anonymousClass3) {
        if (zzadVar == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null service");
            throw null;
        }
        this.zza = zzadVar;
        if (anonymousClass3 != null) {
            this.zzb = anonymousClass3;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null disconnectSignal");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcs) {
            zzcs zzcsVar = (zzcs) obj;
            if (this.zza.equals(zzcsVar.zza) && this.zzb.equals(zzcsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ServiceContext{service=", this.zza.toString(), ", disconnectSignal=", this.zzb.toString(), "}");
    }
}
