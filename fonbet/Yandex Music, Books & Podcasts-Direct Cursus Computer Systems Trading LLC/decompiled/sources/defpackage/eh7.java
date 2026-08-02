package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class eh7 {
    public static final eh7 a;
    public static final /* synthetic */ eh7[] b;

    /* JADX INFO: Fake field, exist only in values array */
    eh7 EF0;

    static {
        eh7 eh7Var = new eh7("ATTACH", 0);
        eh7 eh7Var2 = new eh7("DETACH", 1);
        a = eh7Var2;
        b = new eh7[]{eh7Var, eh7Var2};
    }

    public static eh7 valueOf(String str) {
        return (eh7) Enum.valueOf(eh7.class, str);
    }

    public static eh7[] values() {
        return (eh7[]) b.clone();
    }
}
