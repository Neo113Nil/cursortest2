package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mz {
    public static final /* synthetic */ defpackage.mz[] P05cfTpS5W5L;
    public static final defpackage.mz QiMR8OkAhezm;
    public static final defpackage.mz WDYagTQQm9ns;
    public static final defpackage.mz oh71FJcDz6S2;

    static {
        defpackage.mz mzVar = new defpackage.mz("Active", 0);
        WDYagTQQm9ns = mzVar;
        defpackage.mz mzVar2 = new defpackage.mz("ActiveParent", 1);
        oh71FJcDz6S2 = mzVar2;
        defpackage.mz mzVar3 = new defpackage.mz("Captured", 2);
        defpackage.mz mzVar4 = new defpackage.mz("Inactive", 3);
        QiMR8OkAhezm = mzVar4;
        P05cfTpS5W5L = new defpackage.mz[]{mzVar, mzVar2, mzVar3, mzVar4};
    }

    public static defpackage.mz valueOf(java.lang.String str) {
        return (defpackage.mz) java.lang.Enum.valueOf(defpackage.mz.class, str);
    }

    public static defpackage.mz[] values() {
        return (defpackage.mz[]) P05cfTpS5W5L.clone();
    }

    public final boolean ZpBGe2uQfcn8() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                defpackage.h7.T1fB7bDYiVJQ();
                return false;
            }
        }
        return true;
    }
}
