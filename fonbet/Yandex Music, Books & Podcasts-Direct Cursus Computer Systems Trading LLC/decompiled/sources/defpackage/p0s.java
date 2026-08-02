package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p0s {
    public static final p0s a;
    public static final p0s b;
    public static final /* synthetic */ p0s[] c;

    static {
        p0s p0sVar = new p0s("OWN", 0);
        a = p0sVar;
        p0s p0sVar2 = new p0s("LIKED", 1);
        b = p0sVar2;
        c = new p0s[]{p0sVar, p0sVar2};
    }

    public static p0s valueOf(String str) {
        return (p0s) Enum.valueOf(p0s.class, str);
    }

    public static p0s[] values() {
        return (p0s[]) c.clone();
    }
}
