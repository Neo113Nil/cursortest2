package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CashAppPayIncentiveScreen$IncentivePromptSheetScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<CashAppPayIncentiveScreen$IncentivePromptSheetScreen> CREATOR = new AutofillQuestion.Creator(3);
    public final float discountPercentage;
    public final String flowToken;
    public final String merchantToken;
    public final String paykitMobileUrl;
    public final ShoppingScreenContext screenContext;

    public CashAppPayIncentiveScreen$IncentivePromptSheetScreen(ShoppingScreenContext shoppingScreenContext, String str, float f, String str2, String str3) {
        str.getClass();
        this.screenContext = shoppingScreenContext;
        this.paykitMobileUrl = str;
        this.discountPercentage = f;
        this.merchantToken = str2;
        this.flowToken = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppPayIncentiveScreen$IncentivePromptSheetScreen)) {
            return false;
        }
        CashAppPayIncentiveScreen$IncentivePromptSheetScreen cashAppPayIncentiveScreen$IncentivePromptSheetScreen = (CashAppPayIncentiveScreen$IncentivePromptSheetScreen) obj;
        return Intrinsics.areEqual(this.screenContext, cashAppPayIncentiveScreen$IncentivePromptSheetScreen.screenContext) && Intrinsics.areEqual(this.paykitMobileUrl, cashAppPayIncentiveScreen$IncentivePromptSheetScreen.paykitMobileUrl) && Float.compare(this.discountPercentage, cashAppPayIncentiveScreen$IncentivePromptSheetScreen.discountPercentage) == 0 && Intrinsics.areEqual(this.merchantToken, cashAppPayIncentiveScreen$IncentivePromptSheetScreen.merchantToken) && Intrinsics.areEqual(this.flowToken, cashAppPayIncentiveScreen$IncentivePromptSheetScreen.flowToken);
    }

    public final int hashCode() {
        ShoppingScreenContext shoppingScreenContext = this.screenContext;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.discountPercentage, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((shoppingScreenContext == null ? 0 : shoppingScreenContext.hashCode()) * 31, 31, this.paykitMobileUrl), 31);
        String str = this.merchantToken;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flowToken;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncentivePromptSheetScreen(screenContext=");
        sb.append(this.screenContext);
        sb.append(", paykitMobileUrl=");
        sb.append(this.paykitMobileUrl);
        sb.append(", discountPercentage=");
        sb.append(this.discountPercentage);
        sb.append(", merchantToken=");
        sb.append(this.merchantToken);
        sb.append(", flowToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flowToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.screenContext, i);
        parcel.writeString(this.paykitMobileUrl);
        parcel.writeFloat(this.discountPercentage);
        parcel.writeString(this.merchantToken);
        parcel.writeString(this.flowToken);
    }
}
