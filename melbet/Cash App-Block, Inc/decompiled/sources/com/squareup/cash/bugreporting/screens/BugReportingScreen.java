package com.squareup.cash.bugreporting.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BugReportingScreen implements Screen {
    public static final Parcelable.Creator<BugReportingScreen> CREATOR = new BorrowLimitHub.Creator(5);
    public final List screenshots;

    public BugReportingScreen(List list) {
        list.getClass();
        this.screenshots = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BugReportingScreen) && Intrinsics.areEqual(this.screenshots, ((BugReportingScreen) obj).screenshots);
    }

    public final int hashCode() {
        return this.screenshots.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("BugReportingScreen(screenshots=", ")", this.screenshots);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.screenshots, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
