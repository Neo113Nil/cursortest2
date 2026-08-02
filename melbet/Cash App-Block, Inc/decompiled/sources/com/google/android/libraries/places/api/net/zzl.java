package com.google.android.libraries.places.api.net;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzl {
    public final List zza;

    public zzl(ImmutableList immutableList) {
        if (immutableList != null) {
            this.zza = immutableList;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null autocompletePredictions");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzl) {
            return this.zza.equals(((zzl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(obj.length() + 61), "FindAutocompletePredictionsResponse{autocompletePredictions=", obj, "}");
    }
}
