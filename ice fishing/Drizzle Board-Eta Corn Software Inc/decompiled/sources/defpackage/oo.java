package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class oo {
    private static final /* synthetic */ ag $ENTRIES;
    private static final /* synthetic */ oo[] $VALUES;
    public static final mo Companion;
    public static final oo ON_ANY;
    public static final oo ON_CREATE;
    public static final oo ON_DESTROY;
    public static final oo ON_PAUSE;
    public static final oo ON_RESUME;
    public static final oo ON_START;
    public static final oo ON_STOP;

    static {
        oo ooVar = new oo("ON_CREATE", 0);
        ON_CREATE = ooVar;
        oo ooVar2 = new oo("ON_START", 1);
        ON_START = ooVar2;
        oo ooVar3 = new oo("ON_RESUME", 2);
        ON_RESUME = ooVar3;
        oo ooVar4 = new oo("ON_PAUSE", 3);
        ON_PAUSE = ooVar4;
        oo ooVar5 = new oo("ON_STOP", 4);
        ON_STOP = ooVar5;
        oo ooVar6 = new oo("ON_DESTROY", 5);
        ON_DESTROY = ooVar6;
        oo ooVar7 = new oo("ON_ANY", 6);
        ON_ANY = ooVar7;
        oo[] ooVarArr = {ooVar, ooVar2, ooVar3, ooVar4, ooVar5, ooVar6, ooVar7};
        $VALUES = ooVarArr;
        $ENTRIES = new bg(ooVarArr);
        Companion = new mo();
    }

    public static oo valueOf(String str) {
        return (oo) Enum.valueOf(oo.class, str);
    }

    public static oo[] values() {
        return (oo[]) $VALUES.clone();
    }

    public final po qoPGr6Ce() {
        switch (no.qoPGr6Ce[ordinal()]) {
            case 1:
            case 2:
                return po.wxUZMvaN;
            case 3:
            case 4:
                return po.VgvYg0wo;
            case 5:
                return po.P7K7Inc8;
            case 6:
                return po.NCTxEWno;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new d7();
        }
    }
}
