package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public enum zzcy {
    DOUBLE(0, 1, zzdw.DOUBLE),
    FLOAT(1, 1, zzdw.FLOAT),
    INT64(2, 1, zzdw.LONG),
    UINT64(3, 1, zzdw.LONG),
    INT32(4, 1, zzdw.INT),
    FIXED64(5, 1, zzdw.LONG),
    FIXED32(6, 1, zzdw.INT),
    BOOL(7, 1, zzdw.BOOLEAN),
    STRING(8, 1, zzdw.STRING),
    MESSAGE(9, 1, zzdw.MESSAGE),
    BYTES(10, 1, zzdw.BYTE_STRING),
    UINT32(11, 1, zzdw.INT),
    ENUM(12, 1, zzdw.ENUM),
    SFIXED32(13, 1, zzdw.INT),
    SFIXED64(14, 1, zzdw.LONG),
    SINT32(15, 1, zzdw.INT),
    SINT64(16, 1, zzdw.LONG),
    GROUP(17, 1, zzdw.MESSAGE),
    DOUBLE_LIST(18, 2, zzdw.DOUBLE),
    FLOAT_LIST(19, 2, zzdw.FLOAT),
    INT64_LIST(20, 2, zzdw.LONG),
    UINT64_LIST(21, 2, zzdw.LONG),
    INT32_LIST(22, 2, zzdw.INT),
    FIXED64_LIST(23, 2, zzdw.LONG),
    FIXED32_LIST(24, 2, zzdw.INT),
    BOOL_LIST(25, 2, zzdw.BOOLEAN),
    STRING_LIST(26, 2, zzdw.STRING),
    MESSAGE_LIST(27, 2, zzdw.MESSAGE),
    BYTES_LIST(28, 2, zzdw.BYTE_STRING),
    UINT32_LIST(29, 2, zzdw.INT),
    ENUM_LIST(30, 2, zzdw.ENUM),
    SFIXED32_LIST(31, 2, zzdw.INT),
    SFIXED64_LIST(32, 2, zzdw.LONG),
    SINT32_LIST(33, 2, zzdw.INT),
    SINT64_LIST(34, 2, zzdw.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzdw.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzdw.FLOAT),
    INT64_LIST_PACKED(37, 3, zzdw.LONG),
    UINT64_LIST_PACKED(38, 3, zzdw.LONG),
    INT32_LIST_PACKED(39, 3, zzdw.INT),
    FIXED64_LIST_PACKED(40, 3, zzdw.LONG),
    FIXED32_LIST_PACKED(41, 3, zzdw.INT),
    BOOL_LIST_PACKED(42, 3, zzdw.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzdw.INT),
    ENUM_LIST_PACKED(44, 3, zzdw.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzdw.INT),
    SFIXED64_LIST_PACKED(46, 3, zzdw.LONG),
    SINT32_LIST_PACKED(47, 3, zzdw.INT),
    SINT64_LIST_PACKED(48, 3, zzdw.LONG),
    GROUP_LIST(49, 2, zzdw.MESSAGE),
    MAP(50, 4, zzdw.VOID);

    private static final zzcy[] zzaa;
    private final int zzZ;

    static {
        zzcy[] values = values();
        zzaa = new zzcy[values.length];
        for (zzcy zzcyVar : values) {
            zzaa[zzcyVar.zzZ] = zzcyVar;
        }
    }

    zzcy(int i, int i2, zzdw zzdwVar) {
        this.zzZ = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zzdwVar.zza();
        } else if (i3 == 3) {
            zzdwVar.zza();
        }
        if (i2 == 1) {
            zzdw zzdwVar2 = zzdw.VOID;
            zzdwVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzZ;
    }
}
