package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wh5 {
    public static final fs7 b;
    public static final wh5 c;
    public static final wh5 d;
    public static final wh5 e;
    public static final wh5 f;
    public static final wh5 g;
    public static final wh5 h;
    public static final /* synthetic */ wh5[] i;
    public static final /* synthetic */ rdb j;
    public final String a;

    static {
        wh5 wh5Var = new wh5("FULLSCREEN", 0, "fullscreen");
        c = wh5Var;
        wh5 wh5Var2 = new wh5("BOTTOMSHEET", 1, "bottomsheet");
        d = wh5Var2;
        wh5 wh5Var3 = new wh5("BANNER", 2, "banner");
        e = wh5Var3;
        wh5 wh5Var4 = new wh5("DEEPLINK", 3, "deeplink");
        f = wh5Var4;
        wh5 wh5Var5 = new wh5("DYNAMIC_OVERLAY_SHEET", 4, "dynamic_overlay_sheet");
        g = wh5Var5;
        wh5 wh5Var6 = new wh5("TOAST", 5, "toast");
        h = wh5Var6;
        wh5[] wh5VarArr = {wh5Var, wh5Var2, wh5Var3, wh5Var4, wh5Var5, wh5Var6, new wh5("BARABOVE", 6, "barabove")};
        i = wh5VarArr;
        j = new rdb(wh5VarArr);
        b = new fs7(17);
    }

    public wh5(String str, int i2, String str2) {
        this.a = str2;
    }

    public static wh5 valueOf(String str) {
        return (wh5) Enum.valueOf(wh5.class, str);
    }

    public static wh5[] values() {
        return (wh5[]) i.clone();
    }
}
