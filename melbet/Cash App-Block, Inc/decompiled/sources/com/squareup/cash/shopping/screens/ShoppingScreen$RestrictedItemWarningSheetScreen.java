package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ShoppingScreen$RestrictedItemWarningSheetScreen extends MainScreens implements BottomSheetScreen {
    public static final Parcelable.Creator<ShoppingScreen$RestrictedItemWarningSheetScreen> CREATOR = new AutofillQuestion.Creator(20);
    public final String name;
    public final ShoppingScreenContext screenContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingScreen$RestrictedItemWarningSheetScreen(ShoppingScreenContext shoppingScreenContext, String str) {
        super(2);
        str.getClass();
        this.screenContext = shoppingScreenContext;
        this.name = str;
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
        if (!(obj instanceof ShoppingScreen$RestrictedItemWarningSheetScreen)) {
            return false;
        }
        ShoppingScreen$RestrictedItemWarningSheetScreen shoppingScreen$RestrictedItemWarningSheetScreen = (ShoppingScreen$RestrictedItemWarningSheetScreen) obj;
        return Intrinsics.areEqual(this.screenContext, shoppingScreen$RestrictedItemWarningSheetScreen.screenContext) && Intrinsics.areEqual(this.name, shoppingScreen$RestrictedItemWarningSheetScreen.name);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        ShoppingScreenContext shoppingScreenContext = this.screenContext;
        return this.name.hashCode() + ((shoppingScreenContext == null ? 0 : shoppingScreenContext.hashCode()) * 31);
    }

    public final String toString() {
        return "RestrictedItemWarningSheetScreen(screenContext=" + this.screenContext + ", name=" + this.name + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.screenContext, i);
        parcel.writeString(this.name);
    }
}
