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
    public static final SL f27472v;

    /* renamed from: w, reason: collision with root package name */
    public static final SL f27473w;

    /* renamed from: x, reason: collision with root package name */
    public static final SL f27474x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ SL[] f27475y;

    /* renamed from: n, reason: collision with root package name */
    public final TL f27476n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27477u;

    /* JADX INFO: Fake field, exist only in values array */
    SL EF1;

    /* JADX INFO: Fake field, exist only in values array */
    SL EF2;

    /* JADX INFO: Fake field, exist only in values array */
    SL EF0;

    static {
        SL sl = new SL("DOUBLE", 0, TL.f27728w, 1);
        SL sl2 = new SL("FLOAT", 1, TL.f27727v, 5);
        TL tl = TL.f27726u;
        SL sl3 = new SL("INT64", 2, tl, 0);
        SL sl4 = new SL("UINT64", 3, tl, 0);
        TL tl2 = TL.f27725n;
        SL sl5 = new SL("INT32", 4, tl2, 0);
        SL sl6 = new SL("FIXED64", 5, tl, 1);
        SL sl7 = new SL("FIXED32", 6, tl2, 5);
        SL sl8 = new SL("BOOL", 7, TL.f27729x, 0);
        SL sl9 = new SL("STRING", 8, TL.f27730y, 2);
        f27472v = sl9;
        TL tl3 = TL.f27723B;
        SL sl10 = new SL("GROUP", 9, tl3, 3);
        f27473w = sl10;
        SL sl11 = new SL("MESSAGE", 10, tl3, 2);
        f27474x = sl11;
        f27475y = new SL[]{sl, sl2, sl3, sl4, sl5, sl6, sl7, sl8, sl9, sl10, sl11, new SL("BYTES", 11, TL.f27731z, 2), new SL("UINT32", 12, tl2, 0), new SL("ENUM", 13, TL.f27722A, 0), new SL("SFIXED32", 14, tl2, 5), new SL("SFIXED64", 15, tl, 1), new SL("SINT32", 16, tl2, 0), new SL("SINT64", 17, tl, 0)};
    }

    public SL(String str, int i, TL tl, int i6) {
        this.f27476n = tl;
        this.f27477u = i6;
    }

    public static SL[] values() {
        return (SL[]) f27475y.clone();
    }
}
