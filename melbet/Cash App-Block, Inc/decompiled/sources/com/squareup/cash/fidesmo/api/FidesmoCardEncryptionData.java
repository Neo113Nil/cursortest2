package com.squareup.cash.fidesmo.api;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class FidesmoCardEncryptionData {
    public final ByteString encryptedCardInfo;
    public final String encryptedEphemeralKey;

    public FidesmoCardEncryptionData(String str, ByteString byteString) {
        this.encryptedEphemeralKey = str;
        this.encryptedCardInfo = byteString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FidesmoCardEncryptionData)) {
            return false;
        }
        FidesmoCardEncryptionData fidesmoCardEncryptionData = (FidesmoCardEncryptionData) obj;
        return Intrinsics.areEqual(this.encryptedEphemeralKey, fidesmoCardEncryptionData.encryptedEphemeralKey) && Intrinsics.areEqual(this.encryptedCardInfo, fidesmoCardEncryptionData.encryptedCardInfo);
    }

    public final int hashCode() {
        String str = this.encryptedEphemeralKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ByteString byteString = this.encryptedCardInfo;
        return hashCode + (byteString != null ? byteString.hashCode() : 0);
    }

    public final String toString() {
        return "FidesmoCardEncryptionData(encryptedEphemeralKey=" + this.encryptedEphemeralKey + ", encryptedCardInfo=" + this.encryptedCardInfo + ")";
    }
}
