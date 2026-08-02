package com.squareup.cash.bitcoin.applets.presenters.data;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinRepositoryModel$Installed$LoadedPriceMovement implements BitcoinRepositoryModel {
    public final long balanceAmountCents;
    public final InvestingCryptoImage changeDirection;
    public final String formattedBalance;
    public final InvestingGraphContentModel graph;
    public final String movement;

    public BitcoinRepositoryModel$Installed$LoadedPriceMovement(String str, long j, String str2, InvestingCryptoImage investingCryptoImage, InvestingGraphContentModel investingGraphContentModel) {
        investingGraphContentModel.getClass();
        this.formattedBalance = str;
        this.balanceAmountCents = j;
        this.movement = str2;
        this.changeDirection = investingCryptoImage;
        this.graph = investingGraphContentModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinRepositoryModel$Installed$LoadedPriceMovement)) {
            return false;
        }
        BitcoinRepositoryModel$Installed$LoadedPriceMovement bitcoinRepositoryModel$Installed$LoadedPriceMovement = (BitcoinRepositoryModel$Installed$LoadedPriceMovement) obj;
        return this.formattedBalance.equals(bitcoinRepositoryModel$Installed$LoadedPriceMovement.formattedBalance) && this.balanceAmountCents == bitcoinRepositoryModel$Installed$LoadedPriceMovement.balanceAmountCents && this.movement.equals(bitcoinRepositoryModel$Installed$LoadedPriceMovement.movement) && this.changeDirection == bitcoinRepositoryModel$Installed$LoadedPriceMovement.changeDirection && Intrinsics.areEqual(this.graph, bitcoinRepositoryModel$Installed$LoadedPriceMovement.graph);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.formattedBalance.hashCode() * 31, 31, this.balanceAmountCents), 31, this.movement);
        InvestingCryptoImage investingCryptoImage = this.changeDirection;
        return this.graph.hashCode() + ((m + (investingCryptoImage == null ? 0 : investingCryptoImage.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("LoadedPriceMovement(formattedBalance=", this.formattedBalance, ", balanceAmountCents=", this.balanceAmountCents);
        m.append(", movement=");
        m.append(this.movement);
        m.append(", changeDirection=");
        m.append(this.changeDirection);
        m.append(", graph=");
        m.append(this.graph);
        m.append(")");
        return m.toString();
    }
}
