package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yfa {
    public static final yfa a;
    public static final yfa b;
    public static final yfa c;
    public static final yfa d;
    public static final /* synthetic */ yfa[] e;

    static {
        yfa yfaVar = new yfa("DOWNLOADED_DATE", 0);
        a = yfaVar;
        yfa yfaVar2 = new yfa("ALPHABET", 1);
        b = yfaVar2;
        yfa yfaVar3 = new yfa("SONGS", 2);
        c = yfaVar3;
        yfa yfaVar4 = new yfa("EPISODES", 3);
        d = yfaVar4;
        e = new yfa[]{yfaVar, yfaVar2, yfaVar3, yfaVar4};
    }

    public static yfa valueOf(String str) {
        return (yfa) Enum.valueOf(yfa.class, str);
    }

    public static yfa[] values() {
        return (yfa[]) e.clone();
    }
}
