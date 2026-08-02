package com.squareup.cash.investing.applets.presenters;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement implements RealStocksAppletTileRepository.StocksModel {
    public final long balanceAmountCents;
    public final StocksAppletTileModel.Installed.ChangeDirection changeDirection;
    public final InvestingGraphContentModel graph;
    public final String percentText;
    public final String todayText;

    public RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement(long j, String str, String str2, StocksAppletTileModel.Installed.ChangeDirection changeDirection, InvestingGraphContentModel investingGraphContentModel) {
        str.getClass();
        str2.getClass();
        this.balanceAmountCents = j;
        this.percentText = str;
        this.todayText = str2;
        this.changeDirection = changeDirection;
        this.graph = investingGraphContentModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement)) {
            return false;
        }
        RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement = (RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement) obj;
        return this.balanceAmountCents == realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.balanceAmountCents && Intrinsics.areEqual(this.percentText, realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.percentText) && Intrinsics.areEqual(this.todayText, realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.todayText) && this.changeDirection == realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.changeDirection && this.graph.equals(realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.graph);
    }

    public final int hashCode() {
        return this.graph.hashCode() + ((this.changeDirection.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.balanceAmountCents) * 31, 31, this.percentText), 31, this.todayText)) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("LoadedPriceMovement(balanceAmountCents=", this.balanceAmountCents, ", percentText=", this.percentText);
        m.append(", todayText=");
        m.append(this.todayText);
        m.append(", changeDirection=");
        m.append(this.changeDirection);
        m.append(", graph=");
        m.append(this.graph);
        m.append(")");
        return m.toString();
    }
}
