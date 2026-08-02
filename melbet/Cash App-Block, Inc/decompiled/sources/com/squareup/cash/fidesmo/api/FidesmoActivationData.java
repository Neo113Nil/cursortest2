package com.squareup.cash.fidesmo.api;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FidesmoActivationData {
    public final byte[] certificate;
    public final String fidesmoId;
    public final int installedAppsCount;
    public final boolean isProvisioned;

    public FidesmoActivationData(String str, boolean z, int i, byte[] bArr) {
        str.getClass();
        this.fidesmoId = str;
        this.isProvisioned = z;
        this.installedAppsCount = i;
        this.certificate = bArr;
    }

    public static FidesmoActivationData copy$default(FidesmoActivationData fidesmoActivationData, byte[] bArr) {
        String str = fidesmoActivationData.fidesmoId;
        boolean z = fidesmoActivationData.isProvisioned;
        int i = fidesmoActivationData.installedAppsCount;
        fidesmoActivationData.getClass();
        str.getClass();
        return new FidesmoActivationData(str, z, i, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FidesmoActivationData)) {
            return false;
        }
        FidesmoActivationData fidesmoActivationData = (FidesmoActivationData) obj;
        return Intrinsics.areEqual(this.fidesmoId, fidesmoActivationData.fidesmoId) && this.isProvisioned == fidesmoActivationData.isProvisioned && this.installedAppsCount == fidesmoActivationData.installedAppsCount && Intrinsics.areEqual(this.certificate, fidesmoActivationData.certificate);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.installedAppsCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fidesmoId.hashCode() * 31, 31, this.isProvisioned), 31);
        byte[] bArr = this.certificate;
        return m + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.certificate);
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("FidesmoActivationData(fidesmoId=", this.fidesmoId, ", isProvisioned=", ", installedAppsCount=", this.isProvisioned);
        m1540m.append(this.installedAppsCount);
        m1540m.append(", certificate=");
        m1540m.append(arrays);
        m1540m.append(")");
        return m1540m.toString();
    }
}
