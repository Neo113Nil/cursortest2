package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class qlv {
    public static final qlv a;
    public static final qlv b;
    public static final qlv c;
    public static final qlv d;
    public static final /* synthetic */ qlv[] e;
    public static final /* synthetic */ rdb f;

    static {
        qlv qlvVar = new qlv("Music", 0);
        a = qlvVar;
        qlv qlvVar2 = new qlv("FmRadio", 1);
        b = qlvVar2;
        qlv qlvVar3 = new qlv("Generative", 2);
        c = qlvVar3;
        qlv qlvVar4 = new qlv("NonMusic", 3);
        d = qlvVar4;
        qlv[] qlvVarArr = {qlvVar, qlvVar2, qlvVar3, qlvVar4};
        e = qlvVarArr;
        f = new rdb(qlvVarArr);
    }

    public static qlv valueOf(String str) {
        return (qlv) Enum.valueOf(qlv.class, str);
    }

    public static qlv[] values() {
        return (qlv[]) e.clone();
    }
}
