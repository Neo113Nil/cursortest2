package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class swv {
    public static final swv a;
    public static final swv b;
    public static final swv c;
    public static final swv d;
    public static final /* synthetic */ swv[] e;

    static {
        swv swvVar = new swv("Empty", 0);
        a = swvVar;
        swv swvVar2 = new swv("Bar", 1);
        b = swvVar2;
        swv swvVar3 = new swv("Text", 2);
        c = swvVar3;
        swv swvVar4 = new swv("TextAndBar", 3);
        d = swvVar4;
        e = new swv[]{swvVar, swvVar2, swvVar3, swvVar4};
    }

    public static swv valueOf(String str) {
        return (swv) Enum.valueOf(swv.class, str);
    }

    public static swv[] values() {
        return (swv[]) e.clone();
    }
}
