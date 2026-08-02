package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class SL {

    /* renamed from: v, reason: collision with root package name */
    public static final SL f28185v;

    /* renamed from: w, reason: collision with root package name */
    public static final SL f28186w;

    /* renamed from: x, reason: collision with root package name */
    public static final SL f28187x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ SL[] f28188y;

    /* renamed from: n, reason: collision with root package name */
    public final TL f28189n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28190u;

    /* JADX INFO: Fake field, exist only in values array */
    SL EF1;

    /* JADX INFO: Fake field, exist only in values array */
    SL EF2;

    /* JADX INFO: Fake field, exist only in values array */
    SL EF0;

    static {
        SL sl = new SL("DOUBLE", 0, TL.f28511w, 1);
        SL sl2 = new SL("FLOAT", 1, TL.f28510v, 5);
        TL tl = TL.f28509u;
        SL sl3 = new SL("INT64", 2, tl, 0);
        SL sl4 = new SL("UINT64", 3, tl, 0);
        TL tl2 = TL.f28508n;
        SL sl5 = new SL("INT32", 4, tl2, 0);
        SL sl6 = new SL("FIXED64", 5, tl, 1);
        SL sl7 = new SL("FIXED32", 6, tl2, 5);
        SL sl8 = new SL("BOOL", 7, TL.f28512x, 0);
        SL sl9 = new SL("STRING", 8, TL.f28513y, 2);
        f28185v = sl9;
        TL tl3 = TL.f28506B;
        SL sl10 = new SL("GROUP", 9, tl3, 3);
        f28186w = sl10;
        SL sl11 = new SL("MESSAGE", 10, tl3, 2);
        f28187x = sl11;
        f28188y = new SL[]{sl, sl2, sl3, sl4, sl5, sl6, sl7, sl8, sl9, sl10, sl11, new SL("BYTES", 11, TL.f28514z, 2), new SL("UINT32", 12, tl2, 0), new SL("ENUM", 13, TL.f28505A, 0), new SL("SFIXED32", 14, tl2, 5), new SL("SFIXED64", 15, tl, 1), new SL("SINT32", 16, tl2, 0), new SL("SINT64", 17, tl, 0)};
    }

    public SL(String str, int i, TL tl, int i4) {
        this.f28189n = tl;
        this.f28190u = i4;
    }

    public static SL[] values() {
        return (SL[]) f28188y.clone();
    }
}
