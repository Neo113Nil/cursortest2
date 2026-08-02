package com.squareup.cash.fidesmo.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningData {
    public final FidesmoCardEncryptionData cardEncryptionData;
    public final String customerTokenHashEmail;
    public final String fidesmoId;

    public FidesmoProvisioningData(String str, FidesmoCardEncryptionData fidesmoCardEncryptionData, String str2) {
        str.getClass();
        this.fidesmoId = str;
        this.cardEncryptionData = fidesmoCardEncryptionData;
        this.customerTokenHashEmail = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FidesmoProvisioningData)) {
            return false;
        }
        FidesmoProvisioningData fidesmoProvisioningData = (FidesmoProvisioningData) obj;
        return Intrinsics.areEqual(this.fidesmoId, fidesmoProvisioningData.fidesmoId) && Intrinsics.areEqual(this.cardEncryptionData, fidesmoProvisioningData.cardEncryptionData) && Intrinsics.areEqual(this.customerTokenHashEmail, fidesmoProvisioningData.customerTokenHashEmail);
    }

    public final int hashCode() {
        int hashCode = this.fidesmoId.hashCode() * 31;
        FidesmoCardEncryptionData fidesmoCardEncryptionData = this.cardEncryptionData;
        int hashCode2 = (hashCode + (fidesmoCardEncryptionData == null ? 0 : fidesmoCardEncryptionData.hashCode())) * 31;
        String str = this.customerTokenHashEmail;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FidesmoProvisioningData(fidesmoId=");
        sb.append(this.fidesmoId);
        sb.append(", cardEncryptionData=");
        sb.append(this.cardEncryptionData);
        sb.append(", customerTokenHashEmail=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.customerTokenHashEmail, ")");
    }
}
