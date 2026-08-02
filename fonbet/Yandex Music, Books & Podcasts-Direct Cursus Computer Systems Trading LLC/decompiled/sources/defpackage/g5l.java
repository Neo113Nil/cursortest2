package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g5l {
    public static final g5l a;
    public static final g5l b;
    public static final /* synthetic */ g5l[] c;

    static {
        g5l g5lVar = new g5l("Tracks", 0);
        a = g5lVar;
        g5l g5lVar2 = new g5l("Time", 1);
        b = g5lVar2;
        c = new g5l[]{g5lVar, g5lVar2};
    }

    public static g5l valueOf(String str) {
        return (g5l) Enum.valueOf(g5l.class, str);
    }

    public static g5l[] values() {
        return (g5l[]) c.clone();
    }
}
