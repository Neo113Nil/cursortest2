package com.google.android.libraries.places.api.net;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.android.libraries.places.api.model.zzfi;

/* loaded from: classes4.dex */
public final class zzf {
    public final zzfi zza;

    public zzf(zzfi zzfiVar) {
        this.zza = zzfiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzf) {
            return this.zza.equals(((zzf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String zzfiVar = this.zza.toString();
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(zzfiVar.length() + 26), "FetchPlaceResponse{place=", zzfiVar, "}");
    }
}
