package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kyf {
    private static final /* synthetic */ qdb $ENTRIES;
    private static final /* synthetic */ kyf[] $VALUES;

    @NotNull
    public static final iyf Companion;
    public static final kyf ON_ANY;
    public static final kyf ON_CREATE;
    public static final kyf ON_DESTROY;
    public static final kyf ON_PAUSE;
    public static final kyf ON_RESUME;
    public static final kyf ON_START;
    public static final kyf ON_STOP;

    static {
        kyf kyfVar = new kyf("ON_CREATE", 0);
        ON_CREATE = kyfVar;
        kyf kyfVar2 = new kyf("ON_START", 1);
        ON_START = kyfVar2;
        kyf kyfVar3 = new kyf("ON_RESUME", 2);
        ON_RESUME = kyfVar3;
        kyf kyfVar4 = new kyf("ON_PAUSE", 3);
        ON_PAUSE = kyfVar4;
        kyf kyfVar5 = new kyf("ON_STOP", 4);
        ON_STOP = kyfVar5;
        kyf kyfVar6 = new kyf("ON_DESTROY", 5);
        ON_DESTROY = kyfVar6;
        kyf kyfVar7 = new kyf("ON_ANY", 6);
        ON_ANY = kyfVar7;
        kyf[] kyfVarArr = {kyfVar, kyfVar2, kyfVar3, kyfVar4, kyfVar5, kyfVar6, kyfVar7};
        $VALUES = kyfVarArr;
        $ENTRIES = new rdb(kyfVarArr);
        Companion = new iyf();
    }

    public static kyf valueOf(String str) {
        return (kyf) Enum.valueOf(kyf.class, str);
    }

    public static kyf[] values() {
        return (kyf[]) $VALUES.clone();
    }

    public final lyf a() {
        switch (jyf.a[ordinal()]) {
            case 1:
            case 2:
                return lyf.c;
            case 3:
            case 4:
                return lyf.d;
            case 5:
                return lyf.e;
            case 6:
                return lyf.a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                b6e.s();
                return null;
        }
    }
}
