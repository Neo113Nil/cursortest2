package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ShoppingScreen$BrandsSearchScreen extends MainScreens {
    public static final Parcelable.Creator<ShoppingScreen$BrandsSearchScreen> CREATOR = new AutofillQuestion.Creator(15);
    public final ShoppingScreenContext screenContext;
    public final String searchText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingScreen$BrandsSearchScreen(ShoppingScreenContext shoppingScreenContext, String str) {
        super(2);
        str.getClass();
        this.screenContext = shoppingScreenContext;
        this.searchText = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingScreen$BrandsSearchScreen)) {
            return false;
        }
        ShoppingScreen$BrandsSearchScreen shoppingScreen$BrandsSearchScreen = (ShoppingScreen$BrandsSearchScreen) obj;
        return Intrinsics.areEqual(this.screenContext, shoppingScreen$BrandsSearchScreen.screenContext) && Intrinsics.areEqual(this.searchText, shoppingScreen$BrandsSearchScreen.searchText);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        ShoppingScreenContext shoppingScreenContext = this.screenContext;
        return this.searchText.hashCode() + ((shoppingScreenContext == null ? 0 : shoppingScreenContext.hashCode()) * 31);
    }

    public final String toString() {
        return "BrandsSearchScreen(screenContext=" + this.screenContext + ", searchText=" + this.searchText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.screenContext, i);
        parcel.writeString(this.searchText);
    }
}
