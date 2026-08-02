package defpackage;

import java.io.File;

/* loaded from: classes5.dex */
public abstract class tk61 {
    private static volatile tk61 a;

    public static boolean a(String str, File file, String str2) {
        return d().b(str, file, str2);
    }

    public static tk61 c(tk61 tk61Var) {
        a = tk61Var;
        return tk61Var;
    }

    public static tk61 d() {
        if (a == null) {
            synchronized (tk61.class) {
                try {
                    if (a == null) {
                        a = new sk61();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract boolean b(String str, File file, String str2);
}
