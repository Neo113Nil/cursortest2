package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class cqf {
    public static final cqf a;
    public static final /* synthetic */ cqf[] b;

    static {
        cqf cqfVar = new cqf("Horizontal", 0);
        a = cqfVar;
        b = new cqf[]{cqfVar, new cqf("Vertical", 1)};
    }

    public static cqf valueOf(String str) {
        return (cqf) Enum.valueOf(cqf.class, str);
    }

    public static cqf[] values() {
        return (cqf[]) b.clone();
    }
}
