package com.google.android.gms.internal.measurement;

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
/* loaded from: classes4.dex */
public final class zzadl {
    public static final zzadl zzJ;
    public static final zzadl zzW;
    public static final zzadl[] zzaa;
    public static final /* synthetic */ zzadl[] zzab;
    public final int zzZ;

    /* JADX INFO: Fake field, exist only in values array */
    zzadl EF0;

    static {
        zzaei zzaeiVar = zzaei.zze;
        zzadl zzadlVar = new zzadl("DOUBLE", 0, 0, 1, zzaeiVar);
        zzaei zzaeiVar2 = zzaei.zzd;
        zzadl zzadlVar2 = new zzadl("FLOAT", 1, 1, 1, zzaeiVar2);
        zzaei zzaeiVar3 = zzaei.zzc;
        zzadl zzadlVar3 = new zzadl("INT64", 2, 2, 1, zzaeiVar3);
        zzadl zzadlVar4 = new zzadl("UINT64", 3, 3, 1, zzaeiVar3);
        zzaei zzaeiVar4 = zzaei.zzb;
        zzadl zzadlVar5 = new zzadl("INT32", 4, 4, 1, zzaeiVar4);
        zzadl zzadlVar6 = new zzadl("FIXED64", 5, 5, 1, zzaeiVar3);
        zzadl zzadlVar7 = new zzadl("FIXED32", 6, 6, 1, zzaeiVar4);
        zzaei zzaeiVar5 = zzaei.zzf;
        zzadl zzadlVar8 = new zzadl("BOOL", 7, 7, 1, zzaeiVar5);
        zzaei zzaeiVar6 = zzaei.zzg;
        zzadl zzadlVar9 = new zzadl("STRING", 8, 8, 1, zzaeiVar6);
        zzaei zzaeiVar7 = zzaei.zzj;
        zzadl zzadlVar10 = new zzadl("MESSAGE", 9, 9, 1, zzaeiVar7);
        zzaei zzaeiVar8 = zzaei.zzh;
        zzadl zzadlVar11 = new zzadl("BYTES", 10, 10, 1, zzaeiVar8);
        zzadl zzadlVar12 = new zzadl("UINT32", 11, 11, 1, zzaeiVar4);
        zzaei zzaeiVar9 = zzaei.zzi;
        zzadl zzadlVar13 = new zzadl("ENUM", 12, 12, 1, zzaeiVar9);
        zzadl zzadlVar14 = new zzadl("SFIXED32", 13, 13, 1, zzaeiVar4);
        zzadl zzadlVar15 = new zzadl("SFIXED64", 14, 14, 1, zzaeiVar3);
        zzadl zzadlVar16 = new zzadl("SINT32", 15, 15, 1, zzaeiVar4);
        zzadl zzadlVar17 = new zzadl("SINT64", 16, 16, 1, zzaeiVar3);
        zzadl zzadlVar18 = new zzadl("GROUP", 17, 17, 1, zzaeiVar7);
        zzadl zzadlVar19 = new zzadl("DOUBLE_LIST", 18, 18, 2, zzaeiVar);
        zzadl zzadlVar20 = new zzadl("FLOAT_LIST", 19, 19, 2, zzaeiVar2);
        zzadl zzadlVar21 = new zzadl("INT64_LIST", 20, 20, 2, zzaeiVar3);
        zzadl zzadlVar22 = new zzadl("UINT64_LIST", 21, 21, 2, zzaeiVar3);
        zzadl zzadlVar23 = new zzadl("INT32_LIST", 22, 22, 2, zzaeiVar4);
        zzadl zzadlVar24 = new zzadl("FIXED64_LIST", 23, 23, 2, zzaeiVar3);
        zzadl zzadlVar25 = new zzadl("FIXED32_LIST", 24, 24, 2, zzaeiVar4);
        zzadl zzadlVar26 = new zzadl("BOOL_LIST", 25, 25, 2, zzaeiVar5);
        zzadl zzadlVar27 = new zzadl("STRING_LIST", 26, 26, 2, zzaeiVar6);
        zzadl zzadlVar28 = new zzadl("MESSAGE_LIST", 27, 27, 2, zzaeiVar7);
        zzadl zzadlVar29 = new zzadl("BYTES_LIST", 28, 28, 2, zzaeiVar8);
        zzadl zzadlVar30 = new zzadl("UINT32_LIST", 29, 29, 2, zzaeiVar4);
        zzadl zzadlVar31 = new zzadl("ENUM_LIST", 30, 30, 2, zzaeiVar9);
        zzadl zzadlVar32 = new zzadl("SFIXED32_LIST", 31, 31, 2, zzaeiVar4);
        zzadl zzadlVar33 = new zzadl("SFIXED64_LIST", 32, 32, 2, zzaeiVar3);
        zzadl zzadlVar34 = new zzadl("SINT32_LIST", 33, 33, 2, zzaeiVar4);
        zzadl zzadlVar35 = new zzadl("SINT64_LIST", 34, 34, 2, zzaeiVar3);
        zzadl zzadlVar36 = new zzadl("DOUBLE_LIST_PACKED", 35, 35, 3, zzaeiVar);
        zzJ = zzadlVar36;
        zzadl zzadlVar37 = new zzadl("FLOAT_LIST_PACKED", 36, 36, 3, zzaeiVar2);
        zzadl zzadlVar38 = new zzadl("INT64_LIST_PACKED", 37, 37, 3, zzaeiVar3);
        zzadl zzadlVar39 = new zzadl("UINT64_LIST_PACKED", 38, 38, 3, zzaeiVar3);
        zzadl zzadlVar40 = new zzadl("INT32_LIST_PACKED", 39, 39, 3, zzaeiVar4);
        zzadl zzadlVar41 = new zzadl("FIXED64_LIST_PACKED", 40, 40, 3, zzaeiVar3);
        zzadl zzadlVar42 = new zzadl("FIXED32_LIST_PACKED", 41, 41, 3, zzaeiVar4);
        zzadl zzadlVar43 = new zzadl("BOOL_LIST_PACKED", 42, 42, 3, zzaeiVar5);
        zzadl zzadlVar44 = new zzadl("UINT32_LIST_PACKED", 43, 43, 3, zzaeiVar4);
        zzadl zzadlVar45 = new zzadl("ENUM_LIST_PACKED", 44, 44, 3, zzaeiVar9);
        zzadl zzadlVar46 = new zzadl("SFIXED32_LIST_PACKED", 45, 45, 3, zzaeiVar4);
        zzadl zzadlVar47 = new zzadl("SFIXED64_LIST_PACKED", 46, 46, 3, zzaeiVar3);
        zzadl zzadlVar48 = new zzadl("SINT32_LIST_PACKED", 47, 47, 3, zzaeiVar4);
        zzadl zzadlVar49 = new zzadl("SINT64_LIST_PACKED", 48, 48, 3, zzaeiVar3);
        zzW = zzadlVar49;
        zzab = new zzadl[]{zzadlVar, zzadlVar2, zzadlVar3, zzadlVar4, zzadlVar5, zzadlVar6, zzadlVar7, zzadlVar8, zzadlVar9, zzadlVar10, zzadlVar11, zzadlVar12, zzadlVar13, zzadlVar14, zzadlVar15, zzadlVar16, zzadlVar17, zzadlVar18, zzadlVar19, zzadlVar20, zzadlVar21, zzadlVar22, zzadlVar23, zzadlVar24, zzadlVar25, zzadlVar26, zzadlVar27, zzadlVar28, zzadlVar29, zzadlVar30, zzadlVar31, zzadlVar32, zzadlVar33, zzadlVar34, zzadlVar35, zzadlVar36, zzadlVar37, zzadlVar38, zzadlVar39, zzadlVar40, zzadlVar41, zzadlVar42, zzadlVar43, zzadlVar44, zzadlVar45, zzadlVar46, zzadlVar47, zzadlVar48, zzadlVar49, new zzadl("GROUP_LIST", 49, 49, 2, zzaeiVar7), new zzadl("MAP", 50, 50, 4, zzaei.zza)};
        zzadl[] values = values();
        zzaa = new zzadl[values.length];
        for (zzadl zzadlVar50 : values) {
            zzaa[zzadlVar50.zzZ] = zzadlVar50;
        }
    }

    public zzadl(String str, int i, int i2, int i3, zzaei zzaeiVar) {
        this.zzZ = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            zzaeiVar.getClass();
        } else if (i4 == 3) {
            zzaeiVar.getClass();
        }
        if (i3 == 1) {
            zzaei zzaeiVar2 = zzaei.zza;
            zzaeiVar.ordinal();
        }
    }

    public static zzadl[] values() {
        return (zzadl[]) zzab.clone();
    }
}
