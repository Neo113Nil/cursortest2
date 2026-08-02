package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mpb {
    public static final mpb a;
    public static final mpb b;
    public static final mpb c;
    public static final /* synthetic */ mpb[] d;

    static {
        mpb mpbVar = new mpb("REPLACE", 0);
        a = mpbVar;
        mpb mpbVar2 = new mpb("KEEP", 1);
        b = mpbVar2;
        mpb mpbVar3 = new mpb("UPDATE", 2);
        c = mpbVar3;
        d = new mpb[]{mpbVar, mpbVar2, mpbVar3, new mpb("CANCEL_AND_REENQUEUE", 3)};
    }

    public static mpb valueOf(String str) {
        return (mpb) Enum.valueOf(mpb.class, str);
    }

    public static mpb[] values() {
        return (mpb[]) d.clone();
    }
}
