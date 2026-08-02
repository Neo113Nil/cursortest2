package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ugb {
    public static final ugb a;
    public static final ugb b;
    public static final /* synthetic */ ugb[] c;

    static {
        ugb ugbVar = new ugb("FILE", 0);
        a = ugbVar;
        ugb ugbVar2 = new ugb("INFO", 1);
        ugb ugbVar3 = new ugb("VIDEO", 2);
        ugb ugbVar4 = new ugb("COVER", 3);
        b = ugbVar4;
        c = new ugb[]{ugbVar, ugbVar2, ugbVar3, ugbVar4};
    }

    public static ugb valueOf(String str) {
        return (ugb) Enum.valueOf(ugb.class, str);
    }

    public static ugb[] values() {
        return (ugb[]) c.clone();
    }
}
