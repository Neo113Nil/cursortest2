package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yyb {
    public static final e88 b;
    public static final yyb c;
    public static final yyb d;
    public static final /* synthetic */ yyb[] e;
    public static final /* synthetic */ rdb f;
    public final String a;

    static {
        yyb yybVar = new yyb("ADULT", 0, "adult");
        c = yybVar;
        yyb yybVar2 = new yyb("CHILD", 1, "child");
        d = yybVar2;
        yyb[] yybVarArr = {yybVar, yybVar2};
        e = yybVarArr;
        f = new rdb(yybVarArr);
        b = new e88(22);
    }

    public yyb(String str, int i, String str2) {
        this.a = str2;
    }

    public static yyb valueOf(String str) {
        return (yyb) Enum.valueOf(yyb.class, str);
    }

    public static yyb[] values() {
        return (yyb[]) e.clone();
    }
}
