package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o1t {
    public static final o1t a;
    public static final o1t b;
    public static final o1t c;
    public static final o1t d;
    public static final o1t e;
    public static final /* synthetic */ o1t[] f;

    static {
        o1t o1tVar = new o1t("COMMON", 0);
        a = o1tVar;
        o1t o1tVar2 = new o1t("CHART", 1);
        b = o1tVar2;
        o1t o1tVar3 = new o1t("PLAYER", 2);
        c = o1tVar3;
        o1t o1tVar4 = new o1t("PLAYLIST", 3);
        d = o1tVar4;
        o1t o1tVar5 = new o1t("SEARCH", 4);
        e = o1tVar5;
        f = new o1t[]{o1tVar, o1tVar2, o1tVar3, o1tVar4, o1tVar5};
    }

    public static o1t valueOf(String str) {
        return (o1t) Enum.valueOf(o1t.class, str);
    }

    public static o1t[] values() {
        return (o1t[]) f.clone();
    }
}
