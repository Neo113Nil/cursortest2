package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o0s {
    public static final o0s a;
    public static final o0s b;
    public static final /* synthetic */ o0s[] c;

    static {
        o0s o0sVar = new o0s("OWN", 0);
        a = o0sVar;
        o0s o0sVar2 = new o0s("LIKED", 1);
        b = o0sVar2;
        c = new o0s[]{o0sVar, o0sVar2};
    }

    public static o0s valueOf(String str) {
        return (o0s) Enum.valueOf(o0s.class, str);
    }

    public static o0s[] values() {
        return (o0s[]) c.clone();
    }
}
