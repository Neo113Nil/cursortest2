package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m73 {
    public static final m73 a;
    public static final m73 b;
    public static final /* synthetic */ m73[] c;

    static {
        m73 m73Var = new m73("DIV_SCREEN", 0);
        a = m73Var;
        m73 m73Var2 = new m73("DYNAMIC_OVERLAY", 1);
        b = m73Var2;
        c = new m73[]{m73Var, m73Var2};
    }

    public static m73 valueOf(String str) {
        return (m73) Enum.valueOf(m73.class, str);
    }

    public static m73[] values() {
        return (m73[]) c.clone();
    }
}
