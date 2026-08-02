package com.google.android.libraries.places.internal;

import java.net.URI;

/* loaded from: classes4.dex */
public final class zzcgt implements zzcgu {
    public final URI zza;

    public zzcgt(URI uri) {
        uri.getClass();
        this.zza = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcgt)) {
            return false;
        }
        return this.zza.equals(((zzcgt) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcgu
    public final zzbtf zza(zzbtg zzbtgVar, zzbsy zzbsyVar) {
        return zzbtgVar.zza(this.zza, zzbsyVar);
    }
}
