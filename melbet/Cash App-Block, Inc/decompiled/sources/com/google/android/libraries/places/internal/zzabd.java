package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes4.dex */
public final class zzabd {
    public final String zza;

    public zzabd(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzabd) {
            return this.zza.equals(((zzabd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 867184553;
    }

    public final String toString() {
        String str = this.zza;
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 10), "SafeHtml{", str, "}");
    }
}
