package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s0p {
    public static final s0p a;
    public static final s0p b;
    public static final s0p c;
    public static final s0p d;
    public static final s0p e;
    public static final s0p f;
    public static final s0p g;
    public static final s0p h;
    public static final s0p i;
    public static final s0p j;
    public static final s0p k;
    public static final s0p l;
    public static final s0p m;
    public static final s0p n;
    public static final s0p o;
    public static final /* synthetic */ s0p[] p;

    static {
        s0p s0pVar = new s0p("Top", 0);
        a = s0pVar;
        s0p s0pVar2 = new s0p("Track", 1);
        b = s0pVar2;
        s0p s0pVar3 = new s0p("Album", 2);
        c = s0pVar3;
        s0p s0pVar4 = new s0p("Artist", 3);
        d = s0pVar4;
        s0p s0pVar5 = new s0p("Playlist", 4);
        e = s0pVar5;
        s0p s0pVar6 = new s0p("Podcast", 5);
        f = s0pVar6;
        s0p s0pVar7 = new s0p("Book", 6);
        g = s0pVar7;
        s0p s0pVar8 = new s0p("Spoken", 7);
        h = s0pVar8;
        s0p s0pVar9 = new s0p("KidsMusic", 8);
        i = s0pVar9;
        s0p s0pVar10 = new s0p("KidsPlaylist", 9);
        j = s0pVar10;
        s0p s0pVar11 = new s0p("KidsSpoken", 10);
        k = s0pVar11;
        s0p s0pVar12 = new s0p("SpokenPlaylist", 11);
        l = s0pVar12;
        s0p s0pVar13 = new s0p("Clip", 12);
        m = s0pVar13;
        s0p s0pVar14 = new s0p("Concert", 13);
        n = s0pVar14;
        s0p s0pVar15 = new s0p("Other", 14);
        o = s0pVar15;
        p = new s0p[]{s0pVar, s0pVar2, s0pVar3, s0pVar4, s0pVar5, s0pVar6, s0pVar7, s0pVar8, s0pVar9, s0pVar10, s0pVar11, s0pVar12, s0pVar13, s0pVar14, s0pVar15};
    }

    public static s0p valueOf(String str) {
        return (s0p) Enum.valueOf(s0p.class, str);
    }

    public static s0p[] values() {
        return (s0p[]) p.clone();
    }
}
