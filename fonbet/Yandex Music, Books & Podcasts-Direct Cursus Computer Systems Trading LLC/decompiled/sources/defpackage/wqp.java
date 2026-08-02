package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class wqp implements brp {
    public static final wqp a;
    public static final wqp b;
    public static final /* synthetic */ wqp[] c;

    static {
        wqp wqpVar = new wqp("On", 0);
        a = wqpVar;
        wqp wqpVar2 = new wqp("Off", 1);
        b = wqpVar2;
        c = new wqp[]{wqpVar, wqpVar2};
    }

    public static wqp valueOf(String str) {
        return (wqp) Enum.valueOf(wqp.class, str);
    }

    public static wqp[] values() {
        return (wqp[]) c.clone();
    }
}
