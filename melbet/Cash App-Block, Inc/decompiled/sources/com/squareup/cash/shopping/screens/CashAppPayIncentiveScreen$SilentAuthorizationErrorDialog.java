package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog implements Screen, DialogScreen {
    public static final Parcelable.Creator<CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog> CREATOR = new AutofillQuestion.Creator(4);
    public final String message;
    public final String paykitMobileUrl;
    public final ShoppingScreenContext screenContext;
    public final String title;

    public CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog(ShoppingScreenContext shoppingScreenContext, String str, String str2, String str3) {
        str.getClass();
        this.screenContext = shoppingScreenContext;
        this.paykitMobileUrl = str;
        this.title = str2;
        this.message = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog)) {
            return false;
        }
        CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog = (CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog) obj;
        return Intrinsics.areEqual(this.screenContext, cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog.screenContext) && Intrinsics.areEqual(this.paykitMobileUrl, cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog.paykitMobileUrl) && Intrinsics.areEqual(this.title, cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog.title) && Intrinsics.areEqual(this.message, cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog.message);
    }

    public final int hashCode() {
        ShoppingScreenContext shoppingScreenContext = this.screenContext;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((shoppingScreenContext == null ? 0 : shoppingScreenContext.hashCode()) * 31, 31, this.paykitMobileUrl);
        String str = this.title;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SilentAuthorizationErrorDialog(screenContext=");
        sb.append(this.screenContext);
        sb.append(", paykitMobileUrl=");
        sb.append(this.paykitMobileUrl);
        sb.append(", title=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.title, ", message=", this.message, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.screenContext, i);
        parcel.writeString(this.paykitMobileUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.message);
    }
}
