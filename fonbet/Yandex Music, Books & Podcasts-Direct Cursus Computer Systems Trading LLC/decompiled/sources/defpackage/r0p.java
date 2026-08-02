package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r0p {
    public static final r0p a;
    public static final r0p b;
    public static final r0p c;
    public static final r0p d;
    public static final r0p e;
    public static final r0p f;
    public static final /* synthetic */ r0p[] g;

    static {
        r0p r0pVar = new r0p("Albums", 0);
        a = r0pVar;
        r0p r0pVar2 = new r0p("Tracks", 1);
        b = r0pVar2;
        r0p r0pVar3 = new r0p("Playlists", 2);
        c = r0pVar3;
        r0p r0pVar4 = new r0p("Artists", 3);
        d = r0pVar4;
        r0p r0pVar5 = new r0p("Podcasts", 4);
        e = r0pVar5;
        r0p r0pVar6 = new r0p("Episodes", 5);
        r0p r0pVar7 = new r0p("Clip", 6);
        f = r0pVar7;
        g = new r0p[]{r0pVar, r0pVar2, r0pVar3, r0pVar4, r0pVar5, r0pVar6, r0pVar7, new r0p("Wave", 7)};
    }

    public static r0p valueOf(String str) {
        return (r0p) Enum.valueOf(r0p.class, str);
    }

    public static r0p[] values() {
        return (r0p[]) g.clone();
    }
}
