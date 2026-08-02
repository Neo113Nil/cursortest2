package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.music.screens.MusicScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotFeedbackQuestion implements Question {
    public static final Parcelable.Creator<MoneybotFeedbackQuestion> CREATOR = new MusicScreen.Creator(9);
    public final ThumbDirection direction;
    public final String messageId;
    public final ThumbDirection previousDirection;
    public final String sessionId;

    public MoneybotFeedbackQuestion(String str, String str2, ThumbDirection thumbDirection, ThumbDirection thumbDirection2) {
        str2.getClass();
        thumbDirection.getClass();
        this.sessionId = str;
        this.messageId = str2;
        this.direction = thumbDirection;
        this.previousDirection = thumbDirection2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotFeedbackQuestion)) {
            return false;
        }
        MoneybotFeedbackQuestion moneybotFeedbackQuestion = (MoneybotFeedbackQuestion) obj;
        return Intrinsics.areEqual(this.sessionId, moneybotFeedbackQuestion.sessionId) && Intrinsics.areEqual(this.messageId, moneybotFeedbackQuestion.messageId) && this.direction == moneybotFeedbackQuestion.direction && this.previousDirection == moneybotFeedbackQuestion.previousDirection;
    }

    public final int hashCode() {
        String str = this.sessionId;
        int hashCode = (this.direction.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.messageId)) * 31;
        ThumbDirection thumbDirection = this.previousDirection;
        return hashCode + (thumbDirection != null ? thumbDirection.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotFeedbackQuestion(sessionId=", this.sessionId, ", messageId=", this.messageId, ", direction=");
        m.append(this.direction);
        m.append(", previousDirection=");
        m.append(this.previousDirection);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.sessionId);
        parcel.writeString(this.messageId);
        parcel.writeString(this.direction.name());
        ThumbDirection thumbDirection = this.previousDirection;
        if (thumbDirection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(thumbDirection.name());
        }
    }
}
