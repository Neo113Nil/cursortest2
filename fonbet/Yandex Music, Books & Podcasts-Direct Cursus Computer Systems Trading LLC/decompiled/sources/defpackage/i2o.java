package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i2o {
    public static final i2o a;
    public static final i2o b;
    public static final /* synthetic */ i2o[] c;

    static {
        i2o i2oVar = new i2o("Ltr", 0);
        a = i2oVar;
        i2o i2oVar2 = new i2o("Rtl", 1);
        b = i2oVar2;
        c = new i2o[]{i2oVar, i2oVar2};
    }

    public static i2o valueOf(String str) {
        return (i2o) Enum.valueOf(i2o.class, str);
    }

    public static i2o[] values() {
        return (i2o[]) c.clone();
    }
}
