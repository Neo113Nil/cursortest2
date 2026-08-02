package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q6t {
    public static final q6t a;
    public static final q6t b;
    public static final /* synthetic */ q6t[] c;

    static {
        q6t q6tVar = new q6t("DEFERRED", 0);
        a = q6tVar;
        q6t q6tVar2 = new q6t("IMMEDIATE", 1);
        b = q6tVar2;
        c = new q6t[]{q6tVar, q6tVar2, new q6t("EXCLUSIVE", 2)};
    }

    public static q6t valueOf(String str) {
        return (q6t) Enum.valueOf(q6t.class, str);
    }

    public static q6t[] values() {
        return (q6t[]) c.clone();
    }
}
