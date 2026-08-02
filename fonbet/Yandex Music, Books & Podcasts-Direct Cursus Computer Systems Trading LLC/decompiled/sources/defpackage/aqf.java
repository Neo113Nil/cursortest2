package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aqf {
    public static final aqf a;
    public static final /* synthetic */ aqf[] b;

    static {
        aqf aqfVar = new aqf("Horizontal", 0);
        a = aqfVar;
        b = new aqf[]{aqfVar, new aqf("Vertical", 1)};
    }

    public static aqf valueOf(String str) {
        return (aqf) Enum.valueOf(aqf.class, str);
    }

    public static aqf[] values() {
        return (aqf[]) b.clone();
    }
}
