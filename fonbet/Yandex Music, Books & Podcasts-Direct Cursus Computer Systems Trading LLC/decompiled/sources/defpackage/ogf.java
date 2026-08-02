package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ogf {
    public static final ogf a;
    public static final ogf b;
    public static final ogf c;
    public static final ogf d;
    public static final /* synthetic */ ogf[] e;

    static {
        ogf ogfVar = new ogf("DATE", 0);
        a = ogfVar;
        ogf ogfVar2 = new ogf("ALPHABET", 1);
        b = ogfVar2;
        ogf ogfVar3 = new ogf("SONGS", 2);
        c = ogfVar3;
        ogf ogfVar4 = new ogf("EPISODES", 3);
        d = ogfVar4;
        e = new ogf[]{ogfVar, ogfVar2, ogfVar3, ogfVar4};
    }

    public static ogf valueOf(String str) {
        return (ogf) Enum.valueOf(ogf.class, str);
    }

    public static ogf[] values() {
        return (ogf[]) e.clone();
    }
}
