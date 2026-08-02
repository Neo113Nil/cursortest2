package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zo2 {
    public static final zo2 a;
    public static final /* synthetic */ zo2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    zo2 EF1;

    static {
        zo2 zo2Var = new zo2("AZTEC", 0);
        zo2 zo2Var2 = new zo2("CODABAR", 1);
        zo2 zo2Var3 = new zo2("CODE_39", 2);
        zo2 zo2Var4 = new zo2("CODE_93", 3);
        zo2 zo2Var5 = new zo2("CODE_128", 4);
        zo2 zo2Var6 = new zo2("DATA_MATRIX", 5);
        zo2 zo2Var7 = new zo2("EAN_8", 6);
        zo2 zo2Var8 = new zo2("EAN_13", 7);
        zo2 zo2Var9 = new zo2("ITF", 8);
        zo2 zo2Var10 = new zo2("MAXICODE", 9);
        zo2 zo2Var11 = new zo2("PDF_417", 10);
        zo2 zo2Var12 = new zo2("QR_CODE", 11);
        a = zo2Var12;
        b = new zo2[]{zo2Var, zo2Var2, zo2Var3, zo2Var4, zo2Var5, zo2Var6, zo2Var7, zo2Var8, zo2Var9, zo2Var10, zo2Var11, zo2Var12, new zo2("RSS_14", 12), new zo2("RSS_EXPANDED", 13), new zo2("UPC_A", 14), new zo2("UPC_E", 15), new zo2("UPC_EAN_EXTENSION", 16)};
    }

    public static zo2 valueOf(String str) {
        return (zo2) Enum.valueOf(zo2.class, str);
    }

    public static zo2[] values() {
        return (zo2[]) b.clone();
    }
}
