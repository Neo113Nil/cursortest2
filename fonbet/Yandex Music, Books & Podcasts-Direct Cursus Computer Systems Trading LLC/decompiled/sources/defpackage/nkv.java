package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class nkv {
    public static final nkv a;
    public static final nkv b;
    public static final nkv c;
    public static final nkv d;
    public static final nkv e;
    public static final nkv f;
    public static final nkv g;
    public static final nkv h;
    public static final nkv i;
    public static final nkv j;
    public static final nkv k;
    public static final nkv l;
    public static final /* synthetic */ nkv[] m;

    static {
        nkv nkvVar = new nkv("OpenRecently", 0);
        a = nkvVar;
        nkv nkvVar2 = new nkv("OpenTrack", 1);
        b = nkvVar2;
        nkv nkvVar3 = new nkv("PlayMyFavoritePlaylist", 2);
        nkv nkvVar4 = new nkv("Play", 3);
        c = nkvVar4;
        nkv nkvVar5 = new nkv("Pause", 4);
        d = nkvVar5;
        nkv nkvVar6 = new nkv("Skip", 5);
        e = nkvVar6;
        nkv nkvVar7 = new nkv("Prev", 6);
        f = nkvVar7;
        nkv nkvVar8 = new nkv("SeekForward", 7);
        g = nkvVar8;
        nkv nkvVar9 = new nkv("SeekBackward", 8);
        h = nkvVar9;
        nkv nkvVar10 = new nkv("Like", 9);
        i = nkvVar10;
        nkv nkvVar11 = new nkv("Dislike", 10);
        j = nkvVar11;
        nkv nkvVar12 = new nkv("RemoveLike", 11);
        k = nkvVar12;
        nkv nkvVar13 = new nkv("RemoveDislike", 12);
        l = nkvVar13;
        m = new nkv[]{nkvVar, nkvVar2, nkvVar3, nkvVar4, nkvVar5, nkvVar6, nkvVar7, nkvVar8, nkvVar9, nkvVar10, nkvVar11, nkvVar12, nkvVar13, new nkv("Empty", 13)};
    }

    public static nkv valueOf(String str) {
        return (nkv) Enum.valueOf(nkv.class, str);
    }

    public static nkv[] values() {
        return (nkv[]) m.clone();
    }
}
