package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class x41 {
    public static final x41 a;
    public static final x41 b;
    public static final x41 c;
    public static final /* synthetic */ x41[] d;

    static {
        x41 x41Var = new x41("FROM_ARTIST_PHOTOS", 0);
        a = x41Var;
        x41 x41Var2 = new x41("FROM_ALBUM_COVER", 1);
        b = x41Var2;
        x41 x41Var3 = new x41("UNKNOWN", 2);
        c = x41Var3;
        d = new x41[]{x41Var, x41Var2, x41Var3};
    }

    public static x41 valueOf(String str) {
        return (x41) Enum.valueOf(x41.class, str);
    }

    public static x41[] values() {
        return (x41[]) d.clone();
    }
}
