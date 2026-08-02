package app.cash.local.viewmodels;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCheckoutPaymentTimingViewModel {
    public final List options;
    public final Option selectedOption;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Option {
        public static final /* synthetic */ Option[] $VALUES;
        public static final Option PAY_AT_END;
        public static final Option PAY_NOW;

        static {
            Option option = new Option("PAY_AT_END", 0);
            PAY_AT_END = option;
            Option option2 = new Option("PAY_NOW", 1);
            PAY_NOW = option2;
            $VALUES = new Option[]{option, option2};
        }

        public static Option valueOf(String str) {
            return (Option) Enum.valueOf(Option.class, str);
        }

        public static Option[] values() {
            return (Option[]) $VALUES.clone();
        }
    }

    public final class OptionViewModel {
        public final Option option;

        public OptionViewModel(Option option) {
            this.option = option;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OptionViewModel) && this.option == ((OptionViewModel) obj).option;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (this.option.hashCode() * 31);
        }

        public final String toString() {
            return "OptionViewModel(option=" + this.option + ", enabled=true)";
        }
    }

    public LocalCheckoutPaymentTimingViewModel(Option option, List list) {
        option.getClass();
        list.getClass();
        this.selectedOption = option;
        this.options = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutPaymentTimingViewModel)) {
            return false;
        }
        LocalCheckoutPaymentTimingViewModel localCheckoutPaymentTimingViewModel = (LocalCheckoutPaymentTimingViewModel) obj;
        return this.selectedOption == localCheckoutPaymentTimingViewModel.selectedOption && Intrinsics.areEqual(this.options, localCheckoutPaymentTimingViewModel.options);
    }

    public final int hashCode() {
        return this.options.hashCode() + (this.selectedOption.hashCode() * 31);
    }

    public final String toString() {
        return "LocalCheckoutPaymentTimingViewModel(selectedOption=" + this.selectedOption + ", options=" + this.options + ")";
    }
}
