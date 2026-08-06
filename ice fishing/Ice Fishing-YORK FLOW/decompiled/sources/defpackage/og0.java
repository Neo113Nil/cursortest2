package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class og0 {
    private static final /* synthetic */ defpackage.sv $ENTRIES;
    private static final /* synthetic */ defpackage.og0[] $VALUES;
    public static final defpackage.mg0 Companion;
    public static final defpackage.og0 ON_ANY;
    public static final defpackage.og0 ON_CREATE;
    public static final defpackage.og0 ON_DESTROY;
    public static final defpackage.og0 ON_PAUSE;
    public static final defpackage.og0 ON_RESUME;
    public static final defpackage.og0 ON_START;
    public static final defpackage.og0 ON_STOP;

    static {
        defpackage.og0 og0Var = new defpackage.og0("ON_CREATE", 0);
        ON_CREATE = og0Var;
        defpackage.og0 og0Var2 = new defpackage.og0("ON_START", 1);
        ON_START = og0Var2;
        defpackage.og0 og0Var3 = new defpackage.og0("ON_RESUME", 2);
        ON_RESUME = og0Var3;
        defpackage.og0 og0Var4 = new defpackage.og0("ON_PAUSE", 3);
        ON_PAUSE = og0Var4;
        defpackage.og0 og0Var5 = new defpackage.og0("ON_STOP", 4);
        ON_STOP = og0Var5;
        defpackage.og0 og0Var6 = new defpackage.og0("ON_DESTROY", 5);
        ON_DESTROY = og0Var6;
        defpackage.og0 og0Var7 = new defpackage.og0("ON_ANY", 6);
        ON_ANY = og0Var7;
        defpackage.og0[] og0VarArr = {og0Var, og0Var2, og0Var3, og0Var4, og0Var5, og0Var6, og0Var7};
        $VALUES = og0VarArr;
        $ENTRIES = new defpackage.tv(og0VarArr);
        Companion = new defpackage.mg0();
    }

    public static defpackage.og0 valueOf(java.lang.String str) {
        return (defpackage.og0) java.lang.Enum.valueOf(defpackage.og0.class, str);
    }

    public static defpackage.og0[] values() {
        return (defpackage.og0[]) $VALUES.clone();
    }

    public final defpackage.pg0 ZpBGe2uQfcn8() {
        switch (defpackage.ng0.ZpBGe2uQfcn8[ordinal()]) {
            case 1:
            case 2:
                return defpackage.pg0.QiMR8OkAhezm;
            case 3:
            case 4:
                return defpackage.pg0.P05cfTpS5W5L;
            case 5:
                return defpackage.pg0.e6mdH7fiFuta;
            case 6:
                return defpackage.pg0.WDYagTQQm9ns;
            case 7:
                throw new java.lang.IllegalArgumentException(this + " has no target state");
            default:
                defpackage.h7.T1fB7bDYiVJQ();
                return null;
        }
    }
}
