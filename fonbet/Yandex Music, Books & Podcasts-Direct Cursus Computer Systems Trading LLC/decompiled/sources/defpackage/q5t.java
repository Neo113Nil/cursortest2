package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q5t {
    public static final q5t a;
    public static final q5t b;
    public static final /* synthetic */ q5t[] c;

    static {
        q5t q5tVar = new q5t("None", 0);
        a = q5tVar;
        q5t q5tVar2 = new q5t("Exists", 1);
        b = q5tVar2;
        c = new q5t[]{q5tVar, q5tVar2};
    }

    public static q5t valueOf(String str) {
        return (q5t) Enum.valueOf(q5t.class, str);
    }

    public static q5t[] values() {
        return (q5t[]) c.clone();
    }
}
