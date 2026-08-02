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
/* loaded from: classes3.dex */
public final class i9c {
    public static final i9c b;
    public static final i9c c;
    public static final i9c[] d;
    public static final /* synthetic */ i9c[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    i9c EF0;

    static {
        c2f c2fVar = c2f.DOUBLE;
        i9c i9cVar = new i9c("DOUBLE", 0, 0, 1, c2fVar);
        c2f c2fVar2 = c2f.FLOAT;
        i9c i9cVar2 = new i9c("FLOAT", 1, 1, 1, c2fVar2);
        c2f c2fVar3 = c2f.LONG;
        i9c i9cVar3 = new i9c("INT64", 2, 2, 1, c2fVar3);
        i9c i9cVar4 = new i9c("UINT64", 3, 3, 1, c2fVar3);
        c2f c2fVar4 = c2f.INT;
        i9c i9cVar5 = new i9c("INT32", 4, 4, 1, c2fVar4);
        i9c i9cVar6 = new i9c("FIXED64", 5, 5, 1, c2fVar3);
        i9c i9cVar7 = new i9c("FIXED32", 6, 6, 1, c2fVar4);
        c2f c2fVar5 = c2f.BOOLEAN;
        i9c i9cVar8 = new i9c("BOOL", 7, 7, 1, c2fVar5);
        c2f c2fVar6 = c2f.STRING;
        i9c i9cVar9 = new i9c("STRING", 8, 8, 1, c2fVar6);
        c2f c2fVar7 = c2f.MESSAGE;
        i9c i9cVar10 = new i9c("MESSAGE", 9, 9, 1, c2fVar7);
        c2f c2fVar8 = c2f.BYTE_STRING;
        i9c i9cVar11 = new i9c("BYTES", 10, 10, 1, c2fVar8);
        i9c i9cVar12 = new i9c("UINT32", 11, 11, 1, c2fVar4);
        c2f c2fVar9 = c2f.ENUM;
        i9c i9cVar13 = new i9c("ENUM", 12, 12, 1, c2fVar9);
        i9c i9cVar14 = new i9c("SFIXED32", 13, 13, 1, c2fVar4);
        i9c i9cVar15 = new i9c("SFIXED64", 14, 14, 1, c2fVar3);
        i9c i9cVar16 = new i9c("SINT32", 15, 15, 1, c2fVar4);
        i9c i9cVar17 = new i9c("SINT64", 16, 16, 1, c2fVar3);
        i9c i9cVar18 = new i9c("GROUP", 17, 17, 1, c2fVar7);
        i9c i9cVar19 = new i9c("DOUBLE_LIST", 18, 18, 2, c2fVar);
        i9c i9cVar20 = new i9c("FLOAT_LIST", 19, 19, 2, c2fVar2);
        i9c i9cVar21 = new i9c("INT64_LIST", 20, 20, 2, c2fVar3);
        i9c i9cVar22 = new i9c("UINT64_LIST", 21, 21, 2, c2fVar3);
        i9c i9cVar23 = new i9c("INT32_LIST", 22, 22, 2, c2fVar4);
        i9c i9cVar24 = new i9c("FIXED64_LIST", 23, 23, 2, c2fVar3);
        i9c i9cVar25 = new i9c("FIXED32_LIST", 24, 24, 2, c2fVar4);
        i9c i9cVar26 = new i9c("BOOL_LIST", 25, 25, 2, c2fVar5);
        i9c i9cVar27 = new i9c("STRING_LIST", 26, 26, 2, c2fVar6);
        i9c i9cVar28 = new i9c("MESSAGE_LIST", 27, 27, 2, c2fVar7);
        i9c i9cVar29 = new i9c("BYTES_LIST", 28, 28, 2, c2fVar8);
        i9c i9cVar30 = new i9c("UINT32_LIST", 29, 29, 2, c2fVar4);
        i9c i9cVar31 = new i9c("ENUM_LIST", 30, 30, 2, c2fVar9);
        i9c i9cVar32 = new i9c("SFIXED32_LIST", 31, 31, 2, c2fVar4);
        i9c i9cVar33 = new i9c("SFIXED64_LIST", 32, 32, 2, c2fVar3);
        i9c i9cVar34 = new i9c("SINT32_LIST", 33, 33, 2, c2fVar4);
        i9c i9cVar35 = new i9c("SINT64_LIST", 34, 34, 2, c2fVar3);
        i9c i9cVar36 = new i9c("DOUBLE_LIST_PACKED", 35, 35, 3, c2fVar);
        b = i9cVar36;
        i9c i9cVar37 = new i9c("FLOAT_LIST_PACKED", 36, 36, 3, c2fVar2);
        i9c i9cVar38 = new i9c("INT64_LIST_PACKED", 37, 37, 3, c2fVar3);
        i9c i9cVar39 = new i9c("UINT64_LIST_PACKED", 38, 38, 3, c2fVar3);
        i9c i9cVar40 = new i9c("INT32_LIST_PACKED", 39, 39, 3, c2fVar4);
        i9c i9cVar41 = new i9c("FIXED64_LIST_PACKED", 40, 40, 3, c2fVar3);
        i9c i9cVar42 = new i9c("FIXED32_LIST_PACKED", 41, 41, 3, c2fVar4);
        i9c i9cVar43 = new i9c("BOOL_LIST_PACKED", 42, 42, 3, c2fVar5);
        i9c i9cVar44 = new i9c("UINT32_LIST_PACKED", 43, 43, 3, c2fVar4);
        i9c i9cVar45 = new i9c("ENUM_LIST_PACKED", 44, 44, 3, c2fVar9);
        i9c i9cVar46 = new i9c("SFIXED32_LIST_PACKED", 45, 45, 3, c2fVar4);
        i9c i9cVar47 = new i9c("SFIXED64_LIST_PACKED", 46, 46, 3, c2fVar3);
        i9c i9cVar48 = new i9c("SINT32_LIST_PACKED", 47, 47, 3, c2fVar4);
        i9c i9cVar49 = new i9c("SINT64_LIST_PACKED", 48, 48, 3, c2fVar3);
        c = i9cVar49;
        e = new i9c[]{i9cVar, i9cVar2, i9cVar3, i9cVar4, i9cVar5, i9cVar6, i9cVar7, i9cVar8, i9cVar9, i9cVar10, i9cVar11, i9cVar12, i9cVar13, i9cVar14, i9cVar15, i9cVar16, i9cVar17, i9cVar18, i9cVar19, i9cVar20, i9cVar21, i9cVar22, i9cVar23, i9cVar24, i9cVar25, i9cVar26, i9cVar27, i9cVar28, i9cVar29, i9cVar30, i9cVar31, i9cVar32, i9cVar33, i9cVar34, i9cVar35, i9cVar36, i9cVar37, i9cVar38, i9cVar39, i9cVar40, i9cVar41, i9cVar42, i9cVar43, i9cVar44, i9cVar45, i9cVar46, i9cVar47, i9cVar48, i9cVar49, new i9c("GROUP_LIST", 49, 49, 2, c2fVar7), new i9c("MAP", 50, 50, 4, c2f.VOID)};
        i9c[] values = values();
        d = new i9c[values.length];
        for (i9c i9cVar50 : values) {
            d[i9cVar50.a] = i9cVar50;
        }
    }

    public i9c(String str, int i, int i2, int i3, c2f c2fVar) {
        this.a = i2;
        int D = ouj.D(i3);
        if (D == 1) {
            c2fVar.getClass();
        } else if (D == 3) {
            c2fVar.getClass();
        }
        if (i3 == 1) {
            c2fVar.ordinal();
        }
    }

    public static i9c valueOf(String str) {
        return (i9c) Enum.valueOf(i9c.class, str);
    }

    public static i9c[] values() {
        return (i9c[]) e.clone();
    }
}
