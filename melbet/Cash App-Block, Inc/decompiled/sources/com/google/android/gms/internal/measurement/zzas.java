package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final class zzas implements Iterable, zzao {
    public final String zza;

    public zzas(String str) {
        if (str != null) {
            this.zza = str;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("StringValue cannot be null.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzaq(this, 1);
    }

    public final String toString() {
        String str = this.zza;
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ed, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zzcG(String str, UnleashContext unleashContext, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        int i3;
        UnleashContext unleashContext2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                a$$ExternalSyntheticBUOutline0.m$3(str.concat(" is not a String function"));
                return null;
            }
        }
        int hashCode = str.hashCode();
        str4 = "undefined";
        String str5 = this.zza;
        r8 = false;
        boolean z = false;
        switch (hashCode) {
            case -1789698943:
                String str6 = str2;
                if (str.equals(str6)) {
                    zzh.zza(str6, arrayList, 1);
                    zzao zzb = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0));
                    boolean equals = "length".equals(zzb.zzc());
                    zzaf zzafVar = zzao.zzk;
                    if (equals) {
                        return zzafVar;
                    }
                    double doubleValue = zzb.zzd().doubleValue();
                    return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str5.length()) ? zzao.zzl : zzafVar;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    zzh.zza("toString", arrayList, 0);
                    return this;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    zzh.zza("toLocaleLowerCase", arrayList, 0);
                    return new zzas(str5.toLowerCase());
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    zzh.zzc(1, "charAt", arrayList);
                    int zzi = arrayList.isEmpty() ? 0 : (int) zzh.zzi(((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue());
                    return (zzi < 0 || zzi >= str5.length()) ? zzao.zzm : new zzas(String.valueOf(str5.charAt(zzi)));
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str5);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(i4)).zzc());
                        }
                        return new zzas(sb.toString());
                    }
                    return this;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    zzh.zza("toLowerCase", arrayList, 0);
                    return new zzas(str5.toLowerCase(Locale.ENGLISH));
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    zzh.zzc(1, "search", arrayList);
                    return Pattern.compile(arrayList.isEmpty() ? "undefined" : ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzc()).matcher(str5).find() ? new zzah(Double.valueOf(r0.start())) : new zzah(Double.valueOf(-1.0d));
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    zzh.zza("toLocaleUpperCase", arrayList, 0);
                    return new zzas(str5.toUpperCase());
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    zzh.zzc(2, "lastIndexOf", arrayList);
                    String zzc = arrayList.size() > 0 ? ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzc() : "undefined";
                    return new zzah(Double.valueOf(str5.lastIndexOf(zzc, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zzi(r1)))));
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    zzh.zza("toUpperCase", arrayList, 0);
                    return new zzas(str5.toUpperCase(Locale.ENGLISH));
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str3)) {
                    zzh.zza("toUpperCase", arrayList, 0);
                    return new zzas(str5.trim());
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    zzh.zzc(1, "match", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzc()).matcher(str5);
                    return matcher.find() ? new zzae(Arrays.asList(new zzas(matcher.group()))) : zzao.zzg;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    zzh.zzc(2, "slice", arrayList);
                    double zzi2 = zzh.zzi(!arrayList.isEmpty() ? ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue() : 0.0d);
                    double max = zzi2 < 0.0d ? Math.max(str5.length() + zzi2, 0.0d) : Math.min(zzi2, str5.length());
                    double zzi3 = zzh.zzi(arrayList.size() > 1 ? ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue() : str5.length());
                    int i5 = (int) max;
                    return new zzas(str5.substring(i5, Math.max(0, ((int) (zzi3 < 0.0d ? Math.max(str5.length() + zzi3, 0.0d) : Math.min(zzi3, str5.length()))) - i5) + i5));
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    zzh.zzc(2, "split", arrayList);
                    if (str5.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String zzc2 = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzc();
                        long zzg = arrayList.size() > 1 ? zzh.zzg(((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue()) & BodyPartID.bodyIdMax : 2147483647L;
                        if (zzg == 0) {
                            return new zzae();
                        }
                        String[] split = str5.split(Pattern.quote(zzc2), ((int) zzg) + 1);
                        int length = split.length;
                        if (zzc2.isEmpty() && length > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i2 = length - 1;
                            i3 = isEmpty;
                            z = isEmpty;
                            break;
                        }
                        i2 = length;
                        i3 = z;
                        if (length > zzg) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new zzas(split[i3]));
                            i3++;
                        }
                    }
                    return new zzae(arrayList2);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    zzh.zzc(2, "substring", arrayList);
                    int zzi4 = !arrayList.isEmpty() ? (int) zzh.zzi(((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzd().doubleValue()) : 0;
                    int zzi5 = arrayList.size() > 1 ? (int) zzh.zzi(((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(1)).zzd().doubleValue()) : str5.length();
                    int min = Math.min(Math.max(zzi4, 0), str5.length());
                    int min2 = Math.min(Math.max(zzi5, 0), str5.length());
                    return new zzas(str5.substring(Math.min(min, min2), Math.max(min, min2)));
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    zzh.zzc(2, "replace", arrayList);
                    boolean isEmpty2 = arrayList.isEmpty();
                    zzao zzaoVar = zzao.zzf;
                    if (!isEmpty2) {
                        str4 = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            zzaoVar = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(1));
                        }
                    }
                    String str7 = str4;
                    int indexOf = str5.indexOf(str7);
                    if (indexOf >= 0) {
                        if (zzaoVar instanceof zzai) {
                            zzaoVar = ((zzai) zzaoVar).zza(unleashContext, Arrays.asList(new zzas(str7), new zzah(Double.valueOf(indexOf)), this));
                        }
                        String substring = str5.substring(0, indexOf);
                        String zzc3 = zzaoVar.zzc();
                        String substring2 = str5.substring(str7.length() + indexOf);
                        return new zzas(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(substring.length() + String.valueOf(zzc3).length() + substring2.length()), substring, zzc3, substring2));
                    }
                    return this;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    zzh.zzc(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        unleashContext2 = unleashContext;
                    } else {
                        unleashContext2 = unleashContext;
                        str4 = ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList.get(0)).zzc();
                    }
                    return new zzah(Double.valueOf(str5.indexOf(str4, (int) zzh.zzi(arrayList.size() < 2 ? 0.0d : ((zzz) unleashContext2.sessionId).zzb(unleashContext2, (zzao) arrayList.get(1)).zzd().doubleValue()))));
                }
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
            default:
                a$$ExternalSyntheticBUOutline0.m$3("Command not supported");
                return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.zza);
    }
}
