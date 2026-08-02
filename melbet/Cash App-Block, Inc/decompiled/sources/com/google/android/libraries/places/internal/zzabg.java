package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes4.dex */
public final class zzabg {
    public static final zzabg zza = new zzabg("about:invalid#zGuavaz");
    public final String zzb;

    public zzabg(String str) {
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzabg) {
            return this.zzb.equals(((zzabg) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ 18288376;
    }

    public final String toString() {
        String str = this.zzb;
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 9), "SafeUrl{", str, "}");
    }
}
