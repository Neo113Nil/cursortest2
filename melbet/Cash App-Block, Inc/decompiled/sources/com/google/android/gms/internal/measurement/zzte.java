package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.common.base.Present;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;

/* loaded from: classes4.dex */
public final class zzte {
    public final Uri zza;
    public final zznu zzb;
    public final Present zzc;
    public final ImmutableList zzd;

    public zzte(Uri uri, zznu zznuVar, Present present, ImmutableList immutableList) {
        this.zza = uri;
        this.zzb = zznuVar;
        this.zzc = present;
        this.zzd = immutableList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzte)) {
            return false;
        }
        zzte zzteVar = (zzte) obj;
        if (!this.zza.equals(zzteVar.zza) || !this.zzb.equals(zzteVar.zzb) || !this.zzc.equals(zzteVar.zzc)) {
            return false;
        }
        ImmutableList immutableList = zzteVar.zzd;
        ImmutableList immutableList2 = this.zzd;
        immutableList2.getClass();
        return Maps.equalsImpl(immutableList, immutableList2);
    }

    public final int hashCode() {
        return ((((((this.zzd.hashCode() ^ ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003)) * 1000003) ^ zztw.zza.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String zzaduVar = this.zzb.toString();
        int length2 = zzaduVar.length();
        zztw zztwVar = zztw.zza;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String obj2 = zztwVar.toString();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + obj2.length() + 32 + String.valueOf(true).length() + 22);
        Boxes$$ExternalSyntheticOutline1.m(sb, "ProtoDataStoreConfig{uri=", obj, ", schema=", zzaduVar);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", handler=", valueOf, ", migrations=", valueOf2);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", variantConfig=", obj2, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
