package K5;

import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ C7.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    public static final c IAM = new c("IAM", 0, "iam");
    public static final c NOTIFICATION = new c("NOTIFICATION", 1, "notification");
    private final String nameValue;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final c fromString(String str) {
            c cVar;
            if (str != null) {
                c[] values = c.values();
                int length = values.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        cVar = values[length];
                        if (cVar.equalsName(str)) {
                            break;
                        }
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    }
                }
                cVar = null;
                if (cVar != null) {
                    return cVar;
                }
            }
            return c.NOTIFICATION;
        }

        private a() {
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{IAM, NOTIFICATION};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = X2.a.h($values);
        Companion = new a(null);
    }

    private c(String str, int i, String str2) {
        this.nameValue = str2;
    }

    public static final c fromString(String str) {
        return Companion.fromString(str);
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

    public final boolean equalsName(String otherName) {
        h.e(otherName, "otherName");
        return h.a(this.nameValue, otherName);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.nameValue;
    }
}
