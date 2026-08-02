package com.squareup.cash.history.viewmodels;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TreehouseReceiptViewModel {
    public final ActivityScope activityScope;
    public final ActivityToken activityToken;
    public final String encodedExitUrl;
    public final String locale;
    public final BetterNavigator.ScreenNavigator navigator;
    public final String paymentToken;
    public final ActivityToken primaryActivityToken;

    public TreehouseReceiptViewModel(String str, BetterNavigator.ScreenNavigator screenNavigator, ActivityToken activityToken, ActivityToken activityToken2, ActivityScope activityScope, String str2, String str3) {
        this.paymentToken = str;
        this.navigator = screenNavigator;
        this.activityToken = activityToken;
        this.primaryActivityToken = activityToken2;
        this.activityScope = activityScope;
        this.encodedExitUrl = str2;
        this.locale = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TreehouseReceiptViewModel) {
            TreehouseReceiptViewModel treehouseReceiptViewModel = (TreehouseReceiptViewModel) obj;
            if (this.paymentToken.equals(treehouseReceiptViewModel.paymentToken) && this.navigator == treehouseReceiptViewModel.navigator && Intrinsics.areEqual(this.activityToken, treehouseReceiptViewModel.activityToken) && Intrinsics.areEqual(this.primaryActivityToken, treehouseReceiptViewModel.primaryActivityToken) && this.activityScope == treehouseReceiptViewModel.activityScope && Intrinsics.areEqual(this.encodedExitUrl, treehouseReceiptViewModel.encodedExitUrl) && Intrinsics.areEqual(this.locale, treehouseReceiptViewModel.locale)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.navigator.hashCode() + (this.paymentToken.hashCode() * 31)) * 31;
        ActivityToken activityToken = this.activityToken;
        int hashCode2 = (hashCode + (activityToken == null ? 0 : activityToken.hashCode())) * 31;
        ActivityToken activityToken2 = this.primaryActivityToken;
        int hashCode3 = (hashCode2 + (activityToken2 == null ? 0 : activityToken2.hashCode())) * 31;
        ActivityScope activityScope = this.activityScope;
        int hashCode4 = (hashCode3 + (activityScope == null ? 0 : activityScope.hashCode())) * 31;
        String str = this.encodedExitUrl;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.locale;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }
}
