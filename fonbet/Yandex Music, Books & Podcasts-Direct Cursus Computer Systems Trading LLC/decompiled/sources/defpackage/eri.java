package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class eri {
    public static final eri a;
    public static final eri b;
    public static final eri c;
    public static final eri d;
    public static final /* synthetic */ eri[] e;

    static {
        eri eriVar = new eri("LastEntity", 0);
        a = eriVar;
        eri eriVar2 = new eri("BookShelf", 1);
        b = eriVar2;
        eri eriVar3 = new eri("NewEpisodes", 2);
        c = eriVar3;
        eri eriVar4 = new eri("Artists", 3);
        d = eriVar4;
        e = new eri[]{eriVar, eriVar2, eriVar3, eriVar4};
    }

    public static eri valueOf(String str) {
        return (eri) Enum.valueOf(eri.class, str);
    }

    public static eri[] values() {
        return (eri[]) e.clone();
    }
}
