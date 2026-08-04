package com.gamericefishpro.space.i9;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class w6 {
    public static final w6 i;
    public static final w6 v;
    public static final /* synthetic */ w6[] w;
    public final x6 d;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    w6 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    w6 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    w6 EF0;

    static {
        w6 w6Var = new w6("DOUBLE", 0, x6.v, 1);
        w6 w6Var2 = new w6("FLOAT", 1, x6.i, 5);
        x6 x6Var = x6.e;
        w6 w6Var3 = new w6("INT64", 2, x6Var, 0);
        w6 w6Var4 = new w6("UINT64", 3, x6Var, 0);
        x6 x6Var2 = x6.d;
        w6 w6Var5 = new w6("INT32", 4, x6Var2, 0);
        w6 w6Var6 = new w6("FIXED64", 5, x6Var, 1);
        w6 w6Var7 = new w6("FIXED32", 6, x6Var2, 5);
        w6 w6Var8 = new w6("BOOL", 7, x6.w, 0);
        w6 w6Var9 = new w6("STRING", 8, x6.y, 2);
        i = w6Var9;
        x6 x6Var3 = x6.B;
        w6 w6Var10 = new w6("GROUP", 9, x6Var3, 3);
        v = w6Var10;
        w = new w6[]{w6Var, w6Var2, w6Var3, w6Var4, w6Var5, w6Var6, w6Var7, w6Var8, w6Var9, w6Var10, new w6("MESSAGE", 10, x6Var3, 2), new w6("BYTES", 11, x6.z, 2), new w6("UINT32", 12, x6Var2, 0), new w6("ENUM", 13, x6.A, 0), new w6("SFIXED32", 14, x6Var2, 5), new w6("SFIXED64", 15, x6Var, 1), new w6("SINT32", 16, x6Var2, 0), new w6("SINT64", 17, x6Var, 0)};
    }

    public w6(String str, int i2, x6 x6Var, int i3) {
        super(str, i2);
        this.d = x6Var;
        this.e = i3;
    }

    public static w6[] values() {
        return (w6[]) w.clone();
    }
}
