package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.VideoCapture;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzfo {
    public final Object zza;
    public final VideoCapture.AnonymousClass3 zzb;

    public zzfo(Object obj, VideoCapture.AnonymousClass3 anonymousClass3) {
        if (obj == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null getService");
            throw null;
        }
        this.zza = obj;
        this.zzb = anonymousClass3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfo) {
            zzfo zzfoVar = (zzfo) obj;
            if (this.zza.equals(zzfoVar.zza) && this.zzb.equals(zzfoVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("InferenceServiceContext{getService=", this.zza.toString(), ", disconnectSignal=", this.zzb.toString(), "}");
    }
}
