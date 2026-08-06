package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pz {
    public static final defpackage.pz AARZUJiTa;
    public static final defpackage.pz EXtogiMhuM;
    public static final /* synthetic */ defpackage.pz[] SH1y5HwkJhh;
    public static final defpackage.pz adDC3e2L;
    public static final defpackage.pz riuEU0zW4;
    public static final defpackage.pz xiZrDbcSW0;

    static {
        defpackage.pz pzVar = new defpackage.pz("ON_CONFIGURE", 0);
        adDC3e2L = pzVar;
        defpackage.pz pzVar2 = new defpackage.pz("ON_CREATE", 1);
        xiZrDbcSW0 = pzVar2;
        defpackage.pz pzVar3 = new defpackage.pz("ON_UPGRADE", 2);
        AARZUJiTa = pzVar3;
        defpackage.pz pzVar4 = new defpackage.pz("ON_DOWNGRADE", 3);
        EXtogiMhuM = pzVar4;
        defpackage.pz pzVar5 = new defpackage.pz("ON_OPEN", 4);
        riuEU0zW4 = pzVar5;
        SH1y5HwkJhh = new defpackage.pz[]{pzVar, pzVar2, pzVar3, pzVar4, pzVar5};
    }

    public static defpackage.pz valueOf(java.lang.String str) {
        return (defpackage.pz) java.lang.Enum.valueOf(defpackage.pz.class, str);
    }

    public static defpackage.pz[] values() {
        return (defpackage.pz[]) SH1y5HwkJhh.clone();
    }
}
