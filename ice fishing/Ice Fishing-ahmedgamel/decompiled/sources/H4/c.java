package H4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ C7.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CREATE = new c("CREATE", 0);
    public static final c ALTER = new c("ALTER", 1);
    public static final c NONE = new c("NONE", 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{CREATE, ALTER, NONE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = X2.a.h($values);
    }

    private c(String str, int i) {
    }

    public static C7.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
