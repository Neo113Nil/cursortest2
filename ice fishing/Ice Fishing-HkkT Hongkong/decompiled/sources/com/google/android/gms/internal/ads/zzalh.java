package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.work.WorkRequest;
import com.facebook.internal.security.CertificateUtil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzalh implements zzakr {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzalg zzc;
    private final zzfp zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzalh() {
        this(null);
    }

    private static float zzb(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzc(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = zzfy.zza;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0050, code lost:
    
        if (r3.equals("playresx") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zze(zzfp zzfpVar, Charset charset) {
        while (true) {
            String zzy = zzfpVar.zzy(charset);
            if (zzy == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(zzy)) {
                while (true) {
                    String zzy2 = zzfpVar.zzy(charset);
                    if (zzy2 != null && (zzfpVar.zzb() == 0 || zzfpVar.zza(charset) != '[')) {
                        String[] split = zzy2.split(CertificateUtil.DELIMITER);
                        if (split.length == 2) {
                            char c = 0;
                            String zza2 = zzfwk.zza(split[0].trim());
                            switch (zza2.hashCode()) {
                                case 1879649548:
                                    break;
                                case 1879649549:
                                    if (zza2.equals("playresy")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                this.zzf = Float.parseFloat(split[1].trim());
                            } else if (c == 1) {
                                try {
                                    this.zzg = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(zzy)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzali zzaliVar = null;
                while (true) {
                    String zzy3 = zzfpVar.zzy(charset);
                    if (zzy3 != null && (zzfpVar.zzb() == 0 || zzfpVar.zza(charset) != '[')) {
                        if (zzy3.startsWith("Format:")) {
                            zzaliVar = zzali.zza(zzy3);
                        } else if (zzy3.startsWith("Style:")) {
                            if (zzaliVar == null) {
                                zzff.zzf("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(zzy3));
                            } else {
                                zzalk zzb = zzalk.zzb(zzy3, zzaliVar);
                                if (zzb != null) {
                                    linkedHashMap.put(zzb.zza, zzb);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(zzy)) {
                zzff.zze("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(zzy)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ac  */
    @Override // com.google.android.gms.internal.ads.zzakr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i, int i2, zzakq zzakqVar, zzep zzepVar) {
        int i3;
        Charset charset;
        zzfp zzfpVar;
        zzalg zzalgVar;
        long j;
        int i4;
        Layout.Alignment alignment;
        int i5;
        int i6;
        int i7;
        Integer num;
        int i8;
        zzalh zzalhVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzalhVar.zzd.zzI(bArr, i + i2);
        zzalhVar.zzd.zzK(i);
        Charset zzB = zzalhVar.zzd.zzB();
        if (zzB == null) {
            zzB = zzfwq.zzc;
        }
        if (!zzalhVar.zzb) {
            zzalhVar.zze(zzalhVar.zzd, zzB);
        }
        zzfp zzfpVar2 = zzalhVar.zzd;
        zzalg zzalgVar2 = zzalhVar.zzb ? zzalhVar.zzc : null;
        while (true) {
            String zzy = zzfpVar2.zzy(zzB);
            if (zzy == null) {
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    List list = (List) arrayList.get(i9);
                    if (list.isEmpty()) {
                        if (i9 != 0) {
                            i3 = 1;
                            i9 += i3;
                        } else {
                            i9 = 0;
                        }
                    }
                    if (i9 == arrayList.size() - 1) {
                        throw new IllegalStateException();
                    }
                    zzepVar.zza(new zzakj(list, ((Long) arrayList2.get(i9)).longValue(), ((Long) arrayList2.get(i9 + 1)).longValue() - ((Long) arrayList2.get(i9)).longValue()));
                    i3 = 1;
                    i9 += i3;
                }
                return;
            }
            if (zzy.startsWith("Format:")) {
                zzalgVar2 = zzalg.zza(zzy);
            } else {
                if (zzy.startsWith("Dialogue:")) {
                    if (zzalgVar2 == null) {
                        zzff.zzf("SsaParser", "Skipping dialogue line before complete format: ".concat(zzy));
                    } else {
                        zzek.zzd(zzy.startsWith("Dialogue:"));
                        String[] split = zzy.substring(9).split(",", zzalgVar2.zze);
                        if (split.length != zzalgVar2.zze) {
                            zzff.zzf("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(zzy));
                        } else {
                            long zzd = zzd(split[zzalgVar2.zza]);
                            if (zzd == -9223372036854775807L) {
                                zzff.zzf("SsaParser", "Skipping invalid timing: ".concat(zzy));
                            } else {
                                long zzd2 = zzd(split[zzalgVar2.zzb]);
                                if (zzd2 == -9223372036854775807L) {
                                    zzff.zzf("SsaParser", "Skipping invalid timing: ".concat(zzy));
                                } else {
                                    Map map = zzalhVar.zze;
                                    zzalk zzalkVar = (map == null || (i8 = zzalgVar2.zzc) == -1) ? null : (zzalk) map.get(split[i8].trim());
                                    String str = split[zzalgVar2.zzd];
                                    zzalj zza2 = zzalj.zza(str);
                                    String replace = zzalj.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f = zzalhVar.zzf;
                                    float f2 = zzalhVar.zzg;
                                    SpannableString spannableString = new SpannableString(replace);
                                    zzea zzeaVar = new zzea();
                                    zzeaVar.zzl(spannableString);
                                    charset = zzB;
                                    if (zzalkVar != null) {
                                        Integer num2 = zzalkVar.zzc;
                                        zzfpVar = zzfpVar2;
                                        if (num2 != null) {
                                            zzalgVar = zzalgVar2;
                                            j = zzd2;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            zzalgVar = zzalgVar2;
                                            j = zzd2;
                                        }
                                        if (zzalkVar.zzj == 3 && (num = zzalkVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f3 = zzalkVar.zze;
                                        if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                            zzeaVar.zzn(f3 / f2, 1);
                                        }
                                        if (!zzalkVar.zzf) {
                                            i6 = 33;
                                            i7 = 0;
                                            if (zzalkVar.zzg) {
                                                i4 = 2;
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                if (zzalkVar.zzh) {
                                                    spannableString.setSpan(new UnderlineSpan(), i7, spannableString.length(), i6);
                                                }
                                                if (zzalkVar.zzi) {
                                                    spannableString.setSpan(new StrikethroughSpan(), i7, spannableString.length(), i6);
                                                }
                                            }
                                        } else if (zzalkVar.zzg) {
                                            i6 = 33;
                                            i7 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i6 = 33;
                                            i7 = 0;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        i4 = 2;
                                        if (zzalkVar.zzh) {
                                        }
                                        if (zzalkVar.zzi) {
                                        }
                                    } else {
                                        zzfpVar = zzfpVar2;
                                        zzalgVar = zzalgVar2;
                                        j = zzd2;
                                        i4 = 2;
                                    }
                                    int i10 = zza2.zza;
                                    if (i10 == -1) {
                                        i10 = zzalkVar != null ? zzalkVar.zzb : -1;
                                    }
                                    switch (i10) {
                                        case 0:
                                        default:
                                            zzff.zzf("SsaParser", "Unknown alignment: " + i10);
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzeaVar.zzm(alignment);
                                    int i11 = Integer.MIN_VALUE;
                                    switch (i10) {
                                        case 0:
                                        default:
                                            zzff.zzf("SsaParser", "Unknown alignment: " + i10);
                                        case -1:
                                            i5 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i5 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i5 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i5 = i4;
                                            break;
                                    }
                                    zzeaVar.zzi(i5);
                                    switch (i10) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            zzff.zzf("SsaParser", "Unknown alignment: " + i10);
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i11 = i4;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i11 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i11 = 0;
                                            break;
                                    }
                                    zzeaVar.zzf(i11);
                                    PointF pointF = zza2.zzb;
                                    if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                        zzeaVar.zzh(zzb(zzeaVar.zzb()));
                                        zzeaVar.zze(zzb(zzeaVar.zza()), 0);
                                    } else {
                                        zzeaVar.zzh(pointF.x / f);
                                        zzeaVar.zze(zza2.zzb.y / f2, 0);
                                    }
                                    zzec zzp = zzeaVar.zzp();
                                    int zzc = zzc(j, arrayList2, arrayList);
                                    for (int zzc2 = zzc(zzd, arrayList2, arrayList); zzc2 < zzc; zzc2++) {
                                        ((List) arrayList.get(zzc2)).add(zzp);
                                    }
                                    zzalhVar = this;
                                    zzB = charset;
                                    zzfpVar2 = zzfpVar;
                                    zzalgVar2 = zzalgVar;
                                }
                            }
                        }
                    }
                }
                charset = zzB;
                zzfpVar = zzfpVar2;
                zzalgVar = zzalgVar2;
                zzalhVar = this;
                zzB = charset;
                zzfpVar2 = zzfpVar;
                zzalgVar2 = zzalgVar;
            }
        }
    }

    public zzalh(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzfp();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String zzz = zzfy.zzz((byte[]) list.get(0));
        zzek.zzd(zzz.startsWith("Format:"));
        zzalg zza2 = zzalg.zza(zzz);
        zza2.getClass();
        this.zzc = zza2;
        zze(new zzfp((byte[]) list.get(1)), zzfwq.zzc);
    }
}
