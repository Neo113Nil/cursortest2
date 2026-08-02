package yads;

import com.yandex.go.sql.BaseDatabaseHelper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c10 {
    public static final c10 b;
    public static final c10 c;
    public static final /* synthetic */ c10[] d;

    static {
        c10 c10Var = new c10(BaseDatabaseHelper.TYPE_TEXT, 0);
        b = c10Var;
        c10 c10Var2 = new c10("IMAGE", 1);
        c = c10Var2;
        d = new c10[]{c10Var, c10Var2};
    }

    public static c10 valueOf(String str) {
        return (c10) Enum.valueOf(c10.class, str);
    }

    public static c10[] values() {
        return (c10[]) d.clone();
    }
}
