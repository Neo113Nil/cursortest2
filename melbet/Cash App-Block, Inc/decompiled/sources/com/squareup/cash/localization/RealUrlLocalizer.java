package com.squareup.cash.localization;

import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* loaded from: classes.dex */
public final class RealUrlLocalizer {
    public static final Regex REGEX_COUNTRY;
    public static final Regex REGEX_LOCALE;
    public final RealLocaleManager localeManager;

    static {
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        REGEX_COUNTRY = new Regex("[a-z]{2}", regexOption);
        REGEX_LOCALE = new Regex("[a-z]{2}-[a-z]{2}", regexOption);
    }

    public RealUrlLocalizer(RealLocaleManager realLocaleManager) {
        this.localeManager = realLocaleManager;
    }
}
