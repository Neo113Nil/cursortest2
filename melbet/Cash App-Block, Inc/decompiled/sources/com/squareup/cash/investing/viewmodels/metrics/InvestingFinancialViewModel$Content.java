package com.squareup.cash.investing.viewmodels.metrics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.nimbusds.jose.util.X509CertUtils;
import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingFinancialViewModel$Content extends X509CertUtils {
    public final ColorModel.Accented accentColor;
    public final String annualButtonLabel;
    public final ArrayList financialModels;
    public final ArrayList graphDetails;
    public final String profitLabel;
    public final String quarterlyButtonLabel;
    public final String revenueLabel;
    public final Range selectedButton;
    public final String title;

    public final class InvestingFinancialGraphModel {
        public final float maxAmount;
        public final float maxNegativeAmount;
        public final long profit;
        public final long revenue;

        public InvestingFinancialGraphModel(float f, float f2, long j, long j2) {
            this.revenue = j;
            this.profit = j2;
            this.maxAmount = f;
            this.maxNegativeAmount = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvestingFinancialGraphModel)) {
                return false;
            }
            InvestingFinancialGraphModel investingFinancialGraphModel = (InvestingFinancialGraphModel) obj;
            return this.revenue == investingFinancialGraphModel.revenue && this.profit == investingFinancialGraphModel.profit && Float.compare(this.maxAmount, investingFinancialGraphModel.maxAmount) == 0 && Float.compare(this.maxNegativeAmount, investingFinancialGraphModel.maxNegativeAmount) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.maxNegativeAmount) + CameraState$Type$EnumUnboxingLocalUtility.m(this.maxAmount, Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.revenue) * 31, 31, this.profit), 31);
        }

        public final String toString() {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.revenue, "InvestingFinancialGraphModel(revenue=", ", profit=");
            m1149m.append(this.profit);
            m1149m.append(", maxAmount=");
            m1149m.append(this.maxAmount);
            m1149m.append(", maxNegativeAmount=");
            m1149m.append(this.maxNegativeAmount);
            m1149m.append(")");
            return m1149m.toString();
        }
    }

    public InvestingFinancialViewModel$Content(String str, String str2, String str3, Range range, ArrayList arrayList, ArrayList arrayList2, String str4, String str5, ColorModel.Accented accented) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        range.getClass();
        str4.getClass();
        str5.getClass();
        this.title = str;
        this.annualButtonLabel = str2;
        this.quarterlyButtonLabel = str3;
        this.selectedButton = range;
        this.financialModels = arrayList;
        this.graphDetails = arrayList2;
        this.profitLabel = str4;
        this.revenueLabel = str5;
        this.accentColor = accented;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingFinancialViewModel$Content)) {
            return false;
        }
        InvestingFinancialViewModel$Content investingFinancialViewModel$Content = (InvestingFinancialViewModel$Content) obj;
        return Intrinsics.areEqual(this.title, investingFinancialViewModel$Content.title) && Intrinsics.areEqual(this.annualButtonLabel, investingFinancialViewModel$Content.annualButtonLabel) && Intrinsics.areEqual(this.quarterlyButtonLabel, investingFinancialViewModel$Content.quarterlyButtonLabel) && this.selectedButton == investingFinancialViewModel$Content.selectedButton && this.financialModels.equals(investingFinancialViewModel$Content.financialModels) && this.graphDetails.equals(investingFinancialViewModel$Content.graphDetails) && Intrinsics.areEqual(this.profitLabel, investingFinancialViewModel$Content.profitLabel) && Intrinsics.areEqual(this.revenueLabel, investingFinancialViewModel$Content.revenueLabel) && this.accentColor.equals(investingFinancialViewModel$Content.accentColor);
    }

    public final int hashCode() {
        return this.accentColor.color.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.graphDetails, CameraState$Type$EnumUnboxingLocalUtility.m(this.financialModels, (this.selectedButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.annualButtonLabel), 31, this.quarterlyButtonLabel)) * 31, 31), 31), 31, this.profitLabel), 31, this.revenueLabel);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", annualButtonLabel=", this.annualButtonLabel, ", quarterlyButtonLabel=");
        m.append(this.quarterlyButtonLabel);
        m.append(", selectedButton=");
        m.append(this.selectedButton);
        m.append(", financialModels=");
        m.append(this.financialModels);
        m.append(", graphDetails=");
        m.append(this.graphDetails);
        m.append(", profitLabel=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.profitLabel, ", revenueLabel=", this.revenueLabel, ", accentColor=");
        m.append(this.accentColor);
        m.append(")");
        return m.toString();
    }
}
