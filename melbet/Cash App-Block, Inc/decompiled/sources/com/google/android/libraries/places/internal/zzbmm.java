package com.google.android.libraries.places.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class zzbmm {
    public static final zzbmm zzc;
    public static final zzbmm zzj;
    public static final /* synthetic */ zzbmm[] zzu;
    public final zzbmn zzs;
    public final int zzt;

    /* JADX INFO: Fake field, exist only in values array */
    zzbmm EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzbmm EF2;

    static {
        zzbmm zzbmmVar = new zzbmm("DOUBLE", 0, zzbmn.zzd, 1);
        zzbmm zzbmmVar2 = new zzbmm("FLOAT", 1, zzbmn.zzc, 5);
        zzbmn zzbmnVar = zzbmn.zzb;
        zzbmm zzbmmVar3 = new zzbmm("INT64", 2, zzbmnVar, 0);
        zzc = zzbmmVar3;
        zzbmm zzbmmVar4 = new zzbmm("UINT64", 3, zzbmnVar, 0);
        zzbmn zzbmnVar2 = zzbmn.zza;
        zzbmm zzbmmVar5 = new zzbmm("INT32", 4, zzbmnVar2, 0);
        zzbmm zzbmmVar6 = new zzbmm("FIXED64", 5, zzbmnVar, 1);
        zzbmm zzbmmVar7 = new zzbmm("FIXED32", 6, zzbmnVar2, 5);
        zzbmm zzbmmVar8 = new zzbmm("BOOL", 7, zzbmn.zze, 0);
        zzbmm zzbmmVar9 = new zzbmm("STRING", 8, zzbmn.zzf, 2);
        zzbmn zzbmnVar3 = zzbmn.zzi;
        zzbmm zzbmmVar10 = new zzbmm("GROUP", 9, zzbmnVar3, 3);
        zzj = zzbmmVar10;
        zzu = new zzbmm[]{zzbmmVar, zzbmmVar2, zzbmmVar3, zzbmmVar4, zzbmmVar5, zzbmmVar6, zzbmmVar7, zzbmmVar8, zzbmmVar9, zzbmmVar10, new zzbmm("MESSAGE", 10, zzbmnVar3, 2), new zzbmm("BYTES", 11, zzbmn.zzg, 2), new zzbmm("UINT32", 12, zzbmnVar2, 0), new zzbmm("ENUM", 13, zzbmn.zzh, 0), new zzbmm("SFIXED32", 14, zzbmnVar2, 5), new zzbmm("SFIXED64", 15, zzbmnVar, 1), new zzbmm("SINT32", 16, zzbmnVar2, 0), new zzbmm("SINT64", 17, zzbmnVar, 0)};
    }

    public zzbmm(String str, int i, zzbmn zzbmnVar, int i2) {
        this.zzs = zzbmnVar;
        this.zzt = i2;
    }

    public static zzbmm[] values() {
        return (zzbmm[]) zzu.clone();
    }
}
