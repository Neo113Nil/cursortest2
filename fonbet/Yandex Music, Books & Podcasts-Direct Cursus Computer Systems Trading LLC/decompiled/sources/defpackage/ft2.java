package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ft2 {
    public static final ft2 a;
    public static final ft2 b;
    public static final ft2 c;
    public static final ft2 d;
    public static final /* synthetic */ ft2[] e;

    static {
        ft2 ft2Var = new ft2("Artist", 0);
        a = ft2Var;
        ft2 ft2Var2 = new ft2("Playlist", 1);
        b = ft2Var2;
        ft2 ft2Var3 = new ft2("Album", 2);
        c = ft2Var3;
        ft2 ft2Var4 = new ft2("VideoClip", 3);
        d = ft2Var4;
        e = new ft2[]{ft2Var, ft2Var2, ft2Var3, ft2Var4};
    }

    public static ft2 valueOf(String str) {
        return (ft2) Enum.valueOf(ft2.class, str);
    }

    public static ft2[] values() {
        return (ft2[]) e.clone();
    }
}
