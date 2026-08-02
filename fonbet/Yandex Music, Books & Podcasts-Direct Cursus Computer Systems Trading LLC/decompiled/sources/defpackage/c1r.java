package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c1r {
    public static final c1r a;
    public static final /* synthetic */ c1r[] b;

    static {
        c1r c1rVar = new c1r("Short", 0);
        a = c1rVar;
        b = new c1r[]{c1rVar, new c1r("Long", 1), new c1r("Indefinite", 2)};
    }

    public static c1r valueOf(String str) {
        return (c1r) Enum.valueOf(c1r.class, str);
    }

    public static c1r[] values() {
        return (c1r[]) b.clone();
    }
}
