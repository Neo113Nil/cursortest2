package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m2a {
    public static final m2a a;
    public static final m2a b;
    public static final m2a c;
    public static final m2a d;
    public static final /* synthetic */ m2a[] e;

    static {
        m2a m2aVar = new m2a("Linear", 0);
        a = m2aVar;
        m2a m2aVar2 = new m2a("EaseIn", 1);
        b = m2aVar2;
        m2a m2aVar3 = new m2a("EaseOut", 2);
        c = m2aVar3;
        m2a m2aVar4 = new m2a("EaseInOut", 3);
        d = m2aVar4;
        e = new m2a[]{m2aVar, m2aVar2, m2aVar3, m2aVar4};
    }

    public static m2a valueOf(String str) {
        return (m2a) Enum.valueOf(m2a.class, str);
    }

    public static m2a[] values() {
        return (m2a[]) e.clone();
    }
}
