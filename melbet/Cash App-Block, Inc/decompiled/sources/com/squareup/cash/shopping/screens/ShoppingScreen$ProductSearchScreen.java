package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ShoppingScreen$ProductSearchScreen extends MainScreens {
    public static final Parcelable.Creator<ShoppingScreen$ProductSearchScreen> CREATOR = new AutofillQuestion.Creator(19);
    public final List filters;
    public final ShoppingScreenContext screenContext;
    public final String searchText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingScreen$ProductSearchScreen(ShoppingScreenContext shoppingScreenContext, String str, List list) {
        super(2);
        str.getClass();
        list.getClass();
        this.screenContext = shoppingScreenContext;
        this.searchText = str;
        this.filters = list;
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
        if (!(obj instanceof ShoppingScreen$ProductSearchScreen)) {
            return false;
        }
        ShoppingScreen$ProductSearchScreen shoppingScreen$ProductSearchScreen = (ShoppingScreen$ProductSearchScreen) obj;
        return Intrinsics.areEqual(this.screenContext, shoppingScreen$ProductSearchScreen.screenContext) && Intrinsics.areEqual(this.searchText, shoppingScreen$ProductSearchScreen.searchText) && Intrinsics.areEqual(this.filters, shoppingScreen$ProductSearchScreen.filters);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        ShoppingScreenContext shoppingScreenContext = this.screenContext;
        return this.filters.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((shoppingScreenContext == null ? 0 : shoppingScreenContext.hashCode()) * 31, 31, this.searchText);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductSearchScreen(screenContext=");
        sb.append(this.screenContext);
        sb.append(", searchText=");
        sb.append(this.searchText);
        sb.append(", filters=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.filters, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.screenContext, i);
        parcel.writeString(this.searchText);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.filters, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
