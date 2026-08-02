package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class xdw {
    public static final xdw a;
    public static final /* synthetic */ xdw[] b;

    static {
        xdw xdwVar = new xdw("MOBILE", 0);
        a = xdwVar;
        b = new xdw[]{xdwVar, new xdw("TV", 1), new xdw("WATCH", 2)};
    }

    public static xdw valueOf(String str) {
        return (xdw) Enum.valueOf(xdw.class, str);
    }

    public static xdw[] values() {
        return (xdw[]) b.clone();
    }
}
