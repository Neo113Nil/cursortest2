package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ou1 {
    public static final ou1 a;
    public static final ou1 b;
    public static final ou1 c;
    public static final /* synthetic */ ou1[] d;

    static {
        ou1 ou1Var = new ou1("ALBUM", 0);
        a = ou1Var;
        ou1 ou1Var2 = new ou1("ARTIST", 1);
        b = ou1Var2;
        ou1 ou1Var3 = new ou1("PLAYLIST", 2);
        c = ou1Var3;
        d = new ou1[]{ou1Var, ou1Var2, ou1Var3};
    }

    public static ou1 valueOf(String str) {
        return (ou1) Enum.valueOf(ou1.class, str);
    }

    public static ou1[] values() {
        return (ou1[]) d.clone();
    }
}
