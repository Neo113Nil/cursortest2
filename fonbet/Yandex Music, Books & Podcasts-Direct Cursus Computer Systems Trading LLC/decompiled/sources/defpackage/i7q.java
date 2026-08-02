package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i7q {
    public static final kwl b;
    public static final i7q c;
    public static final i7q d;
    public static final i7q e;
    public static final i7q f;
    public static final /* synthetic */ i7q[] g;
    public static final /* synthetic */ rdb h;
    public final String a;

    static {
        i7q i7qVar = new i7q("LOW", 0, "low");
        c = i7qVar;
        i7q i7qVar2 = new i7q("HIGH", 1, "high");
        d = i7qVar2;
        i7q i7qVar3 = new i7q("LOSSLESS", 2, "lossless");
        e = i7qVar3;
        i7q i7qVar4 = new i7q("AUTO", 3, "auto");
        f = i7qVar4;
        i7q[] i7qVarArr = {i7qVar, i7qVar2, i7qVar3, i7qVar4};
        g = i7qVarArr;
        h = new rdb(i7qVarArr);
        b = new kwl();
    }

    public i7q(String str, int i, String str2) {
        this.a = str2;
    }

    public static i7q valueOf(String str) {
        return (i7q) Enum.valueOf(i7q.class, str);
    }

    public static i7q[] values() {
        return (i7q[]) g.clone();
    }
}
