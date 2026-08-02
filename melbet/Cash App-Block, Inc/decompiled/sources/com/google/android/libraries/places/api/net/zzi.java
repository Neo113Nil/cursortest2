package com.google.android.libraries.places.api.net;

import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes4.dex */
public final class zzi {
    public final Uri zza;

    public zzi(Uri uri) {
        this.zza = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        Uri uri = ((zzi) obj).zza;
        Uri uri2 = this.zza;
        return uri2 == null ? uri == null : uri2.equals(uri);
    }

    public final int hashCode() {
        Uri uri = this.zza;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf.length() + 35), "FetchResolvedPhotoUriResponse{uri=", valueOf, "}");
    }
}
