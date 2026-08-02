package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hqi {
    public static final hqi a;
    public static final hqi b;
    public static final hqi c;
    public static final /* synthetic */ hqi[] d;

    static {
        hqi hqiVar = new hqi("Default", 0);
        a = hqiVar;
        hqi hqiVar2 = new hqi("UserInput", 1);
        b = hqiVar2;
        hqi hqiVar3 = new hqi("PreventUserInput", 2);
        c = hqiVar3;
        d = new hqi[]{hqiVar, hqiVar2, hqiVar3};
    }

    public static hqi valueOf(String str) {
        return (hqi) Enum.valueOf(hqi.class, str);
    }

    public static hqi[] values() {
        return (hqi[]) d.clone();
    }
}
