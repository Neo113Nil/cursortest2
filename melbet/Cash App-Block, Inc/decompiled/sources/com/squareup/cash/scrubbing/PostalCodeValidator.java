package com.squareup.cash.scrubbing;

import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.protos.common.countries.Country;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class PostalCodeValidator {
    public final Country country;
    public static final Pattern AU_POSTAL_CODE = Pattern.compile("^(\\d{4})?$");
    public static final Pattern CA_POSTAL_CODE = Pattern.compile("^([ABCEGHJKLMNPRSTVXY]\\d[ABCEGHJKLMNPRSTVWXYZ]\\d[ABCEGHJKLMNPRSTVWXYZ]\\d)?$");
    public static final Pattern GB_POSTAL_CODE = Pattern.compile("^([Gg][Ii][Rr]0[Aa]{2})|((([A-Za-z][0-9]{1,2})|(([A-Za-z][A-Ha-hJ-Yj-y][0-9]{1,2})|(([A-Za-z][0-9][A-Za-z])|([A-Za-z][A-Ha-hJ-Yj-y][0-9]?[A-Za-z]))))[0-9][A-Za-z]{2})$");
    public static final Pattern US_POSTAL_CODE = Pattern.compile("^(\\d{5})(\\d{4})?$");
    public static final Pattern IE_POSTAL_CODE = Pattern.compile("([AC-FHKNPRTVW-Y]\\d{2}|D6W)[0-9AC-FHKNPRTVW-Y]{4}");
    public static final Pattern INVALID_CHARS_CA = Pattern.compile("[^ABCEGHJKLMNPRSTVWXYZ0-9]");
    public static final Pattern INVALID_CHARS_GB = Pattern.compile("[^A-Z0-9]");
    public static final Pattern INVALID_CHARS_US = Pattern.compile("[^0-9]");
    public static final Pattern INVALID_CHARS_IE = Pattern.compile("[^0-9AC-FHKNPRTVW-Y]");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State Incomplete;
        public static final State Invalid;
        public static final State Valid;

        static {
            State state = new State("Invalid", 0);
            Invalid = state;
            State state2 = new State("Incomplete", 1);
            Incomplete = state2;
            State state3 = new State("Valid", 2);
            Valid = state3;
            $VALUES = new State[]{state, state2, state3};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Country.values().length];
            try {
                iArr[Country.AU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Country.CA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Country.GB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Country.IE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Country.US.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PostalCodeValidator(Country country) {
        country.getClass();
        this.country = country;
    }

    public final int maxLength() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.country.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            return (i == 3 || i == 4) ? 7 : 5;
        }
        return 6;
    }

    public final State validate(String str) {
        Pattern pattern;
        Pattern pattern2;
        str.getClass();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        Country country = this.country;
        int i = iArr[country.ordinal()];
        int i2 = 5;
        if (i == 2) {
            pattern = INVALID_CHARS_CA;
            pattern.getClass();
        } else if (i == 3) {
            pattern = INVALID_CHARS_GB;
            pattern.getClass();
        } else if (i != 4) {
            pattern = INVALID_CHARS_US;
            if (i != 5) {
                pattern.getClass();
            } else {
                pattern.getClass();
            }
        } else {
            pattern = INVALID_CHARS_IE;
            pattern.getClass();
        }
        if (!pattern.matcher(str).find() && str.length() <= maxLength()) {
            int length = str.length();
            int i3 = iArr[country.ordinal()];
            if (i3 == 1) {
                i2 = 4;
            } else if (i3 == 2) {
                i2 = 6;
            } else if (i3 != 3 && i3 == 4) {
                i2 = 7;
            }
            if (length >= i2) {
                int i4 = iArr[country.ordinal()];
                if (i4 == 1) {
                    pattern2 = AU_POSTAL_CODE;
                    pattern2.getClass();
                } else if (i4 == 2) {
                    pattern2 = CA_POSTAL_CODE;
                    pattern2.getClass();
                } else if (i4 == 3) {
                    pattern2 = GB_POSTAL_CODE;
                    pattern2.getClass();
                } else if (i4 != 4) {
                    pattern2 = US_POSTAL_CODE;
                    pattern2.getClass();
                } else {
                    pattern2 = IE_POSTAL_CODE;
                    pattern2.getClass();
                }
                if (pattern2.matcher(str).matches()) {
                    return State.Valid;
                }
                if (str.length() == maxLength()) {
                    return State.Invalid;
                }
            }
            return ((Boolean) (iArr[country.ordinal()] == 2 ? new CalloutKt$$ExternalSyntheticLambda1(13) : new CalloutKt$$ExternalSyntheticLambda1(14)).invoke(str)).booleanValue() ? State.Incomplete : State.Invalid;
        }
        return State.Invalid;
    }
}
