package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class flj {
    public static final flj a;
    public static final flj b;
    public static final flj c;
    public static final /* synthetic */ flj[] d;

    static {
        flj fljVar = new flj("ProgramExpired", 0);
        a = fljVar;
        flj fljVar2 = new flj("DownloadsExpired", 1);
        b = fljVar2;
        flj fljVar3 = new flj("DownloadsChanged", 2);
        c = fljVar3;
        d = new flj[]{fljVar, fljVar2, fljVar3};
    }

    public static flj valueOf(String str) {
        return (flj) Enum.valueOf(flj.class, str);
    }

    public static flj[] values() {
        return (flj[]) d.clone();
    }
}
