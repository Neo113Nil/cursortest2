package com.squareup.cash.recurringpayments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SelectDayOfCadenceScreen implements Screen {
    public static final Parcelable.Creator<SelectDayOfCadenceScreen> CREATOR = new Creator();
    public final RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu;
    public final boolean isDayPicker;
    public final CreateOrEditRecurringPaymentScreen previousRecurringPaymentScreen;

    /* loaded from: classes7.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SelectDayOfCadenceScreen((RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu) parcel.readParcelable(SelectDayOfCadenceScreen.class.getClassLoader()), CreateOrEditRecurringPaymentScreen.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectDayOfCadenceScreen[i];
        }
    }

    public SelectDayOfCadenceScreen(RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu, CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen, boolean z) {
        dayOfCadenceMenu.getClass();
        createOrEditRecurringPaymentScreen.getClass();
        this.dayOfCadenceMenu = dayOfCadenceMenu;
        this.previousRecurringPaymentScreen = createOrEditRecurringPaymentScreen;
        this.isDayPicker = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDayOfCadenceScreen)) {
            return false;
        }
        SelectDayOfCadenceScreen selectDayOfCadenceScreen = (SelectDayOfCadenceScreen) obj;
        return Intrinsics.areEqual(this.dayOfCadenceMenu, selectDayOfCadenceScreen.dayOfCadenceMenu) && Intrinsics.areEqual(this.previousRecurringPaymentScreen, selectDayOfCadenceScreen.previousRecurringPaymentScreen) && this.isDayPicker == selectDayOfCadenceScreen.isDayPicker;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isDayPicker) + ((this.previousRecurringPaymentScreen.hashCode() + (this.dayOfCadenceMenu.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectDayOfCadenceScreen(dayOfCadenceMenu=");
        sb.append(this.dayOfCadenceMenu);
        sb.append(", previousRecurringPaymentScreen=");
        sb.append(this.previousRecurringPaymentScreen);
        sb.append(", isDayPicker=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isDayPicker, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.dayOfCadenceMenu, i);
        this.previousRecurringPaymentScreen.writeToParcel(parcel, i);
        parcel.writeInt(this.isDayPicker ? 1 : 0);
    }
}
