package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ho6 {
    public static final i9w b;
    public static final ho6 c;
    public static final /* synthetic */ ho6[] d;
    public static final /* synthetic */ rdb e;
    public final String a;

    static {
        ho6 ho6Var = new ho6("WithoutCover", 0, "NONE");
        ho6 ho6Var2 = new ho6("DefaultCover", 1, "DEFAULT");
        ho6 ho6Var3 = new ho6("CustomCover", 2, "CUSTOM");
        c = ho6Var3;
        ho6[] ho6VarArr = {ho6Var, ho6Var2, ho6Var3};
        d = ho6VarArr;
        e = new rdb(ho6VarArr);
        b = new i9w();
    }

    public ho6(String str, int i, String str2) {
        this.a = str2;
    }

    public static ho6 valueOf(String str) {
        return (ho6) Enum.valueOf(ho6.class, str);
    }

    public static ho6[] values() {
        return (ho6[]) d.clone();
    }
}
