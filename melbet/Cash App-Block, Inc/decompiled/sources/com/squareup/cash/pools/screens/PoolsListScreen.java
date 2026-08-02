package com.squareup.cash.pools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.pdf.screen.PdfScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PoolsListScreen implements Screen {
    public static final Parcelable.Creator<PoolsListScreen> CREATOR = new PdfScreen.Creator(12);
    public final AppletState appletState;
    public final String origin;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class AppletState {
        public static final /* synthetic */ AppletState[] $VALUES;
        public static final AppletState INSTALLED;
        public static final AppletState UNINSTALLED;
        public static final AppletState UNKNOWN;

        static {
            AppletState appletState = new AppletState("UNKNOWN", 0);
            UNKNOWN = appletState;
            AppletState appletState2 = new AppletState("INSTALLED", 1);
            INSTALLED = appletState2;
            AppletState appletState3 = new AppletState("UNINSTALLED", 2);
            UNINSTALLED = appletState3;
            $VALUES = new AppletState[]{appletState, appletState2, appletState3};
        }

        public static AppletState valueOf(String str) {
            return (AppletState) Enum.valueOf(AppletState.class, str);
        }

        public static AppletState[] values() {
            return (AppletState[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PoolsListScreen(String str, AppletState appletState, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? AppletState.UNKNOWN : appletState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolsListScreen)) {
            return false;
        }
        PoolsListScreen poolsListScreen = (PoolsListScreen) obj;
        return Intrinsics.areEqual(this.origin, poolsListScreen.origin) && this.appletState == poolsListScreen.appletState;
    }

    public final int hashCode() {
        String str = this.origin;
        return this.appletState.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PoolsListScreen(origin=" + this.origin + ", appletState=" + this.appletState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.origin);
        parcel.writeString(this.appletState.name());
    }

    public PoolsListScreen(String str, AppletState appletState) {
        appletState.getClass();
        this.origin = str;
        this.appletState = appletState;
    }
}
