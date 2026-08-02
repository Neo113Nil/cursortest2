package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lem {
    public static final lem a;
    public static final lem b;
    public static final lem c;
    public static final lem d;
    public static final /* synthetic */ lem[] e;

    static {
        lem lemVar = new lem("Category", 0);
        a = lemVar;
        lem lemVar2 = new lem("EditorialAlbums", 1);
        b = lemVar2;
        lem lemVar3 = new lem("EditorialPlaylists", 2);
        c = lemVar3;
        lem lemVar4 = new lem("CompilationAlbums", 3);
        d = lemVar4;
        e = new lem[]{lemVar, lemVar2, lemVar3, lemVar4};
    }

    public static lem valueOf(String str) {
        return (lem) Enum.valueOf(lem.class, str);
    }

    public static lem[] values() {
        return (lem[]) e.clone();
    }
}
