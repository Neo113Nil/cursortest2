package com.squareup.cash.banking.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class RecurringDepositsFirstTimeUserViewModel {
    public final String continueButtonLabel;
    public final List infoSections;
    public final String subtitle;
    public final String title;

    public final class InfoSection {
        public final String description;
        public final Icon icon;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Icon {
            public static final /* synthetic */ Icon[] $VALUES;
            public static final Icon CIRCULAR_ARROWS;
            public static final Icon PENCIL;

            static {
                Icon icon = new Icon("CIRCULAR_ARROWS", 0);
                CIRCULAR_ARROWS = icon;
                Icon icon2 = new Icon("PENCIL", 1);
                PENCIL = icon2;
                $VALUES = new Icon[]{icon, icon2};
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public InfoSection(String str, String str2, Icon icon) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.description = str2;
            this.icon = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoSection)) {
                return false;
            }
            InfoSection infoSection = (InfoSection) obj;
            return Intrinsics.areEqual(this.title, infoSection.title) && Intrinsics.areEqual(this.description, infoSection.description) && this.icon == infoSection.icon;
        }

        public final int hashCode() {
            return this.icon.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InfoSection(title=", this.title, ", description=", this.description, ", icon=");
            m.append(this.icon);
            m.append(")");
            return m.toString();
        }
    }

    public RecurringDepositsFirstTimeUserViewModel(String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.title = str;
        this.subtitle = str2;
        this.continueButtonLabel = str3;
        this.infoSections = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringDepositsFirstTimeUserViewModel)) {
            return false;
        }
        RecurringDepositsFirstTimeUserViewModel recurringDepositsFirstTimeUserViewModel = (RecurringDepositsFirstTimeUserViewModel) obj;
        return Intrinsics.areEqual(this.title, recurringDepositsFirstTimeUserViewModel.title) && Intrinsics.areEqual(this.subtitle, recurringDepositsFirstTimeUserViewModel.subtitle) && Intrinsics.areEqual(this.continueButtonLabel, recurringDepositsFirstTimeUserViewModel.continueButtonLabel) && Intrinsics.areEqual(this.infoSections, recurringDepositsFirstTimeUserViewModel.infoSections);
    }

    public final int hashCode() {
        return this.infoSections.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.continueButtonLabel);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecurringDepositsFirstTimeUserViewModel(title=", this.title, ", subtitle=", this.subtitle, ", continueButtonLabel=");
        m.append(this.continueButtonLabel);
        m.append(", infoSections=");
        m.append(this.infoSections);
        m.append(")");
        return m.toString();
    }
}
