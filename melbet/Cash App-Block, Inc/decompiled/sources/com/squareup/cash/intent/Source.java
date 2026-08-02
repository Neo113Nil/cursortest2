package com.squareup.cash.intent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Source {
    public static final /* synthetic */ Source[] $VALUES;
    public static final Source DEFERRED_DEEP_LINK;
    public static final Source IN_APP_SCANNER;

    static {
        Source source = new Source("IN_APP_SCANNER", 0);
        IN_APP_SCANNER = source;
        Source source2 = new Source("EXTERNAL_DEEP_LINK", 1);
        Source source3 = new Source("DEFERRED_DEEP_LINK", 2);
        DEFERRED_DEEP_LINK = source3;
        $VALUES = new Source[]{source, source2, source3};
    }

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) $VALUES.clone();
    }
}
