package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o3q implements q3q {
    public static final o3q a;
    public static final o3q b;
    public static final /* synthetic */ o3q[] c;

    static {
        o3q o3qVar = new o3q("MusicHistory", 0);
        a = o3qVar;
        o3q o3qVar2 = new o3q("Default", 1);
        b = o3qVar2;
        c = new o3q[]{o3qVar, o3qVar2};
    }

    public static o3q valueOf(String str) {
        return (o3q) Enum.valueOf(o3q.class, str);
    }

    public static o3q[] values() {
        return (o3q[]) c.clone();
    }
}
