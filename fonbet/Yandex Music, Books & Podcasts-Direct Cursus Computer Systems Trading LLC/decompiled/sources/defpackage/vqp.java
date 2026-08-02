package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vqp implements brp {
    public static final vqp a;
    public static final vqp b;
    public static final vqp c;
    public static final vqp d;
    public static final /* synthetic */ vqp[] e;

    static {
        vqp vqpVar = new vqp("Disabled", 0);
        a = vqpVar;
        vqp vqpVar2 = new vqp("None", 1);
        b = vqpVar2;
        vqp vqpVar3 = new vqp("One", 2);
        c = vqpVar3;
        vqp vqpVar4 = new vqp("All", 3);
        d = vqpVar4;
        e = new vqp[]{vqpVar, vqpVar2, vqpVar3, vqpVar4};
    }

    public static vqp valueOf(String str) {
        return (vqp) Enum.valueOf(vqp.class, str);
    }

    public static vqp[] values() {
        return (vqp[]) e.clone();
    }
}
