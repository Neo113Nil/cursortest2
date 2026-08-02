package com.squareup.cash.prepurchasecashcard.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.pdf.screen.PdfScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen> CREATOR = new PdfScreen.Creator(23);
    public final Parent parent;

    public interface Parent extends Screen {
        Parent copyWithOrWithoutSheet(boolean z);

        PrepurchaseCashCardScreen$PrepurchaseSurface getPrepurchaseSurface();
    }

    public PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen(Parent parent) {
        parent.getClass();
        this.parent = parent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen) && Intrinsics.areEqual(this.parent, ((PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen) obj).parent);
    }

    public final int hashCode() {
        return this.parent.hashCode();
    }

    public final String toString() {
        return "PrepurchaseCashCardPlanningSheetScreen(parent=" + this.parent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.parent, i);
    }
}
