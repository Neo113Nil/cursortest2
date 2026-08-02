package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ipf {
    public static final ipf a;
    public static final ipf b;
    public static final ipf c;
    public static final ipf d;
    public static final ipf e;
    public static final /* synthetic */ ipf[] f;

    static {
        ipf ipfVar = new ipf("Measuring", 0);
        a = ipfVar;
        ipf ipfVar2 = new ipf("LookaheadMeasuring", 1);
        b = ipfVar2;
        ipf ipfVar3 = new ipf("LayingOut", 2);
        c = ipfVar3;
        ipf ipfVar4 = new ipf("LookaheadLayingOut", 3);
        d = ipfVar4;
        ipf ipfVar5 = new ipf("Idle", 4);
        e = ipfVar5;
        f = new ipf[]{ipfVar, ipfVar2, ipfVar3, ipfVar4, ipfVar5};
    }

    public static ipf valueOf(String str) {
        return (ipf) Enum.valueOf(ipf.class, str);
    }

    public static ipf[] values() {
        return (ipf[]) f.clone();
    }
}
