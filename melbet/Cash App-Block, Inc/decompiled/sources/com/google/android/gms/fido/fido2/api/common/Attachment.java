package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public enum Attachment implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<Attachment> CREATOR = new com.google.android.gms.common.zzs(1);
    public final String zzb;

    public final class UnsupportedAttachmentException extends Exception {
    }

    Attachment(String str) {
        this.zzb = str;
    }

    public static Attachment fromString(String str) {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.zzb)) {
                return attachment;
            }
        }
        throw new UnsupportedAttachmentException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Attachment ", str, " not supported"));
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
