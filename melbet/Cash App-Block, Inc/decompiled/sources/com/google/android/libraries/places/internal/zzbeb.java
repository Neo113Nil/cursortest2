package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzbeb implements zzbjv {
    FUEL_TYPE_UNSPECIFIED(0),
    DIESEL(1),
    DIESEL_PLUS(19),
    REGULAR_UNLEADED(2),
    MIDGRADE(3),
    PREMIUM(4),
    SP91(5),
    SP91_E10(6),
    SP92(7),
    SP95(8),
    SP95_E10(9),
    SP98(10),
    SP99(11),
    SP100(12),
    LPG(13),
    E80(14),
    E85(15),
    E100(20),
    METHANE(16),
    BIO_DIESEL(17),
    TRUCK_DIESEL(18),
    UNRECOGNIZED(-1);

    public final int zzw;

    zzbeb(int i) {
        this.zzw = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzw);
    }

    @Override // com.google.android.libraries.places.internal.zzbjv
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzw;
        }
        zzbkc.zza();
        throw null;
    }
}
