package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q68 {
    public static final q68 a;
    public static final /* synthetic */ q68[] b;

    /* JADX INFO: Fake field, exist only in values array */
    q68 EF0;

    static {
        q68 q68Var = new q68("PodcastOrBook", 0);
        q68 q68Var2 = new q68("Other", 1);
        a = q68Var2;
        b = new q68[]{q68Var, q68Var2};
    }

    public static q68 valueOf(String str) {
        return (q68) Enum.valueOf(q68.class, str);
    }

    public static q68[] values() {
        return (q68[]) b.clone();
    }
}
