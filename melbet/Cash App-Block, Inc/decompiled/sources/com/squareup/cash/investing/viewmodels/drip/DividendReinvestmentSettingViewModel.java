package com.squareup.cash.investing.viewmodels.drip;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DividendReinvestmentSettingViewModel {
    public final String ctaLabel;
    public final String disclosure;
    public final String message;
    public final List sections;
    public final String title;

    public final class Entry {
        public final boolean checked;
        public final String label;
        public final String subLabel;

        public Entry(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.label = str;
            this.subLabel = str2;
            this.checked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return Intrinsics.areEqual(this.label, entry.label) && Intrinsics.areEqual(this.subLabel, entry.subLabel) && this.checked == entry.checked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checked) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.subLabel);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Entry(label=", this.label, ", subLabel=", this.subLabel, ", checked="), this.checked, ")");
        }
    }

    public final class Section {
        public final List entries;

        public Section(List list) {
            list.getClass();
            this.entries = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Section) && Intrinsics.areEqual(this.entries, ((Section) obj).entries);
        }

        public final int hashCode() {
            return this.entries.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Section(entries=", ")", this.entries);
        }
    }

    public DividendReinvestmentSettingViewModel(String str, String str2, String str3, String str4, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.title = str;
        this.message = str2;
        this.ctaLabel = str3;
        this.sections = list;
        this.disclosure = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DividendReinvestmentSettingViewModel)) {
            return false;
        }
        DividendReinvestmentSettingViewModel dividendReinvestmentSettingViewModel = (DividendReinvestmentSettingViewModel) obj;
        return Intrinsics.areEqual(this.title, dividendReinvestmentSettingViewModel.title) && Intrinsics.areEqual(this.message, dividendReinvestmentSettingViewModel.message) && Intrinsics.areEqual(this.ctaLabel, dividendReinvestmentSettingViewModel.ctaLabel) && Intrinsics.areEqual(this.sections, dividendReinvestmentSettingViewModel.sections) && this.disclosure.equals(dividendReinvestmentSettingViewModel.disclosure);
    }

    public final int hashCode() {
        return this.disclosure.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.ctaLabel), 31, this.sections);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DividendReinvestmentSettingViewModel(title=", this.title, ", message=", this.message, ", ctaLabel=");
        NavAction$$ExternalSyntheticOutline0.m(this.ctaLabel, ", sections=", ", disclosure=", m, this.sections);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.disclosure, ")");
    }
}
