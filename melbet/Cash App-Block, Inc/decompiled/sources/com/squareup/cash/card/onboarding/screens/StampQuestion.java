package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.Question;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StampQuestion implements Question {
    public static final Parcelable.Creator<StampQuestion> CREATOR = new CheckCaptureQuestion.Creator(7);
    public final List availableStamps;

    public StampQuestion(List list) {
        list.getClass();
        this.availableStamps = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StampQuestion) && Intrinsics.areEqual(this.availableStamps, ((StampQuestion) obj).availableStamps);
    }

    public final int hashCode() {
        return this.availableStamps.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("StampQuestion(availableStamps=", ")", this.availableStamps);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStringList(this.availableStamps);
    }
}
