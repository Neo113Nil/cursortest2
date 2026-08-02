package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzc {
    public final Bitmap zza;

    public zzc(Bitmap bitmap) {
        if (bitmap != null) {
            this.zza = bitmap;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null bitmap");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzc) {
            return this.zza.equals(((zzc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(obj.length() + 27), "FetchPhotoResponse{bitmap=", obj, "}");
    }
}
