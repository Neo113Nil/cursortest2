package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class q6b {
    public static final q6b a;
    public static final /* synthetic */ q6b[] b;

    static {
        q6b q6bVar = new q6b("Utf8", 0);
        a = q6bVar;
        b = new q6b[]{q6bVar, new q6b("Base64", 1)};
    }

    public static q6b valueOf(String str) {
        return (q6b) Enum.valueOf(q6b.class, str);
    }

    public static q6b[] values() {
        return (q6b[]) b.clone();
    }
}
