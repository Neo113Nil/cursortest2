package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k80 {
    public static final k80 a;
    public static final k80 b;
    public static final k80 c;
    public static final k80 d;
    public static final /* synthetic */ k80[] e;

    static {
        k80 k80Var = new k80("BottomSheet", 0);
        a = k80Var;
        k80 k80Var2 = new k80("ArtistScreen", 1);
        b = k80Var2;
        k80 k80Var3 = new k80("AlbumScreen", 2);
        c = k80Var3;
        k80 k80Var4 = new k80("PlaylistScreen", 3);
        d = k80Var4;
        e = new k80[]{k80Var, k80Var2, k80Var3, k80Var4};
    }

    public static k80 valueOf(String str) {
        return (k80) Enum.valueOf(k80.class, str);
    }

    public static k80[] values() {
        return (k80[]) e.clone();
    }
}
