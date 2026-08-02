package com.google.android.gms.internal.measurement;

import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class zzaas extends zzaag {
    public static final Set zzb;
    public static final zzzm zzc;
    public static final zzaaq zzd;
    public final String zze;
    public final Level zzf;
    public final Set zzg;
    public final zzzm zzh;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzxx.zza, zzyw.zza, zzyx.zza)));
        zzb = unmodifiableSet;
        zzzm zzzmVar = new zzzm(zzxm.zza(unmodifiableSet));
        zzc = zzzmVar;
        zzd = new zzaaq(Level.ALL, unmodifiableSet, zzzmVar);
    }

    public /* synthetic */ zzaas(String str, Level level, Set set, zzzm zzzmVar) {
        super(str);
        this.zze = zzjx.zza(str);
        this.zzf = level;
        this.zzg = set;
        this.zzh = zzzmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019b, code lost:
    
        if (((char) ((r4.charAt(r6) & 65503) - 65)) >= 26) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x037e, code lost:
    
        r6 = r6 + 1;
        r15 = r15;
        r16 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019d, code lost:
    
        r3 = r4.charAt(r6);
        r7 = r3 & ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a3, code lost:
    
        if (r7 != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a5, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a8, code lost:
    
        r20 = com.google.android.gms.internal.measurement.zzza.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ac, code lost:
    
        if (r12 != r6) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
    
        if (r14 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b2, code lost:
    
        r12 = com.google.android.gms.internal.measurement.zzza.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b4, code lost:
    
        r17 = r2;
        r24 = r11;
        r25 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0244, code lost:
    
        r1 = com.google.android.gms.internal.measurement.zzyz.zzk[(r3 | ' ') - 97];
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024d, code lost:
    
        if (r7 != 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024f, code lost:
    
        if (r1 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0256, code lost:
    
        if ((r1.zzn & 128) == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0259, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025a, code lost:
    
        r7 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025c, code lost:
    
        if (r1 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x025e, code lost:
    
        r12.getClass();
        r3 = r1.zzn;
        r6 = r1.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0266, code lost:
    
        if (r6 == 1) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0269, code lost:
    
        if (r6 == 2) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x026d, code lost:
    
        if (r6 == r16) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0270, code lost:
    
        if (r6 == 4) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0273, code lost:
    
        if (r6 != 5) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0277, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0278, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027d, code lost:
    
        if (r12.zzh(r3, r2) == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0281, code lost:
    
        if (r8 >= 10) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0283, code lost:
    
        r2 = com.google.android.gms.internal.measurement.zzabj.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0289, code lost:
    
        if (r12.zze() == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028b, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.zzabj[]) com.google.android.gms.internal.measurement.zzabj.zza.get(r1);
        com.google.android.gms.internal.measurement.zzky.zza(r1, "default parameter");
        r1 = r1[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02f4, code lost:
    
        r2 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02f8, code lost:
    
        if (r2 >= 32) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02fa, code lost:
    
        r10.zzb$1 |= 1 << r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0303, code lost:
    
        r10.zzc$1 = java.lang.Math.max(r10.zzc$1, r2);
        com.google.android.gms.internal.measurement.zzabp.zzd(r10.zzc, r5, r4, r9);
        r2 = r1.zza;
        r3 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0315, code lost:
    
        if (r2 >= r3.length) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0317, code lost:
    
        r2 = r3[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0319, code lost:
    
        if (r2 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x031b, code lost:
    
        r1.zzb(r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x031f, code lost:
    
        r9.append("null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0326, code lost:
    
        r9.append("[ERROR: MISSING LOG ARGUMENT]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029b, code lost:
    
        r2 = new com.google.android.gms.internal.measurement.zzabj(r8, r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02d0, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02a7, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zza("invalid format specifier", r5, r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0275, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02ae, code lost:
    
        if (r3 == 't') goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02b2, code lost:
    
        if (r3 != 'T') goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02b8, code lost:
    
        if (r3 == 'h') goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02bc, code lost:
    
        if (r3 != 'H') goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02c4, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zza("invalid format specification", r5, r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02c9, code lost:
    
        if (r12.zzh(com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, false) == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02cb, code lost:
    
        r2 = new com.google.android.gms.internal.measurement.zzabk(r12, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02d6, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zza("invalid format specification", r5, r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02db, code lost:
    
        if (r12.zzh(com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, false) == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02dd, code lost:
    
        r6 = r6 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02e3, code lost:
    
        if (r6 > r4.length()) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02e5, code lost:
    
        r1 = com.google.android.gms.internal.measurement.zzabf.zza(r4.charAt(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02ed, code lost:
    
        if (r1 == null) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02ef, code lost:
    
        r1 = com.google.android.gms.internal.measurement.zzabg.zza(r8, r1, r12);
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0344, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zzb(r7, "illegal date/time conversion", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x034c, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zzb(r5, "truncated format specifier", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0351, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zza("invalid format specification", r5, r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01bc, code lost:
    
        if (true == r14) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x01be, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x01c2, code lost:
    
        if (r12 != r6) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01cb, code lost:
    
        r14 = r12 + 1;
        r24 = r11;
        r11 = r4.charAt(r12);
        r25 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x01d9, code lost:
    
        if (r11 < ' ') goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x01dd, code lost:
    
        if (r11 <= '0') goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x01e2, code lost:
    
        r17 = r2;
        r1 = ((int) ((com.google.android.gms.internal.measurement.zzza.zza >>> ((r11 - ' ') * 3)) & 7)) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01f3, code lost:
    
        if (r1 >= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0209, code lost:
    
        r1 = 1 << r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x020f, code lost:
    
        if ((r7 & r1) != 0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0211, code lost:
    
        r7 = r7 | r1;
        r12 = r14;
        r2 = r17;
        r11 = r24;
        r15 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0221, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zzb(r12, "repeated flag", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01f7, code lost:
    
        if (r11 != '.') goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01f9, code lost:
    
        r12 = new com.google.android.gms.internal.measurement.zzza(r7, -1, com.google.android.gms.internal.measurement.zzza.zzn(r14, r6, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0208, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zzb(r12, "invalid flag", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01df, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0224, code lost:
    
        if (r11 > '9') goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0226, code lost:
    
        r11 = r11 - '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0228, code lost:
    
        if (r14 != r6) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0231, code lost:
    
        r1 = r14 + 1;
        r2 = r4.charAt(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0239, code lost:
    
        if (r2 != '.') goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0352, code lost:
    
        r2 = (char) (r2 - '0');
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x035b, code lost:
    
        if (r2 >= '\n') goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x035d, code lost:
    
        r11 = (r11 * 10) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0363, code lost:
    
        if (r11 > 999999) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0365, code lost:
    
        r14 = r1;
        r16 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0371, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zza("width too large", r12, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0378, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zzb(r14, "invalid width character", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x023b, code lost:
    
        r12 = new com.google.android.gms.internal.measurement.zzza(r7, r11, com.google.android.gms.internal.measurement.zzza.zzn(r1, r6, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x022a, code lost:
    
        r12 = new com.google.android.gms.internal.measurement.zzza(r7, r11, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x037d, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zzb(r12, "invalid flag", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01c4, code lost:
    
        r12 = new com.google.android.gms.internal.measurement.zzza(r7, -1, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01c0, code lost:
    
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01a7, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0394, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zzc(r5, "unterminated parameter", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0153, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zzc(r5, "unterminated parameter", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x015a, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zza("index has leading zero", r5, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0162, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zza("missing index", r5, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0165, code lost:
    
        if (r11 != '<') goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0168, code lost:
    
        if (r8 == (-1)) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x016e, code lost:
    
        if (r6 == r4.length()) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0170, code lost:
    
        r4.charAt(r6);
        r12 = r6;
        r6 = r21 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x017c, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zzc(r5, "unterminated parameter", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0183, code lost:
    
        throw com.google.android.gms.internal.measurement.zzabo.zza("invalid relative parameter", r5, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0184, code lost:
    
        r11 = r20 + 1;
        r8 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012e, code lost:
    
        if (r11 != '$') goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0132, code lost:
    
        if ((r21 - r12) == 0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0138, code lost:
    
        if (r4.charAt(r12) == '0') goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013a, code lost:
    
        r17 = r17 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0140, code lost:
    
        if (r6 == r4.length()) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0142, code lost:
    
        r4.charAt(r6);
        r12 = r6;
        r6 = r21 + 2;
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014b, code lost:
    
        r11 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0189, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018e, code lost:
    
        if (r6 >= r4.length()) goto L310;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x046f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzi(zzxq zzxqVar, String str, Level level, Set set, zzzm zzzmVar) {
        zzaaa zzzyVar;
        zzaaa zzaaaVar;
        Level level2;
        Level level3;
        String str2;
        int i;
        String str3;
        zzaaa zzaaaVar2;
        int i2;
        String sb;
        int zzb2;
        zzjx zzl = zzxqVar.zzl();
        Level level4 = zzxqVar.zzb;
        Boolean bool = (Boolean) zzl.zzd(zzyx.zza);
        if (bool != null && bool.booleanValue()) {
            return;
        }
        ((zzaaj) zzaab.zza).getClass();
        zzjx zzd2 = zzaap.zza.zzd();
        zzjx zzl2 = zzxqVar.zzl();
        int zza = zzl2.zza();
        if (zza == 0) {
            zzzyVar = zzaaa.zza;
        } else {
            zzzyVar = zza <= 28 ? new zzzy(zzd2, zzl2) : new zzzz(zzd2, zzl2);
        }
        boolean z = level4.intValue() < level.intValue();
        if (!z) {
            int i3 = zzaae.$r8$clinit;
            if (zzxqVar.zzg == null && zzzyVar.zzb() <= set.size() && set.containsAll(zzzyVar.zzc())) {
                if (!(zzxqVar.zzg == null)) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get literal argument if a template context exists");
                    return;
                }
                Object[] objArr = zzxqVar.zzh;
                if (objArr == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get literal argument before calling log()");
                    return;
                }
                sb = zzzh.zza(objArr[0]);
                level2 = level4;
                Throwable th = (Throwable) zzxqVar.zzl().zzd(zzxx.zza);
                zzb2 = zzjx.zzb(level2);
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
        zzyc zzycVar = zzxqVar.zze;
        if (zzycVar == null) {
            a$$ExternalSyntheticBUOutline0.m$1("cannot request log site information prior to postProcess()");
            return;
        }
        if (zzxm.zza(2, zzycVar, sb2)) {
            sb2.append(" ");
        }
        if (!z || zzxqVar.zzg == null) {
            zzaaf zzaafVar = zzxqVar.zzg;
            if (zzaafVar != null) {
                String str4 = "cannot get arguments unless a template context exists";
                if (!(zzaafVar != null)) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get arguments unless a template context exists");
                    return;
                }
                Object[] objArr2 = zzxqVar.zzh;
                String str5 = "cannot get arguments before calling log()";
                if (objArr2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get arguments before calling log()");
                    return;
                }
                zzyy zzyyVar = new zzyy(zzaafVar, objArr2, sb2);
                zzaaf zzaafVar2 = zzyyVar.zza$1;
                zzabl zzablVar = zzaafVar2.zza;
                String str6 = zzaafVar2.zzb;
                zzablVar.getClass();
                int zze = zzabp.zze(0, str6);
                int i4 = -1;
                int i5 = 0;
                while (true) {
                    int i6 = 3;
                    StringBuilder sb3 = zzyyVar.zzb;
                    if (zze >= 0) {
                        int i7 = zze + 1;
                        int i8 = i7;
                        int i9 = 0;
                        while (true) {
                            level3 = level4;
                            if (i8 >= str6.length()) {
                                throw zzabo.zzc(zze, "unterminated parameter", str6);
                            }
                            int i10 = i8 + 1;
                            int i11 = i5;
                            char charAt = str6.charAt(i8);
                            int i12 = i8;
                            char c = (char) (charAt - '0');
                            str2 = str4;
                            if (c >= '\n') {
                                break;
                            }
                            int i13 = (i9 * 10) + c;
                            if (i13 >= 1000000) {
                                throw zzabo.zza("index too large", zze, i10, str6);
                            }
                            i9 = i13;
                            i8 = i10;
                            level4 = level3;
                            i5 = i11;
                            str4 = str2;
                        }
                    } else {
                        zzaaaVar = zzzyVar;
                        level2 = level4;
                        String str7 = str4;
                        String str8 = str5;
                        int i14 = zzyyVar.zzb$1;
                        if (((i14 + 1) & i14) != 0 || (zzyyVar.zzc$1 > 31 && i14 != -1)) {
                            throw zzabo.zzd(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i14))));
                        }
                        zzabp.zzd(zzyyVar.zzc, str6.length(), str6, sb3);
                        if (!(zzxqVar.zzg != null)) {
                            a$$ExternalSyntheticBUOutline0.m$1(str7);
                            return;
                        }
                        Object[] objArr3 = zzxqVar.zzh;
                        if (objArr3 == null) {
                            a$$ExternalSyntheticBUOutline0.m$1(str8);
                            return;
                        } else if (objArr3.length > zzyyVar.zzc$1 + 1) {
                            sb3.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                        }
                    }
                    zzyyVar.zzc = i2;
                    zze = zzabp.zze(i2, str6);
                    zzzyVar = zzaaaVar2;
                    level4 = level3;
                    str4 = str2;
                    i5 = i;
                    str5 = str3;
                }
            } else {
                zzaaaVar = zzzyVar;
                level2 = level4;
                if (!(zzaafVar == null)) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get literal argument if a template context exists");
                    return;
                }
                Object[] objArr4 = zzxqVar.zzh;
                if (objArr4 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot get literal argument before calling log()");
                    return;
                }
                sb2.append(zzzh.zza(objArr4[0]));
            }
            int i15 = zzaae.$r8$clinit;
            zzzc zzzcVar = new zzzc(sb2);
            zzaaaVar.zza(zzzmVar, zzzcVar);
            if (zzzcVar.zze) {
                sb2.append(" ]");
            }
        } else {
            sb2.append("(REDACTED) ");
            sb2.append(zzxqVar.zzg.zzb);
            level2 = level4;
        }
        sb = sb2.toString();
        Throwable th2 = (Throwable) zzxqVar.zzl().zzd(zzxx.zza);
        zzb2 = zzjx.zzb(level2);
        if (zzb2 != 2) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaag
    public final boolean zzb(Level level) {
        int zzb2 = zzjx.zzb(level);
        return Log.isLoggable(this.zze, zzb2) || Log.isLoggable("all", zzb2);
    }

    @Override // com.google.android.gms.internal.measurement.zzaag
    public final void zzc(zzxq zzxqVar) {
        zzi(zzxqVar, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
