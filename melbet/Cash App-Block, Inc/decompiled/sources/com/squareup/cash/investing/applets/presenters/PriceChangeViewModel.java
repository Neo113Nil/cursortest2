package com.squareup.cash.investing.applets.presenters;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PriceChangeViewModel {
    public final long amountCents;
    public final StocksAppletTileModel.Installed.ChangeDirection changeDirection;
    public final String percentText;
    public final String rangeText;

    public PriceChangeViewModel(long j, String str, StocksAppletTileModel.Installed.ChangeDirection changeDirection, String str2) {
        str2.getClass();
        this.amountCents = j;
        this.percentText = str;
        this.changeDirection = changeDirection;
        this.rangeText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceChangeViewModel)) {
            return false;
        }
        PriceChangeViewModel priceChangeViewModel = (PriceChangeViewModel) obj;
        return this.amountCents == priceChangeViewModel.amountCents && this.percentText.equals(priceChangeViewModel.percentText) && this.changeDirection == priceChangeViewModel.changeDirection && Intrinsics.areEqual(this.rangeText, priceChangeViewModel.rangeText);
    }

    public final int hashCode() {
        return this.rangeText.hashCode() + ((this.changeDirection.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.amountCents) * 31, 31, this.percentText)) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("PriceChangeViewModel(amountCents=", this.amountCents, ", percentText=", this.percentText);
        m.append(", changeDirection=");
        m.append(this.changeDirection);
        m.append(", rangeText=");
        m.append(this.rangeText);
        m.append(")");
        return m.toString();
    }
}
