package com.squareup.cash.investing.viewmodels.ordertype.autoinvest;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class InvestingRecurringFrequencyPickerViewModel {

    public final class Content extends InvestingRecurringFrequencyPickerViewModel {
        public final String minPurchaseAmountMessage;
        public final NavigationIconType navigationType;
        public final List options;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class NavigationIconType {
            public static final /* synthetic */ NavigationIconType[] $VALUES;
            public static final NavigationIconType BACK;
            public static final NavigationIconType CLOSE;

            static {
                NavigationIconType navigationIconType = new NavigationIconType("CLOSE", 0);
                CLOSE = navigationIconType;
                NavigationIconType navigationIconType2 = new NavigationIconType("BACK", 1);
                BACK = navigationIconType2;
                $VALUES = new NavigationIconType[]{navigationIconType, navigationIconType2};
            }

            public static NavigationIconType valueOf(String str) {
                return (NavigationIconType) Enum.valueOf(NavigationIconType.class, str);
            }

            public static NavigationIconType[] values() {
                return (NavigationIconType[]) $VALUES.clone();
            }
        }

        public final class Option {
            public final InvestingFrequencyOption frequency;
            public final boolean isSelected;

            public Option(InvestingFrequencyOption investingFrequencyOption, boolean z) {
                this.frequency = investingFrequencyOption;
                this.isSelected = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Option)) {
                    return false;
                }
                Option option = (Option) obj;
                return this.frequency.equals(option.frequency) && this.isSelected == option.isSelected;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isSelected) + (this.frequency.hashCode() * 31);
            }

            public final String toString() {
                return "Option(frequency=" + this.frequency + ", isSelected=" + this.isSelected + ")";
            }
        }

        public Content(String str, List list, NavigationIconType navigationIconType) {
            this.minPurchaseAmountMessage = str;
            this.options = list;
            this.navigationType = navigationIconType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.minPurchaseAmountMessage.equals(content.minPurchaseAmountMessage) && this.options.equals(content.options) && this.navigationType == content.navigationType;
        }

        public final int hashCode() {
            return this.navigationType.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.minPurchaseAmountMessage.hashCode() * 31, 31, this.options);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Content(minPurchaseAmountMessage=", this.minPurchaseAmountMessage, ", options=", ", navigationType=", this.options);
            m.append(this.navigationType);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading extends InvestingRecurringFrequencyPickerViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1507249168;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
