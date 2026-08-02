package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ves {
    public static final ves a;
    public static final ves b;
    public static final ves c;
    public static final /* synthetic */ ves[] d;

    static {
        ves vesVar = new ves("DARK", 0);
        a = vesVar;
        ves vesVar2 = new ves("LIGHT", 1);
        b = vesVar2;
        ves vesVar3 = new ves("AUTO", 2);
        c = vesVar3;
        d = new ves[]{vesVar, vesVar2, vesVar3};
    }

    public static ves valueOf(String str) {
        return (ves) Enum.valueOf(ves.class, str);
    }

    public static ves[] values() {
        return (ves[]) d.clone();
    }
}
