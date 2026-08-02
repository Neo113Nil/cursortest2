package com.squareup.cash.bitcoin.viewmodels.stablecoin;

import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class StablecoinDepositViewModel$Loaded {
    public final String descriptionText;
    public final String disclaimerText;
    public final String networkName;
    public final QrCodeModel qrCodeModel;

    public StablecoinDepositViewModel$Loaded(QrCodeModel qrCodeModel, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.qrCodeModel = qrCodeModel;
        this.descriptionText = str;
        this.networkName = str2;
        this.disclaimerText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinDepositViewModel$Loaded)) {
            return false;
        }
        StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj;
        return this.qrCodeModel.equals(stablecoinDepositViewModel$Loaded.qrCodeModel) && this.descriptionText.equals(stablecoinDepositViewModel$Loaded.descriptionText) && Intrinsics.areEqual(this.networkName, stablecoinDepositViewModel$Loaded.networkName) && Intrinsics.areEqual(this.disclaimerText, stablecoinDepositViewModel$Loaded.disclaimerText);
    }

    public final int hashCode() {
        return this.disclaimerText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.qrCodeModel.hashCode() * 31, 31, this.descriptionText), 31, this.networkName);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loaded(qrCodeModel=");
        sb.append(this.qrCodeModel);
        sb.append(", descriptionText=");
        sb.append(this.descriptionText);
        sb.append(", networkName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.networkName, ", disclaimerText=", this.disclaimerText, ")");
    }
}
