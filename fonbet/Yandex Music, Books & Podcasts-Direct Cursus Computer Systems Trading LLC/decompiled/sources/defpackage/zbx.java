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
public final class zbx {
    public static final zbx b;
    public static final zbx c;
    public static final zbx[] d;
    public static final /* synthetic */ zbx[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    zbx EF0;

    static {
        fdx fdxVar = fdx.e;
        zbx zbxVar = new zbx("DOUBLE", 0, 0, 1, fdxVar);
        fdx fdxVar2 = fdx.d;
        zbx zbxVar2 = new zbx("FLOAT", 1, 1, 1, fdxVar2);
        fdx fdxVar3 = fdx.c;
        zbx zbxVar3 = new zbx("INT64", 2, 2, 1, fdxVar3);
        zbx zbxVar4 = new zbx("UINT64", 3, 3, 1, fdxVar3);
        fdx fdxVar4 = fdx.b;
        zbx zbxVar5 = new zbx("INT32", 4, 4, 1, fdxVar4);
        zbx zbxVar6 = new zbx("FIXED64", 5, 5, 1, fdxVar3);
        zbx zbxVar7 = new zbx("FIXED32", 6, 6, 1, fdxVar4);
        fdx fdxVar5 = fdx.f;
        zbx zbxVar8 = new zbx("BOOL", 7, 7, 1, fdxVar5);
        fdx fdxVar6 = fdx.g;
        zbx zbxVar9 = new zbx("STRING", 8, 8, 1, fdxVar6);
        fdx fdxVar7 = fdx.j;
        zbx zbxVar10 = new zbx("MESSAGE", 9, 9, 1, fdxVar7);
        fdx fdxVar8 = fdx.h;
        zbx zbxVar11 = new zbx("BYTES", 10, 10, 1, fdxVar8);
        zbx zbxVar12 = new zbx("UINT32", 11, 11, 1, fdxVar4);
        fdx fdxVar9 = fdx.i;
        zbx zbxVar13 = new zbx("ENUM", 12, 12, 1, fdxVar9);
        zbx zbxVar14 = new zbx("SFIXED32", 13, 13, 1, fdxVar4);
        zbx zbxVar15 = new zbx("SFIXED64", 14, 14, 1, fdxVar3);
        zbx zbxVar16 = new zbx("SINT32", 15, 15, 1, fdxVar4);
        zbx zbxVar17 = new zbx("SINT64", 16, 16, 1, fdxVar3);
        zbx zbxVar18 = new zbx("GROUP", 17, 17, 1, fdxVar7);
        zbx zbxVar19 = new zbx("DOUBLE_LIST", 18, 18, 2, fdxVar);
        zbx zbxVar20 = new zbx("FLOAT_LIST", 19, 19, 2, fdxVar2);
        zbx zbxVar21 = new zbx("INT64_LIST", 20, 20, 2, fdxVar3);
        zbx zbxVar22 = new zbx("UINT64_LIST", 21, 21, 2, fdxVar3);
        zbx zbxVar23 = new zbx("INT32_LIST", 22, 22, 2, fdxVar4);
        zbx zbxVar24 = new zbx("FIXED64_LIST", 23, 23, 2, fdxVar3);
        zbx zbxVar25 = new zbx("FIXED32_LIST", 24, 24, 2, fdxVar4);
        zbx zbxVar26 = new zbx("BOOL_LIST", 25, 25, 2, fdxVar5);
        zbx zbxVar27 = new zbx("STRING_LIST", 26, 26, 2, fdxVar6);
        zbx zbxVar28 = new zbx("MESSAGE_LIST", 27, 27, 2, fdxVar7);
        zbx zbxVar29 = new zbx("BYTES_LIST", 28, 28, 2, fdxVar8);
        zbx zbxVar30 = new zbx("UINT32_LIST", 29, 29, 2, fdxVar4);
        zbx zbxVar31 = new zbx("ENUM_LIST", 30, 30, 2, fdxVar9);
        zbx zbxVar32 = new zbx("SFIXED32_LIST", 31, 31, 2, fdxVar4);
        zbx zbxVar33 = new zbx("SFIXED64_LIST", 32, 32, 2, fdxVar3);
        zbx zbxVar34 = new zbx("SINT32_LIST", 33, 33, 2, fdxVar4);
        zbx zbxVar35 = new zbx("SINT64_LIST", 34, 34, 2, fdxVar3);
        zbx zbxVar36 = new zbx("DOUBLE_LIST_PACKED", 35, 35, 3, fdxVar);
        b = zbxVar36;
        zbx zbxVar37 = new zbx("FLOAT_LIST_PACKED", 36, 36, 3, fdxVar2);
        zbx zbxVar38 = new zbx("INT64_LIST_PACKED", 37, 37, 3, fdxVar3);
        zbx zbxVar39 = new zbx("UINT64_LIST_PACKED", 38, 38, 3, fdxVar3);
        zbx zbxVar40 = new zbx("INT32_LIST_PACKED", 39, 39, 3, fdxVar4);
        zbx zbxVar41 = new zbx("FIXED64_LIST_PACKED", 40, 40, 3, fdxVar3);
        zbx zbxVar42 = new zbx("FIXED32_LIST_PACKED", 41, 41, 3, fdxVar4);
        zbx zbxVar43 = new zbx("BOOL_LIST_PACKED", 42, 42, 3, fdxVar5);
        zbx zbxVar44 = new zbx("UINT32_LIST_PACKED", 43, 43, 3, fdxVar4);
        zbx zbxVar45 = new zbx("ENUM_LIST_PACKED", 44, 44, 3, fdxVar9);
        zbx zbxVar46 = new zbx("SFIXED32_LIST_PACKED", 45, 45, 3, fdxVar4);
        zbx zbxVar47 = new zbx("SFIXED64_LIST_PACKED", 46, 46, 3, fdxVar3);
        zbx zbxVar48 = new zbx("SINT32_LIST_PACKED", 47, 47, 3, fdxVar4);
        zbx zbxVar49 = new zbx("SINT64_LIST_PACKED", 48, 48, 3, fdxVar3);
        c = zbxVar49;
        e = new zbx[]{zbxVar, zbxVar2, zbxVar3, zbxVar4, zbxVar5, zbxVar6, zbxVar7, zbxVar8, zbxVar9, zbxVar10, zbxVar11, zbxVar12, zbxVar13, zbxVar14, zbxVar15, zbxVar16, zbxVar17, zbxVar18, zbxVar19, zbxVar20, zbxVar21, zbxVar22, zbxVar23, zbxVar24, zbxVar25, zbxVar26, zbxVar27, zbxVar28, zbxVar29, zbxVar30, zbxVar31, zbxVar32, zbxVar33, zbxVar34, zbxVar35, zbxVar36, zbxVar37, zbxVar38, zbxVar39, zbxVar40, zbxVar41, zbxVar42, zbxVar43, zbxVar44, zbxVar45, zbxVar46, zbxVar47, zbxVar48, zbxVar49, new zbx("GROUP_LIST", 49, 49, 2, fdxVar7), new zbx("MAP", 50, 50, 4, fdx.a)};
        zbx[] values = values();
        d = new zbx[values.length];
        for (zbx zbxVar50 : values) {
            d[zbxVar50.a] = zbxVar50;
        }
    }

    public zbx(String str, int i, int i2, int i3, fdx fdxVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            fdxVar.getClass();
        } else if (i4 == 3) {
            fdxVar.getClass();
        }
        if (i3 == 1) {
            fdx fdxVar2 = fdx.a;
            fdxVar.ordinal();
        }
    }

    public static zbx[] values() {
        return (zbx[]) e.clone();
    }
}
