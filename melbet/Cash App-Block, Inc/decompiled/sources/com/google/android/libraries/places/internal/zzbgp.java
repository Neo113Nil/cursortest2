package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzbgp implements zzbjv {
    PRICE_LEVEL_UNSPECIFIED(0),
    PRICE_LEVEL_FREE(1),
    PRICE_LEVEL_INEXPENSIVE(2),
    PRICE_LEVEL_MODERATE(3),
    PRICE_LEVEL_EXPENSIVE(4),
    PRICE_LEVEL_VERY_EXPENSIVE(5),
    UNRECOGNIZED(-1);

    public final int zzh;

    zzbgp(int i) {
        this.zzh = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.libraries.places.internal.zzbjv
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        zzbkc.zza();
        throw null;
    }
}
