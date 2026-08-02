package com.squareup.cash.merchant.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.limits.screens.LimitsScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MerchantScreen$MerchantProfileScreen implements Screen, RestoringScreen {
    public static final Parcelable.Creator<MerchantScreen$MerchantProfileScreen> CREATOR = new LimitsScreen.Creator(11);
    public final MerchantScreen$MerchantAnalytics analytics;
    public final BackNavigationAction backNavigationAction;
    public final String genericElementsContext;
    public final Redacted merchantOrBrandToken;
    public final GetProfileDetailsContext originContext;

    public MerchantScreen$MerchantProfileScreen(Redacted redacted, GetProfileDetailsContext getProfileDetailsContext, MerchantScreen$MerchantAnalytics merchantScreen$MerchantAnalytics, BackNavigationAction backNavigationAction, String str) {
        redacted.getClass();
        getProfileDetailsContext.getClass();
        backNavigationAction.getClass();
        this.merchantOrBrandToken = redacted;
        this.originContext = getProfileDetailsContext;
        this.analytics = merchantScreen$MerchantAnalytics;
        this.backNavigationAction = backNavigationAction;
        this.genericElementsContext = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantScreen$MerchantProfileScreen)) {
            return false;
        }
        MerchantScreen$MerchantProfileScreen merchantScreen$MerchantProfileScreen = (MerchantScreen$MerchantProfileScreen) obj;
        return Intrinsics.areEqual(this.merchantOrBrandToken, merchantScreen$MerchantProfileScreen.merchantOrBrandToken) && this.originContext == merchantScreen$MerchantProfileScreen.originContext && Intrinsics.areEqual(this.analytics, merchantScreen$MerchantProfileScreen.analytics) && this.backNavigationAction == merchantScreen$MerchantProfileScreen.backNavigationAction && Intrinsics.areEqual(this.genericElementsContext, merchantScreen$MerchantProfileScreen.genericElementsContext);
    }

    public final int hashCode() {
        int hashCode = (this.originContext.hashCode() + (this.merchantOrBrandToken.hashCode() * 31)) * 31;
        MerchantScreen$MerchantAnalytics merchantScreen$MerchantAnalytics = this.analytics;
        int hashCode2 = (this.backNavigationAction.hashCode() + ((hashCode + (merchantScreen$MerchantAnalytics == null ? 0 : merchantScreen$MerchantAnalytics.hashCode())) * 31)) * 31;
        String str = this.genericElementsContext;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantProfileScreen(merchantOrBrandToken=");
        sb.append(this.merchantOrBrandToken);
        sb.append(", originContext=");
        sb.append(this.originContext);
        sb.append(", analytics=");
        sb.append(this.analytics);
        sb.append(", backNavigationAction=");
        sb.append(this.backNavigationAction);
        sb.append(", genericElementsContext=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.genericElementsContext, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.merchantOrBrandToken, i);
        parcel.writeString(this.originContext.name());
        MerchantScreen$MerchantAnalytics merchantScreen$MerchantAnalytics = this.analytics;
        if (merchantScreen$MerchantAnalytics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            merchantScreen$MerchantAnalytics.writeToParcel(parcel, i);
        }
        parcel.writeString(this.backNavigationAction.name());
        parcel.writeString(this.genericElementsContext);
    }
}
