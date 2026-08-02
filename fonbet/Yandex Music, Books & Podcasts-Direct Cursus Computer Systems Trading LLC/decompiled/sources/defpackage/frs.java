package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class frs {
    public static final frs a;
    public static final frs b;
    public static final frs c;
    public static final frs d;
    public static final /* synthetic */ frs[] e;

    static {
        frs frsVar = new frs("NotPlayable", 0);
        a = frsVar;
        frs frsVar2 = new frs("NotAllowedByExplicitFilter", 1);
        b = frsVar2;
        frs frsVar3 = new frs("NotAvailable", 2);
        c = frsVar3;
        frs frsVar4 = new frs("Available", 3);
        d = frsVar4;
        e = new frs[]{frsVar, frsVar2, frsVar3, frsVar4};
    }

    public static frs valueOf(String str) {
        return (frs) Enum.valueOf(frs.class, str);
    }

    public static frs[] values() {
        return (frs[]) e.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return false;
        }
        if (ordinal == 3) {
            return true;
        }
        b6e.s();
        return false;
    }

    public final zyj b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return zyj.b;
            }
            if (ordinal != 2 && ordinal != 3) {
                b6e.s();
                return null;
            }
        }
        return zyj.c;
    }
}
