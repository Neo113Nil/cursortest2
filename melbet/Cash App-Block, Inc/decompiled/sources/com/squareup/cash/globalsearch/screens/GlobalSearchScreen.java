package com.squareup.cash.globalsearch.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.fileupload.api.UriString;

/* loaded from: classes.dex */
public final class GlobalSearchScreen implements Screen, RestoringScreen {
    public static final Parcelable.Creator<GlobalSearchScreen> CREATOR = new UriString.Creator(11);
    public final boolean isActivityOnlySearch;
    public final SearchOrigin searchOrigin;

    public GlobalSearchScreen(SearchOrigin searchOrigin, boolean z) {
        searchOrigin.getClass();
        this.searchOrigin = searchOrigin;
        this.isActivityOnlySearch = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchScreen)) {
            return false;
        }
        GlobalSearchScreen globalSearchScreen = (GlobalSearchScreen) obj;
        return this.searchOrigin == globalSearchScreen.searchOrigin && this.isActivityOnlySearch == globalSearchScreen.isActivityOnlySearch;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isActivityOnlySearch) + (this.searchOrigin.hashCode() * 31);
    }

    public final String toString() {
        return "GlobalSearchScreen(searchOrigin=" + this.searchOrigin + ", isActivityOnlySearch=" + this.isActivityOnlySearch + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.searchOrigin.name());
        parcel.writeInt(this.isActivityOnlySearch ? 1 : 0);
    }
}
