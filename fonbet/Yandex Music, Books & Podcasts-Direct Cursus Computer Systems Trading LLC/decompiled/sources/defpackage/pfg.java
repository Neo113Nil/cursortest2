package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pfg {
    public static final pfg a;
    public static final pfg b;
    public static final pfg c;
    public static final /* synthetic */ pfg[] d;

    static {
        pfg pfgVar = new pfg("REFRESH", 0);
        a = pfgVar;
        pfg pfgVar2 = new pfg("PREPEND", 1);
        b = pfgVar2;
        pfg pfgVar3 = new pfg("APPEND", 2);
        c = pfgVar3;
        d = new pfg[]{pfgVar, pfgVar2, pfgVar3};
    }

    public static pfg valueOf(String str) {
        return (pfg) Enum.valueOf(pfg.class, str);
    }

    public static pfg[] values() {
        return (pfg[]) d.clone();
    }
}
