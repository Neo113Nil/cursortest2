package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzbzm {
    public final ArrayList zza = new ArrayList();

    public final String toString() {
        return this.zza.toString();
    }

    public final void zzb(Object obj, String str) {
        String valueOf = String.valueOf(obj);
        this.zza.add(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 1 + valueOf.length()), str, "=", valueOf));
    }
}
