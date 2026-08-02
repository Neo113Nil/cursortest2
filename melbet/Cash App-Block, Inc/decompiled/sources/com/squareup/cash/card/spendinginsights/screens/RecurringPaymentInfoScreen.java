package com.squareup.cash.card.spendinginsights.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.google.android.gms.common.zza;

/* loaded from: classes.dex */
public final class RecurringPaymentInfoScreen implements SpendingInsightsScreen, BottomSheetScreen {
    public static final RecurringPaymentInfoScreen INSTANCE = new RecurringPaymentInfoScreen();
    public static final Parcelable.Creator<RecurringPaymentInfoScreen> CREATOR = new zza(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
