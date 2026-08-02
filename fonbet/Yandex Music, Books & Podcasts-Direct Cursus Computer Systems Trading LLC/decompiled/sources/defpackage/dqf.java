package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dqf {
    public static final dqf a;
    public static final /* synthetic */ dqf[] b;

    static {
        dqf dqfVar = new dqf("Horizontal", 0);
        a = dqfVar;
        b = new dqf[]{dqfVar, new dqf("Vertical", 1)};
    }

    public static dqf valueOf(String str) {
        return (dqf) Enum.valueOf(dqf.class, str);
    }

    public static dqf[] values() {
        return (dqf[]) b.clone();
    }
}
