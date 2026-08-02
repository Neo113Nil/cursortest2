package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m3v {
    public static final m3v a;
    public static final m3v b;
    public static final m3v c;
    public static final m3v d;
    public static final /* synthetic */ m3v[] e;

    static {
        m3v m3vVar = new m3v("Regular", 0);
        a = m3vVar;
        m3v m3vVar2 = new m3v("Personal", 1);
        b = m3vVar2;
        m3v m3vVar3 = new m3v("Query2Vibe", 2);
        c = m3vVar3;
        m3v m3vVar4 = new m3v("OnDemand", 3);
        d = m3vVar4;
        e = new m3v[]{m3vVar, m3vVar2, m3vVar3, m3vVar4};
    }

    public static m3v valueOf(String str) {
        return (m3v) Enum.valueOf(m3v.class, str);
    }

    public static m3v[] values() {
        return (m3v[]) e.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2 && ordinal != 3) {
                b6e.s();
                return false;
            }
        }
        return true;
    }
}
