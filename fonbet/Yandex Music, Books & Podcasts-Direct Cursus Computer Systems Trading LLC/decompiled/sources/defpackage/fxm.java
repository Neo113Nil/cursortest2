package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class fxm {
    public static final wfl b;
    public static final fxm c;
    public static final /* synthetic */ fxm[] d;
    public static final /* synthetic */ rdb e;
    public final String a;

    static {
        fxm fxmVar = new fxm("Center", 0, "center");
        c = fxmVar;
        fxm[] fxmVarArr = {fxmVar, new fxm("Top", 1, "top")};
        d = fxmVarArr;
        e = new rdb(fxmVarArr);
        b = new wfl();
    }

    public fxm(String str, int i, String str2) {
        this.a = str2;
    }

    public static fxm valueOf(String str) {
        return (fxm) Enum.valueOf(fxm.class, str);
    }

    public static fxm[] values() {
        return (fxm[]) d.clone();
    }
}
