package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzbfv implements zzbjv {
    SECONDARY_HOURS_TYPE_UNSPECIFIED(0),
    DRIVE_THROUGH(1),
    HAPPY_HOUR(2),
    DELIVERY(3),
    TAKEOUT(4),
    KITCHEN(5),
    BREAKFAST(6),
    LUNCH(7),
    DINNER(8),
    BRUNCH(9),
    PICKUP(10),
    ACCESS(11),
    SENIOR_HOURS(12),
    ONLINE_SERVICE_HOURS(13),
    UNRECOGNIZED(-1);

    public final int zzp;

    zzbfv(int i) {
        this.zzp = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzp);
    }

    @Override // com.google.android.libraries.places.internal.zzbjv
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzp;
        }
        zzbkc.zza();
        throw null;
    }
}
