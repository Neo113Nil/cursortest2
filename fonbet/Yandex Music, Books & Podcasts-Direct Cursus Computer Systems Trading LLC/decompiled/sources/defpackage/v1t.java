package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class v1t {
    public static final l3l a;
    public static final v1t b;
    public static final v1t c;
    public static final v1t d;
    public static final v1t e;
    public static final v1t f;
    public static final /* synthetic */ v1t[] g;

    static {
        v1t v1tVar = new v1t("MUSIC", 0);
        b = v1tVar;
        v1t v1tVar2 = new v1t("BOOK", 1);
        c = v1tVar2;
        v1t v1tVar3 = new v1t("PODCAST", 2);
        d = v1tVar3;
        v1t v1tVar4 = new v1t("KIDS", 3);
        e = v1tVar4;
        v1t v1tVar5 = new v1t("UNKNOWN", 4);
        f = v1tVar5;
        g = new v1t[]{v1tVar, v1tVar2, v1tVar3, v1tVar4, v1tVar5};
        a = new l3l();
    }

    public static v1t valueOf(String str) {
        return (v1t) Enum.valueOf(v1t.class, str);
    }

    public static v1t[] values() {
        return (v1t[]) g.clone();
    }
}
