package com.squareup.cash.investing.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PerformanceViewModel {
    public final List models;
    public final List sections;
    public final String title;

    public final class Section {
        public final com.squareup.protos.invest.ui.Section section;

        public Section(com.squareup.protos.invest.ui.Section section) {
            section.getClass();
            this.section = section;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Section) && Intrinsics.areEqual(this.section, ((Section) obj).section);
        }

        public final int hashCode() {
            return this.section.hashCode();
        }

        public final String toString() {
            return "Section(section=" + this.section + ")";
        }
    }

    public PerformanceViewModel(String str, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.title = str;
        this.models = list;
        this.sections = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceViewModel)) {
            return false;
        }
        PerformanceViewModel performanceViewModel = (PerformanceViewModel) obj;
        return Intrinsics.areEqual(this.title, performanceViewModel.title) && Intrinsics.areEqual(this.models, performanceViewModel.models) && Intrinsics.areEqual(this.sections, performanceViewModel.sections);
    }

    public final int hashCode() {
        return this.sections.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.models);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("PerformanceViewModel(title=", this.title, ", models=", ", sections=", this.models), this.sections, ")");
    }
}
