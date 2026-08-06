package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class l90 {
    private static final /* synthetic */ oq $ENTRIES;
    private static final /* synthetic */ l90[] $VALUES;
    public static final j90 Companion;
    public static final l90 ON_ANY;
    public static final l90 ON_CREATE;
    public static final l90 ON_DESTROY;
    public static final l90 ON_PAUSE;
    public static final l90 ON_RESUME;
    public static final l90 ON_START;
    public static final l90 ON_STOP;

    static {
        l90 l90Var = new l90("ON_CREATE", 0);
        ON_CREATE = l90Var;
        l90 l90Var2 = new l90("ON_START", 1);
        ON_START = l90Var2;
        l90 l90Var3 = new l90("ON_RESUME", 2);
        ON_RESUME = l90Var3;
        l90 l90Var4 = new l90("ON_PAUSE", 3);
        ON_PAUSE = l90Var4;
        l90 l90Var5 = new l90("ON_STOP", 4);
        ON_STOP = l90Var5;
        l90 l90Var6 = new l90("ON_DESTROY", 5);
        ON_DESTROY = l90Var6;
        l90 l90Var7 = new l90("ON_ANY", 6);
        ON_ANY = l90Var7;
        l90[] l90VarArr = {l90Var, l90Var2, l90Var3, l90Var4, l90Var5, l90Var6, l90Var7};
        $VALUES = l90VarArr;
        $ENTRIES = new pq(l90VarArr);
        Companion = new j90();
    }

    public static l90 valueOf(String str) {
        return (l90) Enum.valueOf(l90.class, str);
    }

    public static l90[] values() {
        return (l90[]) $VALUES.clone();
    }

    public final m90 GWasM1elztuh() {
        switch (k90.GWasM1elztuh[ordinal()]) {
            case 1:
            case 2:
                return m90.AvO7iQsrTN;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
            case 4:
                return m90.encWxUiV2;
            case 5:
                return m90.mOu10nynGul;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                return m90.OOA6hdeuvCS;
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                o4.xqGvceK5x();
                return null;
        }
    }
}
