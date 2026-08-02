package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class iqw {
    public static final iqw a;
    public static final iqw b;
    public static final /* synthetic */ iqw[] c;

    static {
        iqw iqwVar = new iqw("FULL_SMART", 0);
        a = iqwVar;
        iqw iqwVar2 = new iqw("SEMI_SMART", 1);
        b = iqwVar2;
        c = new iqw[]{iqwVar, iqwVar2};
    }

    public static iqw valueOf(String str) {
        return (iqw) Enum.valueOf(iqw.class, str);
    }

    public static iqw[] values() {
        return (iqw[]) c.clone();
    }
}
