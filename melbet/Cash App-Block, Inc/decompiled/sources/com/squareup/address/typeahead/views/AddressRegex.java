package com.squareup.address.typeahead.views;

import com.squareup.protos.common.countries.Country;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* loaded from: classes5.dex */
public abstract class AddressRegex {
    public static final Regex ADDRESS_REGEX_AU = new Regex("^([' a-zA-Z]+)[, ]+([a-zA-Z]{2,})[, ]+([0-9]{4}) *$");
    public static final Regex ADDRESS_REGEX_CA;
    public static final Regex ADDRESS_REGEX_GB;
    public static final Regex ADDRESS_REGEX_IE;
    public static final Regex ADDRESS_REGEX_MX;
    public static final Regex ADDRESS_REGEX_US;
    public static final Regex STREET_ADDRESS_PATTERN;
    public static final Regex STREET_ADDRESS_PATTERN_GB_IE;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Country.values().length];
            try {
                iArr[Country.GB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Country.IE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        ADDRESS_REGEX_CA = new Regex("^([' \\p{L}]+)[, ]+([a-zA-Z]{2,})[, ]+([ABCEGHJKLMNPRSTVXY]\\d[ABCEGHJKLMNPRSTVWXYZ]( )?\\d[ABCEGHJKLMNPRSTVWXYZ]\\d) *$", regexOption);
        ADDRESS_REGEX_GB = new Regex("^([' a-zA-Z]+)[, ]+([a-zA-Z]{2,})?[, ]+([A-Z]{1,2}[0-9][0-9A-Z]?[ ]?[0-9][A-Z]{2}) *$", regexOption);
        ADDRESS_REGEX_IE = new Regex("^(([-' a-zA-Z0-9.]+)[, ]+){1,2}(([ACDEFHKNPRTVWXY]{1}[0-9]{2}|D6W){1}[ ]?[ACDEFHKNPRTVWXY0-9]{4})? *$", regexOption);
        ADDRESS_REGEX_US = new Regex("^([-' a-zA-Z.]+)[, ]+([a-zA-Z]{2,})[, ]+([0-9]{5}) *$");
        ADDRESS_REGEX_MX = new Regex("^([-' a-zA-Z\\u0080-\\u00ff.]+)[, ]+([a-zA-Z\\u0080-\\u00ff]{2,})[, ]+([0-9]{5}) *$");
        STREET_ADDRESS_PATTERN = new Regex("(?=.*\\p{L})(?=.*\\d)(?=.+ )[^,]{4,}");
        STREET_ADDRESS_PATTERN_GB_IE = new Regex("(?=.*[a-zA-Z]).{4,}");
    }
}
