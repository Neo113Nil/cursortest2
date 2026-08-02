package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e51 {
    public static final ovn b;
    public static final /* synthetic */ e51[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        e51[] e51VarArr = {new e51("TRACKS", 0, "tracks"), new e51("CONCERTS", 1, "concerts"), new e51("ALBUMS", 2, "albums"), new e51("COMPILATIONS", 3, "compilations"), new e51("DISCOGRAPHY", 4, "discography"), new e51("SIMILAR", 5, "similar")};
        c = e51VarArr;
        d = new rdb(e51VarArr);
        b = new ovn();
    }

    public e51(String str, int i, String str2) {
        this.a = str2;
    }

    public static e51 valueOf(String str) {
        return (e51) Enum.valueOf(e51.class, str);
    }

    public static e51[] values() {
        return (e51[]) c.clone();
    }
}
