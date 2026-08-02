package C4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ C7.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b MISSING = new b("MISSING", 0);
    public static final b OUTDATED = new b("OUTDATED", 1);
    public static final b OK = new b("OK", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{MISSING, OUTDATED, OK};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = X2.a.h($values);
    }

    private b(String str, int i) {
    }

    public static C7.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
