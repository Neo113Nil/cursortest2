package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.music.screens.MusicScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class MoneybotFeedbackAnswer implements Parcelable {

    public final class Dismissed extends MoneybotFeedbackAnswer {
        public static final Parcelable.Creator<Dismissed> CREATOR = new MusicScreen.Creator(5);
        public final ThumbDirection direction;
        public final String messageId;
        public final String sessionId;

        public Dismissed(String str, String str2, ThumbDirection thumbDirection) {
            str2.getClass();
            thumbDirection.getClass();
            this.sessionId = str;
            this.messageId = str2;
            this.direction = thumbDirection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dismissed)) {
                return false;
            }
            Dismissed dismissed = (Dismissed) obj;
            return Intrinsics.areEqual(this.sessionId, dismissed.sessionId) && Intrinsics.areEqual(this.messageId, dismissed.messageId) && this.direction == dismissed.direction;
        }

        public final int hashCode() {
            String str = this.sessionId;
            return this.direction.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.messageId);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Dismissed(sessionId=", this.sessionId, ", messageId=", this.messageId, ", direction=");
            m.append(this.direction);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sessionId);
            parcel.writeString(this.messageId);
            parcel.writeString(this.direction.name());
        }
    }

    public final class Submitted extends MoneybotFeedbackAnswer {
        public static final Parcelable.Creator<Submitted> CREATOR = new MusicScreen.Creator(6);
        public final String comment;
        public final ThumbDirection direction;
        public final String messageId;
        public final MoneybotFeedbackOption option;
        public final String sessionId;

        public Submitted(String str, String str2, ThumbDirection thumbDirection, MoneybotFeedbackOption moneybotFeedbackOption, String str3) {
            str2.getClass();
            thumbDirection.getClass();
            str3.getClass();
            this.sessionId = str;
            this.messageId = str2;
            this.direction = thumbDirection;
            this.option = moneybotFeedbackOption;
            this.comment = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Submitted)) {
                return false;
            }
            Submitted submitted = (Submitted) obj;
            return Intrinsics.areEqual(this.sessionId, submitted.sessionId) && Intrinsics.areEqual(this.messageId, submitted.messageId) && this.direction == submitted.direction && Intrinsics.areEqual(this.option, submitted.option) && Intrinsics.areEqual(this.comment, submitted.comment);
        }

        public final int hashCode() {
            String str = this.sessionId;
            int hashCode = (this.direction.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.messageId)) * 31;
            MoneybotFeedbackOption moneybotFeedbackOption = this.option;
            return this.comment.hashCode() + ((hashCode + (moneybotFeedbackOption != null ? moneybotFeedbackOption.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Submitted(sessionId=", this.sessionId, ", messageId=", this.messageId, ", direction=");
            m.append(this.direction);
            m.append(", option=");
            m.append(this.option);
            m.append(", comment=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.comment, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sessionId);
            parcel.writeString(this.messageId);
            parcel.writeString(this.direction.name());
            parcel.writeParcelable(this.option, i);
            parcel.writeString(this.comment);
        }
    }
}
