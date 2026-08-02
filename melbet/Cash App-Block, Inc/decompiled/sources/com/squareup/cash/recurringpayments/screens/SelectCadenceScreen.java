package com.squareup.cash.recurringpayments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SelectCadenceScreen implements Screen {
    public static final Parcelable.Creator<SelectCadenceScreen> CREATOR = new Creator();
    public final RecurringPaymentBlocker.CadenceMenu cadenceMenu;
    public final CreateOrEditRecurringPaymentScreen previousRecurringPaymentScreen;

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SelectCadenceScreen((RecurringPaymentBlocker.CadenceMenu) parcel.readParcelable(SelectCadenceScreen.class.getClassLoader()), CreateOrEditRecurringPaymentScreen.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectCadenceScreen[i];
        }
    }

    public SelectCadenceScreen(RecurringPaymentBlocker.CadenceMenu cadenceMenu, CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen) {
        cadenceMenu.getClass();
        createOrEditRecurringPaymentScreen.getClass();
        this.cadenceMenu = cadenceMenu;
        this.previousRecurringPaymentScreen = createOrEditRecurringPaymentScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectCadenceScreen)) {
            return false;
        }
        SelectCadenceScreen selectCadenceScreen = (SelectCadenceScreen) obj;
        return Intrinsics.areEqual(this.cadenceMenu, selectCadenceScreen.cadenceMenu) && Intrinsics.areEqual(this.previousRecurringPaymentScreen, selectCadenceScreen.previousRecurringPaymentScreen);
    }

    public final int hashCode() {
        return this.previousRecurringPaymentScreen.hashCode() + (this.cadenceMenu.hashCode() * 31);
    }

    public final String toString() {
        return "SelectCadenceScreen(cadenceMenu=" + this.cadenceMenu + ", previousRecurringPaymentScreen=" + this.previousRecurringPaymentScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.cadenceMenu, i);
        this.previousRecurringPaymentScreen.writeToParcel(parcel, i);
    }
}
