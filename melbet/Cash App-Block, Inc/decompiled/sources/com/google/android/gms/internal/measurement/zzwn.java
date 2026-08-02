package com.google.android.gms.internal.measurement;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.HashMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzwn {
    public int zza;
    public final int zzb;
    public zzwn zzc;
    public final HashMap zzd = new HashMap(0);

    public zzwn(int i, int i2) {
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
