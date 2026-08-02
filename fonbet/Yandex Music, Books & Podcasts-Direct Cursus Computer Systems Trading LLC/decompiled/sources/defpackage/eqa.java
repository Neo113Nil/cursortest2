package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eqa {
    public static final eqa a;
    public static final /* synthetic */ eqa[] b;

    static {
        eqa eqaVar = new eqa("Closed", 0);
        a = eqaVar;
        b = new eqa[]{eqaVar, new eqa("Open", 1)};
    }

    public static eqa valueOf(String str) {
        return (eqa) Enum.valueOf(eqa.class, str);
    }

    public static eqa[] values() {
        return (eqa[]) b.clone();
    }
}
