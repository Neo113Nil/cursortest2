package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class irg {
    public static final b2c b;
    public static final irg c;
    public static final irg d;
    public static final /* synthetic */ irg[] e;
    public static final /* synthetic */ rdb f;
    public final int a;

    static {
        irg irgVar = new irg("OFF", 0, 0);
        c = irgVar;
        irg irgVar2 = new irg("FATAL", 1, 1);
        irg irgVar3 = new irg("ERROR", 2, 2);
        irg irgVar4 = new irg("WARN", 3, 3);
        d = irgVar4;
        irg[] irgVarArr = {irgVar, irgVar2, irgVar3, irgVar4, new irg("INFO", 4, 4), new irg("DEBUG", 5, 5), new irg("TRACE", 6, 6), new irg("ALL", 7, 7)};
        e = irgVarArr;
        f = new rdb(irgVarArr);
        b = new b2c();
    }

    public irg(String str, int i, int i2) {
        this.a = i2;
    }

    public static irg valueOf(String str) {
        return (irg) Enum.valueOf(irg.class, str);
    }

    public static irg[] values() {
        return (irg[]) e.clone();
    }
}
