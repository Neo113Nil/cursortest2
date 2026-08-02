package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class iqi {
    public static final iqi a;
    public static final /* synthetic */ iqi[] b;

    static {
        iqi iqiVar = new iqi("Default", 0);
        a = iqiVar;
        b = new iqi[]{iqiVar, new iqi("UserInput", 1), new iqi("PreventUserInput", 2)};
    }

    public static iqi valueOf(String str) {
        return (iqi) Enum.valueOf(iqi.class, str);
    }

    public static iqi[] values() {
        return (iqi[]) b.clone();
    }
}
