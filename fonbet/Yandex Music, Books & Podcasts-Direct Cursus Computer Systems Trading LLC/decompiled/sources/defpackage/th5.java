package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class th5 {
    public static final d51 a;
    public static final th5 b;
    public static final /* synthetic */ th5[] c;
    public static final /* synthetic */ rdb d;

    static {
        th5 th5Var = new th5("SIMPLE", 0);
        b = th5Var;
        th5[] th5VarArr = {th5Var};
        c = th5VarArr;
        d = new rdb(th5VarArr);
        a = new d51(17);
    }

    public static th5 valueOf(String str) {
        return (th5) Enum.valueOf(th5.class, str);
    }

    public static th5[] values() {
        return (th5[]) c.clone();
    }
}
