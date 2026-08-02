package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class oyq {
    public static final oyq a;
    public static final /* synthetic */ oyq[] b;

    static {
        oyq oyqVar = new oyq("OFFLINE_RECOMMENDER", 0);
        a = oyqVar;
        b = new oyq[]{oyqVar, new oyq("VIBE_GENERATOR", 1)};
    }

    public static oyq valueOf(String str) {
        return (oyq) Enum.valueOf(oyq.class, str);
    }

    public static oyq[] values() {
        return (oyq[]) b.clone();
    }
}
