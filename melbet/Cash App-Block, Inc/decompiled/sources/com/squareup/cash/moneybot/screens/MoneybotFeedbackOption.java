package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.music.screens.MusicScreen;

/* loaded from: classes6.dex */
public interface MoneybotFeedbackOption extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Negative implements MoneybotFeedbackOption {
        public static final /* synthetic */ Negative[] $VALUES;
        public static final Negative CONFUSING;
        public static final Parcelable.Creator<Negative> CREATOR;
        public static final Negative FEATURE_REQUEST;
        public static final Negative INACCURATE;
        public static final Negative INAPPROPRIATE;
        public static final Negative OTHER;
        public static final Negative TOOK_TOO_LONG;
        public static final Negative UNHELPFUL;

        static {
            Negative negative = new Negative("INACCURATE", 0);
            INACCURATE = negative;
            Negative negative2 = new Negative("CONFUSING", 1);
            CONFUSING = negative2;
            Negative negative3 = new Negative("TOOK_TOO_LONG", 2);
            TOOK_TOO_LONG = negative3;
            Negative negative4 = new Negative("INAPPROPRIATE", 3);
            INAPPROPRIATE = negative4;
            Negative negative5 = new Negative("UNHELPFUL", 4);
            UNHELPFUL = negative5;
            Negative negative6 = new Negative("OTHER", 5);
            OTHER = negative6;
            Negative negative7 = new Negative("FEATURE_REQUEST", 6);
            FEATURE_REQUEST = negative7;
            $VALUES = new Negative[]{negative, negative2, negative3, negative4, negative5, negative6, negative7};
            CREATOR = new MusicScreen.Creator(7);
        }

        public static Negative valueOf(String str) {
            return (Negative) Enum.valueOf(Negative.class, str);
        }

        public static Negative[] values() {
            return (Negative[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Positive implements MoneybotFeedbackOption {
        public static final /* synthetic */ Positive[] $VALUES;
        public static final Positive ACCURATE;
        public static final Positive CLEAR;
        public static final Parcelable.Creator<Positive> CREATOR;
        public static final Positive FAST;
        public static final Positive HELPFUL;
        public static final Positive OTHER;

        static {
            Positive positive = new Positive("ACCURATE", 0);
            ACCURATE = positive;
            Positive positive2 = new Positive("CLEAR", 1);
            CLEAR = positive2;
            Positive positive3 = new Positive("FAST", 2);
            FAST = positive3;
            Positive positive4 = new Positive("HELPFUL", 3);
            HELPFUL = positive4;
            Positive positive5 = new Positive("OTHER", 4);
            OTHER = positive5;
            $VALUES = new Positive[]{positive, positive2, positive3, positive4, positive5, new Positive("FEATURE_REQUEST", 5)};
            CREATOR = new MusicScreen.Creator(8);
        }

        public static Positive valueOf(String str) {
            return (Positive) Enum.valueOf(Positive.class, str);
        }

        public static Positive[] values() {
            return (Positive[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(name());
        }
    }
}
