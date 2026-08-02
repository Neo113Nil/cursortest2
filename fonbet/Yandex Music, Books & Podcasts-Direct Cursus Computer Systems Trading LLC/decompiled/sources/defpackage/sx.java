package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class sx {
    public static final sx a;
    public static final sx b;
    public static final sx c;
    public static final sx d;
    public static final /* synthetic */ sx[] e;

    static {
        sx sxVar = new sx("AuthorsBooks", 0);
        a = sxVar;
        sx sxVar2 = new sx("CategoryAlbums", 1);
        b = sxVar2;
        sx sxVar3 = new sx("LabelsAlbums", 2);
        c = sxVar3;
        sx sxVar4 = new sx("SimilarAlbums", 3);
        d = sxVar4;
        e = new sx[]{sxVar, sxVar2, sxVar3, sxVar4};
    }

    public static sx valueOf(String str) {
        return (sx) Enum.valueOf(sx.class, str);
    }

    public static sx[] values() {
        return (sx[]) e.clone();
    }
}
