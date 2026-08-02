package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z4m {
    public static final z4m a;
    public static final z4m b;
    public static final /* synthetic */ z4m[] c;

    static {
        z4m z4mVar = new z4m("TESTING", 0);
        a = z4mVar;
        z4m z4mVar2 = new z4m("PRODUCTION", 1);
        b = z4mVar2;
        c = new z4m[]{z4mVar, z4mVar2};
    }

    public static z4m valueOf(String str) {
        return (z4m) Enum.valueOf(z4m.class, str);
    }

    public static z4m[] values() {
        return (z4m[]) c.clone();
    }
}
