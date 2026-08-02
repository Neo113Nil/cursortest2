package com.squareup.cash.shopping.sup.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen> CREATOR = new ErrorScreen.Creator(22);
    public final SingleUsePaymentAnalyticsParam analyticsParam;
    public final String downPayment;
    public final String estimatedTotal;

    public SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen(String str, String str2, SingleUsePaymentAnalyticsParam singleUsePaymentAnalyticsParam) {
        str.getClass();
        str2.getClass();
        this.downPayment = str;
        this.estimatedTotal = str2;
        this.analyticsParam = singleUsePaymentAnalyticsParam;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen)) {
            return false;
        }
        SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen = (SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen) obj;
        return Intrinsics.areEqual(this.downPayment, singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.downPayment) && Intrinsics.areEqual(this.estimatedTotal, singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.estimatedTotal) && Intrinsics.areEqual(this.analyticsParam, singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.analyticsParam);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.downPayment.hashCode() * 31, 31, this.estimatedTotal);
        SingleUsePaymentAnalyticsParam singleUsePaymentAnalyticsParam = this.analyticsParam;
        return m + (singleUsePaymentAnalyticsParam == null ? 0 : singleUsePaymentAnalyticsParam.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SingleUsePaymentPlanDetailsSheetScreen(downPayment=", this.downPayment, ", estimatedTotal=", this.estimatedTotal, ", analyticsParam=");
        m.append(this.analyticsParam);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.downPayment);
        parcel.writeString(this.estimatedTotal);
        SingleUsePaymentAnalyticsParam singleUsePaymentAnalyticsParam = this.analyticsParam;
        if (singleUsePaymentAnalyticsParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            singleUsePaymentAnalyticsParam.writeToParcel(parcel, i);
        }
    }
}
