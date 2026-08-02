package com.squareup.cash.limits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.limits.screens.LimitsScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LimitsSectionScreen implements Screen {
    public static final Parcelable.Creator<LimitsSectionScreen> CREATOR = new LimitsScreen.Creator(3);
    public final LimitsSectionData sectionData;

    public LimitsSectionScreen(LimitsSectionData limitsSectionData) {
        limitsSectionData.getClass();
        this.sectionData = limitsSectionData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LimitsSectionScreen) && Intrinsics.areEqual(this.sectionData, ((LimitsSectionScreen) obj).sectionData);
    }

    public final int hashCode() {
        return this.sectionData.hashCode();
    }

    public final String toString() {
        return "LimitsSectionScreen(sectionData=" + this.sectionData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.sectionData.writeToParcel(parcel, i);
    }
}
