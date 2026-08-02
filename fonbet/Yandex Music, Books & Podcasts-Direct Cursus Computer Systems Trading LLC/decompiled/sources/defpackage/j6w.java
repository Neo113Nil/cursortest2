package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j6w {
    public static final j6w c;
    public static final j6w d;
    public static final j6w e;
    public static final j6w f;
    public static final /* synthetic */ j6w[] g;
    public static final /* synthetic */ rdb h;
    public final char a;
    public final char b;

    static {
        j6w j6wVar = new j6w("OBJ", 0, '{', '}');
        c = j6wVar;
        j6w j6wVar2 = new j6w("LIST", 1, '[', ']');
        d = j6wVar2;
        j6w j6wVar3 = new j6w("MAP", 2, '{', '}');
        e = j6wVar3;
        j6w j6wVar4 = new j6w("POLY_OBJ", 3, '[', ']');
        f = j6wVar4;
        j6w[] j6wVarArr = {j6wVar, j6wVar2, j6wVar3, j6wVar4};
        g = j6wVarArr;
        h = new rdb(j6wVarArr);
    }

    public j6w(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static j6w valueOf(String str) {
        return (j6w) Enum.valueOf(j6w.class, str);
    }

    public static j6w[] values() {
        return (j6w[]) g.clone();
    }
}
