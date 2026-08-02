package com.fidesmo.sec.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/fidesmo/sec/core/EligibilityCheckRequest;", "", "kid", "", "batchId", "", "encryptedData", "ephemeralKey", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBatchId", "()I", "getEncryptedData", "()Ljava/lang/String;", "getEphemeralKey", "getKid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EligibilityCheckRequest {
    private final int batchId;
    private final String encryptedData;
    private final String ephemeralKey;
    private final String kid;

    public EligibilityCheckRequest(String str, int i, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.kid = str;
        this.batchId = i;
        this.encryptedData = str2;
        this.ephemeralKey = str3;
    }

    public static /* synthetic */ EligibilityCheckRequest copy$default(EligibilityCheckRequest eligibilityCheckRequest, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eligibilityCheckRequest.kid;
        }
        if ((i2 & 2) != 0) {
            i = eligibilityCheckRequest.batchId;
        }
        if ((i2 & 4) != 0) {
            str2 = eligibilityCheckRequest.encryptedData;
        }
        if ((i2 & 8) != 0) {
            str3 = eligibilityCheckRequest.ephemeralKey;
        }
        return eligibilityCheckRequest.copy(str, i, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKid() {
        return this.kid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBatchId() {
        return this.batchId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEncryptedData() {
        return this.encryptedData;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEphemeralKey() {
        return this.ephemeralKey;
    }

    public final EligibilityCheckRequest copy(String kid, int batchId, String encryptedData, String ephemeralKey) {
        kid.getClass();
        encryptedData.getClass();
        ephemeralKey.getClass();
        return new EligibilityCheckRequest(kid, batchId, encryptedData, ephemeralKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EligibilityCheckRequest)) {
            return false;
        }
        EligibilityCheckRequest eligibilityCheckRequest = (EligibilityCheckRequest) other;
        return Intrinsics.areEqual(this.kid, eligibilityCheckRequest.kid) && this.batchId == eligibilityCheckRequest.batchId && Intrinsics.areEqual(this.encryptedData, eligibilityCheckRequest.encryptedData) && Intrinsics.areEqual(this.ephemeralKey, eligibilityCheckRequest.ephemeralKey);
    }

    public final int getBatchId() {
        return this.batchId;
    }

    public final String getEncryptedData() {
        return this.encryptedData;
    }

    public final String getEphemeralKey() {
        return this.ephemeralKey;
    }

    public final String getKid() {
        return this.kid;
    }

    public int hashCode() {
        return this.ephemeralKey.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.batchId, this.kid.hashCode() * 31, 31), 31, this.encryptedData);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EligibilityCheckRequest(kid=");
        sb.append(this.kid);
        sb.append(", batchId=");
        sb.append(this.batchId);
        sb.append(", encryptedData=");
        sb.append(this.encryptedData);
        sb.append(", ephemeralKey=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.ephemeralKey, ')');
    }
}
