package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class grq {
    public static final grq a;
    public static final grq b;
    public static final /* synthetic */ grq[] c;

    static {
        grq grqVar = new grq("SHOW_PAYWALL", 0);
        a = grqVar;
        grq grqVar2 = new grq("SHOW_SKIPPABLE_PAYWALL", 1);
        b = grqVar2;
        c = new grq[]{grqVar, grqVar2};
    }

    public static grq valueOf(String str) {
        return (grq) Enum.valueOf(grq.class, str);
    }

    public static grq[] values() {
        return (grq[]) c.clone();
    }
}
