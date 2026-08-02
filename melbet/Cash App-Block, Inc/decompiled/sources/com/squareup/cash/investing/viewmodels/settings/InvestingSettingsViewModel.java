package com.squareup.cash.investing.viewmodels.settings;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.DropMode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingSettingsViewModel {
    public final List sections;
    public final String title;

    /* loaded from: classes9.dex */
    public final class Entry {
        public final String actionDescription;
        public final String label;
        public final DropMode subLabel;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1167type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes6.dex */
        public final class Type {
            public static final /* synthetic */ Type[] $VALUES;
            public static final Type DIVIDEND_REINVESTMENT;
            public static final Type NOTIFICATIONS;

            static {
                Type type2 = new Type("NOTIFICATIONS", 0);
                NOTIFICATIONS = type2;
                Type type3 = new Type("DIVIDEND_REINVESTMENT", 1);
                DIVIDEND_REINVESTMENT = type3;
                $VALUES = new Type[]{type2, type3, new Type("AUTO_INVEST", 2)};
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Entry(Type type2, String str, DropMode dropMode, String str2) {
            str.getClass();
            str2.getClass();
            this.f1167type = type2;
            this.label = str;
            this.subLabel = dropMode;
            this.actionDescription = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f1167type == entry.f1167type && Intrinsics.areEqual(this.label, entry.label) && Intrinsics.areEqual(this.subLabel, entry.subLabel) && Intrinsics.areEqual(this.actionDescription, entry.actionDescription);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f1167type.hashCode() * 31, 31, this.label);
            DropMode dropMode = this.subLabel;
            return this.actionDescription.hashCode() + ((m + (dropMode == null ? 0 : dropMode.hashCode())) * 31);
        }

        public final String toString() {
            return "Entry(type=" + this.f1167type + ", label=" + this.label + ", subLabel=" + this.subLabel + ", actionDescription=" + this.actionDescription + ")";
        }
    }

    public final class Section {
        public final List entries;
        public final String title;

        public Section(String str, List list) {
            str.getClass();
            list.getClass();
            this.title = str;
            this.entries = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.entries, section.entries);
        }

        public final int hashCode() {
            return this.entries.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Section(title=", this.title, ", entries=", ")", this.entries);
        }
    }

    public InvestingSettingsViewModel(String str, List list) {
        str.getClass();
        this.title = str;
        this.sections = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingSettingsViewModel)) {
            return false;
        }
        InvestingSettingsViewModel investingSettingsViewModel = (InvestingSettingsViewModel) obj;
        return Intrinsics.areEqual(this.title, investingSettingsViewModel.title) && this.sections.equals(investingSettingsViewModel.sections);
    }

    public final int hashCode() {
        return this.sections.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("InvestingSettingsViewModel(title=", this.title, ", sections=", ")", this.sections);
    }
}
