package com.google.android.libraries.places.internal;

import androidx.collection.SimpleArrayMap;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzuy {
    public static final zzmg zza = new zzmg();
    public final zzuy zzb;
    public final SimpleArrayMap zzc;
    public boolean zzd = false;

    public /* synthetic */ zzuy(zzuy zzuyVar, SimpleArrayMap simpleArrayMap) {
        if (zzuyVar != null) {
            Trace.checkArgument(zzuyVar.zzd);
        }
        this.zzb = zzuyVar;
        this.zzc = simpleArrayMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (zzuy zzuyVar = this; zzuyVar != null; zzuyVar = zzuyVar.zzb) {
            for (int i = 0; i < zzuyVar.zzc.size; i++) {
                sb.append("[");
                sb.append(this.zzc.valueAt(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }

    public final zzuy zzb() {
        if (this.zzd) {
            a$$ExternalSyntheticBUOutline0.m$1("Already frozen");
            return null;
        }
        this.zzd = true;
        zzuy zzuyVar = this.zzb;
        return (zzuyVar == null || !this.zzc.isEmpty()) ? this : zzuyVar;
    }

    public final boolean zzd() {
        if (this.zzc.containsKey(zza)) {
            return true;
        }
        zzuy zzuyVar = this.zzb;
        return zzuyVar != null && zzuyVar.zzd();
    }
}
