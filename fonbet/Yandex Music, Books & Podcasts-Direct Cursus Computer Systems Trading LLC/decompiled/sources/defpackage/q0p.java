package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q0p {
    public static final q0p a;
    public static final q0p b;
    public static final /* synthetic */ q0p[] c;

    static {
        q0p q0pVar = new q0p("INFO_SCREEN", 0);
        a = q0pVar;
        q0p q0pVar2 = new q0p("TICKET_PURCHASE", 1);
        b = q0pVar2;
        c = new q0p[]{q0pVar, q0pVar2};
    }

    public static q0p valueOf(String str) {
        return (q0p) Enum.valueOf(q0p.class, str);
    }

    public static q0p[] values() {
        return (q0p[]) c.clone();
    }
}
