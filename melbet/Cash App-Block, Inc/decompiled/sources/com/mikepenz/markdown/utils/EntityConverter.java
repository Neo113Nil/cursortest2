package com.mikepenz.markdown.utils;

import kotlin.text.Regex;

/* loaded from: classes9.dex */
public abstract class EntityConverter {
    public static final Regex REGEX_ESCAPES;

    static {
        String pattern = new Regex("&(?:([a-zA-Z0-9]+)|#([0-9]{1,8})|#[xX]([a-fA-F0-9]{1,8}));|([\"&<>])").nativePattern.pattern();
        pattern.getClass();
        REGEX_ESCAPES = new Regex(pattern.concat("|\\\\([!\"#\\$%&'\\(\\)\\*\\+,\\-.\\/:;<=>\\?@\\[\\\\\\]\\^_`{\\|}~])"));
    }
}
