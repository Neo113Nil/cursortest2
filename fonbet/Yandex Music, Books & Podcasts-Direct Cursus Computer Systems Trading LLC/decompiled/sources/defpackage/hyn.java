package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class hyn {
    public static final z7l c;
    public static final hyn d;
    public static final hyn e;
    public static final hyn f;
    public static final /* synthetic */ hyn[] g;
    public static final /* synthetic */ rdb h;
    public final int a;
    public final String b;

    static {
        hyn hynVar = new hyn("ONE", 0, 0, "repeatOne");
        d = hynVar;
        hyn hynVar2 = new hyn("ALL", 1, 1, "repeatAll");
        e = hynVar2;
        hyn hynVar3 = new hyn("NONE", 2, 2, "repeatOff");
        f = hynVar3;
        hyn[] hynVarArr = {hynVar, hynVar2, hynVar3};
        g = hynVarArr;
        h = new rdb(hynVarArr);
        c = new z7l(2);
    }

    public hyn(String str, int i, int i2, String str2) {
        this.a = i2;
        this.b = str2;
    }

    public static hyn valueOf(String str) {
        return (hyn) Enum.valueOf(hyn.class, str);
    }

    public static hyn[] values() {
        return (hyn[]) g.clone();
    }
}
