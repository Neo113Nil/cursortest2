package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lzs {
    public static final lzs a;
    public static final lzs b;
    public static final lzs c;
    public static final /* synthetic */ lzs[] d;

    static {
        lzs lzsVar = new lzs("NotPlaying", 0);
        a = lzsVar;
        lzs lzsVar2 = new lzs("Playing", 1);
        b = lzsVar2;
        lzs lzsVar3 = new lzs("Paused", 2);
        c = lzsVar3;
        d = new lzs[]{lzsVar, lzsVar2, lzsVar3};
    }

    public static lzs valueOf(String str) {
        return (lzs) Enum.valueOf(lzs.class, str);
    }

    public static lzs[] values() {
        return (lzs[]) d.clone();
    }
}
