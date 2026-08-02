package defpackage;

import java.util.EnumSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gy1 {
    public static final aaw b;
    public static final gy1 c;
    public static final gy1 d;
    public static final gy1 e;
    public static final /* synthetic */ gy1[] f;
    public static final /* synthetic */ rdb g;
    public final String a;

    static {
        gy1 gy1Var = new gy1("TRACK", 0, "");
        c = gy1Var;
        gy1 gy1Var2 = new gy1("LEGACY_PREVIEW", 1, "preview");
        d = gy1Var2;
        gy1 gy1Var3 = new gy1("SMART_PREVIEW", 2, "smart_preview");
        e = gy1Var3;
        gy1[] gy1VarArr = {gy1Var, gy1Var2, gy1Var3};
        f = gy1VarArr;
        g = new rdb(gy1VarArr);
        b = new aaw(14);
    }

    public gy1(String str, int i, String str2) {
        this.a = str2;
    }

    public static gy1 valueOf(String str) {
        return (gy1) Enum.valueOf(gy1.class, str);
    }

    public static gy1[] values() {
        return (gy1[]) f.clone();
    }

    public final boolean a() {
        return EnumSet.of(d, e).contains(this);
    }
}
