package com.squareup.cash.investing.scenarioplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InitiateInvestmentOrderScenarioPlanInput implements ScenarioPlanInput {
    public static final Parcelable.Creator<InitiateInvestmentOrderScenarioPlanInput> CREATOR = new FilterToken.Creator(14);
    public final ColorModel colorModel;
    public final String referrerFlowToken;
    public final InitiateInvestmentOrderRequest request;

    public InitiateInvestmentOrderScenarioPlanInput(InitiateInvestmentOrderRequest initiateInvestmentOrderRequest, ColorModel colorModel, String str) {
        initiateInvestmentOrderRequest.getClass();
        colorModel.getClass();
        this.request = initiateInvestmentOrderRequest;
        this.colorModel = colorModel;
        this.referrerFlowToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitiateInvestmentOrderScenarioPlanInput)) {
            return false;
        }
        InitiateInvestmentOrderScenarioPlanInput initiateInvestmentOrderScenarioPlanInput = (InitiateInvestmentOrderScenarioPlanInput) obj;
        return Intrinsics.areEqual(this.request, initiateInvestmentOrderScenarioPlanInput.request) && Intrinsics.areEqual(this.colorModel, initiateInvestmentOrderScenarioPlanInput.colorModel) && Intrinsics.areEqual(this.referrerFlowToken, initiateInvestmentOrderScenarioPlanInput.referrerFlowToken);
    }

    public final int hashCode() {
        int hashCode = (this.colorModel.hashCode() + (this.request.hashCode() * 31)) * 31;
        String str = this.referrerFlowToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitiateInvestmentOrderScenarioPlanInput(request=");
        sb.append(this.request);
        sb.append(", colorModel=");
        sb.append(this.colorModel);
        sb.append(", referrerFlowToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.referrerFlowToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.request, i);
        parcel.writeParcelable(this.colorModel, i);
        parcel.writeString(this.referrerFlowToken);
    }
}
