package com.squareup.cash.common.web;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TelScheme {
    public static final /* synthetic */ TelScheme[] $VALUES = {new TelScheme("TEL", 0), new TelScheme("TEL_PROMPT", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    TelScheme EF5;

    public static TelScheme valueOf(String str) {
        return (TelScheme) Enum.valueOf(TelScheme.class, str);
    }

    public static TelScheme[] values() {
        return (TelScheme[]) $VALUES.clone();
    }
}
