package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fo4 {
    public static final fo4 a;
    public static final /* synthetic */ fo4[] b;

    /* JADX INFO: Fake field, exist only in values array */
    fo4 EF0;

    static {
        fo4 fo4Var = new fo4("UNKNOWN", 0);
        fo4 fo4Var2 = new fo4("ANDROID_FIREBASE", 1);
        a = fo4Var2;
        b = new fo4[]{fo4Var, fo4Var2};
    }

    public static fo4 valueOf(String str) {
        return (fo4) Enum.valueOf(fo4.class, str);
    }

    public static fo4[] values() {
        return (fo4[]) b.clone();
    }
}
