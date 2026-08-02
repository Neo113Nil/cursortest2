package com.squareup.cash.benefits.applets.viewmodels;

import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BankingBenefitsAppletTileModel$Installed$Default implements BankingBenefitsAppletTileModel {
    public final GreenStatus greenStatus;
    public final Float previousProgress;
    public final Float progress;
    public final Subtitle subtitle;
    public final String title;

    public BankingBenefitsAppletTileModel$Installed$Default(String str, GreenStatus greenStatus, Subtitle subtitle, Float f, Float f2) {
        str.getClass();
        this.title = str;
        this.greenStatus = greenStatus;
        this.subtitle = subtitle;
        this.progress = f;
        this.previousProgress = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankingBenefitsAppletTileModel$Installed$Default)) {
            return false;
        }
        BankingBenefitsAppletTileModel$Installed$Default bankingBenefitsAppletTileModel$Installed$Default = (BankingBenefitsAppletTileModel$Installed$Default) obj;
        return Intrinsics.areEqual(this.title, bankingBenefitsAppletTileModel$Installed$Default.title) && this.greenStatus == bankingBenefitsAppletTileModel$Installed$Default.greenStatus && this.subtitle.equals(bankingBenefitsAppletTileModel$Installed$Default.subtitle) && Intrinsics.areEqual((Object) this.progress, (Object) bankingBenefitsAppletTileModel$Installed$Default.progress) && Intrinsics.areEqual((Object) this.previousProgress, (Object) bankingBenefitsAppletTileModel$Installed$Default.previousProgress);
    }

    @Override // com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel
    public final boolean getShowInBalanceSection() {
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.subtitle.hashCode() + ((this.greenStatus.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, false)) * 31)) * 31;
        Float f = this.progress;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.previousProgress;
        return hashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        return "Default(title=" + this.title + ", showInBalanceSection=false, greenStatus=" + this.greenStatus + ", subtitle=" + this.subtitle + ", progress=" + this.progress + ", previousProgress=" + this.previousProgress + ")";
    }
}
