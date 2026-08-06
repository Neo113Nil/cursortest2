package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class tp1 {
    public static final defpackage.pp1 AARZUJiTa;
    public static final defpackage.qp1 EXtogiMhuM;
    public static final /* synthetic */ defpackage.tp1[] SH1y5HwkJhh;
    public static final defpackage.rp1 riuEU0zW4;
    public final defpackage.up1 adDC3e2L;
    public final int xiZrDbcSW0;

    /* JADX INFO: Fake field, exist only in values array */
    defpackage.tp1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    defpackage.tp1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    defpackage.tp1 EF2;

    static {
        defpackage.tp1 tp1Var = new defpackage.tp1("DOUBLE", 0, defpackage.up1.EXtogiMhuM, 1);
        defpackage.tp1 tp1Var2 = new defpackage.tp1("FLOAT", 1, defpackage.up1.AARZUJiTa, 5);
        defpackage.up1 up1Var = defpackage.up1.xiZrDbcSW0;
        defpackage.tp1 tp1Var3 = new defpackage.tp1("INT64", 2, up1Var, 0);
        defpackage.tp1 tp1Var4 = new defpackage.tp1("UINT64", 3, up1Var, 0);
        defpackage.up1 up1Var2 = defpackage.up1.adDC3e2L;
        defpackage.tp1 tp1Var5 = new defpackage.tp1("INT32", 4, up1Var2, 0);
        defpackage.tp1 tp1Var6 = new defpackage.tp1("FIXED64", 5, up1Var, 1);
        defpackage.tp1 tp1Var7 = new defpackage.tp1("FIXED32", 6, up1Var2, 5);
        defpackage.tp1 tp1Var8 = new defpackage.tp1("BOOL", 7, defpackage.up1.riuEU0zW4, 0);
        defpackage.pp1 pp1Var = new defpackage.pp1("STRING", 8, defpackage.up1.SH1y5HwkJhh, 2);
        AARZUJiTa = pp1Var;
        defpackage.up1 up1Var3 = defpackage.up1.DFo87pBq1E5;
        defpackage.qp1 qp1Var = new defpackage.qp1("GROUP", 9, up1Var3, 3);
        EXtogiMhuM = qp1Var;
        defpackage.rp1 rp1Var = new defpackage.rp1("MESSAGE", 10, up1Var3, 2);
        riuEU0zW4 = rp1Var;
        SH1y5HwkJhh = new defpackage.tp1[]{tp1Var, tp1Var2, tp1Var3, tp1Var4, tp1Var5, tp1Var6, tp1Var7, tp1Var8, pp1Var, qp1Var, rp1Var, new defpackage.sp1("BYTES", 11, defpackage.up1.ez2rX8ReCYw, 2), new defpackage.tp1("UINT32", 12, up1Var2, 0), new defpackage.tp1("ENUM", 13, defpackage.up1.JlrlGoKF, 0), new defpackage.tp1("SFIXED32", 14, up1Var2, 5), new defpackage.tp1("SFIXED64", 15, up1Var, 1), new defpackage.tp1("SINT32", 16, up1Var2, 0), new defpackage.tp1("SINT64", 17, up1Var, 0)};
    }

    public tp1(java.lang.String str, int i, defpackage.up1 up1Var, int i2) {
        this.adDC3e2L = up1Var;
        this.xiZrDbcSW0 = i2;
    }

    public static defpackage.tp1 valueOf(java.lang.String str) {
        return (defpackage.tp1) java.lang.Enum.valueOf(defpackage.tp1.class, str);
    }

    public static defpackage.tp1[] values() {
        return (defpackage.tp1[]) SH1y5HwkJhh.clone();
    }
}
