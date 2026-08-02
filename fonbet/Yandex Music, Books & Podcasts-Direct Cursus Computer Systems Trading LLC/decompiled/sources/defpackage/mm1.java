package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class mm1 {
    public static final mm1 a;
    public static final mm1 b;
    public static final mm1 c;
    public static final /* synthetic */ mm1[] d;

    static {
        mm1 mm1Var = new mm1("ArtistAlbum", 0);
        a = mm1Var;
        mm1 mm1Var2 = new mm1("Compilation", 1);
        b = mm1Var2;
        mm1 mm1Var3 = new mm1("Discography", 2);
        c = mm1Var3;
        d = new mm1[]{mm1Var, mm1Var2, mm1Var3};
    }

    public static mm1 valueOf(String str) {
        return (mm1) Enum.valueOf(mm1.class, str);
    }

    public static mm1[] values() {
        return (mm1[]) d.clone();
    }
}
