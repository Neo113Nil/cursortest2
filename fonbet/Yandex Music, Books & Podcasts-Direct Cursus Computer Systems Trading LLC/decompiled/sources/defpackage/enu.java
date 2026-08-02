package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class enu {
    public static final enu a;
    public static final enu b;
    public static final enu c;
    public static final /* synthetic */ enu[] d;

    static {
        enu enuVar = new enu("DEFAULT", 0);
        a = enuVar;
        enu enuVar2 = new enu("START", 1);
        b = enuVar2;
        enu enuVar3 = new enu("END", 2);
        c = enuVar3;
        d = new enu[]{enuVar, enuVar2, enuVar3};
    }

    public static enu valueOf(String str) {
        return (enu) Enum.valueOf(enu.class, str);
    }

    public static enu[] values() {
        return (enu[]) d.clone();
    }
}
