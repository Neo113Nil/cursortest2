package com.google.android.libraries.places.internal;

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
public final class zzbji {
    public static final zzbji zzJ;
    public static final zzbji zzW;
    public static final zzbji[] zzaa;
    public static final /* synthetic */ zzbji[] zzab;
    public final int zzZ;

    /* JADX INFO: Fake field, exist only in values array */
    zzbji EF0;

    static {
        zzbkf zzbkfVar = zzbkf.zze;
        zzbji zzbjiVar = new zzbji("DOUBLE", 0, 0, 1, zzbkfVar);
        zzbkf zzbkfVar2 = zzbkf.zzd;
        zzbji zzbjiVar2 = new zzbji("FLOAT", 1, 1, 1, zzbkfVar2);
        zzbkf zzbkfVar3 = zzbkf.zzc;
        zzbji zzbjiVar3 = new zzbji("INT64", 2, 2, 1, zzbkfVar3);
        zzbji zzbjiVar4 = new zzbji("UINT64", 3, 3, 1, zzbkfVar3);
        zzbkf zzbkfVar4 = zzbkf.zzb;
        zzbji zzbjiVar5 = new zzbji("INT32", 4, 4, 1, zzbkfVar4);
        zzbji zzbjiVar6 = new zzbji("FIXED64", 5, 5, 1, zzbkfVar3);
        zzbji zzbjiVar7 = new zzbji("FIXED32", 6, 6, 1, zzbkfVar4);
        zzbkf zzbkfVar5 = zzbkf.zzf;
        zzbji zzbjiVar8 = new zzbji("BOOL", 7, 7, 1, zzbkfVar5);
        zzbkf zzbkfVar6 = zzbkf.zzg;
        zzbji zzbjiVar9 = new zzbji("STRING", 8, 8, 1, zzbkfVar6);
        zzbkf zzbkfVar7 = zzbkf.zzj;
        zzbji zzbjiVar10 = new zzbji("MESSAGE", 9, 9, 1, zzbkfVar7);
        zzbkf zzbkfVar8 = zzbkf.zzh;
        zzbji zzbjiVar11 = new zzbji("BYTES", 10, 10, 1, zzbkfVar8);
        zzbji zzbjiVar12 = new zzbji("UINT32", 11, 11, 1, zzbkfVar4);
        zzbkf zzbkfVar9 = zzbkf.zzi;
        zzbji zzbjiVar13 = new zzbji("ENUM", 12, 12, 1, zzbkfVar9);
        zzbji zzbjiVar14 = new zzbji("SFIXED32", 13, 13, 1, zzbkfVar4);
        zzbji zzbjiVar15 = new zzbji("SFIXED64", 14, 14, 1, zzbkfVar3);
        zzbji zzbjiVar16 = new zzbji("SINT32", 15, 15, 1, zzbkfVar4);
        zzbji zzbjiVar17 = new zzbji("SINT64", 16, 16, 1, zzbkfVar3);
        zzbji zzbjiVar18 = new zzbji("GROUP", 17, 17, 1, zzbkfVar7);
        zzbji zzbjiVar19 = new zzbji("DOUBLE_LIST", 18, 18, 2, zzbkfVar);
        zzbji zzbjiVar20 = new zzbji("FLOAT_LIST", 19, 19, 2, zzbkfVar2);
        zzbji zzbjiVar21 = new zzbji("INT64_LIST", 20, 20, 2, zzbkfVar3);
        zzbji zzbjiVar22 = new zzbji("UINT64_LIST", 21, 21, 2, zzbkfVar3);
        zzbji zzbjiVar23 = new zzbji("INT32_LIST", 22, 22, 2, zzbkfVar4);
        zzbji zzbjiVar24 = new zzbji("FIXED64_LIST", 23, 23, 2, zzbkfVar3);
        zzbji zzbjiVar25 = new zzbji("FIXED32_LIST", 24, 24, 2, zzbkfVar4);
        zzbji zzbjiVar26 = new zzbji("BOOL_LIST", 25, 25, 2, zzbkfVar5);
        zzbji zzbjiVar27 = new zzbji("STRING_LIST", 26, 26, 2, zzbkfVar6);
        zzbji zzbjiVar28 = new zzbji("MESSAGE_LIST", 27, 27, 2, zzbkfVar7);
        zzbji zzbjiVar29 = new zzbji("BYTES_LIST", 28, 28, 2, zzbkfVar8);
        zzbji zzbjiVar30 = new zzbji("UINT32_LIST", 29, 29, 2, zzbkfVar4);
        zzbji zzbjiVar31 = new zzbji("ENUM_LIST", 30, 30, 2, zzbkfVar9);
        zzbji zzbjiVar32 = new zzbji("SFIXED32_LIST", 31, 31, 2, zzbkfVar4);
        zzbji zzbjiVar33 = new zzbji("SFIXED64_LIST", 32, 32, 2, zzbkfVar3);
        zzbji zzbjiVar34 = new zzbji("SINT32_LIST", 33, 33, 2, zzbkfVar4);
        zzbji zzbjiVar35 = new zzbji("SINT64_LIST", 34, 34, 2, zzbkfVar3);
        zzbji zzbjiVar36 = new zzbji("DOUBLE_LIST_PACKED", 35, 35, 3, zzbkfVar);
        zzJ = zzbjiVar36;
        zzbji zzbjiVar37 = new zzbji("FLOAT_LIST_PACKED", 36, 36, 3, zzbkfVar2);
        zzbji zzbjiVar38 = new zzbji("INT64_LIST_PACKED", 37, 37, 3, zzbkfVar3);
        zzbji zzbjiVar39 = new zzbji("UINT64_LIST_PACKED", 38, 38, 3, zzbkfVar3);
        zzbji zzbjiVar40 = new zzbji("INT32_LIST_PACKED", 39, 39, 3, zzbkfVar4);
        zzbji zzbjiVar41 = new zzbji("FIXED64_LIST_PACKED", 40, 40, 3, zzbkfVar3);
        zzbji zzbjiVar42 = new zzbji("FIXED32_LIST_PACKED", 41, 41, 3, zzbkfVar4);
        zzbji zzbjiVar43 = new zzbji("BOOL_LIST_PACKED", 42, 42, 3, zzbkfVar5);
        zzbji zzbjiVar44 = new zzbji("UINT32_LIST_PACKED", 43, 43, 3, zzbkfVar4);
        zzbji zzbjiVar45 = new zzbji("ENUM_LIST_PACKED", 44, 44, 3, zzbkfVar9);
        zzbji zzbjiVar46 = new zzbji("SFIXED32_LIST_PACKED", 45, 45, 3, zzbkfVar4);
        zzbji zzbjiVar47 = new zzbji("SFIXED64_LIST_PACKED", 46, 46, 3, zzbkfVar3);
        zzbji zzbjiVar48 = new zzbji("SINT32_LIST_PACKED", 47, 47, 3, zzbkfVar4);
        zzbji zzbjiVar49 = new zzbji("SINT64_LIST_PACKED", 48, 48, 3, zzbkfVar3);
        zzW = zzbjiVar49;
        zzab = new zzbji[]{zzbjiVar, zzbjiVar2, zzbjiVar3, zzbjiVar4, zzbjiVar5, zzbjiVar6, zzbjiVar7, zzbjiVar8, zzbjiVar9, zzbjiVar10, zzbjiVar11, zzbjiVar12, zzbjiVar13, zzbjiVar14, zzbjiVar15, zzbjiVar16, zzbjiVar17, zzbjiVar18, zzbjiVar19, zzbjiVar20, zzbjiVar21, zzbjiVar22, zzbjiVar23, zzbjiVar24, zzbjiVar25, zzbjiVar26, zzbjiVar27, zzbjiVar28, zzbjiVar29, zzbjiVar30, zzbjiVar31, zzbjiVar32, zzbjiVar33, zzbjiVar34, zzbjiVar35, zzbjiVar36, zzbjiVar37, zzbjiVar38, zzbjiVar39, zzbjiVar40, zzbjiVar41, zzbjiVar42, zzbjiVar43, zzbjiVar44, zzbjiVar45, zzbjiVar46, zzbjiVar47, zzbjiVar48, zzbjiVar49, new zzbji("GROUP_LIST", 49, 49, 2, zzbkfVar7), new zzbji("MAP", 50, 50, 4, zzbkf.zza)};
        zzbji[] values = values();
        zzaa = new zzbji[values.length];
        for (zzbji zzbjiVar50 : values) {
            zzaa[zzbjiVar50.zzZ] = zzbjiVar50;
        }
    }

    public zzbji(String str, int i, int i2, int i3, zzbkf zzbkfVar) {
        this.zzZ = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            zzbkfVar.getClass();
        } else if (i4 == 3) {
            zzbkfVar.getClass();
        }
        if (i3 == 1) {
            zzbkf zzbkfVar2 = zzbkf.zza;
            zzbkfVar.ordinal();
        }
    }

    public static zzbji[] values() {
        return (zzbji[]) zzab.clone();
    }
}
