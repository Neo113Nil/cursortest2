package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzaly {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzfp zzc = new zzfp();
    private final StringBuilder zzd = new StringBuilder();

    static String zza(zzfp zzfpVar, StringBuilder sb) {
        zzc(zzfpVar);
        if (zzfpVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzfpVar, sb);
        if (!"".equals(zzd)) {
            return zzd;
        }
        char zzm = (char) zzfpVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zzm);
        return sb2.toString();
    }

    static void zzc(zzfp zzfpVar) {
        while (true) {
            for (boolean z = true; zzfpVar.zzb() > 0 && z; z = false) {
                char c = (char) zzfpVar.zzM()[zzfpVar.zzd()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzfpVar.zzL(1);
                } else {
                    int zzd = zzfpVar.zzd();
                    int zze = zzfpVar.zze();
                    byte[] zzM = zzfpVar.zzM();
                    if (zzd + 2 <= zze) {
                        int i = zzd + 1;
                        if (zzM[zzd] == 47) {
                            int i2 = zzd + 2;
                            if (zzM[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= zze) {
                                        break;
                                    }
                                    if (((char) zzM[i2]) == '*' && ((char) zzM[i3]) == '/') {
                                        zze = i2 + 2;
                                        i2 = zze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzfpVar.zzL(zze - zzfpVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzfp zzfpVar, StringBuilder sb) {
        sb.setLength(0);
        int zzd = zzfpVar.zzd();
        int zze = zzfpVar.zze();
        loop0: while (true) {
            for (boolean z = false; zzd < zze && !z; z = true) {
                char c = (char) zzfpVar.zzM()[zzd];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    zzd++;
                }
            }
        }
        zzfpVar.zzL(zzd - zzfpVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0317, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00b0, code lost:
    
        if (")".equals(zza(r3, r4)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(zzfp zzfpVar) {
        String str;
        String sb;
        char c;
        int i = 0;
        this.zzd.setLength(0);
        int zzd = zzfpVar.zzd();
        while (!TextUtils.isEmpty(zzfpVar.zzy(zzfwq.zzc))) {
        }
        this.zzc.zzI(zzfpVar.zzM(), zzfpVar.zzd());
        this.zzc.zzK(zzd);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfp zzfpVar2 = this.zzc;
            StringBuilder sb2 = this.zzd;
            zzc(zzfpVar2);
            if (zzfpVar2.zzb() >= 5 && "::cue".equals(zzfpVar2.zzA(5, zzfwq.zzc))) {
                int zzd2 = zzfpVar2.zzd();
                String zza2 = zza(zzfpVar2, sb2);
                if (zza2 != null) {
                    if ("{".equals(zza2)) {
                        zzfpVar2.zzK(zzd2);
                        str = "";
                    } else if ("(".equals(zza2)) {
                        int zzd3 = zzfpVar2.zzd();
                        int zze = zzfpVar2.zze();
                        int i2 = i;
                        while (zzd3 < zze && i2 == 0) {
                            int i3 = zzd3 + 1;
                            i2 = ((char) zzfpVar2.zzM()[zzd3]) == ')' ? 1 : i;
                            zzd3 = i3;
                        }
                        str = zzfpVar2.zzA((zzd3 - 1) - zzfpVar2.zzd(), zzfwq.zzc).trim();
                    } else {
                        str = null;
                    }
                    if (str == null || !"{".equals(zza(this.zzc, this.zzd))) {
                        break;
                    }
                    zzalz zzalzVar = new zzalz();
                    if (!"".equals(str)) {
                        int indexOf = str.indexOf(91);
                        if (indexOf != -1) {
                            Matcher matcher = zza.matcher(str.substring(indexOf));
                            if (matcher.matches()) {
                                String group = matcher.group(1);
                                group.getClass();
                                zzalzVar.zzv(group);
                            }
                            str = str.substring(i, indexOf);
                        }
                        int i4 = zzfy.zza;
                        String[] split = str.split("\\.", -1);
                        String str2 = split[i];
                        int indexOf2 = str2.indexOf(35);
                        if (indexOf2 != -1) {
                            zzalzVar.zzu(str2.substring(i, indexOf2));
                            zzalzVar.zzt(str2.substring(indexOf2 + 1));
                        } else {
                            zzalzVar.zzu(str2);
                        }
                        int length = split.length;
                        if (length > 1) {
                            zzalzVar.zzs((String[]) Arrays.copyOfRange(split, 1, length));
                        }
                    }
                    int i5 = i;
                    String str3 = null;
                    while (i5 == 0) {
                        zzfp zzfpVar3 = this.zzc;
                        StringBuilder sb3 = this.zzd;
                        int zzd4 = zzfpVar3.zzd();
                        str3 = zza(zzfpVar3, sb3);
                        i5 = (str3 == null || "}".equals(str3)) ? 1 : i;
                        if (i5 == 0) {
                            this.zzc.zzK(zzd4);
                            zzfp zzfpVar4 = this.zzc;
                            StringBuilder sb4 = this.zzd;
                            zzc(zzfpVar4);
                            String zzd5 = zzd(zzfpVar4, sb4);
                            if (!"".equals(zzd5) && CertificateUtil.DELIMITER.equals(zza(zzfpVar4, sb4))) {
                                zzc(zzfpVar4);
                                StringBuilder sb5 = new StringBuilder();
                                int i6 = i;
                                while (true) {
                                    if (i6 != 0) {
                                        sb = sb5.toString();
                                        break;
                                    }
                                    int zzd6 = zzfpVar4.zzd();
                                    String zza3 = zza(zzfpVar4, sb4);
                                    if (zza3 == null) {
                                        sb = null;
                                        break;
                                    }
                                    if ("}".equals(zza3) || ";".equals(zza3)) {
                                        zzfpVar4.zzK(zzd6);
                                        i6 = 1;
                                    } else {
                                        sb5.append(zza3);
                                    }
                                }
                                if (sb != null && !"".equals(sb)) {
                                    int zzd7 = zzfpVar4.zzd();
                                    String zza4 = zza(zzfpVar4, sb4);
                                    if (!";".equals(zza4)) {
                                        if ("}".equals(zza4)) {
                                            zzfpVar4.zzK(zzd7);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if (TypedValues.Custom.S_COLOR.equals(zzd5)) {
                                        zzalzVar.zzk(zzen.zza(sb));
                                    } else if ("background-color".equals(zzd5)) {
                                        zzalzVar.zzh(zzen.zza(sb));
                                    } else if ("ruby-position".equals(zzd5)) {
                                        if ("over".equals(sb)) {
                                            zzalzVar.zzp(1);
                                        } else if ("under".equals(sb)) {
                                            zzalzVar.zzp(2);
                                        }
                                    } else if ("text-combine-upright".equals(zzd5)) {
                                        zzalzVar.zzj("all".equals(sb) || sb.startsWith("digits"));
                                    } else if ("text-decoration".equals(zzd5)) {
                                        if ("underline".equals(sb)) {
                                            zzalzVar.zzq(true);
                                        }
                                    } else if ("font-family".equals(zzd5)) {
                                        zzalzVar.zzl(sb);
                                    } else if ("font-weight".equals(zzd5)) {
                                        if ("bold".equals(sb)) {
                                            zzalzVar.zzi(true);
                                        }
                                    } else if ("font-style".equals(zzd5)) {
                                        if ("italic".equals(sb)) {
                                            zzalzVar.zzo(true);
                                        }
                                    } else if ("font-size".equals(zzd5)) {
                                        Matcher matcher2 = zzb.matcher(zzfwk.zza(sb));
                                        if (matcher2.matches()) {
                                            String group2 = matcher2.group(2);
                                            group2.getClass();
                                            int hashCode = group2.hashCode();
                                            if (hashCode == 37) {
                                                if (group2.equals("%")) {
                                                    c = 2;
                                                    if (c != 0) {
                                                    }
                                                    String group3 = matcher2.group(1);
                                                    group3.getClass();
                                                    zzalzVar.zzm(Float.parseFloat(group3));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group32 = matcher2.group(1);
                                                group32.getClass();
                                                zzalzVar.zzm(Float.parseFloat(group32));
                                            } else if (hashCode != 3240) {
                                                if (hashCode == 3592 && group2.equals("px")) {
                                                    c = 0;
                                                    if (c != 0) {
                                                        zzalzVar.zzn(1);
                                                    } else if (c == 1) {
                                                        zzalzVar.zzn(2);
                                                    } else {
                                                        if (c != 2) {
                                                            throw new IllegalStateException();
                                                        }
                                                        zzalzVar.zzn(3);
                                                    }
                                                    String group322 = matcher2.group(1);
                                                    group322.getClass();
                                                    zzalzVar.zzm(Float.parseFloat(group322));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group3222 = matcher2.group(1);
                                                group3222.getClass();
                                                zzalzVar.zzm(Float.parseFloat(group3222));
                                            } else {
                                                if (group2.equals(UserDataStore.EMAIL)) {
                                                    c = 1;
                                                    if (c != 0) {
                                                    }
                                                    String group32222 = matcher2.group(1);
                                                    group32222.getClass();
                                                    zzalzVar.zzm(Float.parseFloat(group32222));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group322222 = matcher2.group(1);
                                                group322222.getClass();
                                                zzalzVar.zzm(Float.parseFloat(group322222));
                                            }
                                        } else {
                                            zzff.zzf("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        i = 0;
                    }
                    if ("}".equals(str3)) {
                        arrayList.add(zzalzVar);
                    }
                    i = 0;
                }
            }
            str = null;
            if (str == null) {
                break;
            }
            break;
        }
    }
}
