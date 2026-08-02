package defpackage;

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
/* loaded from: classes.dex */
public final class g9c {
    public static final g9c b;
    public static final g9c c;
    public static final g9c[] d;
    public static final /* synthetic */ g9c[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    g9c EF0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("SCALAR", 0);
            a = aVar;
            a aVar2 = new a("VECTOR", 1);
            b = aVar2;
            a aVar3 = new a("PACKED_VECTOR", 2);
            c = aVar3;
            a aVar4 = new a("MAP", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    static {
        e2f e2fVar = e2f.DOUBLE;
        a aVar = a.a;
        g9c g9cVar = new g9c("DOUBLE", 0, 0, aVar, e2fVar);
        e2f e2fVar2 = e2f.FLOAT;
        g9c g9cVar2 = new g9c("FLOAT", 1, 1, aVar, e2fVar2);
        e2f e2fVar3 = e2f.LONG;
        g9c g9cVar3 = new g9c("INT64", 2, 2, aVar, e2fVar3);
        g9c g9cVar4 = new g9c("UINT64", 3, 3, aVar, e2fVar3);
        e2f e2fVar4 = e2f.INT;
        g9c g9cVar5 = new g9c("INT32", 4, 4, aVar, e2fVar4);
        g9c g9cVar6 = new g9c("FIXED64", 5, 5, aVar, e2fVar3);
        g9c g9cVar7 = new g9c("FIXED32", 6, 6, aVar, e2fVar4);
        e2f e2fVar5 = e2f.BOOLEAN;
        g9c g9cVar8 = new g9c("BOOL", 7, 7, aVar, e2fVar5);
        e2f e2fVar6 = e2f.STRING;
        g9c g9cVar9 = new g9c("STRING", 8, 8, aVar, e2fVar6);
        e2f e2fVar7 = e2f.MESSAGE;
        g9c g9cVar10 = new g9c("MESSAGE", 9, 9, aVar, e2fVar7);
        e2f e2fVar8 = e2f.BYTE_STRING;
        g9c g9cVar11 = new g9c("BYTES", 10, 10, aVar, e2fVar8);
        g9c g9cVar12 = new g9c("UINT32", 11, 11, aVar, e2fVar4);
        e2f e2fVar9 = e2f.ENUM;
        g9c g9cVar13 = new g9c("ENUM", 12, 12, aVar, e2fVar9);
        g9c g9cVar14 = new g9c("SFIXED32", 13, 13, aVar, e2fVar4);
        g9c g9cVar15 = new g9c("SFIXED64", 14, 14, aVar, e2fVar3);
        g9c g9cVar16 = new g9c("SINT32", 15, 15, aVar, e2fVar4);
        g9c g9cVar17 = new g9c("SINT64", 16, 16, aVar, e2fVar3);
        g9c g9cVar18 = new g9c("GROUP", 17, 17, aVar, e2fVar7);
        a aVar2 = a.b;
        g9c g9cVar19 = new g9c("DOUBLE_LIST", 18, 18, aVar2, e2fVar);
        g9c g9cVar20 = new g9c("FLOAT_LIST", 19, 19, aVar2, e2fVar2);
        g9c g9cVar21 = new g9c("INT64_LIST", 20, 20, aVar2, e2fVar3);
        g9c g9cVar22 = new g9c("UINT64_LIST", 21, 21, aVar2, e2fVar3);
        g9c g9cVar23 = new g9c("INT32_LIST", 22, 22, aVar2, e2fVar4);
        g9c g9cVar24 = new g9c("FIXED64_LIST", 23, 23, aVar2, e2fVar3);
        g9c g9cVar25 = new g9c("FIXED32_LIST", 24, 24, aVar2, e2fVar4);
        g9c g9cVar26 = new g9c("BOOL_LIST", 25, 25, aVar2, e2fVar5);
        g9c g9cVar27 = new g9c("STRING_LIST", 26, 26, aVar2, e2fVar6);
        g9c g9cVar28 = new g9c("MESSAGE_LIST", 27, 27, aVar2, e2fVar7);
        g9c g9cVar29 = new g9c("BYTES_LIST", 28, 28, aVar2, e2fVar8);
        g9c g9cVar30 = new g9c("UINT32_LIST", 29, 29, aVar2, e2fVar4);
        g9c g9cVar31 = new g9c("ENUM_LIST", 30, 30, aVar2, e2fVar9);
        g9c g9cVar32 = new g9c("SFIXED32_LIST", 31, 31, aVar2, e2fVar4);
        g9c g9cVar33 = new g9c("SFIXED64_LIST", 32, 32, aVar2, e2fVar3);
        g9c g9cVar34 = new g9c("SINT32_LIST", 33, 33, aVar2, e2fVar4);
        g9c g9cVar35 = new g9c("SINT64_LIST", 34, 34, aVar2, e2fVar3);
        a aVar3 = a.c;
        g9c g9cVar36 = new g9c("DOUBLE_LIST_PACKED", 35, 35, aVar3, e2fVar);
        b = g9cVar36;
        g9c g9cVar37 = new g9c("FLOAT_LIST_PACKED", 36, 36, aVar3, e2fVar2);
        g9c g9cVar38 = new g9c("INT64_LIST_PACKED", 37, 37, aVar3, e2fVar3);
        g9c g9cVar39 = new g9c("UINT64_LIST_PACKED", 38, 38, aVar3, e2fVar3);
        g9c g9cVar40 = new g9c("INT32_LIST_PACKED", 39, 39, aVar3, e2fVar4);
        g9c g9cVar41 = new g9c("FIXED64_LIST_PACKED", 40, 40, aVar3, e2fVar3);
        g9c g9cVar42 = new g9c("FIXED32_LIST_PACKED", 41, 41, aVar3, e2fVar4);
        g9c g9cVar43 = new g9c("BOOL_LIST_PACKED", 42, 42, aVar3, e2fVar5);
        g9c g9cVar44 = new g9c("UINT32_LIST_PACKED", 43, 43, aVar3, e2fVar4);
        g9c g9cVar45 = new g9c("ENUM_LIST_PACKED", 44, 44, aVar3, e2fVar9);
        g9c g9cVar46 = new g9c("SFIXED32_LIST_PACKED", 45, 45, aVar3, e2fVar4);
        g9c g9cVar47 = new g9c("SFIXED64_LIST_PACKED", 46, 46, aVar3, e2fVar3);
        g9c g9cVar48 = new g9c("SINT32_LIST_PACKED", 47, 47, aVar3, e2fVar4);
        g9c g9cVar49 = new g9c("SINT64_LIST_PACKED", 48, 48, aVar3, e2fVar3);
        c = g9cVar49;
        e = new g9c[]{g9cVar, g9cVar2, g9cVar3, g9cVar4, g9cVar5, g9cVar6, g9cVar7, g9cVar8, g9cVar9, g9cVar10, g9cVar11, g9cVar12, g9cVar13, g9cVar14, g9cVar15, g9cVar16, g9cVar17, g9cVar18, g9cVar19, g9cVar20, g9cVar21, g9cVar22, g9cVar23, g9cVar24, g9cVar25, g9cVar26, g9cVar27, g9cVar28, g9cVar29, g9cVar30, g9cVar31, g9cVar32, g9cVar33, g9cVar34, g9cVar35, g9cVar36, g9cVar37, g9cVar38, g9cVar39, g9cVar40, g9cVar41, g9cVar42, g9cVar43, g9cVar44, g9cVar45, g9cVar46, g9cVar47, g9cVar48, g9cVar49, new g9c("GROUP_LIST", 49, 49, aVar2, e2fVar7), new g9c("MAP", 50, 50, a.d, e2f.VOID)};
        g9c[] values = values();
        d = new g9c[values.length];
        for (g9c g9cVar50 : values) {
            d[g9cVar50.a] = g9cVar50;
        }
    }

    public g9c(String str, int i, int i2, a aVar, e2f e2fVar) {
        this.a = i2;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            e2fVar.getClass();
        } else if (ordinal == 3) {
            e2fVar.getClass();
        }
        if (aVar == a.a) {
            e2fVar.ordinal();
        }
    }

    public static g9c valueOf(String str) {
        return (g9c) Enum.valueOf(g9c.class, str);
    }

    public static g9c[] values() {
        return (g9c[]) e.clone();
    }
}
