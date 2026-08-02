package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class oxi {
    public static final oxi a;
    public static final oxi b;
    public static final oxi c;
    public static final oxi d;
    public static final /* synthetic */ oxi[] e;

    static {
        oxi oxiVar = new oxi("Success", 0);
        a = oxiVar;
        oxi oxiVar2 = new oxi("Replay", 1);
        b = oxiVar2;
        oxi oxiVar3 = new oxi("ShouldFallBackToBeginning", 2);
        c = oxiVar3;
        oxi oxiVar4 = new oxi("Failure", 3);
        d = oxiVar4;
        e = new oxi[]{oxiVar, oxiVar2, oxiVar3, oxiVar4};
    }

    public static oxi valueOf(String str) {
        return (oxi) Enum.valueOf(oxi.class, str);
    }

    public static oxi[] values() {
        return (oxi[]) e.clone();
    }
}
