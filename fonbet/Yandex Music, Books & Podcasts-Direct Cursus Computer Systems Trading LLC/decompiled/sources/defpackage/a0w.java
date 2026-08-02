package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a0w {
    public static final hil b;
    public static final /* synthetic */ a0w[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        a0w[] a0wVarArr = {new a0w("ARTISTS", 0, "artists"), new a0w("COUNTER", 1, "counter")};
        c = a0wVarArr;
        d = new rdb(a0wVarArr);
        b = new hil();
    }

    public a0w(String str, int i, String str2) {
        this.a = str2;
    }

    public static a0w valueOf(String str) {
        return (a0w) Enum.valueOf(a0w.class, str);
    }

    public static a0w[] values() {
        return (a0w[]) c.clone();
    }
}
