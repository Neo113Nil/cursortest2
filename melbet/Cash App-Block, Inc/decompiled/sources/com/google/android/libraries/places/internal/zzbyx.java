package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzbyx implements zzbxz {
    public final zzbze zza;

    public zzbyx(zzbze zzbzeVar) {
        if (zzbzeVar != null) {
            this.zza = zzbzeVar;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Http2Error cannot be null for GOAWAY");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzbyx.class == obj.getClass() && this.zza == ((zzbyx) obj).zza;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.libraries.places.internal.zzbxz
    public final String zza() {
        return "GOAWAY ".concat(String.valueOf(this.zza.name()));
    }
}
