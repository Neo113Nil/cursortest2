package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class v5o {
    public static final /* synthetic */ v5o[] a = {new v5o("USD", 0), new v5o("RUB", 1), new v5o("UAH", 2), new v5o("KZT", 3), new v5o("BYR", 4), new v5o("BYN", 5), new v5o("AZN", 6), new v5o("UZS", 7), new v5o("MDL", 8), new v5o("AMD", 9), new v5o("ILS", 10), new v5o("GEL", 11), new v5o("KGS", 12), new v5o("AED", 13), new v5o("EUR", 14), new v5o("SAR", 15), new v5o("OMR", 16), new v5o("KWD", 17), new v5o("BHD", 18), new v5o("QAR", 19), new v5o("EGP", 20), new v5o("TRY", 21)};

    /* JADX INFO: Fake field, exist only in values array */
    v5o EF5;

    public static v5o valueOf(String str) {
        return (v5o) Enum.valueOf(v5o.class, str);
    }

    public static v5o[] values() {
        return (v5o[]) a.clone();
    }
}
