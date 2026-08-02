package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ue4 {
    public static final ue4 a;
    public static final ue4 b;
    public static final /* synthetic */ ue4[] c;

    static {
        ue4 ue4Var = new ue4("Number", 0);
        a = ue4Var;
        ue4 ue4Var2 = new ue4("Text", 1);
        b = ue4Var2;
        c = new ue4[]{ue4Var, ue4Var2};
    }

    public static ue4 valueOf(String str) {
        return (ue4) Enum.valueOf(ue4.class, str);
    }

    public static ue4[] values() {
        return (ue4[]) c.clone();
    }
}
