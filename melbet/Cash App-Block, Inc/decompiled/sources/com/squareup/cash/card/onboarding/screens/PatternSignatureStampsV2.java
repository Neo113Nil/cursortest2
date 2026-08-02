package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PatternSignatureStampsV2 implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<PatternSignatureStampsV2> CREATOR = new CheckCaptureQuestion.Creator(5);
    public final List availableStamps;
    public final AskedQuestion question;

    public PatternSignatureStampsV2(List list, AskedQuestion askedQuestion) {
        list.getClass();
        askedQuestion.getClass();
        this.availableStamps = list;
        this.question = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternSignatureStampsV2)) {
            return false;
        }
        PatternSignatureStampsV2 patternSignatureStampsV2 = (PatternSignatureStampsV2) obj;
        return Intrinsics.areEqual(this.availableStamps, patternSignatureStampsV2.availableStamps) && Intrinsics.areEqual(this.question, patternSignatureStampsV2.question);
    }

    public final int hashCode() {
        return this.question.hashCode() + (this.availableStamps.hashCode() * 31);
    }

    public final String toString() {
        return "PatternSignatureStampsV2(availableStamps=" + this.availableStamps + ", question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStringList(this.availableStamps);
        parcel.writeParcelable(this.question, i);
    }
}
