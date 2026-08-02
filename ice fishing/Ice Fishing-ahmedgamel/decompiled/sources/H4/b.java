package H4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ C7.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SUCCESS = new b("SUCCESS", 0);
    public static final b SUCCESS_STARTING_ONLY = new b("SUCCESS_STARTING_ONLY", 1);
    public static final b FAIL_RETRY = new b("FAIL_RETRY", 2);
    public static final b FAIL_NORETRY = new b("FAIL_NORETRY", 3);
    public static final b FAIL_UNAUTHORIZED = new b("FAIL_UNAUTHORIZED", 4);
    public static final b FAIL_CONFLICT = new b("FAIL_CONFLICT", 5);
    public static final b FAIL_PAUSE_OPREPO = new b("FAIL_PAUSE_OPREPO", 6);

    private static final /* synthetic */ b[] $values() {
        return new b[]{SUCCESS, SUCCESS_STARTING_ONLY, FAIL_RETRY, FAIL_NORETRY, FAIL_UNAUTHORIZED, FAIL_CONFLICT, FAIL_PAUSE_OPREPO};
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
