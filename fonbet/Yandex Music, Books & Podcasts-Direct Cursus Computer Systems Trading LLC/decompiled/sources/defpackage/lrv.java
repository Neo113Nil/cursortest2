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
public class lrv {
    public static final lrv c;
    public static final lrv d;
    public static final lrv e;
    public static final /* synthetic */ lrv[] f;
    public final rrv a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    lrv EF0;

    /* JADX INFO: Fake field, exist only in values array */
    lrv EF1;

    /* JADX INFO: Fake field, exist only in values array */
    lrv EF2;

    public enum a extends lrv {
    }

    public enum b extends lrv {
    }

    public enum c extends lrv {
    }

    public enum d extends lrv {
    }

    static {
        lrv lrvVar = new lrv("DOUBLE", 0, rrv.DOUBLE, 1);
        lrv lrvVar2 = new lrv("FLOAT", 1, rrv.FLOAT, 5);
        rrv rrvVar = rrv.LONG;
        lrv lrvVar3 = new lrv("INT64", 2, rrvVar, 0);
        lrv lrvVar4 = new lrv("UINT64", 3, rrvVar, 0);
        rrv rrvVar2 = rrv.INT;
        lrv lrvVar5 = new lrv("INT32", 4, rrvVar2, 0);
        lrv lrvVar6 = new lrv("FIXED64", 5, rrvVar, 1);
        lrv lrvVar7 = new lrv("FIXED32", 6, rrvVar2, 5);
        lrv lrvVar8 = new lrv("BOOL", 7, rrv.BOOLEAN, 0);
        a aVar = new a("STRING", 8, rrv.STRING, 2);
        c = aVar;
        rrv rrvVar3 = rrv.MESSAGE;
        b bVar = new b("GROUP", 9, rrvVar3, 3);
        d = bVar;
        c cVar = new c("MESSAGE", 10, rrvVar3, 2);
        e = cVar;
        f = new lrv[]{lrvVar, lrvVar2, lrvVar3, lrvVar4, lrvVar5, lrvVar6, lrvVar7, lrvVar8, aVar, bVar, cVar, new d("BYTES", 11, rrv.BYTE_STRING, 2), new lrv("UINT32", 12, rrvVar2, 0), new lrv("ENUM", 13, rrv.ENUM, 0), new lrv("SFIXED32", 14, rrvVar2, 5), new lrv("SFIXED64", 15, rrvVar, 1), new lrv("SINT32", 16, rrvVar2, 0), new lrv("SINT64", 17, rrvVar, 0)};
    }

    public lrv(String str, int i, rrv rrvVar, int i2) {
        this.a = rrvVar;
        this.b = i2;
    }

    public static lrv valueOf(String str) {
        return (lrv) Enum.valueOf(lrv.class, str);
    }

    public static lrv[] values() {
        return (lrv[]) f.clone();
    }
}
