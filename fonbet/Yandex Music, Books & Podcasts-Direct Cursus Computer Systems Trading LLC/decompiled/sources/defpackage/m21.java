package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class m21 {
    public static final m21 a;
    public static final m21 b;
    public static final /* synthetic */ m21[] c;

    static {
        m21 m21Var = new m21("Local", 0);
        a = m21Var;
        m21 m21Var2 = new m21("Remote", 1);
        b = m21Var2;
        c = new m21[]{m21Var, m21Var2};
    }

    public static m21 valueOf(String str) {
        return (m21) Enum.valueOf(m21.class, str);
    }

    public static m21[] values() {
        return (m21[]) c.clone();
    }
}
