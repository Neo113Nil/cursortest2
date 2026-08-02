package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.HashMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzva {
    public int zza;
    public final int zzb;
    public zzva zzc;
    public final HashMap zzd = new HashMap(0);

    public zzva(int i, int i2) {
        if (i > i2) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            throw null;
        }
        this.zza = i;
        this.zzb = i2;
        this.zzc = null;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return Boxes$$ExternalSyntheticOutline1.m(identityHashCode, "Node", new StringBuilder(String.valueOf(identityHashCode).length() + 4));
    }
}
