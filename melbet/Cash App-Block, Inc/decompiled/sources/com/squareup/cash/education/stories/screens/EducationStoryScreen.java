package com.squareup.cash.education.stories.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class EducationStoryScreen implements Screen {
    public static final Parcelable.Creator<EducationStoryScreen> CREATOR = new AddPayerCustomersScreen.Creator(22);
    public final ColorModel accentColor;
    public final List backgroundColors;
    public final Screen clientRouteExitScreen;
    public final int initialSceneIndex;
    public final String storyUrl;

    public EducationStoryScreen(String str, List list, int i, Screen screen, ColorModel colorModel) {
        str.getClass();
        list.getClass();
        this.storyUrl = str;
        this.backgroundColors = list;
        this.initialSceneIndex = i;
        this.clientRouteExitScreen = screen;
        this.accentColor = colorModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationStoryScreen)) {
            return false;
        }
        EducationStoryScreen educationStoryScreen = (EducationStoryScreen) obj;
        return Intrinsics.areEqual(this.storyUrl, educationStoryScreen.storyUrl) && Intrinsics.areEqual(this.backgroundColors, educationStoryScreen.backgroundColors) && this.initialSceneIndex == educationStoryScreen.initialSceneIndex && Intrinsics.areEqual(this.clientRouteExitScreen, educationStoryScreen.clientRouteExitScreen) && Intrinsics.areEqual(this.accentColor, educationStoryScreen.accentColor);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.initialSceneIndex, Recorder$$ExternalSyntheticOutline2.m(this.storyUrl.hashCode() * 31, 31, this.backgroundColors), 31);
        Screen screen = this.clientRouteExitScreen;
        int hashCode = (m + (screen == null ? 0 : screen.hashCode())) * 31;
        ColorModel colorModel = this.accentColor;
        return hashCode + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("EducationStoryScreen(storyUrl=", this.storyUrl, ", backgroundColors=", ", initialSceneIndex=", this.backgroundColors);
        m.append(this.initialSceneIndex);
        m.append(", clientRouteExitScreen=");
        m.append(this.clientRouteExitScreen);
        m.append(", accentColor=");
        return SVG$Unit$EnumUnboxingLocalUtility.m(m, this.accentColor, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.storyUrl);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.backgroundColors, parcel);
        while (m.hasNext()) {
            parcel.writeInt(((Number) m.next()).intValue());
        }
        parcel.writeInt(this.initialSceneIndex);
        parcel.writeParcelable(this.clientRouteExitScreen, i);
        parcel.writeParcelable(this.accentColor, i);
    }

    public /* synthetic */ EducationStoryScreen(String str, List list, BitcoinHome bitcoinHome, int i) {
        this(str, list, 0, bitcoinHome, (i & 16) != 0 ? null : ColorModel.Bitcoin.INSTANCE);
    }
}
