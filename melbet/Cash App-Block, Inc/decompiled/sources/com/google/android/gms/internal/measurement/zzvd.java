package com.google.android.gms.internal.measurement;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzvd {
    public final zznu zza;
    public final zzadf zzb;

    public zzvd(zznu zznuVar, zzadf zzadfVar) {
        this.zza = zznuVar;
        if (zzadfVar != null) {
            this.zzb = zzadfVar;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzvd)) {
            return false;
        }
        zzvd zzvdVar = (zzvd) obj;
        return this.zza.equals(zzvdVar.zza) && this.zzb.equals(zzvdVar.zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String zzaduVar = this.zza.toString();
        int length = zzaduVar.length();
        String obj = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 53 + obj.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "ProtoSerializer{defaultValue=", zzaduVar, ", extensionRegistryLite=", obj);
        sb.append("}");
        return sb.toString();
    }
}
