package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class wmn {
    public static final wmn a;
    public static final wmn b;
    public static final wmn c;
    public static final wmn d;
    public static final wmn e;
    public static final wmn f;
    public static final /* synthetic */ wmn[] g;

    static {
        wmn wmnVar = new wmn("ON_DEMAND", 0);
        a = wmnVar;
        wmn wmnVar2 = new wmn("RECOMMENDED", 1);
        b = wmnVar2;
        wmn wmnVar3 = new wmn("SEARCH", 2);
        c = wmnVar3;
        wmn wmnVar4 = new wmn("ARTIST", 3);
        d = wmnVar4;
        wmn wmnVar5 = new wmn("OWN", 4);
        e = wmnVar5;
        wmn wmnVar6 = new wmn("EDITORIAL_CHOICE", 5);
        f = wmnVar6;
        g = new wmn[]{wmnVar, wmnVar2, wmnVar3, wmnVar4, wmnVar5, wmnVar6};
    }

    public static wmn valueOf(String str) {
        return (wmn) Enum.valueOf(wmn.class, str);
    }

    public static wmn[] values() {
        return (wmn[]) g.clone();
    }
}
