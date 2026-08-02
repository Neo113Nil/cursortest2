package com.squareup.cash.education.stories.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class EducationStoryViewPagerScreen implements Screen {
    public static final Parcelable.Creator<EducationStoryViewPagerScreen> CREATOR = new AddPayerCustomersScreen.Creator(23);
    public final ColorModel accentColor;
    public final int initialStoryIndex;
    public final ArrayList stories;

    public EducationStoryViewPagerScreen(ArrayList arrayList, int i, ColorModel colorModel) {
        this.stories = arrayList;
        this.initialStoryIndex = i;
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
        if (!(obj instanceof EducationStoryViewPagerScreen)) {
            return false;
        }
        EducationStoryViewPagerScreen educationStoryViewPagerScreen = (EducationStoryViewPagerScreen) obj;
        return this.stories.equals(educationStoryViewPagerScreen.stories) && this.initialStoryIndex == educationStoryViewPagerScreen.initialStoryIndex && Intrinsics.areEqual(this.accentColor, educationStoryViewPagerScreen.accentColor);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.initialStoryIndex, this.stories.hashCode() * 31, 31);
        ColorModel colorModel = this.accentColor;
        return m + (colorModel == null ? 0 : colorModel.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationStoryViewPagerScreen(stories=");
        sb.append(this.stories);
        sb.append(", initialStoryIndex=");
        sb.append(this.initialStoryIndex);
        sb.append(", accentColor=");
        return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.stories, parcel);
        while (m.hasNext()) {
            ((EducationStoryScreen) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.initialStoryIndex);
        parcel.writeParcelable(this.accentColor, i);
    }
}
