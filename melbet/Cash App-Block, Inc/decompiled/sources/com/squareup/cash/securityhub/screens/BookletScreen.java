package com.squareup.cash.securityhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.screens.BoostDetailsScreen;

/* loaded from: classes.dex */
public final class BookletScreen implements Screen, RestoringScreen {
    public static final Parcelable.Creator<BookletScreen> CREATOR = new BoostDetailsScreen.Creator(21);
    public final BookletId bookletId;

    public BookletScreen(BookletId bookletId) {
        bookletId.getClass();
        this.bookletId = bookletId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BookletScreen) && this.bookletId == ((BookletScreen) obj).bookletId;
    }

    public final int hashCode() {
        return this.bookletId.hashCode();
    }

    public final String toString() {
        return "BookletScreen(bookletId=" + this.bookletId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.bookletId.writeToParcel(parcel, i);
    }
}
