package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class bqf {
    public static final bqf a;
    public static final /* synthetic */ bqf[] b;

    static {
        bqf bqfVar = new bqf("Horizontal", 0);
        a = bqfVar;
        b = new bqf[]{bqfVar, new bqf("Vertical", 1)};
    }

    public static bqf valueOf(String str) {
        return (bqf) Enum.valueOf(bqf.class, str);
    }

    public static bqf[] values() {
        return (bqf[]) b.clone();
    }
}
