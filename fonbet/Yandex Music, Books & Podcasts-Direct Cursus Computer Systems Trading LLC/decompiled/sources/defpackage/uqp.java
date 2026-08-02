package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class uqp implements brp {
    public static final uqp a;
    public static final uqp b;
    public static final /* synthetic */ uqp[] c;

    static {
        uqp uqpVar = new uqp("Disabled", 0);
        a = uqpVar;
        uqp uqpVar2 = new uqp("Available", 1);
        b = uqpVar2;
        c = new uqp[]{uqpVar, uqpVar2};
    }

    public static uqp valueOf(String str) {
        return (uqp) Enum.valueOf(uqp.class, str);
    }

    public static uqp[] values() {
        return (uqp[]) c.clone();
    }
}
