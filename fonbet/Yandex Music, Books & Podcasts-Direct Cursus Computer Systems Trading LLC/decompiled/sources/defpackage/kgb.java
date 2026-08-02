package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class kgb {
    public static final kgb a;
    public static final kgb b;
    public static final kgb c;
    public static final kgb d;
    public static final /* synthetic */ kgb[] e;

    static {
        kgb kgbVar = new kgb("NETWORK", 0);
        a = kgbVar;
        kgb kgbVar2 = new kgb("NATIVE", 1);
        b = kgbVar2;
        kgb kgbVar3 = new kgb("STORE", 2);
        c = kgbVar3;
        kgb kgbVar4 = new kgb("OTHER", 3);
        d = kgbVar4;
        e = new kgb[]{kgbVar, kgbVar2, kgbVar3, kgbVar4};
    }

    public static kgb valueOf(String str) {
        return (kgb) Enum.valueOf(kgb.class, str);
    }

    public static kgb[] values() {
        return (kgb[]) e.clone();
    }
}
