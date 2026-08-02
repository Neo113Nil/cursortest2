package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t0o {
    public static final t0o a;
    public static final t0o b;
    public static final /* synthetic */ t0o[] c;

    static {
        t0o t0oVar = new t0o("url", 0);
        a = t0oVar;
        t0o t0oVar2 = new t0o("json", 1);
        b = t0oVar2;
        c = new t0o[]{t0oVar, t0oVar2};
    }

    public static t0o valueOf(String str) {
        return (t0o) Enum.valueOf(t0o.class, str);
    }

    public static t0o[] values() {
        return (t0o[]) c.clone();
    }
}
