package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ohr {
    public static final ohr a;
    public static final ohr b;
    public static final /* synthetic */ ohr[] c;

    static {
        ohr ohrVar = new ohr("PreventiveCheck", 0);
        a = ohrVar;
        ohr ohrVar2 = new ohr("DuringDownload", 1);
        b = ohrVar2;
        c = new ohr[]{ohrVar, ohrVar2};
    }

    public static ohr valueOf(String str) {
        return (ohr) Enum.valueOf(ohr.class, str);
    }

    public static ohr[] values() {
        return (ohr[]) c.clone();
    }
}
