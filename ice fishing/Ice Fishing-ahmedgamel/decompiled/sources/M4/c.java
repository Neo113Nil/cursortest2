package M4;

import java.util.Locale;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ C7.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    public static final c NONE = new c("NONE", 0);
    public static final c FATAL = new c("FATAL", 1);
    public static final c ERROR = new c("ERROR", 2);
    public static final c WARN = new c("WARN", 3);
    public static final c INFO = new c("INFO", 4);
    public static final c DEBUG = new c("DEBUG", 5);
    public static final c VERBOSE = new c("VERBOSE", 6);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final c fromInt(int i) {
            return c.values()[i];
        }

        public final c fromString(String str) {
            if (str == null) {
                return null;
            }
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                h.d(upperCase, "toUpperCase(...)");
                return c.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{NONE, FATAL, ERROR, WARN, INFO, DEBUG, VERBOSE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = com.bumptech.glide.e.b($values);
        Companion = new a(null);
    }

    private c(String str, int i) {
    }

    public static final c fromInt(int i) {
        return Companion.fromInt(i);
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
}
