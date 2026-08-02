package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z6w {
    public static final z6w a;
    public static final z6w b;
    public static final /* synthetic */ z6w[] c;

    static {
        z6w z6wVar = new z6w("light", 0);
        a = z6wVar;
        z6w z6wVar2 = new z6w("dark", 1);
        b = z6wVar2;
        c = new z6w[]{z6wVar, z6wVar2};
    }

    public static z6w valueOf(String str) {
        return (z6w) Enum.valueOf(z6w.class, str);
    }

    public static z6w[] values() {
        return (z6w[]) c.clone();
    }
}
