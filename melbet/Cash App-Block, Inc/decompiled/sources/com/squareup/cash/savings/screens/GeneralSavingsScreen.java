package com.squareup.cash.savings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class GeneralSavingsScreen implements RestoringScreen, SavingsScreen {
    public static final Parcelable.Creator<GeneralSavingsScreen> CREATOR = new Recipient.Creator(27);

    /* renamed from: type, reason: collision with root package name */
    public final SavingsScreen.ScreenType f1197type;

    public GeneralSavingsScreen(SavingsScreen.ScreenType screenType) {
        screenType.getClass();
        this.f1197type = screenType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GeneralSavingsScreen) && Intrinsics.areEqual(this.f1197type, ((GeneralSavingsScreen) obj).f1197type);
    }

    public final int hashCode() {
        return this.f1197type.hashCode();
    }

    public final String toString() {
        return "GeneralSavingsScreen(type=" + this.f1197type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f1197type, i);
    }
}
