package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class rqp implements brp {
    public static final rqp a;
    public static final rqp b;
    public static final rqp c;
    public static final rqp d;
    public static final /* synthetic */ rqp[] e;

    static {
        rqp rqpVar = new rqp("ReadyToDownload", 0);
        a = rqpVar;
        rqp rqpVar2 = new rqp("InProgress", 1);
        b = rqpVar2;
        rqp rqpVar3 = new rqp("Downloaded", 2);
        c = rqpVar3;
        rqp rqpVar4 = new rqp("Disabled", 3);
        d = rqpVar4;
        e = new rqp[]{rqpVar, rqpVar2, rqpVar3, rqpVar4};
    }

    public static rqp valueOf(String str) {
        return (rqp) Enum.valueOf(rqp.class, str);
    }

    public static rqp[] values() {
        return (rqp[]) e.clone();
    }
}
