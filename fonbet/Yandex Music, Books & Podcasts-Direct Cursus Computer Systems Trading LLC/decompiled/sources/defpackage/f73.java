package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f73 {
    public static final gos b;
    public static final f73 c;
    public static final f73 d;
    public static final /* synthetic */ f73[] e;
    public static final /* synthetic */ rdb f;
    public final String a;

    static {
        f73 f73Var = new f73("ShowAndLoad", 0, "SHOW_AND_LOAD");
        c = f73Var;
        f73 f73Var2 = new f73("LoadAndShow", 1, "LOAD_AND_SHOW");
        d = f73Var2;
        f73[] f73VarArr = {f73Var, f73Var2};
        e = f73VarArr;
        f = new rdb(f73VarArr);
        b = new gos(15);
    }

    public f73(String str, int i, String str2) {
        this.a = str2;
    }

    public static f73 valueOf(String str) {
        return (f73) Enum.valueOf(f73.class, str);
    }

    public static f73[] values() {
        return (f73[]) e.clone();
    }
}
