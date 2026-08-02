package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zdj {
    public static final zdj a;
    public static final zdj b;
    public static final zdj c;
    public static final /* synthetic */ zdj[] d;

    static {
        zdj zdjVar = new zdj("ALL", 0);
        a = zdjVar;
        zdj zdjVar2 = new zdj("PODCAST", 1);
        b = zdjVar2;
        zdj zdjVar3 = new zdj("AUDIOBOOK", 2);
        c = zdjVar3;
        d = new zdj[]{zdjVar, zdjVar2, zdjVar3};
    }

    public static zdj valueOf(String str) {
        return (zdj) Enum.valueOf(zdj.class, str);
    }

    public static zdj[] values() {
        return (zdj[]) d.clone();
    }
}
