package com.datadog.trace.api;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TracePropagationStyle {
    public static final /* synthetic */ TracePropagationStyle[] $VALUES;
    public static final TracePropagationStyle B3MULTI;
    public static final TracePropagationStyle B3SINGLE;
    public static final TracePropagationStyle DATADOG;
    public static final TracePropagationStyle HAYSTACK;
    public static final TracePropagationStyle TRACECONTEXT;
    public static final TracePropagationStyle XRAY;
    public String displayName;

    static {
        TracePropagationStyle tracePropagationStyle = new TracePropagationStyle("DATADOG", 0);
        DATADOG = tracePropagationStyle;
        TracePropagationStyle tracePropagationStyle2 = new TracePropagationStyle("B3SINGLE", 1);
        B3SINGLE = tracePropagationStyle2;
        TracePropagationStyle tracePropagationStyle3 = new TracePropagationStyle("B3MULTI", 2);
        B3MULTI = tracePropagationStyle3;
        TracePropagationStyle tracePropagationStyle4 = new TracePropagationStyle("HAYSTACK", 3);
        HAYSTACK = tracePropagationStyle4;
        TracePropagationStyle tracePropagationStyle5 = new TracePropagationStyle("XRAY", 4);
        XRAY = tracePropagationStyle5;
        TracePropagationStyle tracePropagationStyle6 = new TracePropagationStyle("TRACECONTEXT", 5);
        TRACECONTEXT = tracePropagationStyle6;
        $VALUES = new TracePropagationStyle[]{tracePropagationStyle, tracePropagationStyle2, tracePropagationStyle3, tracePropagationStyle4, tracePropagationStyle5, tracePropagationStyle6, new TracePropagationStyle("NONE", 6)};
    }

    public static TracePropagationStyle valueOf(String str) {
        return (TracePropagationStyle) Enum.valueOf(TracePropagationStyle.class, str);
    }

    public static TracePropagationStyle valueOfDisplayName(String str) {
        String replace = str.toUpperCase(Locale.US).replace(' ', '_');
        replace.getClass();
        return !replace.equals("B3_SINGLE_HEADER") ? !replace.equals("B3") ? valueOf(replace) : B3MULTI : B3SINGLE;
    }

    public static TracePropagationStyle[] values() {
        return (TracePropagationStyle[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        String str = this.displayName;
        if (str != null) {
            return str;
        }
        String replace = name().toLowerCase(Locale.ROOT).replace('_', ' ');
        this.displayName = replace;
        return replace;
    }
}
