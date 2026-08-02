package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class oaa {
    public static final oaa a;
    public static final oaa b;
    public static final oaa c;
    public static final oaa d;
    public static final oaa e;
    public static final oaa f;
    public static final oaa g;
    public static final /* synthetic */ oaa[] h;

    static {
        oaa oaaVar = new oaa("MusicTrack", 0);
        a = oaaVar;
        oaa oaaVar2 = new oaa("PodcastEpisode", 1);
        b = oaaVar2;
        oaa oaaVar3 = new oaa("AudioBookChapter", 2);
        c = oaaVar3;
        oaa oaaVar4 = new oaa("MusicAlbum", 3);
        d = oaaVar4;
        oaa oaaVar5 = new oaa("PodcastAlbum", 4);
        e = oaaVar5;
        oaa oaaVar6 = new oaa("AudioBookAlbum", 5);
        f = oaaVar6;
        oaa oaaVar7 = new oaa("Playlist", 6);
        g = oaaVar7;
        h = new oaa[]{oaaVar, oaaVar2, oaaVar3, oaaVar4, oaaVar5, oaaVar6, oaaVar7};
    }

    public static oaa valueOf(String str) {
        return (oaa) Enum.valueOf(oaa.class, str);
    }

    public static oaa[] values() {
        return (oaa[]) h.clone();
    }
}
