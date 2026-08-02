package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ipb {
    public static final ipb a;
    public static final /* synthetic */ ipb[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ipb EF0;

    static {
        ipb ipbVar = new ipb("IGNORE", 0);
        ipb ipbVar2 = new ipb("RESPECT_PERFORMANCE", 1);
        a = ipbVar2;
        b = new ipb[]{ipbVar, ipbVar2, new ipb("RESPECT_ALL", 2)};
    }

    public static ipb valueOf(String str) {
        return (ipb) Enum.valueOf(ipb.class, str);
    }

    public static ipb[] values() {
        return (ipb[]) b.clone();
    }
}
