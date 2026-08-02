package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bpc {
    public static final bpc a;
    public static final bpc b;
    public static final bpc c;
    public static final bpc d;
    public static final /* synthetic */ bpc[] e;

    static {
        bpc bpcVar = new bpc("Active", 0);
        a = bpcVar;
        bpc bpcVar2 = new bpc("ActiveParent", 1);
        b = bpcVar2;
        bpc bpcVar3 = new bpc("Captured", 2);
        c = bpcVar3;
        bpc bpcVar4 = new bpc("Inactive", 3);
        d = bpcVar4;
        e = new bpc[]{bpcVar, bpcVar2, bpcVar3, bpcVar4};
    }

    public static bpc valueOf(String str) {
        return (bpc) Enum.valueOf(bpc.class, str);
    }

    public static bpc[] values() {
        return (bpc[]) e.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        b6e.s();
        return false;
    }

    public final boolean b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                b6e.s();
                return false;
            }
        }
        return true;
    }
}
