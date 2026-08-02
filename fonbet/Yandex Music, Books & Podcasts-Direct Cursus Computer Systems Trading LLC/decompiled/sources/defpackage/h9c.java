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
public final class h9c {
    public static final h9c b;
    public static final h9c c;
    public static final h9c[] d;
    public static final /* synthetic */ h9c[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    h9c EF0;

    static {
        b2f b2fVar = b2f.DOUBLE;
        h9c h9cVar = new h9c("DOUBLE", 0, 0, 1, b2fVar);
        b2f b2fVar2 = b2f.FLOAT;
        h9c h9cVar2 = new h9c("FLOAT", 1, 1, 1, b2fVar2);
        b2f b2fVar3 = b2f.LONG;
        h9c h9cVar3 = new h9c("INT64", 2, 2, 1, b2fVar3);
        h9c h9cVar4 = new h9c("UINT64", 3, 3, 1, b2fVar3);
        b2f b2fVar4 = b2f.INT;
        h9c h9cVar5 = new h9c("INT32", 4, 4, 1, b2fVar4);
        h9c h9cVar6 = new h9c("FIXED64", 5, 5, 1, b2fVar3);
        h9c h9cVar7 = new h9c("FIXED32", 6, 6, 1, b2fVar4);
        b2f b2fVar5 = b2f.BOOLEAN;
        h9c h9cVar8 = new h9c("BOOL", 7, 7, 1, b2fVar5);
        b2f b2fVar6 = b2f.STRING;
        h9c h9cVar9 = new h9c("STRING", 8, 8, 1, b2fVar6);
        b2f b2fVar7 = b2f.MESSAGE;
        h9c h9cVar10 = new h9c("MESSAGE", 9, 9, 1, b2fVar7);
        b2f b2fVar8 = b2f.BYTE_STRING;
        h9c h9cVar11 = new h9c("BYTES", 10, 10, 1, b2fVar8);
        h9c h9cVar12 = new h9c("UINT32", 11, 11, 1, b2fVar4);
        b2f b2fVar9 = b2f.ENUM;
        h9c h9cVar13 = new h9c("ENUM", 12, 12, 1, b2fVar9);
        h9c h9cVar14 = new h9c("SFIXED32", 13, 13, 1, b2fVar4);
        h9c h9cVar15 = new h9c("SFIXED64", 14, 14, 1, b2fVar3);
        h9c h9cVar16 = new h9c("SINT32", 15, 15, 1, b2fVar4);
        h9c h9cVar17 = new h9c("SINT64", 16, 16, 1, b2fVar3);
        h9c h9cVar18 = new h9c("GROUP", 17, 17, 1, b2fVar7);
        h9c h9cVar19 = new h9c("DOUBLE_LIST", 18, 18, 2, b2fVar);
        h9c h9cVar20 = new h9c("FLOAT_LIST", 19, 19, 2, b2fVar2);
        h9c h9cVar21 = new h9c("INT64_LIST", 20, 20, 2, b2fVar3);
        h9c h9cVar22 = new h9c("UINT64_LIST", 21, 21, 2, b2fVar3);
        h9c h9cVar23 = new h9c("INT32_LIST", 22, 22, 2, b2fVar4);
        h9c h9cVar24 = new h9c("FIXED64_LIST", 23, 23, 2, b2fVar3);
        h9c h9cVar25 = new h9c("FIXED32_LIST", 24, 24, 2, b2fVar4);
        h9c h9cVar26 = new h9c("BOOL_LIST", 25, 25, 2, b2fVar5);
        h9c h9cVar27 = new h9c("STRING_LIST", 26, 26, 2, b2fVar6);
        h9c h9cVar28 = new h9c("MESSAGE_LIST", 27, 27, 2, b2fVar7);
        h9c h9cVar29 = new h9c("BYTES_LIST", 28, 28, 2, b2fVar8);
        h9c h9cVar30 = new h9c("UINT32_LIST", 29, 29, 2, b2fVar4);
        h9c h9cVar31 = new h9c("ENUM_LIST", 30, 30, 2, b2fVar9);
        h9c h9cVar32 = new h9c("SFIXED32_LIST", 31, 31, 2, b2fVar4);
        h9c h9cVar33 = new h9c("SFIXED64_LIST", 32, 32, 2, b2fVar3);
        h9c h9cVar34 = new h9c("SINT32_LIST", 33, 33, 2, b2fVar4);
        h9c h9cVar35 = new h9c("SINT64_LIST", 34, 34, 2, b2fVar3);
        h9c h9cVar36 = new h9c("DOUBLE_LIST_PACKED", 35, 35, 3, b2fVar);
        b = h9cVar36;
        h9c h9cVar37 = new h9c("FLOAT_LIST_PACKED", 36, 36, 3, b2fVar2);
        h9c h9cVar38 = new h9c("INT64_LIST_PACKED", 37, 37, 3, b2fVar3);
        h9c h9cVar39 = new h9c("UINT64_LIST_PACKED", 38, 38, 3, b2fVar3);
        h9c h9cVar40 = new h9c("INT32_LIST_PACKED", 39, 39, 3, b2fVar4);
        h9c h9cVar41 = new h9c("FIXED64_LIST_PACKED", 40, 40, 3, b2fVar3);
        h9c h9cVar42 = new h9c("FIXED32_LIST_PACKED", 41, 41, 3, b2fVar4);
        h9c h9cVar43 = new h9c("BOOL_LIST_PACKED", 42, 42, 3, b2fVar5);
        h9c h9cVar44 = new h9c("UINT32_LIST_PACKED", 43, 43, 3, b2fVar4);
        h9c h9cVar45 = new h9c("ENUM_LIST_PACKED", 44, 44, 3, b2fVar9);
        h9c h9cVar46 = new h9c("SFIXED32_LIST_PACKED", 45, 45, 3, b2fVar4);
        h9c h9cVar47 = new h9c("SFIXED64_LIST_PACKED", 46, 46, 3, b2fVar3);
        h9c h9cVar48 = new h9c("SINT32_LIST_PACKED", 47, 47, 3, b2fVar4);
        h9c h9cVar49 = new h9c("SINT64_LIST_PACKED", 48, 48, 3, b2fVar3);
        c = h9cVar49;
        e = new h9c[]{h9cVar, h9cVar2, h9cVar3, h9cVar4, h9cVar5, h9cVar6, h9cVar7, h9cVar8, h9cVar9, h9cVar10, h9cVar11, h9cVar12, h9cVar13, h9cVar14, h9cVar15, h9cVar16, h9cVar17, h9cVar18, h9cVar19, h9cVar20, h9cVar21, h9cVar22, h9cVar23, h9cVar24, h9cVar25, h9cVar26, h9cVar27, h9cVar28, h9cVar29, h9cVar30, h9cVar31, h9cVar32, h9cVar33, h9cVar34, h9cVar35, h9cVar36, h9cVar37, h9cVar38, h9cVar39, h9cVar40, h9cVar41, h9cVar42, h9cVar43, h9cVar44, h9cVar45, h9cVar46, h9cVar47, h9cVar48, h9cVar49, new h9c("GROUP_LIST", 49, 49, 2, b2fVar7), new h9c("MAP", 50, 50, 4, b2f.VOID)};
        h9c[] values = values();
        d = new h9c[values.length];
        for (h9c h9cVar50 : values) {
            d[h9cVar50.a] = h9cVar50;
        }
    }

    public h9c(String str, int i, int i2, int i3, b2f b2fVar) {
        this.a = i2;
        int D = ouj.D(i3);
        if (D == 1) {
            b2fVar.getClass();
        } else if (D == 3) {
            b2fVar.getClass();
        }
        if (i3 == 1) {
            b2fVar.ordinal();
        }
    }

    public static h9c valueOf(String str) {
        return (h9c) Enum.valueOf(h9c.class, str);
    }

    public static h9c[] values() {
        return (h9c[]) e.clone();
    }
}
