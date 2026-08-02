package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mcs {
    public static final mcs a;
    public static final mcs b;
    public static final mcs c;
    public static final mcs d;
    public static final /* synthetic */ mcs[] e;

    static {
        mcs mcsVar = new mcs("StartInput", 0);
        a = mcsVar;
        mcs mcsVar2 = new mcs("StopInput", 1);
        b = mcsVar2;
        mcs mcsVar3 = new mcs("ShowKeyboard", 2);
        c = mcsVar3;
        mcs mcsVar4 = new mcs("HideKeyboard", 3);
        d = mcsVar4;
        e = new mcs[]{mcsVar, mcsVar2, mcsVar3, mcsVar4};
    }

    public static mcs valueOf(String str) {
        return (mcs) Enum.valueOf(mcs.class, str);
    }

    public static mcs[] values() {
        return (mcs[]) e.clone();
    }
}
