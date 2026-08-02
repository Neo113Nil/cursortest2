package com.squareup.cash.bitcoin.graph.real;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.bitcoin.graph.api.model.BitcoinGraphModel;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RealBitcoinGraphPresenter$State {
    public final BitcoinGraphModel graphModel;
    public final boolean isLogged;
    public final boolean isSwitchingRange;
    public final HistoricalRange selectedRange;

    public RealBitcoinGraphPresenter$State(HistoricalRange historicalRange, BitcoinGraphModel bitcoinGraphModel, boolean z, boolean z2) {
        this.selectedRange = historicalRange;
        this.graphModel = bitcoinGraphModel;
        this.isSwitchingRange = z;
        this.isLogged = z2;
    }

    public static RealBitcoinGraphPresenter$State copy$default(RealBitcoinGraphPresenter$State realBitcoinGraphPresenter$State, HistoricalRange historicalRange, BitcoinGraphModel bitcoinGraphModel, boolean z, int i) {
        if ((i & 1) != 0) {
            historicalRange = realBitcoinGraphPresenter$State.selectedRange;
        }
        if ((i & 2) != 0) {
            bitcoinGraphModel = realBitcoinGraphPresenter$State.graphModel;
        }
        if ((i & 4) != 0) {
            z = realBitcoinGraphPresenter$State.isSwitchingRange;
        }
        boolean z2 = (i & 8) != 0 ? realBitcoinGraphPresenter$State.isLogged : true;
        realBitcoinGraphPresenter$State.getClass();
        return new RealBitcoinGraphPresenter$State(historicalRange, bitcoinGraphModel, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealBitcoinGraphPresenter$State)) {
            return false;
        }
        RealBitcoinGraphPresenter$State realBitcoinGraphPresenter$State = (RealBitcoinGraphPresenter$State) obj;
        return this.selectedRange == realBitcoinGraphPresenter$State.selectedRange && Intrinsics.areEqual(this.graphModel, realBitcoinGraphPresenter$State.graphModel) && this.isSwitchingRange == realBitcoinGraphPresenter$State.isSwitchingRange && this.isLogged == realBitcoinGraphPresenter$State.isLogged;
    }

    public final int hashCode() {
        HistoricalRange historicalRange = this.selectedRange;
        int hashCode = (historicalRange == null ? 0 : historicalRange.hashCode()) * 31;
        BitcoinGraphModel bitcoinGraphModel = this.graphModel;
        return Boolean.hashCode(this.isLogged) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (bitcoinGraphModel != null ? bitcoinGraphModel.hashCode() : 0)) * 31, 31, this.isSwitchingRange);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(selectedRange=");
        sb.append(this.selectedRange);
        sb.append(", graphModel=");
        sb.append(this.graphModel);
        sb.append(", isSwitchingRange=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.isSwitchingRange, ", isLogged=", this.isLogged, ")");
    }
}
