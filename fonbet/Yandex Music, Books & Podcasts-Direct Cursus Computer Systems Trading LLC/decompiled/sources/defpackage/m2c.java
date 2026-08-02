package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m2c {
    public static final m2c a;
    public static final m2c b;
    public static final m2c c;
    public static final /* synthetic */ m2c[] d;

    static {
        m2c m2cVar = new m2c("DEFAULT", 0);
        a = m2cVar;
        m2c m2cVar2 = new m2c("DONATION", 1);
        b = m2cVar2;
        m2c m2cVar3 = new m2c("YEAR_REWIND", 2);
        c = m2cVar3;
        d = new m2c[]{m2cVar, m2cVar2, m2cVar3};
    }

    public static m2c valueOf(String str) {
        return (m2c) Enum.valueOf(m2c.class, str);
    }

    public static m2c[] values() {
        return (m2c[]) d.clone();
    }
}
