package com.squareup.cash.money.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.savings.SavingsElement;

/* loaded from: classes6.dex */
public final class InstalledBalanceAppletTileContentModel {
    public final String formattedBalance;
    public final SavingsElement.Element metadata;
    public final long rawBalance;
    public final Function3 visual;

    public InstalledBalanceAppletTileContentModel(String str, long j, SavingsElement.Element element, ComposableLambdaImpl composableLambdaImpl, int i) {
        composableLambdaImpl = (i & 16) != 0 ? null : composableLambdaImpl;
        str.getClass();
        this.formattedBalance = str;
        this.rawBalance = j;
        this.metadata = element;
        this.visual = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstalledBalanceAppletTileContentModel)) {
            return false;
        }
        InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel = (InstalledBalanceAppletTileContentModel) obj;
        return Intrinsics.areEqual(this.formattedBalance, installedBalanceAppletTileContentModel.formattedBalance) && this.rawBalance == installedBalanceAppletTileContentModel.rawBalance && this.metadata.equals(installedBalanceAppletTileContentModel.metadata) && Intrinsics.areEqual(this.visual, installedBalanceAppletTileContentModel.visual);
    }

    public final int hashCode() {
        int hashCode = (this.metadata.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.formattedBalance.hashCode() * 31, 961, this.rawBalance)) * 31;
        Function3 function3 = this.visual;
        return hashCode + (function3 == null ? 0 : function3.hashCode());
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("InstalledBalanceAppletTileContentModel(formattedBalance=", this.formattedBalance, ", rawBalance=", this.rawBalance);
        m.append(", shaker=null, metadata=");
        m.append(this.metadata);
        m.append(", visual=");
        m.append(this.visual);
        m.append(")");
        return m.toString();
    }
}
