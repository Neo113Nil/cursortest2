package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzbez implements zzbjv {
    BUSINESS_STATUS_UNSPECIFIED(0),
    OPERATIONAL(1),
    CLOSED_TEMPORARILY(2),
    CLOSED_PERMANENTLY(3),
    FUTURE_OPENING(4),
    UNRECOGNIZED(-1);

    public final int zzg;

    zzbez(int i) {
        this.zzg = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.libraries.places.internal.zzbjv
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzg;
        }
        zzbkc.zza();
        throw null;
    }
}
