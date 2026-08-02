package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class bkd {
    public static final bkd c;
    public static final bkd d;
    public static final bkd e;
    public static final bkd f;
    public static final bkd g;
    public static final /* synthetic */ bkd[] h;
    public final boolean a;
    public final boolean b;

    static {
        int i = 1;
        bkd bkdVar = new bkd("TRACK", true, true, 0);
        c = bkdVar;
        bkd bkdVar2 = new bkd("SHOT", i, i);
        d = bkdVar2;
        int i2 = 3;
        bkd bkdVar3 = new bkd("STREAM", 2, i2);
        e = bkdVar3;
        bkd bkdVar4 = new bkd("GENERATIVE", i2, i2);
        f = bkdVar4;
        bkd bkdVar5 = new bkd("UNKNOWN", 4, i2);
        g = bkdVar5;
        h = new bkd[]{bkdVar, bkdVar2, bkdVar3, bkdVar4, bkdVar5};
    }

    public /* synthetic */ bkd(String str, int i, int i2) {
        this(str, false, (i2 & 2) == 0, i);
    }

    public static bkd valueOf(String str) {
        return (bkd) Enum.valueOf(bkd.class, str);
    }

    public static bkd[] values() {
        return (bkd[]) h.clone();
    }

    public bkd(String str, boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
    }
}
