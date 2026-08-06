package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class md0 {
    private static final /* synthetic */ defpackage.fu $ENTRIES;
    private static final /* synthetic */ defpackage.md0[] $VALUES;
    public static final defpackage.kd0 Companion;
    public static final defpackage.md0 ON_ANY;
    public static final defpackage.md0 ON_CREATE;
    public static final defpackage.md0 ON_DESTROY;
    public static final defpackage.md0 ON_PAUSE;
    public static final defpackage.md0 ON_RESUME;
    public static final defpackage.md0 ON_START;
    public static final defpackage.md0 ON_STOP;

    static {
        defpackage.md0 md0Var = new defpackage.md0("ON_CREATE", 0);
        ON_CREATE = md0Var;
        defpackage.md0 md0Var2 = new defpackage.md0("ON_START", 1);
        ON_START = md0Var2;
        defpackage.md0 md0Var3 = new defpackage.md0("ON_RESUME", 2);
        ON_RESUME = md0Var3;
        defpackage.md0 md0Var4 = new defpackage.md0("ON_PAUSE", 3);
        ON_PAUSE = md0Var4;
        defpackage.md0 md0Var5 = new defpackage.md0("ON_STOP", 4);
        ON_STOP = md0Var5;
        defpackage.md0 md0Var6 = new defpackage.md0("ON_DESTROY", 5);
        ON_DESTROY = md0Var6;
        defpackage.md0 md0Var7 = new defpackage.md0("ON_ANY", 6);
        ON_ANY = md0Var7;
        defpackage.md0[] md0VarArr = {md0Var, md0Var2, md0Var3, md0Var4, md0Var5, md0Var6, md0Var7};
        $VALUES = md0VarArr;
        $ENTRIES = new defpackage.gu(md0VarArr);
        Companion = new defpackage.kd0();
    }

    public static defpackage.md0 valueOf(java.lang.String str) {
        return (defpackage.md0) java.lang.Enum.valueOf(defpackage.md0.class, str);
    }

    public static defpackage.md0[] values() {
        return (defpackage.md0[]) $VALUES.clone();
    }

    public final defpackage.nd0 IHQe1A4L2xu() {
        switch (defpackage.ld0.IHQe1A4L2xu[ordinal()]) {
            case 1:
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.nd0.AARZUJiTa;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.nd0.EXtogiMhuM;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.nd0.riuEU0zW4;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.nd0.adDC3e2L;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new java.lang.IllegalArgumentException(this + " has no target state");
            default:
                defpackage.db.F7NU4MC0GW();
                return null;
        }
    }
}
