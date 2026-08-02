package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class s9t {
    public static final s9t a;
    public static final s9t b;
    public static final /* synthetic */ s9t[] c;

    static {
        s9t s9tVar = new s9t("HTTP1", 0);
        a = s9tVar;
        s9t s9tVar2 = new s9t("HTTP1_HTTP2", 1);
        b = s9tVar2;
        c = new s9t[]{s9tVar, s9tVar2, new s9t("HTTP2_HTTP1", 2)};
    }

    public static s9t valueOf(String str) {
        return (s9t) Enum.valueOf(s9t.class, str);
    }

    public static s9t[] values() {
        return (s9t[]) c.clone();
    }
}
