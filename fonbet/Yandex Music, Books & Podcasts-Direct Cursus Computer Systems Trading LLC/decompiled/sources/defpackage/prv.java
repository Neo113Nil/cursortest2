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
/* loaded from: classes3.dex */
public class prv {
    public static final prv c;
    public static final mrv d;
    public static final nrv e;
    public static final /* synthetic */ prv[] f;
    public final qrv a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    prv EF0;

    /* JADX INFO: Fake field, exist only in values array */
    prv EF1;

    /* JADX INFO: Fake field, exist only in values array */
    prv EF2;

    static {
        prv prvVar = new prv("DOUBLE", 0, qrv.DOUBLE, 1);
        prv prvVar2 = new prv("FLOAT", 1, qrv.FLOAT, 5);
        qrv qrvVar = qrv.LONG;
        prv prvVar3 = new prv("INT64", 2, qrvVar, 0);
        prv prvVar4 = new prv("UINT64", 3, qrvVar, 0);
        qrv qrvVar2 = qrv.INT;
        prv prvVar5 = new prv("INT32", 4, qrvVar2, 0);
        c = prvVar5;
        prv prvVar6 = new prv("FIXED64", 5, qrvVar, 1);
        prv prvVar7 = new prv("FIXED32", 6, qrvVar2, 5);
        prv prvVar8 = new prv("BOOL", 7, qrv.BOOLEAN, 0);
        krv krvVar = new krv("STRING", 8, qrv.STRING, 2);
        qrv qrvVar3 = qrv.MESSAGE;
        mrv mrvVar = new mrv("GROUP", 9, qrvVar3, 3);
        d = mrvVar;
        nrv nrvVar = new nrv("MESSAGE", 10, qrvVar3, 2);
        e = nrvVar;
        f = new prv[]{prvVar, prvVar2, prvVar3, prvVar4, prvVar5, prvVar6, prvVar7, prvVar8, krvVar, mrvVar, nrvVar, new orv("BYTES", 11, qrv.BYTE_STRING, 2), new prv("UINT32", 12, qrvVar2, 0), new prv("ENUM", 13, qrv.ENUM, 0), new prv("SFIXED32", 14, qrvVar2, 5), new prv("SFIXED64", 15, qrvVar, 1), new prv("SINT32", 16, qrvVar2, 0), new prv("SINT64", 17, qrvVar, 0)};
    }

    public prv(String str, int i, qrv qrvVar, int i2) {
        this.a = qrvVar;
        this.b = i2;
    }

    public static prv valueOf(String str) {
        return (prv) Enum.valueOf(prv.class, str);
    }

    public static prv[] values() {
        return (prv[]) f.clone();
    }
}
