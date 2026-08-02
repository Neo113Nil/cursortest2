package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wh1 {
    public static final wh1 a;
    public static final wh1 b;
    public static final wh1 c;
    public static final /* synthetic */ wh1[] d;

    static {
        wh1 wh1Var = new wh1("ONLINE", 0);
        a = wh1Var;
        wh1 wh1Var2 = new wh1("OFFLINE", 1);
        b = wh1Var2;
        wh1 wh1Var3 = new wh1("DOWNLOADED", 2);
        c = wh1Var3;
        d = new wh1[]{wh1Var, wh1Var2, wh1Var3};
    }

    public static wh1 valueOf(String str) {
        return (wh1) Enum.valueOf(wh1.class, str);
    }

    public static wh1[] values() {
        return (wh1[]) d.clone();
    }
}
