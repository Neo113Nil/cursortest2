package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fy {
    public static final defpackage.fy AARZUJiTa;
    public static final /* synthetic */ defpackage.fy[] EXtogiMhuM;
    public static final defpackage.fy adDC3e2L;
    public static final defpackage.fy xiZrDbcSW0;

    static {
        defpackage.fy fyVar = new defpackage.fy("Active", 0);
        adDC3e2L = fyVar;
        defpackage.fy fyVar2 = new defpackage.fy("ActiveParent", 1);
        xiZrDbcSW0 = fyVar2;
        defpackage.fy fyVar3 = new defpackage.fy("Captured", 2);
        defpackage.fy fyVar4 = new defpackage.fy("Inactive", 3);
        AARZUJiTa = fyVar4;
        EXtogiMhuM = new defpackage.fy[]{fyVar, fyVar2, fyVar3, fyVar4};
    }

    public static defpackage.fy valueOf(java.lang.String str) {
        return (defpackage.fy) java.lang.Enum.valueOf(defpackage.fy.class, str);
    }

    public static defpackage.fy[] values() {
        return (defpackage.fy[]) EXtogiMhuM.clone();
    }

    public final boolean IHQe1A4L2xu() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                defpackage.db.F7NU4MC0GW();
                return false;
            }
        }
        return true;
    }
}
