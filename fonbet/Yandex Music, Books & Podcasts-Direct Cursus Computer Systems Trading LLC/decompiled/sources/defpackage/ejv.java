package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ejv {
    public static final rxk a;
    public static final ejv b;
    public static final ejv c;
    public static final /* synthetic */ ejv[] d;
    public static final /* synthetic */ rdb e;

    static {
        ejv ejvVar = new ejv("CLICK", 0);
        b = ejvVar;
        ejv ejvVar2 = new ejv("VIEW", 1);
        c = ejvVar2;
        ejv[] ejvVarArr = {ejvVar, ejvVar2};
        d = ejvVarArr;
        e = new rdb(ejvVarArr);
        a = new rxk();
    }

    public static ejv valueOf(String str) {
        return (ejv) Enum.valueOf(ejv.class, str);
    }

    public static ejv[] values() {
        return (ejv[]) d.clone();
    }
}
