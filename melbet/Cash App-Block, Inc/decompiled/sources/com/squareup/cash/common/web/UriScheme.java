package com.squareup.cash.common.web;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class UriScheme {
    public static final /* synthetic */ UriScheme[] $VALUES = {new UriScheme("HTTP", 0), new UriScheme("HTTPS", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    UriScheme EF5;

    public static UriScheme valueOf(String str) {
        return (UriScheme) Enum.valueOf(UriScheme.class, str);
    }

    public static UriScheme[] values() {
        return (UriScheme[]) $VALUES.clone();
    }
}
