package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class y6r {
    public static final y6r a;
    public static final /* synthetic */ y6r[] b;

    static {
        y6r y6rVar = new y6r("FINISH", 0);
        a = y6rVar;
        b = new y6r[]{y6rVar};
    }

    public static y6r valueOf(String str) {
        return (y6r) Enum.valueOf(y6r.class, str);
    }

    public static y6r[] values() {
        return (y6r[]) b.clone();
    }
}
