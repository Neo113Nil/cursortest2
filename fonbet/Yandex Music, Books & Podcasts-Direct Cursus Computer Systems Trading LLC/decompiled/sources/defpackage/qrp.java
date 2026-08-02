package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class qrp {
    public static final qrp a;
    public static final qrp b;
    public static final qrp c;
    public static final qrp d;
    public static final /* synthetic */ qrp[] e;

    static {
        qrp qrpVar = new qrp("CommonSettings", 0);
        a = qrpVar;
        qrp qrpVar2 = new qrp("MusicSettings", 1);
        b = qrpVar2;
        qrp qrpVar3 = new qrp("NonMusicSettings", 2);
        c = qrpVar3;
        qrp qrpVar4 = new qrp("AllSettings", 3);
        d = qrpVar4;
        e = new qrp[]{qrpVar, qrpVar2, qrpVar3, qrpVar4};
    }

    public static qrp valueOf(String str) {
        return (qrp) Enum.valueOf(qrp.class, str);
    }

    public static qrp[] values() {
        return (qrp[]) e.clone();
    }
}
