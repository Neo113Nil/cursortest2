package com.gamericefishpro.space.q4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class m1 {
    public static final i1 i;
    public static final j1 v;
    public static final k1 w;
    public static final /* synthetic */ m1[] y;
    public final n1 d;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    m1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    m1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    m1 EF2;

    static {
        m1 m1Var = new m1("DOUBLE", 0, n1.v, 1);
        m1 m1Var2 = new m1("FLOAT", 1, n1.i, 5);
        n1 n1Var = n1.e;
        m1 m1Var3 = new m1("INT64", 2, n1Var, 0);
        m1 m1Var4 = new m1("UINT64", 3, n1Var, 0);
        n1 n1Var2 = n1.d;
        m1 m1Var5 = new m1("INT32", 4, n1Var2, 0);
        m1 m1Var6 = new m1("FIXED64", 5, n1Var, 1);
        m1 m1Var7 = new m1("FIXED32", 6, n1Var2, 5);
        m1 m1Var8 = new m1("BOOL", 7, n1.w, 0);
        i1 i1Var = new i1("STRING", 8, n1.y, 2);
        i = i1Var;
        n1 n1Var3 = n1.B;
        j1 j1Var = new j1("GROUP", 9, n1Var3, 3);
        v = j1Var;
        k1 k1Var = new k1("MESSAGE", 10, n1Var3, 2);
        w = k1Var;
        y = new m1[]{m1Var, m1Var2, m1Var3, m1Var4, m1Var5, m1Var6, m1Var7, m1Var8, i1Var, j1Var, k1Var, new l1("BYTES", 11, n1.z, 2), new m1("UINT32", 12, n1Var2, 0), new m1("ENUM", 13, n1.A, 0), new m1("SFIXED32", 14, n1Var2, 5), new m1("SFIXED64", 15, n1Var, 1), new m1("SINT32", 16, n1Var2, 0), new m1("SINT64", 17, n1Var, 0)};
    }

    public m1(String str, int i2, n1 n1Var, int i3) {
        super(str, i2);
        this.d = n1Var;
        this.e = i3;
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) y.clone();
    }
}
