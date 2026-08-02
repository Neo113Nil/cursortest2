package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l5t {
    public static final i5l a;
    public static final l5t b;
    public static final l5t c;
    public static final l5t d;
    public static final l5t e;
    public static final l5t f;
    public static final /* synthetic */ l5t[] g;

    static {
        l5t l5tVar = new l5t("ALBUM", 0);
        b = l5tVar;
        l5t l5tVar2 = new l5t("SINGLE", 1);
        c = l5tVar2;
        l5t l5tVar3 = new l5t("PLAYLIST", 2);
        d = l5tVar3;
        l5t l5tVar4 = new l5t("ARTIST", 3);
        e = l5tVar4;
        l5t l5tVar5 = new l5t("TRACK", 4);
        f = l5tVar5;
        g = new l5t[]{l5tVar, l5tVar2, l5tVar3, l5tVar4, l5tVar5};
        a = new i5l();
    }

    public static l5t valueOf(String str) {
        return (l5t) Enum.valueOf(l5t.class, str);
    }

    public static l5t[] values() {
        return (l5t[]) g.clone();
    }

    public final w5t a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return w5t.b;
        }
        if (ordinal == 1) {
            return w5t.b;
        }
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return w5t.a;
        }
        b6e.s();
        return null;
    }
}
