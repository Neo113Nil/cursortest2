package com.squareup.cash.afterpayapplet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen> CREATOR = new ActivityScreen.Creator(16);
    public final AskedQuestion question;
    public final String upsellSheetProto;

    /* loaded from: classes5.dex */
    public final class ProductUpsellScrollQuestion implements Question {
        public static final ProductUpsellScrollQuestion INSTANCE = new ProductUpsellScrollQuestion();
        public static final Parcelable.Creator<ProductUpsellScrollQuestion> CREATOR = new ActivityScreen.Creator(17);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductUpsellScrollQuestion);
        }

        public final int hashCode() {
            return 310384122;
        }

        public final String toString() {
            return "ProductUpsellScrollQuestion";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen(String str, AskedQuestion askedQuestion) {
        str.getClass();
        this.upsellSheetProto = str;
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
        if (!(obj instanceof AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen)) {
            return false;
        }
        AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen afterpayAppletScreen$AfterpayAppletUpsellSheetScreen = (AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen) obj;
        return Intrinsics.areEqual(this.upsellSheetProto, afterpayAppletScreen$AfterpayAppletUpsellSheetScreen.upsellSheetProto) && Intrinsics.areEqual(this.question, afterpayAppletScreen$AfterpayAppletUpsellSheetScreen.question);
    }

    public final int hashCode() {
        int hashCode = this.upsellSheetProto.hashCode() * 31;
        AskedQuestion askedQuestion = this.question;
        return hashCode + (askedQuestion == null ? 0 : askedQuestion.hashCode());
    }

    public final String toString() {
        return "AfterpayAppletUpsellSheetScreen(upsellSheetProto=" + this.upsellSheetProto + ", question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.upsellSheetProto);
        parcel.writeParcelable(this.question, i);
    }
}
