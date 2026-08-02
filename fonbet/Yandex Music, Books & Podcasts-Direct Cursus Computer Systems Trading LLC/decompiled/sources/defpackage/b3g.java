package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b3g {
    public static final b3g a;
    public static final b3g b;
    public static final b3g c;
    public static final b3g d;
    public static final b3g e;
    public static final b3g f;
    public static final b3g g;
    public static final b3g h;
    public static final b3g i;
    public static final /* synthetic */ b3g[] j;

    static {
        b3g b3gVar = new b3g("MusicTrack", 0);
        a = b3gVar;
        b3g b3gVar2 = new b3g("PodcastEpisode", 1);
        b = b3gVar2;
        b3g b3gVar3 = new b3g("AudioBookChapter", 2);
        c = b3gVar3;
        b3g b3gVar4 = new b3g("VideoClip", 3);
        b3g b3gVar5 = new b3g("GenerativeStream", 4);
        d = b3gVar5;
        b3g b3gVar6 = new b3g("MusicAlbum", 5);
        e = b3gVar6;
        b3g b3gVar7 = new b3g("PodcastAlbum", 6);
        f = b3gVar7;
        b3g b3gVar8 = new b3g("AudioBookAlbum", 7);
        g = b3gVar8;
        b3g b3gVar9 = new b3g("Artist", 8);
        h = b3gVar9;
        b3g b3gVar10 = new b3g("Playlist", 9);
        i = b3gVar10;
        j = new b3g[]{b3gVar, b3gVar2, b3gVar3, b3gVar4, b3gVar5, b3gVar6, b3gVar7, b3gVar8, b3gVar9, b3gVar10};
    }

    public static b3g valueOf(String str) {
        return (b3g) Enum.valueOf(b3g.class, str);
    }

    public static b3g[] values() {
        return (b3g[]) j.clone();
    }
}
