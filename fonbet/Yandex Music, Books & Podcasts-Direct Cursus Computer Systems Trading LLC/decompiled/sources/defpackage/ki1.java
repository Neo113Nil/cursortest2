package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ki1 {
    public static final ki1 a;
    public static final ki1 b;
    public static final /* synthetic */ ki1[] c;

    static {
        ki1 ki1Var = new ki1("COLLECTION", 0);
        a = ki1Var;
        ki1 ki1Var2 = new ki1("WAVE", 1);
        b = ki1Var2;
        c = new ki1[]{ki1Var, ki1Var2};
    }

    public static ki1 valueOf(String str) {
        return (ki1) Enum.valueOf(ki1.class, str);
    }

    public static ki1[] values() {
        return (ki1[]) c.clone();
    }

    public final alb a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return alb.Collection;
        }
        if (ordinal == 1) {
            return alb.MyWave;
        }
        b6e.s();
        return null;
    }
}
