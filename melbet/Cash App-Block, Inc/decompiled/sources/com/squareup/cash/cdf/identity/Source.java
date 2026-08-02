package com.squareup.cash.cdf.identity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Source {
    public static final /* synthetic */ Source[] $VALUES;
    public static final Source PERSONAL;
    public static final Source SECURITY_AND_PRIVACY;
    public static final Source SECURITY_HUB;

    /* JADX INFO: Fake field, exist only in values array */
    Source EF0;

    static {
        Source source = new Source("ACCOUNTS", 0);
        Source source2 = new Source("SECURITY_AND_PRIVACY", 1);
        SECURITY_AND_PRIVACY = source2;
        Source source3 = new Source("PERSONAL", 2);
        PERSONAL = source3;
        Source source4 = new Source("PROFILE_UPSELL", 3);
        Source source5 = new Source("DEEP_LINK", 4);
        Source source6 = new Source("SECURITY_HUB", 5);
        SECURITY_HUB = source6;
        $VALUES = new Source[]{source, source2, source3, source4, source5, source6};
    }

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) $VALUES.clone();
    }
}
