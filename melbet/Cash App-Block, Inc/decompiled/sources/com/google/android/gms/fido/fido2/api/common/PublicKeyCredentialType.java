package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PublicKeyCredentialType implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    PublicKeyCredentialType EF5;
    public static final /* synthetic */ PublicKeyCredentialType[] zza = {new PublicKeyCredentialType("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = new com.google.android.gms.common.zzs(14);

    public final class UnsupportedPublicKeyCredTypeException extends Exception {
    }

    public static PublicKeyCredentialType fromString(String str) {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            publicKeyCredentialType.getClass();
            if (str.equals("public-key")) {
                return publicKeyCredentialType;
            }
        }
        throw new UnsupportedPublicKeyCredTypeException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PublicKeyCredentialType ", str, " not supported"));
    }

    public static PublicKeyCredentialType valueOf(String str) {
        return (PublicKeyCredentialType) Enum.valueOf(PublicKeyCredentialType.class, str);
    }

    public static PublicKeyCredentialType[] values() {
        return (PublicKeyCredentialType[]) zza.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
