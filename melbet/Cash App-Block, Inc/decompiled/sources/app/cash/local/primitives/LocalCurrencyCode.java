package app.cash.local.primitives;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LocalCurrencyCode {
    public static final /* synthetic */ LocalCurrencyCode[] $VALUES;
    public static final LocalCurrencyCode USD;

    static {
        LocalCurrencyCode localCurrencyCode = new LocalCurrencyCode("USD", 0);
        USD = localCurrencyCode;
        $VALUES = new LocalCurrencyCode[]{localCurrencyCode, new LocalCurrencyCode("CAD", 1), new LocalCurrencyCode("GBP", 2)};
    }

    public static LocalCurrencyCode valueOf(String str) {
        return (LocalCurrencyCode) Enum.valueOf(LocalCurrencyCode.class, str);
    }

    public static LocalCurrencyCode[] values() {
        return (LocalCurrencyCode[]) $VALUES.clone();
    }
}
