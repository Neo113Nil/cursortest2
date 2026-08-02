package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i96 {
    public static final i96 a;
    public static final i96 b;
    public static final i96 c;
    public static final i96 d;
    public static final /* synthetic */ i96[] e;

    /* JADX INFO: Fake field, exist only in values array */
    i96 EF0;

    static {
        i96 i96Var = new i96("LEFT", 0);
        i96 i96Var2 = new i96("RIGHT", 1);
        i96 i96Var3 = new i96("TOP", 2);
        a = i96Var3;
        i96 i96Var4 = new i96("BOTTOM", 3);
        b = i96Var4;
        i96 i96Var5 = new i96("BASELINE", 4);
        i96 i96Var6 = new i96("START", 5);
        c = i96Var6;
        i96 i96Var7 = new i96("END", 6);
        d = i96Var7;
        e = new i96[]{i96Var, i96Var2, i96Var3, i96Var4, i96Var5, i96Var6, i96Var7};
    }

    public static i96 valueOf(String str) {
        return (i96) Enum.valueOf(i96.class, str);
    }

    public static i96[] values() {
        return (i96[]) e.clone();
    }
}
