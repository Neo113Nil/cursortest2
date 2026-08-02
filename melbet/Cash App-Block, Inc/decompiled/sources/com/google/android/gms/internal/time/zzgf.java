package com.google.android.gms.internal.time;

import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzgf extends zzef {
    public static final Set zza;
    public static final zzew zzb;
    public static final zzgc zzc;
    public final String zzd;
    public final Level zze;
    public final Set zzf;
    public final zzew zzg;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzdd.zza, zzeg.zza, zzeh.zza)));
        zza = unmodifiableSet;
        zzew zzewVar = new zzew(zzcw.zza(unmodifiableSet));
        zzb = zzewVar;
        zzc = new zzgc(Level.ALL, unmodifiableSet, zzewVar);
    }

    public /* synthetic */ zzgf(String str, Level level, Set set, zzew zzewVar) {
        super(str);
        this.zzd = zzbz.zza(str);
        this.zze = level;
        this.zzf = set;
        this.zzg = zzewVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0489  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzi(zzd zzdVar, String str, Level level, Set set, zzew zzewVar) {
        zzfm zzfjVar;
        zzfm zzfmVar;
        Level level2;
        int i;
        zzek zzekVar;
        int i2;
        String str2;
        zzfm zzfmVar2;
        zzej zzejVar;
        zzgv zzguVar;
        zzgv zzgyVar;
        int i3;
        Object[] objArr;
        int i4;
        boolean z;
        String sb;
        int zzb2;
        zzcw zzg = zzdVar.zzg();
        Level level3 = zzdVar.zzb;
        Boolean bool = (Boolean) zzg.zzc(zzeh.zza);
        if (bool != null && bool.booleanValue()) {
            return;
        }
        ((zzfv) zzfn.zza).getClass();
        zzcw zza2 = zzgb.zza.zza();
        zzcw zzg2 = zzdVar.zzg();
        int zza3 = zzg2.zza();
        if (zza3 == 0) {
            zzfjVar = zzfm.zza;
        } else {
            zzfjVar = zza3 <= 28 ? new zzfj(zza2, zzg2) : new zzfk(zza2, zzg2);
        }
        boolean z2 = level3.intValue() < level.intValue();
        if (!z2) {
            int i5 = zzfq.$r8$clinit;
            if (zzdVar.zzg == null && zzfjVar.zza() <= set.size() && set.containsAll(zzfjVar.zzb())) {
                if (!(zzdVar.zzg == null)) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get literal argument if a template context exists");
                    return;
                }
                Object[] objArr2 = zzdVar.zzh;
                if (objArr2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get literal argument before calling log()");
                    return;
                }
                sb = zzer.zza(objArr2[0]);
                level2 = level3;
                Throwable th = (Throwable) zzdVar.zzg().zzc(zzdd.zza);
                zzb2 = zzbz.zzb(level2);
                if (zzb2 != 2) {
                    Log.v(str, sb, th);
                    return;
                }
                if (zzb2 == 3) {
                    Log.d(str, sb, th);
                    return;
                }
                if (zzb2 == 4) {
                    Log.i(str, sb, th);
                    return;
                } else if (zzb2 != 5) {
                    Log.e(str, sb, th);
                    return;
                } else {
                    Log.w(str, sb, th);
                    return;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        zzdg zzdgVar = zzdVar.zze;
        if (zzdgVar == null) {
            a$$ExternalSyntheticBUOutline0.m$1("cannot request log site information prior to postProcess()");
            return;
        }
        if (zzbz.zza(2, zzdgVar, sb2)) {
            sb2.append(" ");
        }
        if (!z2 || zzdVar.zzg == null) {
            zzfr zzfrVar = zzdVar.zzg;
            if (zzfrVar != null) {
                String str3 = "cannot get arguments unless a template context exists";
                if (!(zzfrVar != null)) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get arguments unless a template context exists");
                    return;
                }
                Object[] objArr3 = zzdVar.zzh;
                String str4 = "cannot get arguments before calling log()";
                if (objArr3 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get arguments before calling log()");
                    return;
                }
                zzei zzeiVar = new zzei(zzfrVar, objArr3, sb2);
                StringBuilder sb3 = (StringBuilder) zzeiVar.zzb;
                zzfr zzfrVar2 = (zzfr) zzeiVar.zza$1;
                zzgz zzgzVar = zzfrVar2.zza;
                String str5 = zzfrVar2.zzb;
                zzgzVar.getClass();
                int zze = zzhd.zze(0, str5);
                int i6 = -1;
                int i7 = 0;
                while (zze >= 0) {
                    int i8 = 3;
                    int i9 = zze + 1;
                    int i10 = i9;
                    int i11 = 0;
                    while (i10 < str5.length()) {
                        int i12 = i10 + 1;
                        Level level4 = level3;
                        char charAt = str5.charAt(i10);
                        int i13 = i10;
                        char c = (char) (charAt - '0');
                        String str6 = str3;
                        if (c >= '\n') {
                            if (charAt != '$') {
                                i = -1;
                                if (charAt != '<') {
                                    i6 = i7;
                                    i7++;
                                } else {
                                    if (i6 == -1) {
                                        throw zzhc.zzc("invalid relative parameter", zze, i12, str5);
                                    }
                                    if (i12 == str5.length()) {
                                        throw new zzhc(zzhc.zze("unterminated parameter", zze, -1, str5));
                                    }
                                    str5.charAt(i12);
                                    i9 = i12;
                                    i12 = i13 + 2;
                                }
                            } else {
                                if (i13 - i9 == 0) {
                                    throw zzhc.zzc("missing index", zze, i12, str5);
                                }
                                if (str5.charAt(i9) == '0') {
                                    throw zzhc.zzc("index has leading zero", zze, i12, str5);
                                }
                                int i14 = i11 - 1;
                                if (i12 == str5.length()) {
                                    throw new zzhc(zzhc.zze("unterminated parameter", zze, -1, str5));
                                }
                                str5.charAt(i12);
                                i9 = i12;
                                i12 = i13 + 2;
                                i6 = i14;
                                i = -1;
                            }
                            int i15 = i12 + i;
                            while (i15 < str5.length()) {
                                if (((char) ((str5.charAt(i15) & 65503) - 65)) < 26) {
                                    char charAt2 = str5.charAt(i15);
                                    int i16 = charAt2 & ' ';
                                    boolean z3 = i16 == 0;
                                    zzek zzekVar2 = zzek.zzb;
                                    if (i9 != i15 || z3) {
                                        int i17 = true != z3 ? 0 : 128;
                                        while (i9 != i15) {
                                            int i18 = i9 + 1;
                                            i2 = i16;
                                            char charAt3 = str5.charAt(i9);
                                            str2 = str4;
                                            if (charAt3 < ' ' || charAt3 > '0') {
                                                zzfmVar2 = zzfjVar;
                                                if (charAt3 > '9') {
                                                    throw zzhc.zza(i9, "invalid flag", str5);
                                                }
                                                int i19 = charAt3 - '0';
                                                while (true) {
                                                    if (i18 == i15) {
                                                        zzekVar = new zzek(i17, i19, -1);
                                                        break;
                                                    }
                                                    int i20 = i18 + 1;
                                                    char charAt4 = str5.charAt(i18);
                                                    if (charAt4 == '.') {
                                                        zzekVar = new zzek(i17, i19, zzek.zzn(i20, i15, str5));
                                                        break;
                                                    }
                                                    char c2 = (char) (charAt4 - '0');
                                                    if (c2 >= '\n') {
                                                        throw zzhc.zza(i18, "invalid width character", str5);
                                                    }
                                                    i19 = (i19 * 10) + c2;
                                                    if (i19 > 999999) {
                                                        throw zzhc.zzc("width too large", i9, i15, str5);
                                                    }
                                                    i18 = i20;
                                                    i8 = 3;
                                                }
                                            } else {
                                                zzfmVar2 = zzfjVar;
                                                int i21 = ((int) ((zzek.zza >>> ((charAt3 - ' ') * 3)) & 7)) - 1;
                                                if (i21 >= 0) {
                                                    int i22 = 1 << i21;
                                                    if ((i17 & i22) != 0) {
                                                        throw zzhc.zza(i9, "repeated flag", str5);
                                                    }
                                                    i17 |= i22;
                                                    i9 = i18;
                                                    zzfjVar = zzfmVar2;
                                                    i16 = i2;
                                                    str4 = str2;
                                                } else {
                                                    if (charAt3 != '.') {
                                                        throw zzhc.zza(i9, "invalid flag", str5);
                                                    }
                                                    zzekVar = new zzek(i17, -1, zzek.zzn(i18, i15, str5));
                                                }
                                            }
                                            zzejVar = zzej.zzk[(charAt2 | ' ') - 97];
                                            if (i2 == 0 && (zzejVar == null || (zzejVar.zzo & 128) == 0)) {
                                                zzejVar = null;
                                            }
                                            int i23 = i15 + 1;
                                            if (zzejVar == null) {
                                                zzekVar.getClass();
                                                int i24 = zzejVar.zzo;
                                                int i25 = zzejVar.zzn;
                                                if (i25 != 1) {
                                                    if (i25 == 2 || i25 == i8 || i25 == 4) {
                                                        z = false;
                                                        if (zzekVar.zzl(i24, z)) {
                                                            throw zzhc.zzc("invalid format specifier", zze, i23, str5);
                                                        }
                                                        if (i6 < 10) {
                                                            Map map = zzgx.zza;
                                                            if (zzekVar.zzj()) {
                                                                zzgv[] zzgvVarArr = (zzgx[]) zzgx.zza.get(zzejVar);
                                                                zzcw.zza(zzgvVarArr, "default parameter");
                                                                zzguVar = zzgvVarArr[i6];
                                                            }
                                                        }
                                                        zzgyVar = new zzgx(i6, zzejVar, zzekVar);
                                                        zzguVar = zzgyVar;
                                                    } else if (i25 != 5) {
                                                        throw null;
                                                    }
                                                }
                                                z = true;
                                                if (zzekVar.zzl(i24, z)) {
                                                }
                                            } else if (charAt2 == 't' || charAt2 == 'T') {
                                                if (!zzekVar.zzl(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, false)) {
                                                    throw zzhc.zzc("invalid format specification", zze, i23, str5);
                                                }
                                                int i26 = i15 + 2;
                                                if (i26 > str5.length()) {
                                                    throw zzhc.zza(zze, "truncated format specifier", str5);
                                                }
                                                zzgt zzgtVar = (zzgt) zzgt.zzF.get(Character.valueOf(str5.charAt(i23)));
                                                if (zzgtVar == null) {
                                                    throw zzhc.zza(i23, "illegal date/time conversion", str5);
                                                }
                                                zzguVar = new zzgu(zzekVar, i6, zzgtVar);
                                                i23 = i26;
                                            } else {
                                                if (charAt2 != 'h' && charAt2 != 'H') {
                                                    throw zzhc.zzc("invalid format specification", zze, i23, str5);
                                                }
                                                if (!zzekVar.zzl(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, false)) {
                                                    throw zzhc.zzc("invalid format specification", zze, i23, str5);
                                                }
                                                zzgyVar = new zzgy(zzekVar, i6);
                                                zzguVar = zzgyVar;
                                            }
                                            i3 = zzguVar.zza;
                                            if (i3 < 32) {
                                                zzeiVar.zzb$1 |= 1 << i3;
                                            }
                                            zzeiVar.zzc$1 = Math.max(zzeiVar.zzc$1, i3);
                                            zzhd.zzd(zzeiVar.zzc, zze, str5, sb3);
                                            objArr = (Object[]) zzeiVar.zza;
                                            i4 = zzguVar.zza;
                                            if (i4 >= objArr.length) {
                                                Object obj = objArr[i4];
                                                if (obj != null) {
                                                    zzguVar.zzb(zzeiVar, obj);
                                                } else {
                                                    sb3.append("null");
                                                }
                                            } else {
                                                sb3.append("[ERROR: MISSING LOG ARGUMENT]");
                                            }
                                            zzeiVar.zzc = i23;
                                            zze = zzhd.zze(i23, str5);
                                            zzfjVar = zzfmVar2;
                                            level3 = level4;
                                            str3 = str6;
                                            str4 = str2;
                                        }
                                        zzekVar = new zzek(i17, -1, -1);
                                    } else {
                                        zzekVar = zzek.zzb;
                                    }
                                    zzfmVar2 = zzfjVar;
                                    i2 = i16;
                                    str2 = str4;
                                    zzejVar = zzej.zzk[(charAt2 | ' ') - 97];
                                    if (i2 == 0) {
                                        zzejVar = null;
                                    }
                                    int i232 = i15 + 1;
                                    if (zzejVar == null) {
                                    }
                                    i3 = zzguVar.zza;
                                    if (i3 < 32) {
                                    }
                                    zzeiVar.zzc$1 = Math.max(zzeiVar.zzc$1, i3);
                                    zzhd.zzd(zzeiVar.zzc, zze, str5, sb3);
                                    objArr = (Object[]) zzeiVar.zza;
                                    i4 = zzguVar.zza;
                                    if (i4 >= objArr.length) {
                                    }
                                    zzeiVar.zzc = i232;
                                    zze = zzhd.zze(i232, str5);
                                    zzfjVar = zzfmVar2;
                                    level3 = level4;
                                    str3 = str6;
                                    str4 = str2;
                                } else {
                                    i15++;
                                    str4 = str4;
                                    i8 = 3;
                                }
                            }
                            throw new zzhc(zzhc.zze("unterminated parameter", zze, -1, str5));
                        }
                        int i27 = (i11 * 10) + c;
                        if (i27 >= 1000000) {
                            throw zzhc.zzc("index too large", zze, i12, str5);
                        }
                        i11 = i27;
                        i10 = i12;
                        level3 = level4;
                        str3 = str6;
                    }
                    throw new zzhc(zzhc.zze("unterminated parameter", zze, -1, str5));
                }
                zzfmVar = zzfjVar;
                level2 = level3;
                String str7 = str3;
                String str8 = str4;
                int i28 = zzeiVar.zzb$1;
                if (((i28 + 1) & i28) != 0 || (zzeiVar.zzc$1 > 31 && i28 != -1)) {
                    throw new zzhc(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i28))));
                }
                zzhd.zzd(zzeiVar.zzc, str5.length(), str5, sb3);
                if (!(zzdVar.zzg != null)) {
                    a$$ExternalSyntheticBUOutline0.m$1(str7);
                    return;
                }
                Object[] objArr4 = zzdVar.zzh;
                if (objArr4 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1(str8);
                    return;
                } else if (objArr4.length > zzeiVar.zzc$1 + 1) {
                    sb3.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                }
            } else {
                zzfmVar = zzfjVar;
                level2 = level3;
                if (!(zzfrVar == null)) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get literal argument if a template context exists");
                    return;
                }
                Object[] objArr5 = zzdVar.zzh;
                if (objArr5 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get literal argument before calling log()");
                    return;
                }
                sb2.append(zzer.zza(objArr5[0]));
            }
            int i29 = zzfq.$r8$clinit;
            zzem zzemVar = new zzem(sb2);
            zzfmVar.zzc(zzewVar, zzemVar);
            if (zzemVar.zze) {
                sb2.append(" ]");
            }
        } else {
            sb2.append("(REDACTED) ");
            sb2.append(zzdVar.zzg.zzb);
            level2 = level3;
        }
        sb = sb2.toString();
        Throwable th2 = (Throwable) zzdVar.zzg().zzc(zzdd.zza);
        zzb2 = zzbz.zzb(level2);
        if (zzb2 != 2) {
        }
    }

    @Override // com.google.android.gms.internal.time.zzef
    public final void zzb(zzd zzdVar) {
        zzi(zzdVar, this.zzd, this.zze, this.zzf, this.zzg);
    }

    @Override // com.google.android.gms.internal.time.zzef
    public final boolean zzc(Level level) {
        int zzb2 = zzbz.zzb(level);
        return Log.isLoggable(this.zzd, zzb2) || Log.isLoggable("all", zzb2);
    }
}
