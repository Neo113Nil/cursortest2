package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ShoppingInfoSheetScreen implements BottomSheetScreen {

    public final class AfterPayInfoSheetScreen extends ShoppingInfoSheetScreen {
        public static final Parcelable.Creator<AfterPayInfoSheetScreen> CREATOR = new AutofillQuestion.Creator(13);
        public final ShoppingScreenContext screenContext;

        public AfterPayInfoSheetScreen(ShoppingScreenContext shoppingScreenContext) {
            this.screenContext = shoppingScreenContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AfterPayInfoSheetScreen) && Intrinsics.areEqual(this.screenContext, ((AfterPayInfoSheetScreen) obj).screenContext);
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen
        public final ShoppingScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final int hashCode() {
            ShoppingScreenContext shoppingScreenContext = this.screenContext;
            if (shoppingScreenContext == null) {
                return 0;
            }
            return shoppingScreenContext.hashCode();
        }

        public final String toString() {
            return "AfterPayInfoSheetScreen(screenContext=" + this.screenContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.screenContext, i);
        }
    }

    public final class CashAppPayIncentiveInfoSheetScreen extends ShoppingInfoSheetScreen {
        public static final Parcelable.Creator<CashAppPayIncentiveInfoSheetScreen> CREATOR = new AutofillQuestion.Creator(14);
        public final ShoppingScreenContext screenContext;

        public CashAppPayIncentiveInfoSheetScreen(ShoppingScreenContext shoppingScreenContext) {
            this.screenContext = shoppingScreenContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CashAppPayIncentiveInfoSheetScreen) && Intrinsics.areEqual(this.screenContext, ((CashAppPayIncentiveInfoSheetScreen) obj).screenContext);
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen
        public final ShoppingScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final int hashCode() {
            ShoppingScreenContext shoppingScreenContext = this.screenContext;
            if (shoppingScreenContext == null) {
                return 0;
            }
            return shoppingScreenContext.hashCode();
        }

        public final String toString() {
            return "CashAppPayIncentiveInfoSheetScreen(screenContext=" + this.screenContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.screenContext, i);
        }
    }

    public abstract ShoppingScreenContext getScreenContext();
}
