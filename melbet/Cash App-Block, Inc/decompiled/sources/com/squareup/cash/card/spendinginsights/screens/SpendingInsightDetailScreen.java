package com.squareup.cash.card.spendinginsights.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.RestoringScreen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SpendingInsightDetailScreen implements SpendingInsightsScreen, RestoringScreen {
    public static final Parcelable.Creator<SpendingInsightDetailScreen> CREATOR = new CheckCaptureQuestion.Creator(10);
    public final String context;

    /* renamed from: type, reason: collision with root package name */
    public final String f1066type;

    public SpendingInsightDetailScreen(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f1066type = str;
        this.context = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpendingInsightDetailScreen)) {
            return false;
        }
        SpendingInsightDetailScreen spendingInsightDetailScreen = (SpendingInsightDetailScreen) obj;
        return Intrinsics.areEqual(this.f1066type, spendingInsightDetailScreen.f1066type) && Intrinsics.areEqual(this.context, spendingInsightDetailScreen.context);
    }

    public final int hashCode() {
        return this.context.hashCode() + (this.f1066type.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SpendingInsightDetailScreen(type=", this.f1066type, ", context=", this.context, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f1066type);
        parcel.writeString(this.context);
    }
}
