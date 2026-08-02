package D4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ C7.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a IMMEDIATE = new a("IMMEDIATE", 0);
    public static final a APP_STARTUP = new a("APP_STARTUP", 1);

    private static final /* synthetic */ a[] $values() {
        return new a[]{IMMEDIATE, APP_STARTUP};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = X2.a.h($values);
    }

    private a(String str, int i) {
    }

    public static C7.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
