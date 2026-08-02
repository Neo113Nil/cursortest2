package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzbdy implements zzbjv {
    EV_CONNECTOR_TYPE_UNSPECIFIED(0),
    EV_CONNECTOR_TYPE_OTHER(1),
    EV_CONNECTOR_TYPE_J1772(2),
    EV_CONNECTOR_TYPE_TYPE_2(3),
    EV_CONNECTOR_TYPE_CHADEMO(4),
    EV_CONNECTOR_TYPE_CCS_COMBO_1(5),
    EV_CONNECTOR_TYPE_CCS_COMBO_2(6),
    EV_CONNECTOR_TYPE_TESLA(7),
    EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T(8),
    EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET(9),
    EV_CONNECTOR_TYPE_NACS(10),
    UNRECOGNIZED(-1);

    public final int zzm;

    zzbdy(int i) {
        this.zzm = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzm);
    }

    @Override // com.google.android.libraries.places.internal.zzbjv
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzm;
        }
        zzbkc.zza();
        throw null;
    }
}
