package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class jrq {
    public static final jrq a;
    public static final jrq b;
    public static final jrq c;
    public static final /* synthetic */ jrq[] d;

    static {
        jrq jrqVar = new jrq("Regular", 0);
        a = jrqVar;
        jrq jrqVar2 = new jrq("Error", 1);
        b = jrqVar2;
        jrq jrqVar3 = new jrq("Offline", 2);
        c = jrqVar3;
        d = new jrq[]{jrqVar, jrqVar2, jrqVar3};
    }

    public static jrq valueOf(String str) {
        return (jrq) Enum.valueOf(jrq.class, str);
    }

    public static jrq[] values() {
        return (jrq[]) d.clone();
    }
}
