package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oiu {
    public static final oiu a;
    public static final /* synthetic */ oiu[] b;

    static {
        oiu oiuVar = new oiu("Visible", 0);
        a = oiuVar;
        b = new oiu[]{oiuVar, new oiu("Invisible", 1), new oiu("Gone", 2)};
    }

    public static oiu valueOf(String str) {
        return (oiu) Enum.valueOf(oiu.class, str);
    }

    public static oiu[] values() {
        return (oiu[]) b.clone();
    }
}
