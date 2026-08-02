package com.squareup.cash.investing.viewmodels.drip;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DividendReinvestmentWelcomeViewModel {
    public final String ctaLabel;
    public final String disclaimerText;
    public final List sections;
    public final String title;

    public final class Section {
        public final Icon icon;
        public final String subtitle;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Icon {
            public static final /* synthetic */ Icon[] $VALUES;
            public static final Icon BULLET_POINT;
            public static final Icon UP_AND_DOWN_ARROW;

            static {
                Icon icon = new Icon("UP_AND_DOWN_ARROW", 0);
                UP_AND_DOWN_ARROW = icon;
                Icon icon2 = new Icon("BULLET_POINT", 1);
                BULLET_POINT = icon2;
                $VALUES = new Icon[]{icon, icon2};
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public Section(String str, String str2, Icon icon) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
            this.icon = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.subtitle, section.subtitle) && this.icon == section.icon;
        }

        public final int hashCode() {
            return this.icon.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Section(title=", this.title, ", subtitle=", this.subtitle, ", icon=");
            m.append(this.icon);
            m.append(")");
            return m.toString();
        }
    }

    public DividendReinvestmentWelcomeViewModel(String str, String str2, String str3, List list) {
        str.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        this.title = str;
        this.sections = list;
        this.disclaimerText = str2;
        this.ctaLabel = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DividendReinvestmentWelcomeViewModel)) {
            return false;
        }
        DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel = (DividendReinvestmentWelcomeViewModel) obj;
        return Intrinsics.areEqual(this.title, dividendReinvestmentWelcomeViewModel.title) && Intrinsics.areEqual(this.sections, dividendReinvestmentWelcomeViewModel.sections) && Intrinsics.areEqual(this.disclaimerText, dividendReinvestmentWelcomeViewModel.disclaimerText) && Intrinsics.areEqual(this.ctaLabel, dividendReinvestmentWelcomeViewModel.ctaLabel);
    }

    public final int hashCode() {
        return this.ctaLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.sections), 31, this.disclaimerText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("DividendReinvestmentWelcomeViewModel(title=", this.title, ", sections=", ", disclaimerText=", this.sections), this.disclaimerText, ", ctaLabel=", this.ctaLabel, ")");
    }
}
