package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nmv {
    public static final nmv a;
    public static final nmv b;
    public static final nmv c;
    public static final /* synthetic */ nmv[] d;

    static {
        nmv nmvVar = new nmv("RECTANGLE_WITH_RECENTLY", 0);
        a = nmvVar;
        nmv nmvVar2 = new nmv("RECTANGLE", 1);
        b = nmvVar2;
        nmv nmvVar3 = new nmv("SQUARE", 2);
        c = nmvVar3;
        d = new nmv[]{nmvVar, nmvVar2, nmvVar3};
    }

    public static nmv valueOf(String str) {
        return (nmv) Enum.valueOf(nmv.class, str);
    }

    public static nmv[] values() {
        return (nmv[]) d.clone();
    }
}
