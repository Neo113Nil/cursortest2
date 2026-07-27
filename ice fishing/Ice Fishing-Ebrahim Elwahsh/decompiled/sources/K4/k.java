package K4;

import M7.q;
import y7.InterfaceC5255a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k {
    private static final /* synthetic */ InterfaceC5255a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final a Companion;
    private final String text;
    public static final k IN_APP_WEBVIEW = new k("IN_APP_WEBVIEW", 0, "webview");
    public static final k BROWSER = new k("BROWSER", 1, "browser");
    public static final k REPLACE_CONTENT = new k("REPLACE_CONTENT", 2, "replacement");

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final k fromString(String str) {
            for (k kVar : k.values()) {
                if (q.C(kVar.text, str)) {
                    return kVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ k[] $values() {
        return new k[]{IN_APP_WEBVIEW, BROWSER, REPLACE_CONTENT};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = W2.e.d($values);
        Companion = new a(null);
    }

    private k(String str, int i, String str2) {
        this.text = str2;
    }

    public static InterfaceC5255a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
