package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vd3 {
    public static final ehv a;
    public static final vd3 b;
    public static final vd3 c;
    public static final vd3 d;
    public static final vd3 e;
    public static final vd3 f;
    public static final /* synthetic */ vd3[] g;

    static {
        vd3 vd3Var = new vd3("TRACK", 0);
        b = vd3Var;
        vd3 vd3Var2 = new vd3("ARTIST", 1);
        c = vd3Var2;
        vd3 vd3Var3 = new vd3("ALBUM", 2);
        d = vd3Var3;
        vd3 vd3Var4 = new vd3("CLIP", 3);
        e = vd3Var4;
        vd3 vd3Var5 = new vd3("PLAYLIST", 4);
        f = vd3Var5;
        g = new vd3[]{vd3Var, vd3Var2, vd3Var3, vd3Var4, vd3Var5};
        a = new ehv(15);
    }

    public static vd3 valueOf(String str) {
        return (vd3) Enum.valueOf(vd3.class, str);
    }

    public static vd3[] values() {
        return (vd3[]) g.clone();
    }
}
