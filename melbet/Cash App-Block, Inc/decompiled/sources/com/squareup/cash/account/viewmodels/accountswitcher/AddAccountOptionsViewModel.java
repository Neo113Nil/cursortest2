package com.squareup.cash.account.viewmodels.accountswitcher;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class AddAccountOptionsViewModel {

    public final class Loaded extends AddAccountOptionsViewModel {
        public final ArrayList accountOptions;

        public final class AccountOption {
            public final boolean isEnabled;
            public final OptionType optionType;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OptionType {
                public static final /* synthetic */ OptionType[] $VALUES;
                public static final OptionType Business;
                public static final OptionType Link;
                public static final OptionType Personal;

                static {
                    OptionType optionType = new OptionType("Personal", 0);
                    Personal = optionType;
                    OptionType optionType2 = new OptionType("Business", 1);
                    Business = optionType2;
                    OptionType optionType3 = new OptionType("Link", 2);
                    Link = optionType3;
                    $VALUES = new OptionType[]{optionType, optionType2, optionType3};
                }

                public static OptionType valueOf(String str) {
                    return (OptionType) Enum.valueOf(OptionType.class, str);
                }

                public static OptionType[] values() {
                    return (OptionType[]) $VALUES.clone();
                }
            }

            public AccountOption(OptionType optionType, boolean z) {
                optionType.getClass();
                this.optionType = optionType;
                this.isEnabled = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AccountOption)) {
                    return false;
                }
                AccountOption accountOption = (AccountOption) obj;
                return this.optionType == accountOption.optionType && this.isEnabled == accountOption.isEnabled;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isEnabled) + (this.optionType.hashCode() * 31);
            }

            public final String toString() {
                return "AccountOption(optionType=" + this.optionType + ", isEnabled=" + this.isEnabled + ")";
            }
        }

        public Loaded(ArrayList arrayList) {
            this.accountOptions = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.accountOptions.equals(((Loaded) obj).accountOptions);
        }

        public final int hashCode() {
            return this.accountOptions.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Loaded(accountOptions=", ")", this.accountOptions);
        }
    }

    public final class Loading extends AddAccountOptionsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 923222508;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
