package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class qqw {
    public static final qqw a;
    public static final qqw b;
    public static final /* synthetic */ qqw[] c;

    static {
        qqw qqwVar = new qqw("ACTIVE", 0);
        a = qqwVar;
        qqw qqwVar2 = new qqw("PASSIVE", 1);
        b = qqwVar2;
        c = new qqw[]{qqwVar, qqwVar2};
    }

    public static qqw valueOf(String str) {
        return (qqw) Enum.valueOf(qqw.class, str);
    }

    public static qqw[] values() {
        return (qqw[]) c.clone();
    }
}
