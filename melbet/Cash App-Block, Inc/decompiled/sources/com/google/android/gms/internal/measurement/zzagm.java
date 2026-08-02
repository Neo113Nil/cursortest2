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
public final class zzagm {
    public static final zzagm zzi;
    public static final zzagm zzj;
    public static final zzagm zzk;
    public static final /* synthetic */ zzagm[] zzu;
    public final zzagn zzs;
    public final int zzt;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF0;

    static {
        zzagm zzagmVar = new zzagm("DOUBLE", 0, zzagn.zzd, 1);
        zzagm zzagmVar2 = new zzagm("FLOAT", 1, zzagn.zzc, 5);
        zzagn zzagnVar = zzagn.zzb;
        zzagm zzagmVar3 = new zzagm("INT64", 2, zzagnVar, 0);
        zzagm zzagmVar4 = new zzagm("UINT64", 3, zzagnVar, 0);
        zzagn zzagnVar2 = zzagn.zza;
        zzagm zzagmVar5 = new zzagm("INT32", 4, zzagnVar2, 0);
        zzagm zzagmVar6 = new zzagm("FIXED64", 5, zzagnVar, 1);
        zzagm zzagmVar7 = new zzagm("FIXED32", 6, zzagnVar2, 5);
        zzagm zzagmVar8 = new zzagm("BOOL", 7, zzagn.zze, 0);
        zzagm zzagmVar9 = new zzagm("STRING", 8, zzagn.zzf, 2);
        zzi = zzagmVar9;
        zzagn zzagnVar3 = zzagn.zzi;
        zzagm zzagmVar10 = new zzagm("GROUP", 9, zzagnVar3, 3);
        zzj = zzagmVar10;
        zzagm zzagmVar11 = new zzagm("MESSAGE", 10, zzagnVar3, 2);
        zzk = zzagmVar11;
        zzu = new zzagm[]{zzagmVar, zzagmVar2, zzagmVar3, zzagmVar4, zzagmVar5, zzagmVar6, zzagmVar7, zzagmVar8, zzagmVar9, zzagmVar10, zzagmVar11, new zzagm("BYTES", 11, zzagn.zzg, 2), new zzagm("UINT32", 12, zzagnVar2, 0), new zzagm("ENUM", 13, zzagn.zzh, 0), new zzagm("SFIXED32", 14, zzagnVar2, 5), new zzagm("SFIXED64", 15, zzagnVar, 1), new zzagm("SINT32", 16, zzagnVar2, 0), new zzagm("SINT64", 17, zzagnVar, 0)};
    }

    public zzagm(String str, int i, zzagn zzagnVar, int i2) {
        this.zzs = zzagnVar;
        this.zzt = i2;
    }

    public static zzagm[] values() {
        return (zzagm[]) zzu.clone();
    }
}
