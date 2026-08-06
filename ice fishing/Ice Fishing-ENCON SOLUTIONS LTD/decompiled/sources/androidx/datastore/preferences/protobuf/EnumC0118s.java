package androidx.datastore.preferences.protobuf;

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
/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0118s {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0118s f2443b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0118s f2444c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0118s[] f2445d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0118s[] f2446e;

    /* renamed from: a, reason: collision with root package name */
    public final int f2447a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0118s EF0;

    static {
        B b2 = B.DOUBLE;
        EnumC0118s enumC0118s = new EnumC0118s("DOUBLE", 0, 0, 1, b2);
        B b3 = B.FLOAT;
        EnumC0118s enumC0118s2 = new EnumC0118s("FLOAT", 1, 1, 1, b3);
        B b4 = B.LONG;
        EnumC0118s enumC0118s3 = new EnumC0118s("INT64", 2, 2, 1, b4);
        EnumC0118s enumC0118s4 = new EnumC0118s("UINT64", 3, 3, 1, b4);
        B b5 = B.INT;
        EnumC0118s enumC0118s5 = new EnumC0118s("INT32", 4, 4, 1, b5);
        EnumC0118s enumC0118s6 = new EnumC0118s("FIXED64", 5, 5, 1, b4);
        EnumC0118s enumC0118s7 = new EnumC0118s("FIXED32", 6, 6, 1, b5);
        B b6 = B.BOOLEAN;
        EnumC0118s enumC0118s8 = new EnumC0118s("BOOL", 7, 7, 1, b6);
        B b7 = B.STRING;
        EnumC0118s enumC0118s9 = new EnumC0118s("STRING", 8, 8, 1, b7);
        B b8 = B.MESSAGE;
        EnumC0118s enumC0118s10 = new EnumC0118s("MESSAGE", 9, 9, 1, b8);
        B b9 = B.BYTE_STRING;
        EnumC0118s enumC0118s11 = new EnumC0118s("BYTES", 10, 10, 1, b9);
        EnumC0118s enumC0118s12 = new EnumC0118s("UINT32", 11, 11, 1, b5);
        B b10 = B.ENUM;
        EnumC0118s enumC0118s13 = new EnumC0118s("ENUM", 12, 12, 1, b10);
        EnumC0118s enumC0118s14 = new EnumC0118s("SFIXED32", 13, 13, 1, b5);
        EnumC0118s enumC0118s15 = new EnumC0118s("SFIXED64", 14, 14, 1, b4);
        EnumC0118s enumC0118s16 = new EnumC0118s("SINT32", 15, 15, 1, b5);
        EnumC0118s enumC0118s17 = new EnumC0118s("SINT64", 16, 16, 1, b4);
        EnumC0118s enumC0118s18 = new EnumC0118s("GROUP", 17, 17, 1, b8);
        EnumC0118s enumC0118s19 = new EnumC0118s("DOUBLE_LIST", 18, 18, 2, b2);
        EnumC0118s enumC0118s20 = new EnumC0118s("FLOAT_LIST", 19, 19, 2, b3);
        EnumC0118s enumC0118s21 = new EnumC0118s("INT64_LIST", 20, 20, 2, b4);
        EnumC0118s enumC0118s22 = new EnumC0118s("UINT64_LIST", 21, 21, 2, b4);
        EnumC0118s enumC0118s23 = new EnumC0118s("INT32_LIST", 22, 22, 2, b5);
        EnumC0118s enumC0118s24 = new EnumC0118s("FIXED64_LIST", 23, 23, 2, b4);
        EnumC0118s enumC0118s25 = new EnumC0118s("FIXED32_LIST", 24, 24, 2, b5);
        EnumC0118s enumC0118s26 = new EnumC0118s("BOOL_LIST", 25, 25, 2, b6);
        EnumC0118s enumC0118s27 = new EnumC0118s("STRING_LIST", 26, 26, 2, b7);
        EnumC0118s enumC0118s28 = new EnumC0118s("MESSAGE_LIST", 27, 27, 2, b8);
        EnumC0118s enumC0118s29 = new EnumC0118s("BYTES_LIST", 28, 28, 2, b9);
        EnumC0118s enumC0118s30 = new EnumC0118s("UINT32_LIST", 29, 29, 2, b5);
        EnumC0118s enumC0118s31 = new EnumC0118s("ENUM_LIST", 30, 30, 2, b10);
        EnumC0118s enumC0118s32 = new EnumC0118s("SFIXED32_LIST", 31, 31, 2, b5);
        EnumC0118s enumC0118s33 = new EnumC0118s("SFIXED64_LIST", 32, 32, 2, b4);
        EnumC0118s enumC0118s34 = new EnumC0118s("SINT32_LIST", 33, 33, 2, b5);
        EnumC0118s enumC0118s35 = new EnumC0118s("SINT64_LIST", 34, 34, 2, b4);
        EnumC0118s enumC0118s36 = new EnumC0118s("DOUBLE_LIST_PACKED", 35, 35, 3, b2);
        f2443b = enumC0118s36;
        EnumC0118s enumC0118s37 = new EnumC0118s("FLOAT_LIST_PACKED", 36, 36, 3, b3);
        EnumC0118s enumC0118s38 = new EnumC0118s("INT64_LIST_PACKED", 37, 37, 3, b4);
        EnumC0118s enumC0118s39 = new EnumC0118s("UINT64_LIST_PACKED", 38, 38, 3, b4);
        EnumC0118s enumC0118s40 = new EnumC0118s("INT32_LIST_PACKED", 39, 39, 3, b5);
        EnumC0118s enumC0118s41 = new EnumC0118s("FIXED64_LIST_PACKED", 40, 40, 3, b4);
        EnumC0118s enumC0118s42 = new EnumC0118s("FIXED32_LIST_PACKED", 41, 41, 3, b5);
        EnumC0118s enumC0118s43 = new EnumC0118s("BOOL_LIST_PACKED", 42, 42, 3, b6);
        EnumC0118s enumC0118s44 = new EnumC0118s("UINT32_LIST_PACKED", 43, 43, 3, b5);
        EnumC0118s enumC0118s45 = new EnumC0118s("ENUM_LIST_PACKED", 44, 44, 3, b10);
        EnumC0118s enumC0118s46 = new EnumC0118s("SFIXED32_LIST_PACKED", 45, 45, 3, b5);
        EnumC0118s enumC0118s47 = new EnumC0118s("SFIXED64_LIST_PACKED", 46, 46, 3, b4);
        EnumC0118s enumC0118s48 = new EnumC0118s("SINT32_LIST_PACKED", 47, 47, 3, b5);
        EnumC0118s enumC0118s49 = new EnumC0118s("SINT64_LIST_PACKED", 48, 48, 3, b4);
        f2444c = enumC0118s49;
        f2446e = new EnumC0118s[]{enumC0118s, enumC0118s2, enumC0118s3, enumC0118s4, enumC0118s5, enumC0118s6, enumC0118s7, enumC0118s8, enumC0118s9, enumC0118s10, enumC0118s11, enumC0118s12, enumC0118s13, enumC0118s14, enumC0118s15, enumC0118s16, enumC0118s17, enumC0118s18, enumC0118s19, enumC0118s20, enumC0118s21, enumC0118s22, enumC0118s23, enumC0118s24, enumC0118s25, enumC0118s26, enumC0118s27, enumC0118s28, enumC0118s29, enumC0118s30, enumC0118s31, enumC0118s32, enumC0118s33, enumC0118s34, enumC0118s35, enumC0118s36, enumC0118s37, enumC0118s38, enumC0118s39, enumC0118s40, enumC0118s41, enumC0118s42, enumC0118s43, enumC0118s44, enumC0118s45, enumC0118s46, enumC0118s47, enumC0118s48, enumC0118s49, new EnumC0118s("GROUP_LIST", 49, 49, 2, b8), new EnumC0118s("MAP", 50, 50, 4, B.VOID)};
        EnumC0118s[] values = values();
        f2445d = new EnumC0118s[values.length];
        for (EnumC0118s enumC0118s50 : values) {
            f2445d[enumC0118s50.f2447a] = enumC0118s50;
        }
    }

    public EnumC0118s(String str, int i2, int i3, int i4, B b2) {
        this.f2447a = i3;
        int b3 = H.j.b(i4);
        if (b3 == 1) {
            b2.getClass();
        } else if (b3 == 3) {
            b2.getClass();
        }
        if (i4 == 1) {
            b2.ordinal();
        }
    }

    public static EnumC0118s valueOf(String str) {
        return (EnumC0118s) Enum.valueOf(EnumC0118s.class, str);
    }

    public static EnumC0118s[] values() {
        return (EnumC0118s[]) f2446e.clone();
    }

    public final int a() {
        return this.f2447a;
    }
}
