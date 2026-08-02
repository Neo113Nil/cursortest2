package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class lf1 {
    public static final fs7 b;
    public static final /* synthetic */ lf1[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        lf1[] lf1VarArr = {new lf1("TOP", 0, "TOP"), new lf1("SIMILAR", 1, "SIMILAR")};
        c = lf1VarArr;
        d = new rdb(lf1VarArr);
        b = new fs7(14);
    }

    public lf1(String str, int i, String str2) {
        this.a = str2;
    }

    public static lf1 valueOf(String str) {
        return (lf1) Enum.valueOf(lf1.class, str);
    }

    public static lf1[] values() {
        return (lf1[]) c.clone();
    }
}
