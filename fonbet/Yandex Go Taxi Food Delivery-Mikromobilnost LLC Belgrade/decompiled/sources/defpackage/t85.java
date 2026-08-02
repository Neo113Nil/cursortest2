package defpackage;

import java.util.List;

/* loaded from: classes11.dex */
public abstract class t85 implements rc70 {
    public abstract Object a(String str);

    public abstract String b();

    public boolean c() {
        return Boolean.TRUE.equals(a("noResult"));
    }

    public final String toString() {
        return b() + " " + ((String) a("sql")) + " " + ((List) a("arguments"));
    }
}
