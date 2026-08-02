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
public final class gmx {
    public static final gmx b;
    public static final gmx c;
    public static final gmx[] d;
    public static final /* synthetic */ gmx[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    gmx EF0;

    static {
        tmx tmxVar = tmx.e;
        gmx gmxVar = new gmx("DOUBLE", 0, 0, 1, tmxVar);
        tmx tmxVar2 = tmx.d;
        gmx gmxVar2 = new gmx("FLOAT", 1, 1, 1, tmxVar2);
        tmx tmxVar3 = tmx.c;
        gmx gmxVar3 = new gmx("INT64", 2, 2, 1, tmxVar3);
        gmx gmxVar4 = new gmx("UINT64", 3, 3, 1, tmxVar3);
        tmx tmxVar4 = tmx.b;
        gmx gmxVar5 = new gmx("INT32", 4, 4, 1, tmxVar4);
        gmx gmxVar6 = new gmx("FIXED64", 5, 5, 1, tmxVar3);
        gmx gmxVar7 = new gmx("FIXED32", 6, 6, 1, tmxVar4);
        tmx tmxVar5 = tmx.f;
        gmx gmxVar8 = new gmx("BOOL", 7, 7, 1, tmxVar5);
        tmx tmxVar6 = tmx.g;
        gmx gmxVar9 = new gmx("STRING", 8, 8, 1, tmxVar6);
        tmx tmxVar7 = tmx.j;
        gmx gmxVar10 = new gmx("MESSAGE", 9, 9, 1, tmxVar7);
        tmx tmxVar8 = tmx.h;
        gmx gmxVar11 = new gmx("BYTES", 10, 10, 1, tmxVar8);
        gmx gmxVar12 = new gmx("UINT32", 11, 11, 1, tmxVar4);
        tmx tmxVar9 = tmx.i;
        gmx gmxVar13 = new gmx("ENUM", 12, 12, 1, tmxVar9);
        gmx gmxVar14 = new gmx("SFIXED32", 13, 13, 1, tmxVar4);
        gmx gmxVar15 = new gmx("SFIXED64", 14, 14, 1, tmxVar3);
        gmx gmxVar16 = new gmx("SINT32", 15, 15, 1, tmxVar4);
        gmx gmxVar17 = new gmx("SINT64", 16, 16, 1, tmxVar3);
        gmx gmxVar18 = new gmx("GROUP", 17, 17, 1, tmxVar7);
        gmx gmxVar19 = new gmx("DOUBLE_LIST", 18, 18, 2, tmxVar);
        gmx gmxVar20 = new gmx("FLOAT_LIST", 19, 19, 2, tmxVar2);
        gmx gmxVar21 = new gmx("INT64_LIST", 20, 20, 2, tmxVar3);
        gmx gmxVar22 = new gmx("UINT64_LIST", 21, 21, 2, tmxVar3);
        gmx gmxVar23 = new gmx("INT32_LIST", 22, 22, 2, tmxVar4);
        gmx gmxVar24 = new gmx("FIXED64_LIST", 23, 23, 2, tmxVar3);
        gmx gmxVar25 = new gmx("FIXED32_LIST", 24, 24, 2, tmxVar4);
        gmx gmxVar26 = new gmx("BOOL_LIST", 25, 25, 2, tmxVar5);
        gmx gmxVar27 = new gmx("STRING_LIST", 26, 26, 2, tmxVar6);
        gmx gmxVar28 = new gmx("MESSAGE_LIST", 27, 27, 2, tmxVar7);
        gmx gmxVar29 = new gmx("BYTES_LIST", 28, 28, 2, tmxVar8);
        gmx gmxVar30 = new gmx("UINT32_LIST", 29, 29, 2, tmxVar4);
        gmx gmxVar31 = new gmx("ENUM_LIST", 30, 30, 2, tmxVar9);
        gmx gmxVar32 = new gmx("SFIXED32_LIST", 31, 31, 2, tmxVar4);
        gmx gmxVar33 = new gmx("SFIXED64_LIST", 32, 32, 2, tmxVar3);
        gmx gmxVar34 = new gmx("SINT32_LIST", 33, 33, 2, tmxVar4);
        gmx gmxVar35 = new gmx("SINT64_LIST", 34, 34, 2, tmxVar3);
        gmx gmxVar36 = new gmx("DOUBLE_LIST_PACKED", 35, 35, 3, tmxVar);
        b = gmxVar36;
        gmx gmxVar37 = new gmx("FLOAT_LIST_PACKED", 36, 36, 3, tmxVar2);
        gmx gmxVar38 = new gmx("INT64_LIST_PACKED", 37, 37, 3, tmxVar3);
        gmx gmxVar39 = new gmx("UINT64_LIST_PACKED", 38, 38, 3, tmxVar3);
        gmx gmxVar40 = new gmx("INT32_LIST_PACKED", 39, 39, 3, tmxVar4);
        gmx gmxVar41 = new gmx("FIXED64_LIST_PACKED", 40, 40, 3, tmxVar3);
        gmx gmxVar42 = new gmx("FIXED32_LIST_PACKED", 41, 41, 3, tmxVar4);
        gmx gmxVar43 = new gmx("BOOL_LIST_PACKED", 42, 42, 3, tmxVar5);
        gmx gmxVar44 = new gmx("UINT32_LIST_PACKED", 43, 43, 3, tmxVar4);
        gmx gmxVar45 = new gmx("ENUM_LIST_PACKED", 44, 44, 3, tmxVar9);
        gmx gmxVar46 = new gmx("SFIXED32_LIST_PACKED", 45, 45, 3, tmxVar4);
        gmx gmxVar47 = new gmx("SFIXED64_LIST_PACKED", 46, 46, 3, tmxVar3);
        gmx gmxVar48 = new gmx("SINT32_LIST_PACKED", 47, 47, 3, tmxVar4);
        gmx gmxVar49 = new gmx("SINT64_LIST_PACKED", 48, 48, 3, tmxVar3);
        c = gmxVar49;
        e = new gmx[]{gmxVar, gmxVar2, gmxVar3, gmxVar4, gmxVar5, gmxVar6, gmxVar7, gmxVar8, gmxVar9, gmxVar10, gmxVar11, gmxVar12, gmxVar13, gmxVar14, gmxVar15, gmxVar16, gmxVar17, gmxVar18, gmxVar19, gmxVar20, gmxVar21, gmxVar22, gmxVar23, gmxVar24, gmxVar25, gmxVar26, gmxVar27, gmxVar28, gmxVar29, gmxVar30, gmxVar31, gmxVar32, gmxVar33, gmxVar34, gmxVar35, gmxVar36, gmxVar37, gmxVar38, gmxVar39, gmxVar40, gmxVar41, gmxVar42, gmxVar43, gmxVar44, gmxVar45, gmxVar46, gmxVar47, gmxVar48, gmxVar49, new gmx("GROUP_LIST", 49, 49, 2, tmxVar7), new gmx("MAP", 50, 50, 4, tmx.a)};
        gmx[] values = values();
        d = new gmx[values.length];
        for (gmx gmxVar50 : values) {
            d[gmxVar50.a] = gmxVar50;
        }
    }

    public gmx(String str, int i, int i2, int i3, tmx tmxVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            tmxVar.getClass();
        } else if (i4 == 3) {
            tmxVar.getClass();
        }
        if (i3 == 1) {
            tmx tmxVar2 = tmx.a;
            tmxVar.ordinal();
        }
    }

    public static gmx[] values() {
        return (gmx[]) e.clone();
    }
}
