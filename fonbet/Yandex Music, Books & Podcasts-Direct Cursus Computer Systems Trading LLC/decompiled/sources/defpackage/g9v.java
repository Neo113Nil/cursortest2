package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g9v {
    public static final g9v a;
    public static final g9v b;
    public static final g9v c;
    public static final g9v d;
    public static final /* synthetic */ g9v[] e;

    static {
        g9v g9vVar = new g9v("Loading", 0);
        a = g9vVar;
        g9v g9vVar2 = new g9v("Content", 1);
        b = g9vVar2;
        g9v g9vVar3 = new g9v("Sleep", 2);
        c = g9vVar3;
        g9v g9vVar4 = new g9v("None", 3);
        d = g9vVar4;
        e = new g9v[]{g9vVar, g9vVar2, g9vVar3, g9vVar4};
    }

    public static g9v valueOf(String str) {
        return (g9v) Enum.valueOf(g9v.class, str);
    }

    public static g9v[] values() {
        return (g9v[]) e.clone();
    }
}
