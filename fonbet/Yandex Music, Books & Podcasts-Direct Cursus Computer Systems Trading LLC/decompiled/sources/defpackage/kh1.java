package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class kh1 {
    public static final e88 b;
    public static final /* synthetic */ kh1[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        kh1[] kh1VarArr = {new kh1("UPCOMING_RELEASE", 0, "upcoming_release"), new kh1("TRACKS", 1, "tracks"), new kh1("FAMILIAR", 2, "familiar"), new kh1("CONCERTS", 3, "concerts"), new kh1("INFO", 4, "info"), new kh1("ARTIST_PICK", 5, "artist_pick")};
        c = kh1VarArr;
        d = new rdb(kh1VarArr);
        b = new e88(14);
    }

    public kh1(String str, int i, String str2) {
        this.a = str2;
    }

    public static kh1 valueOf(String str) {
        return (kh1) Enum.valueOf(kh1.class, str);
    }

    public static kh1[] values() {
        return (kh1[]) c.clone();
    }
}
