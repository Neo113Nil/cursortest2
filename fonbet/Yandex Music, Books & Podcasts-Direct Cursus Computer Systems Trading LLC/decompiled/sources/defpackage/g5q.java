package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g5q {
    public static final g5q a;
    public static final g5q b;
    public static final g5q c;
    public static final /* synthetic */ g5q[] d;

    static {
        g5q g5qVar = new g5q("CROSSFADED", 0);
        a = g5qVar;
        g5q g5qVar2 = new g5q("NORMALIZED", 1);
        b = g5qVar2;
        g5q g5qVar3 = new g5q("MIX", 2);
        c = g5qVar3;
        d = new g5q[]{g5qVar, g5qVar2, g5qVar3};
    }

    public static g5q valueOf(String str) {
        return (g5q) Enum.valueOf(g5q.class, str);
    }

    public static g5q[] values() {
        return (g5q[]) d.clone();
    }
}
