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
/* renamed from: com.google.android.gms.internal.ads.fM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3200fM {

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC3200fM f30691v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC3200fM f30692w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC3200fM f30693x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ EnumC3200fM[] f30694y;

    /* renamed from: n, reason: collision with root package name */
    public final EnumC3255gM f30695n;

    /* renamed from: u, reason: collision with root package name */
    public final int f30696u;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3200fM EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3200fM EF2;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3200fM EF0;

    static {
        EnumC3200fM enumC3200fM = new EnumC3200fM("DOUBLE", 0, EnumC3255gM.f30998w, 1);
        EnumC3200fM enumC3200fM2 = new EnumC3200fM("FLOAT", 1, EnumC3255gM.f30997v, 5);
        EnumC3255gM enumC3255gM = EnumC3255gM.f30996u;
        EnumC3200fM enumC3200fM3 = new EnumC3200fM("INT64", 2, enumC3255gM, 0);
        EnumC3200fM enumC3200fM4 = new EnumC3200fM("UINT64", 3, enumC3255gM, 0);
        EnumC3255gM enumC3255gM2 = EnumC3255gM.f30995n;
        EnumC3200fM enumC3200fM5 = new EnumC3200fM("INT32", 4, enumC3255gM2, 0);
        EnumC3200fM enumC3200fM6 = new EnumC3200fM("FIXED64", 5, enumC3255gM, 1);
        EnumC3200fM enumC3200fM7 = new EnumC3200fM("FIXED32", 6, enumC3255gM2, 5);
        EnumC3200fM enumC3200fM8 = new EnumC3200fM("BOOL", 7, EnumC3255gM.f30999x, 0);
        EnumC3200fM enumC3200fM9 = new EnumC3200fM("STRING", 8, EnumC3255gM.f31000y, 2);
        f30691v = enumC3200fM9;
        EnumC3255gM enumC3255gM3 = EnumC3255gM.f30993B;
        EnumC3200fM enumC3200fM10 = new EnumC3200fM("GROUP", 9, enumC3255gM3, 3);
        f30692w = enumC3200fM10;
        EnumC3200fM enumC3200fM11 = new EnumC3200fM("MESSAGE", 10, enumC3255gM3, 2);
        f30693x = enumC3200fM11;
        f30694y = new EnumC3200fM[]{enumC3200fM, enumC3200fM2, enumC3200fM3, enumC3200fM4, enumC3200fM5, enumC3200fM6, enumC3200fM7, enumC3200fM8, enumC3200fM9, enumC3200fM10, enumC3200fM11, new EnumC3200fM("BYTES", 11, EnumC3255gM.f31001z, 2), new EnumC3200fM("UINT32", 12, enumC3255gM2, 0), new EnumC3200fM("ENUM", 13, EnumC3255gM.f30992A, 0), new EnumC3200fM("SFIXED32", 14, enumC3255gM2, 5), new EnumC3200fM("SFIXED64", 15, enumC3255gM, 1), new EnumC3200fM("SINT32", 16, enumC3255gM2, 0), new EnumC3200fM("SINT64", 17, enumC3255gM, 0)};
    }

    public EnumC3200fM(String str, int i, EnumC3255gM enumC3255gM, int i4) {
        this.f30695n = enumC3255gM;
        this.f30696u = i4;
    }

    public static EnumC3200fM[] values() {
        return (EnumC3200fM[]) f30694y.clone();
    }
}
