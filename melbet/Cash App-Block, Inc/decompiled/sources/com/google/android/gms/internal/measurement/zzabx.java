package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public enum zzabx implements zzady {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);

    public final int zzf;

    zzabx(int i) {
        this.zzf = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.zzady
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzf;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }
}
