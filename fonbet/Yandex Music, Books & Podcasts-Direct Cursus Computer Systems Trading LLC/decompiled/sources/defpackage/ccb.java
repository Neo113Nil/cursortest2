package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class ccb {
    public static final ccb b;
    public static final ccb c;
    public static final ccb d;
    public static final ccb e;
    public static final ccb f;
    public static final ccb g;
    public static final ccb h;
    public static final ccb i;
    public static final ccb j;
    public static final ccb k;
    public static final ccb l;
    public static final ccb m;
    public static final ccb n;
    public static final ccb o;
    public static final ccb p;
    public static final ccb q;
    public static final ccb r;
    public static final /* synthetic */ ccb[] s;
    public final ao1 a;

    static {
        ao1 ao1Var = ao1.c;
        ccb ccbVar = new ccb("COMMON", 0, ao1Var);
        b = ccbVar;
        ao1 ao1Var2 = ao1.d;
        ccb ccbVar2 = new ccb("PODCAST", 1, ao1Var2);
        c = ccbVar2;
        ccb ccbVar3 = new ccb("ARTICLE", 2, ao1Var2);
        d = ccbVar3;
        ccb ccbVar4 = new ccb("ASMR", 3, ao1Var);
        e = ccbVar4;
        ccb ccbVar5 = new ccb("NOISE", 4, ao1Var);
        f = ccbVar5;
        ccb ccbVar6 = new ccb("RADIO_RECORD", 5, ao1Var);
        g = ccbVar6;
        ccb ccbVar7 = new ccb("SHOW", 6, ao1Var2);
        h = ccbVar7;
        ccb ccbVar8 = new ccb("LECTURE", 7, ao1Var2);
        i = ccbVar8;
        ccb ccbVar9 = new ccb("FAIRY_TALE", 8, ao1Var2);
        j = ccbVar9;
        ccb ccbVar10 = new ccb("BOOK", 9, ao1Var2);
        k = ccbVar10;
        ccb ccbVar11 = new ccb("AUDIOBOOK", 10, ao1Var2);
        l = ccbVar11;
        ccb ccbVar12 = new ccb("POETRY", 11, ao1Var);
        m = ccbVar12;
        ccb ccbVar13 = new ccb("TRAILER", 12, ao1Var);
        n = ccbVar13;
        ccb ccbVar14 = new ccb("COMMENT", 13, ao1Var2);
        o = ccbVar14;
        ccb ccbVar15 = new ccb("BONUS", 14, ao1Var);
        p = ccbVar15;
        ccb ccbVar16 = new ccb("COMPILATION", 15, ao1Var);
        q = ccbVar16;
        ccb ccbVar17 = new ccb("SINGLE", 16, ao1Var);
        r = ccbVar17;
        s = new ccb[]{ccbVar, ccbVar2, ccbVar3, ccbVar4, ccbVar5, ccbVar6, ccbVar7, ccbVar8, ccbVar9, ccbVar10, ccbVar11, ccbVar12, ccbVar13, ccbVar14, ccbVar15, ccbVar16, ccbVar17};
    }

    public ccb(String str, int i2, ao1 ao1Var) {
        this.a = ao1Var;
    }

    public static ccb valueOf(String str) {
        return (ccb) Enum.valueOf(ccb.class, str);
    }

    public static ccb[] values() {
        return (ccb[]) s.clone();
    }
}
