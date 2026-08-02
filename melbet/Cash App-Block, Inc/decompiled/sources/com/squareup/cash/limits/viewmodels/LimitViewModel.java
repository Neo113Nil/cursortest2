package com.squareup.cash.limits.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LimitViewModel {
    public final ColorModel accentColor;
    public final List categories;
    public final String description;
    public final LimitsSectionType sectionType;
    public final String title;

    public LimitViewModel(String str, List list, ColorModel colorModel, LimitsSectionType limitsSectionType, String str2) {
        list.getClass();
        limitsSectionType.getClass();
        this.title = str;
        this.categories = list;
        this.accentColor = colorModel;
        this.sectionType = limitsSectionType;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitViewModel)) {
            return false;
        }
        LimitViewModel limitViewModel = (LimitViewModel) obj;
        return Intrinsics.areEqual(this.title, limitViewModel.title) && Intrinsics.areEqual(this.categories, limitViewModel.categories) && this.accentColor.equals(limitViewModel.accentColor) && this.sectionType == limitViewModel.sectionType && Intrinsics.areEqual(this.description, limitViewModel.description);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (this.sectionType.hashCode() + ((this.accentColor.hashCode() + Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.categories)) * 31)) * 31;
        String str2 = this.description;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("LimitViewModel(title=", this.title, ", categories=", ", accentColor=", this.categories);
        m.append(this.accentColor);
        m.append(", sectionType=");
        m.append(this.sectionType);
        m.append(", description=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.description, ")");
    }
}
