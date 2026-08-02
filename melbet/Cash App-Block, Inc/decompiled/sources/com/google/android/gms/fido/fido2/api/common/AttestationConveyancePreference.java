package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new com.google.android.gms.common.zzs(20);
    public final String zzb;

    public final class UnsupportedAttestationConveyancePreferenceException extends Exception {
    }

    AttestationConveyancePreference(String str) {
        this.zzb = str;
    }

    public static AttestationConveyancePreference fromString(String str) {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.zzb)) {
                return attestationConveyancePreference;
            }
        }
        throw new UnsupportedAttestationConveyancePreferenceException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }
}
