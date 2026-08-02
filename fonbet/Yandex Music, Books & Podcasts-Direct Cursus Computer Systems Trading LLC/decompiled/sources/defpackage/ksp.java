package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ksp implements msp {
    public static final wfl a;
    public static final ksp b;
    public static final ksp c;
    public static final ksp d;
    public static final ksp e;
    public static final ksp f;
    public static final ksp g;
    public static final /* synthetic */ ksp[] h;
    public static final /* synthetic */ rdb i;

    static {
        ksp kspVar = new ksp("DEV", 0);
        ksp kspVar2 = new ksp("OFFLINE", 1);
        b = kspVar2;
        ksp kspVar3 = new ksp("SOUND", 2);
        c = kspVar3;
        ksp kspVar4 = new ksp("FOR_KIDS", 3);
        d = kspVar4;
        ksp kspVar5 = new ksp("THEME", 4);
        e = kspVar5;
        ksp kspVar6 = new ksp("SMART_DEVICES", 5);
        ksp kspVar7 = new ksp("COLLECTION", 6);
        f = kspVar7;
        ksp kspVar8 = new ksp("HELP", 7);
        g = kspVar8;
        ksp[] kspVarArr = {kspVar, kspVar2, kspVar3, kspVar4, kspVar5, kspVar6, kspVar7, kspVar8};
        h = kspVarArr;
        i = new rdb(kspVarArr);
        a = new wfl();
    }

    public static ksp valueOf(String str) {
        return (ksp) Enum.valueOf(ksp.class, str);
    }

    public static ksp[] values() {
        return (ksp[]) h.clone();
    }

    @Override // defpackage.msp
    public final ksp a() {
        return this;
    }
}
