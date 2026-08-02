package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class jzb {
    public static final h1b b;
    public static final jzb c;
    public static final jzb d;
    public static final jzb e;
    public static final /* synthetic */ jzb[] f;
    public static final /* synthetic */ rdb g;
    public final String a;

    static {
        jzb jzbVar = new jzb("Explicit", 0, "explicit");
        c = jzbVar;
        jzb jzbVar2 = new jzb("Age18", 1, "age18");
        d = jzbVar2;
        jzb jzbVar3 = new jzb("Exclamation", 2, "exclamation");
        e = jzbVar3;
        jzb[] jzbVarArr = {jzbVar, jzbVar2, jzbVar3};
        f = jzbVarArr;
        g = new rdb(jzbVarArr);
        b = new h1b();
    }

    public jzb(String str, int i, String str2) {
        this.a = str2;
    }

    public static jzb valueOf(String str) {
        return (jzb) Enum.valueOf(jzb.class, str);
    }

    public static jzb[] values() {
        return (jzb[]) f.clone();
    }
}
