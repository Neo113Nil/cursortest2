package com.squareup.cash.common.messaging.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.screens.AccentedScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FailureMessageScreen implements DialogScreen, AccentedScreen {
    public static final Parcelable.Creator<FailureMessageScreen> CREATOR = new RoutingParams.Creator(21);
    public final ColorModel accentColor;
    public final Screen currentScreen;
    public final String dismissButtonText;
    public final String message;
    public final String title;

    public FailureMessageScreen(String str, String str2, String str3, Screen screen, ColorModel colorModel) {
        str2.getClass();
        screen.getClass();
        this.title = str;
        this.message = str2;
        this.dismissButtonText = str3;
        this.currentScreen = screen;
        this.accentColor = colorModel;
        if (screen instanceof BlockersScreens) {
            a$$ExternalSyntheticBUOutline0.m$3("FailureMessageScreen should not be used on top of BlockersScreens; use FailureMessageBlockerScreen instead");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailureMessageScreen)) {
            return false;
        }
        FailureMessageScreen failureMessageScreen = (FailureMessageScreen) obj;
        return Intrinsics.areEqual(this.title, failureMessageScreen.title) && Intrinsics.areEqual(this.message, failureMessageScreen.message) && Intrinsics.areEqual(this.dismissButtonText, failureMessageScreen.dismissButtonText) && Intrinsics.areEqual(this.currentScreen, failureMessageScreen.currentScreen) && Intrinsics.areEqual(this.accentColor, failureMessageScreen.accentColor);
    }

    @Override // com.squareup.cash.screens.AccentedScreen
    public final ColorModel getAccentColor() {
        return this.accentColor;
    }

    public final int hashCode() {
        String str = this.title;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
        String str2 = this.dismissButtonText;
        int m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.currentScreen, (m + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ColorModel colorModel = this.accentColor;
        return m2 + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FailureMessageScreen(title=██, message=██, dismissButtonText=");
        sb.append(this.dismissButtonText);
        sb.append(", currentScreen=");
        sb.append(this.currentScreen);
        sb.append(", accentColor=");
        return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.dismissButtonText);
        parcel.writeParcelable(this.currentScreen, i);
        parcel.writeParcelable(this.accentColor, i);
    }

    public /* synthetic */ FailureMessageScreen(String str, String str2, String str3, Screen screen, ColorModel.Icon icon, int i) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, screen, (i & 16) != 0 ? null : icon);
    }
}
