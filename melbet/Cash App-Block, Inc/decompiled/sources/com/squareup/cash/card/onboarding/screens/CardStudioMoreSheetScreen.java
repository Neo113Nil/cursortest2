package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CardStudioMoreSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<CardStudioMoreSheetScreen> CREATOR = new BorrowLimitHub.Creator(28);
    public final String cashtag;
    public final boolean isShowingCashtag;
    public final boolean isShowingCashtagToggle;
    public final AskedQuestion question;

    public CardStudioMoreSheetScreen(String str, boolean z, boolean z2, AskedQuestion askedQuestion) {
        str.getClass();
        askedQuestion.getClass();
        this.cashtag = str;
        this.isShowingCashtag = z;
        this.isShowingCashtagToggle = z2;
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
        if (!(obj instanceof CardStudioMoreSheetScreen)) {
            return false;
        }
        CardStudioMoreSheetScreen cardStudioMoreSheetScreen = (CardStudioMoreSheetScreen) obj;
        return Intrinsics.areEqual(this.cashtag, cardStudioMoreSheetScreen.cashtag) && this.isShowingCashtag == cardStudioMoreSheetScreen.isShowingCashtag && this.isShowingCashtagToggle == cardStudioMoreSheetScreen.isShowingCashtagToggle && Intrinsics.areEqual(this.question, cardStudioMoreSheetScreen.question);
    }

    public final int hashCode() {
        return this.question.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cashtag.hashCode() * 31, 31, this.isShowingCashtag), 31, this.isShowingCashtagToggle);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("CardStudioMoreSheetScreen(cashtag=", this.cashtag, ", isShowingCashtag=", ", isShowingCashtagToggle=", this.isShowingCashtag);
        m1540m.append(this.isShowingCashtagToggle);
        m1540m.append(", question=");
        m1540m.append(this.question);
        m1540m.append(")");
        return m1540m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.cashtag);
        parcel.writeInt(this.isShowingCashtag ? 1 : 0);
        parcel.writeInt(this.isShowingCashtagToggle ? 1 : 0);
        parcel.writeParcelable(this.question, i);
    }
}
