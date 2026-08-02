package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e9g {
    public static final e9g a;
    public static final e9g b;
    public static final /* synthetic */ e9g[] c;

    static {
        e9g e9gVar = new e9g("Large", 0);
        a = e9gVar;
        e9g e9gVar2 = new e9g("Medium", 1);
        b = e9gVar2;
        c = new e9g[]{e9gVar, e9gVar2};
    }

    public static e9g valueOf(String str) {
        return (e9g) Enum.valueOf(e9g.class, str);
    }

    public static e9g[] values() {
        return (e9g[]) c.clone();
    }
}
