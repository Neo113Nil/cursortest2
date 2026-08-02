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
public final class j9c {
    public static final j9c b;
    public static final j9c c;
    public static final j9c[] d;
    public static final /* synthetic */ j9c[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    j9c EF0;

    static {
        d2f d2fVar = d2f.DOUBLE;
        j9c j9cVar = new j9c("DOUBLE", 0, 0, 1, d2fVar);
        d2f d2fVar2 = d2f.FLOAT;
        j9c j9cVar2 = new j9c("FLOAT", 1, 1, 1, d2fVar2);
        d2f d2fVar3 = d2f.LONG;
        j9c j9cVar3 = new j9c("INT64", 2, 2, 1, d2fVar3);
        j9c j9cVar4 = new j9c("UINT64", 3, 3, 1, d2fVar3);
        d2f d2fVar4 = d2f.INT;
        j9c j9cVar5 = new j9c("INT32", 4, 4, 1, d2fVar4);
        j9c j9cVar6 = new j9c("FIXED64", 5, 5, 1, d2fVar3);
        j9c j9cVar7 = new j9c("FIXED32", 6, 6, 1, d2fVar4);
        d2f d2fVar5 = d2f.BOOLEAN;
        j9c j9cVar8 = new j9c("BOOL", 7, 7, 1, d2fVar5);
        d2f d2fVar6 = d2f.STRING;
        j9c j9cVar9 = new j9c("STRING", 8, 8, 1, d2fVar6);
        d2f d2fVar7 = d2f.MESSAGE;
        j9c j9cVar10 = new j9c("MESSAGE", 9, 9, 1, d2fVar7);
        d2f d2fVar8 = d2f.BYTE_STRING;
        j9c j9cVar11 = new j9c("BYTES", 10, 10, 1, d2fVar8);
        j9c j9cVar12 = new j9c("UINT32", 11, 11, 1, d2fVar4);
        d2f d2fVar9 = d2f.ENUM;
        j9c j9cVar13 = new j9c("ENUM", 12, 12, 1, d2fVar9);
        j9c j9cVar14 = new j9c("SFIXED32", 13, 13, 1, d2fVar4);
        j9c j9cVar15 = new j9c("SFIXED64", 14, 14, 1, d2fVar3);
        j9c j9cVar16 = new j9c("SINT32", 15, 15, 1, d2fVar4);
        j9c j9cVar17 = new j9c("SINT64", 16, 16, 1, d2fVar3);
        j9c j9cVar18 = new j9c("GROUP", 17, 17, 1, d2fVar7);
        j9c j9cVar19 = new j9c("DOUBLE_LIST", 18, 18, 2, d2fVar);
        j9c j9cVar20 = new j9c("FLOAT_LIST", 19, 19, 2, d2fVar2);
        j9c j9cVar21 = new j9c("INT64_LIST", 20, 20, 2, d2fVar3);
        j9c j9cVar22 = new j9c("UINT64_LIST", 21, 21, 2, d2fVar3);
        j9c j9cVar23 = new j9c("INT32_LIST", 22, 22, 2, d2fVar4);
        j9c j9cVar24 = new j9c("FIXED64_LIST", 23, 23, 2, d2fVar3);
        j9c j9cVar25 = new j9c("FIXED32_LIST", 24, 24, 2, d2fVar4);
        j9c j9cVar26 = new j9c("BOOL_LIST", 25, 25, 2, d2fVar5);
        j9c j9cVar27 = new j9c("STRING_LIST", 26, 26, 2, d2fVar6);
        j9c j9cVar28 = new j9c("MESSAGE_LIST", 27, 27, 2, d2fVar7);
        j9c j9cVar29 = new j9c("BYTES_LIST", 28, 28, 2, d2fVar8);
        j9c j9cVar30 = new j9c("UINT32_LIST", 29, 29, 2, d2fVar4);
        j9c j9cVar31 = new j9c("ENUM_LIST", 30, 30, 2, d2fVar9);
        j9c j9cVar32 = new j9c("SFIXED32_LIST", 31, 31, 2, d2fVar4);
        j9c j9cVar33 = new j9c("SFIXED64_LIST", 32, 32, 2, d2fVar3);
        j9c j9cVar34 = new j9c("SINT32_LIST", 33, 33, 2, d2fVar4);
        j9c j9cVar35 = new j9c("SINT64_LIST", 34, 34, 2, d2fVar3);
        j9c j9cVar36 = new j9c("DOUBLE_LIST_PACKED", 35, 35, 3, d2fVar);
        b = j9cVar36;
        j9c j9cVar37 = new j9c("FLOAT_LIST_PACKED", 36, 36, 3, d2fVar2);
        j9c j9cVar38 = new j9c("INT64_LIST_PACKED", 37, 37, 3, d2fVar3);
        j9c j9cVar39 = new j9c("UINT64_LIST_PACKED", 38, 38, 3, d2fVar3);
        j9c j9cVar40 = new j9c("INT32_LIST_PACKED", 39, 39, 3, d2fVar4);
        j9c j9cVar41 = new j9c("FIXED64_LIST_PACKED", 40, 40, 3, d2fVar3);
        j9c j9cVar42 = new j9c("FIXED32_LIST_PACKED", 41, 41, 3, d2fVar4);
        j9c j9cVar43 = new j9c("BOOL_LIST_PACKED", 42, 42, 3, d2fVar5);
        j9c j9cVar44 = new j9c("UINT32_LIST_PACKED", 43, 43, 3, d2fVar4);
        j9c j9cVar45 = new j9c("ENUM_LIST_PACKED", 44, 44, 3, d2fVar9);
        j9c j9cVar46 = new j9c("SFIXED32_LIST_PACKED", 45, 45, 3, d2fVar4);
        j9c j9cVar47 = new j9c("SFIXED64_LIST_PACKED", 46, 46, 3, d2fVar3);
        j9c j9cVar48 = new j9c("SINT32_LIST_PACKED", 47, 47, 3, d2fVar4);
        j9c j9cVar49 = new j9c("SINT64_LIST_PACKED", 48, 48, 3, d2fVar3);
        c = j9cVar49;
        e = new j9c[]{j9cVar, j9cVar2, j9cVar3, j9cVar4, j9cVar5, j9cVar6, j9cVar7, j9cVar8, j9cVar9, j9cVar10, j9cVar11, j9cVar12, j9cVar13, j9cVar14, j9cVar15, j9cVar16, j9cVar17, j9cVar18, j9cVar19, j9cVar20, j9cVar21, j9cVar22, j9cVar23, j9cVar24, j9cVar25, j9cVar26, j9cVar27, j9cVar28, j9cVar29, j9cVar30, j9cVar31, j9cVar32, j9cVar33, j9cVar34, j9cVar35, j9cVar36, j9cVar37, j9cVar38, j9cVar39, j9cVar40, j9cVar41, j9cVar42, j9cVar43, j9cVar44, j9cVar45, j9cVar46, j9cVar47, j9cVar48, j9cVar49, new j9c("GROUP_LIST", 49, 49, 2, d2fVar7), new j9c("MAP", 50, 50, 4, d2f.VOID)};
        j9c[] values = values();
        d = new j9c[values.length];
        for (j9c j9cVar50 : values) {
            d[j9cVar50.a] = j9cVar50;
        }
    }

    public j9c(String str, int i, int i2, int i3, d2f d2fVar) {
        this.a = i2;
        int D = ouj.D(i3);
        if (D == 1) {
            d2fVar.getClass();
        } else if (D == 3) {
            d2fVar.getClass();
        }
        if (i3 == 1) {
            d2fVar.ordinal();
        }
    }

    public static j9c valueOf(String str) {
        return (j9c) Enum.valueOf(j9c.class, str);
    }

    public static j9c[] values() {
        return (j9c[]) e.clone();
    }
}
