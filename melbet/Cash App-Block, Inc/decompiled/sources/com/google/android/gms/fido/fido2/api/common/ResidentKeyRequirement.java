package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public enum ResidentKeyRequirement implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = new com.google.android.gms.common.zzs(16);
    public final String zzb;

    public final class UnsupportedResidentKeyRequirementException extends Exception {
    }

    ResidentKeyRequirement(String str) {
        this.zzb = str;
    }

    public static ResidentKeyRequirement fromString(String str) {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.zzb)) {
                return residentKeyRequirement;
            }
        }
        throw new UnsupportedResidentKeyRequirementException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Resident key requirement ", str, " not supported"));
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
