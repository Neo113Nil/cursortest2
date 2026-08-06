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
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class yh1 {
    public static final uh1 AvO7iQsrTN;
    public static final /* synthetic */ yh1[] JFJ3QoxA;
    public static final vh1 encWxUiV2;
    public static final wh1 mOu10nynGul;
    public final int EljAMC1QTz;
    public final zh1 OOA6hdeuvCS;

    /* JADX INFO: Fake field, exist only in values array */
    yh1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    yh1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    yh1 EF2;

    static {
        yh1 yh1Var = new yh1("DOUBLE", 0, zh1.encWxUiV2, 1);
        yh1 yh1Var2 = new yh1("FLOAT", 1, zh1.AvO7iQsrTN, 5);
        zh1 zh1Var = zh1.EljAMC1QTz;
        yh1 yh1Var3 = new yh1("INT64", 2, zh1Var, 0);
        yh1 yh1Var4 = new yh1("UINT64", 3, zh1Var, 0);
        zh1 zh1Var2 = zh1.OOA6hdeuvCS;
        yh1 yh1Var5 = new yh1("INT32", 4, zh1Var2, 0);
        yh1 yh1Var6 = new yh1("FIXED64", 5, zh1Var, 1);
        yh1 yh1Var7 = new yh1("FIXED32", 6, zh1Var2, 5);
        yh1 yh1Var8 = new yh1("BOOL", 7, zh1.mOu10nynGul, 0);
        uh1 uh1Var = new uh1("STRING", 8, zh1.JFJ3QoxA, 2);
        AvO7iQsrTN = uh1Var;
        zh1 zh1Var3 = zh1.XnEVoBF0td1l;
        vh1 vh1Var = new vh1("GROUP", 9, zh1Var3, 3);
        encWxUiV2 = vh1Var;
        wh1 wh1Var = new wh1("MESSAGE", 10, zh1Var3, 2);
        mOu10nynGul = wh1Var;
        JFJ3QoxA = new yh1[]{yh1Var, yh1Var2, yh1Var3, yh1Var4, yh1Var5, yh1Var6, yh1Var7, yh1Var8, uh1Var, vh1Var, wh1Var, new xh1("BYTES", 11, zh1.rQPn8YBR, 2), new yh1("UINT32", 12, zh1Var2, 0), new yh1("ENUM", 13, zh1.E7jCp8Ls, 0), new yh1("SFIXED32", 14, zh1Var2, 5), new yh1("SFIXED64", 15, zh1Var, 1), new yh1("SINT32", 16, zh1Var2, 0), new yh1("SINT64", 17, zh1Var, 0)};
    }

    public yh1(String str, int i, zh1 zh1Var, int i2) {
        this.OOA6hdeuvCS = zh1Var;
        this.EljAMC1QTz = i2;
    }

    public static yh1 valueOf(String str) {
        return (yh1) Enum.valueOf(yh1.class, str);
    }

    public static yh1[] values() {
        return (yh1[]) JFJ3QoxA.clone();
    }
}
