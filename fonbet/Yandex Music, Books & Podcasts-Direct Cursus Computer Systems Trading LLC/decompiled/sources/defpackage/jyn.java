package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jyn {
    public static final jyn a;
    public static final jyn b;
    public static final /* synthetic */ jyn[] c;

    static {
        jyn jynVar = new jyn("Restart", 0);
        a = jynVar;
        jyn jynVar2 = new jyn("Reverse", 1);
        b = jynVar2;
        c = new jyn[]{jynVar, jynVar2};
    }

    public static jyn valueOf(String str) {
        return (jyn) Enum.valueOf(jyn.class, str);
    }

    public static jyn[] values() {
        return (jyn[]) c.clone();
    }
}
