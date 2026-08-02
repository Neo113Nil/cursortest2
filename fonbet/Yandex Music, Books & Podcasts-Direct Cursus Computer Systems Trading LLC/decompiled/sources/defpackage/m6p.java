package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m6p {
    public static final m6p a;
    public static final m6p b;
    public static final /* synthetic */ m6p[] c;

    static {
        m6p m6pVar = new m6p("HISTORY", 0);
        a = m6pVar;
        m6p m6pVar2 = new m6p("RESULT", 1);
        b = m6pVar2;
        c = new m6p[]{m6pVar, m6pVar2};
    }

    public static m6p valueOf(String str) {
        return (m6p) Enum.valueOf(m6p.class, str);
    }

    public static m6p[] values() {
        return (m6p[]) c.clone();
    }
}
