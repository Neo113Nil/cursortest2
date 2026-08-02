package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v74 {
    public static final v74 a;
    public static final v74 b;
    public static final v74 c;
    public static final v74 d;
    public static final v74 e;
    public static final v74 f;
    public static final v74 g;
    public static final v74 h;
    public static final /* synthetic */ v74[] i;

    static {
        v74 v74Var = new v74("PHONE", 0);
        a = v74Var;
        v74 v74Var2 = new v74("WEB_TV", 1);
        b = v74Var2;
        v74 v74Var3 = new v74("APPLE_TV", 2);
        c = v74Var3;
        v74 v74Var4 = new v74("ANDROID_TV", 3);
        d = v74Var4;
        v74 v74Var5 = new v74("ANDROID_WEAR", 4);
        e = v74Var5;
        v74 v74Var6 = new v74("WEB_DESKTOP", 5);
        f = v74Var6;
        v74 v74Var7 = new v74("WEB", 6);
        g = v74Var7;
        v74 v74Var8 = new v74("SMART_SPEAKER", 7);
        h = v74Var8;
        i = new v74[]{v74Var, v74Var2, v74Var3, v74Var4, v74Var5, v74Var6, v74Var7, v74Var8};
    }

    public static v74 valueOf(String str) {
        return (v74) Enum.valueOf(v74.class, str);
    }

    public static v74[] values() {
        return (v74[]) i.clone();
    }
}
