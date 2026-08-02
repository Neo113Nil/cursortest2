package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzaee;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzair;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class zzpk extends zzos {
    public long zza;
    public long zzb;

    public static zzbh zzA(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle zzB = zzB(zzaaVar.zzf(), true);
        String obj2 = (!zzB.containsKey("_o") || (obj = zzB.get("_o")) == null) ? "app" : obj.toString();
        String zzb = zzjm.zzb(zzaaVar.zzb());
        if (zzb == null) {
            zzb = zzaaVar.zzb();
        }
        return new zzbh(zzb, new zzbf(zzB), obj2, zzaaVar.zza(), 0L);
    }

    public static Bundle zzB(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(zzB((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void zzF(zzhr zzhrVar, String str, Long l) {
        List zza = zzhrVar.zza();
        int i = 0;
        while (true) {
            if (i >= zza.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i)).zzb())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn.zzb$3(str);
        zzn.zzf(l.longValue());
        if (i >= 0) {
            zzhrVar.zze(i, zzn);
        } else {
            zzhrVar.zzg(zzn);
        }
    }

    public static final Bundle zzH(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            String zzb = zzhwVar.zzb();
            if (zzhwVar.zzj()) {
                bundle.putDouble(zzb, zzhwVar.zzk());
            } else if (zzhwVar.zzh()) {
                bundle.putFloat(zzb, zzhwVar.zzi());
            } else if (zzhwVar.zzc()) {
                bundle.putString(zzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putLong(zzb, zzhwVar.zzf());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.zzhw zzI(zzhs zzhsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    public static final String zzJ(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable zzM(zzhs zzhsVar, String str) {
        com.google.android.gms.internal.measurement.zzhw zzI = zzI(zzhsVar, str);
        if (zzI == null) {
            return null;
        }
        return zzT(zzI);
    }

    public static final void zzQ(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void zzR(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String zzS(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable zzT(com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        if (zzhwVar.zzc()) {
            return zzhwVar.zzd();
        }
        if (zzhwVar.zze()) {
            return Long.valueOf(zzhwVar.zzf());
        }
        if (zzhwVar.zzj()) {
            return Double.valueOf(zzhwVar.zzk());
        }
        if (zzhwVar.zzm() > 0) {
            return zzy(zzhwVar.zzl());
        }
        return null;
    }

    public static final void zzU(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string2 = bundle.getString(str2);
            if (string2 != null) {
                zzR(builder, str3, string2, hashSet);
            }
        }
    }

    public static final void zzV(StringBuilder sb, String str, zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        zzQ(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (zziiVar.zzd() != 0) {
            zzQ(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : zziiVar.zzc()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (zziiVar.zzb() != 0) {
            zzQ(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : zziiVar.zza()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (zziiVar.zzf() != 0) {
            zzQ(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (zzhq zzhqVar : zziiVar.zze()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(zzhqVar.zza() ? Integer.valueOf(zzhqVar.zzb()) : null);
                sb.append(":");
                sb.append(zzhqVar.zzc() ? Long.valueOf(zzhqVar.zzd()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (zziiVar.zzi() != 0) {
            zzQ(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (zzik zzikVar : zziiVar.zzh()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(zzikVar.zza() ? Integer.valueOf(zzikVar.zzb()) : null);
                sb.append(": [");
                Iterator it = zzikVar.zzc().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        zzQ(3, sb);
        sb.append("}\n");
    }

    public static final void zzW(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzQ(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void zzX(StringBuilder sb, int i, String str, zzfl zzflVar) {
        if (zzflVar == null) {
            return;
        }
        zzQ(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (zzflVar.zza()) {
            int zzm = zzflVar.zzm();
            zzW(sb, i, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzflVar.zzb()) {
            zzW(sb, i, "match_as_float", Boolean.valueOf(zzflVar.zzc()));
        }
        if (zzflVar.zzd()) {
            zzW(sb, i, "comparison_value", zzflVar.zze());
        }
        if (zzflVar.zzf()) {
            zzW(sb, i, "min_comparison_value", zzflVar.zzh());
        }
        if (zzflVar.zzi()) {
            zzW(sb, i, "max_comparison_value", zzflVar.zzj());
        }
        zzQ(i, sb);
        sb.append("}\n");
    }

    public static boolean zzm(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean zzn(zzaee zzaeeVar, int i) {
        if (i < zzaeeVar.size() * 64) {
            return ((1 << (i % 64)) & ((Long) zzaeeVar.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList zzp(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static zzadp zzw(zzadp zzadpVar, byte[] bArr) {
        zzadf zzb = zzadf.zzb();
        if (zzb != null) {
            zzadpVar.zzaW(bArr, zzb);
            return zzadpVar;
        }
        zzadpVar.zzaX(bArr);
        return zzadpVar;
    }

    public static int zzx(com.google.android.gms.internal.measurement.zzic zzicVar, String str) {
        for (int i = 0; i < zzicVar.zzl(); i++) {
            if (str.equals(zzicVar.zzm(i).zzc())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] zzy(zzaef zzaefVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = zzaefVar.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar2 : zzhwVar.zzl()) {
                    if (zzhwVar2.zzc()) {
                        bundle.putString(zzhwVar2.zzb(), zzhwVar2.zzd());
                    } else if (zzhwVar2.zze()) {
                        bundle.putLong(zzhwVar2.zzb(), zzhwVar2.zzf());
                    } else if (zzhwVar2.zzj()) {
                        bundle.putDouble(zzhwVar2.zzb(), zzhwVar2.zzk());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(zzz((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(zzz((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(zzz((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap zzz(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (!z2 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public final void zzD(Map map) {
        long j;
        zzic zzicVar = (zzic) this.$$delegate_0;
        String zzJ = zzJ("Date", map);
        if (TextUtils.isEmpty(zzJ)) {
            return;
        }
        try {
            j = ZonedDateTime.parse(zzJ, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
        } catch (DateTimeParseException unused) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(zzJ, "Unable to parse header time, time");
            j = 0;
        }
        if (j > 0) {
            zzicVar.zzn.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzg();
            if (this.zzb == 0) {
                this.zza = elapsedRealtime;
                this.zzb = j;
            }
        }
    }

    public final long zzE(long j) {
        zzg();
        long j2 = this.zzb;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.zza) + j;
    }

    public final void zzO(StringBuilder sb, int i, zzaef zzaefVar) {
        if (zzaefVar == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = zzaefVar.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                zzQ(i2, sb);
                sb.append("param {\n");
                zzW(sb, i2, "name", zzhwVar.zza() ? ((zzic) this.$$delegate_0).zzm.zzb(zzhwVar.zzb()) : null);
                zzW(sb, i2, "string_value", zzhwVar.zzc() ? zzhwVar.zzd() : null);
                zzW(sb, i2, "int_value", zzhwVar.zze() ? Long.valueOf(zzhwVar.zzf()) : null);
                zzW(sb, i2, "double_value", zzhwVar.zzj() ? Double.valueOf(zzhwVar.zzk()) : null);
                if (zzhwVar.zzm() > 0) {
                    zzO(sb, i2, zzhwVar.zzl());
                }
                zzQ(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void zzP(StringBuilder sb, int i, zzfh zzfhVar) {
        String str;
        if (zzfhVar == null) {
            return;
        }
        zzQ(i, sb);
        sb.append("filter {\n");
        if (zzfhVar.zze()) {
            zzW(sb, i, "complement", Boolean.valueOf(zzfhVar.zzf()));
        }
        if (zzfhVar.zzh()) {
            zzW(sb, i, "param_name", ((zzic) this.$$delegate_0).zzm.zzb(zzfhVar.zzi()));
        }
        if (zzfhVar.zza()) {
            int i2 = i + 1;
            zzfr zzb = zzfhVar.zzb();
            if (zzb != null) {
                zzQ(i2, sb);
                sb.append("string_filter {\n");
                if (zzb.zza()) {
                    switch (zzb.zzk()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzW(sb, i2, "match_type", str);
                }
                if (zzb.zzb()) {
                    zzW(sb, i2, "expression", zzb.zzc());
                }
                if (zzb.zzd()) {
                    zzW(sb, i2, "case_sensitive", Boolean.valueOf(zzb.zze()));
                }
                if (zzb.zzh() > 0) {
                    zzQ(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : zzb.zzf()) {
                        zzQ(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zzQ(i2, sb);
                sb.append("}\n");
            }
        }
        if (zzfhVar.zzc()) {
            zzX(sb, i + 1, "number_filter", zzfhVar.zzd());
        }
        zzQ(i, sb);
        sb.append("}\n");
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void zzbc() {
    }

    public final void zzc(zzit zzitVar, Object obj) {
        zzae.checkNotNull(obj);
        zzitVar.zzd$2();
        zzitVar.zzf$3();
        zzitVar.zzh$1();
        if (obj instanceof String) {
            zzitVar.zzc$2((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzitVar.zze$1(((Long) obj).longValue());
        } else {
            if (obj instanceof Double) {
                zzitVar.zzg(((Double) obj).doubleValue());
                return;
            }
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzhv zzhvVar, Object obj) {
        zzhvVar.zze$1();
        zzhvVar.zzg();
        zzhvVar.zzi$1();
        zzhvVar.zzm();
        if (obj instanceof String) {
            zzhvVar.zzd$1((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhvVar.zzf(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzhvVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                    zzn2.zzb$3(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzn2.zzf(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzn2.zzd$1((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzn2.zzh(((Double) obj2).doubleValue());
                    }
                    zzn.zzk(zzn2);
                }
                if (zzn.zzj() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzhw) zzn.zzbd());
                }
            }
        }
        zzhvVar.zzl(arrayList);
    }

    public final zzoh zzf(String str, com.google.android.gms.internal.measurement.zzic zzicVar, zzhr zzhrVar, String str2) {
        int indexOf;
        zzaif.zza();
        zzic zzicVar2 = (zzic) this.$$delegate_0;
        zzal zzalVar = zzicVar2.zzg;
        if (!zzalVar.zzp(str, zzfy.zzaO)) {
            return null;
        }
        zzicVar2.zzn.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(zzalVar.zzk(str, zzfy.zzat).split(",")));
        zzpg zzpgVar = this.zzg;
        zzou zzouVar = zzpgVar.zzl;
        zzht zzhtVar = zzpgVar.zzc;
        zzht zzhtVar2 = zzouVar.zzg.zzc;
        zzpg.zzaT(zzhtVar2);
        String zzc = zzhtVar2.zzc(str);
        Uri.Builder builder = new Uri.Builder();
        zzal zzalVar2 = ((zzic) zzouVar.$$delegate_0).zzg;
        builder.scheme(zzalVar2.zzk(str, zzfy.zzam));
        if (TextUtils.isEmpty(zzc)) {
            builder.authority(zzalVar2.zzk(str, zzfy.zzan));
        } else {
            String zzk = zzalVar2.zzk(str, zzfy.zzan);
            StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + 1 + String.valueOf(zzk).length());
            sb.append(zzc);
            sb.append(".");
            sb.append(zzk);
            builder.authority(sb.toString());
        }
        builder.path(zzalVar2.zzk(str, zzfy.zzao));
        zzR(builder, "gmp_app_id", zzicVar.zzac(), hashSet);
        zzalVar.zzi();
        zzR(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String zzV = zzicVar.zzV();
        zzfx zzfxVar = zzfy.zzaR;
        if (zzalVar.zzp(str, zzfxVar)) {
            zzpg.zzaT(zzhtVar);
            if (zzhtVar.zzu(str)) {
                zzV = "";
            }
        }
        zzR(builder, "app_instance_id", zzV, hashSet);
        zzR(builder, "rdid", zzicVar.zzP(), hashSet);
        zzR(builder, "bundle_id", zzicVar.zzK(), hashSet);
        String zzk2 = zzhrVar.zzk();
        String zza = zzjm.zza(zzk2);
        if (true != TextUtils.isEmpty(zza)) {
            zzk2 = zza;
        }
        zzR(builder, "app_event_name", zzk2, hashSet);
        zzR(builder, "app_version", String.valueOf(zzicVar.zzai()), hashSet);
        String zzD = zzicVar.zzD();
        if (zzalVar.zzp(str, zzfxVar)) {
            zzpg.zzaT(zzhtVar);
            if (zzhtVar.zzr(str) && !TextUtils.isEmpty(zzD) && (indexOf = zzD.indexOf(".")) != -1) {
                zzD = zzD.substring(0, indexOf);
            }
        }
        zzR(builder, "os_version", zzD, hashSet);
        zzR(builder, "timestamp", String.valueOf(zzhrVar.zzn()), hashSet);
        if (zzicVar.zzS()) {
            zzR(builder, "lat", "1", hashSet);
        }
        zzR(builder, "privacy_sandbox_version", String.valueOf(zzicVar.zzaG()), hashSet);
        zzR(builder, "trigger_uri_source", "1", hashSet);
        zzR(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), hashSet);
        zzR(builder, "request_uuid", str2, hashSet);
        List<com.google.android.gms.internal.measurement.zzhw> zza2 = zzhrVar.zza();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zza2) {
            String zzb = zzhwVar.zzb();
            if (zzhwVar.zzj()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzk()));
            } else if (zzhwVar.zzh()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzi()));
            } else if (zzhwVar.zzc()) {
                bundle.putString(zzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzf()));
            }
        }
        zzU(builder, zzalVar.zzk(str, zzfy.zzas).split("\\|"), bundle, hashSet);
        List<zziu> zzk3 = zzicVar.zzk();
        Bundle bundle2 = new Bundle();
        for (zziu zziuVar : zzk3) {
            String zzc2 = zziuVar.zzc();
            if (zziuVar.zzk()) {
                bundle2.putString(zzc2, String.valueOf(zziuVar.zzl()));
            } else if (zziuVar.zzi()) {
                bundle2.putString(zzc2, String.valueOf(zziuVar.zzj()));
            } else if (zziuVar.zzd()) {
                bundle2.putString(zzc2, zziuVar.zze());
            } else if (zziuVar.zzf()) {
                bundle2.putString(zzc2, String.valueOf(zziuVar.zzh()));
            }
        }
        zzU(builder, zzalVar.zzk(str, zzfy.zzar).split("\\|"), bundle2, hashSet);
        zzR(builder, "dma", true != zzicVar.zzaC() ? "0" : "1", hashSet);
        if (!zzicVar.zzaE().isEmpty()) {
            zzR(builder, "dma_cps", zzicVar.zzaE(), hashSet);
        }
        if (zzicVar.zzaK()) {
            zzha zzaL = zzicVar.zzaL();
            if (!zzaL.zzb().isEmpty()) {
                zzR(builder, "dl_gclid", zzaL.zzb(), hashSet);
            }
            if (!zzaL.zzd().isEmpty()) {
                zzR(builder, "dl_gbraid", zzaL.zzd(), hashSet);
            }
            if (!zzaL.zzf().isEmpty()) {
                zzR(builder, "dl_gs", zzaL.zzf(), hashSet);
            }
            if (zzaL.zzi() > 0) {
                zzR(builder, "dl_ss_ts", String.valueOf(zzaL.zzi()), hashSet);
            }
            if (!zzaL.zzk().isEmpty()) {
                zzR(builder, "mr_gclid", zzaL.zzk(), hashSet);
            }
            if (!zzaL.zzm().isEmpty()) {
                zzR(builder, "mr_gbraid", zzaL.zzm(), hashSet);
            }
            if (!zzaL.zzo().isEmpty()) {
                zzR(builder, "mr_gs", zzaL.zzo(), hashSet);
            }
            if (zzaL.zzq() > 0) {
                zzR(builder, "mr_click_ts", String.valueOf(zzaL.zzq()), hashSet);
            }
        }
        return new zzoh(builder.build().toString(), currentTimeMillis, 1);
    }

    public final zzhs zzh(zzbc zzbcVar) {
        zzhr zzp = zzhs.zzp();
        zzp.zzq(zzbcVar.zzf);
        zzp.zzw(zzbcVar.zze);
        zzbf zzbfVar = (zzbf) zzbcVar.zzg;
        zzbe zzbeVar = new zzbe(zzbfVar);
        while (zzbeVar.hasNext()) {
            String zza = zzbeVar.zza();
            com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
            zzn.zzb$3(zza);
            Object zza2 = zzbfVar.zza(zza);
            zzae.checkNotNull(zza2);
            zzd(zzn, zza2);
            zzp.zzg(zzn);
        }
        String str = (String) zzbcVar.zzc;
        if (!TextUtils.isEmpty(str) && zzbfVar.zza("_o") == null) {
            com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
            zzn2.zzb$3("_o");
            zzn2.zzd$1(str);
            zzp.zzf((com.google.android.gms.internal.measurement.zzhw) zzn2.zzbd());
        }
        return (zzhs) zzp.zzbd();
    }

    public final String zzi(zzib zzibVar) {
        com.google.android.gms.internal.measurement.zzhe zzat;
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("\nbatch {\n");
        if (zzibVar.zzf()) {
            zzW(m, 0, "upload_subdomain", zzibVar.zzh());
        }
        if (zzibVar.zzd()) {
            zzW(m, 0, "sgtm_join_id", zzibVar.zze());
        }
        for (zzid zzidVar : zzibVar.zza()) {
            if (zzidVar != null) {
                zzQ(1, m);
                m.append("bundle {\n");
                if (zzidVar.zza()) {
                    zzW(m, 1, "protocol_version", Integer.valueOf(zzidVar.zzb()));
                }
                zzair.zza();
                zzic zzicVar = (zzic) this.$$delegate_0;
                zzal zzalVar = zzicVar.zzg;
                zzgn zzgnVar = zzicVar.zzm;
                if (zzalVar.zzp(zzidVar.zzA(), zzfy.zzaM) && zzidVar.zzag()) {
                    zzW(m, 1, "session_stitching_token", zzidVar.zzah());
                }
                zzW(m, 1, "platform", zzidVar.zzt());
                if (zzidVar.zzC()) {
                    zzW(m, 1, "gmp_version", Long.valueOf(zzidVar.zzD()));
                }
                if (zzidVar.zzE()) {
                    zzW(m, 1, "uploading_gmp_version", Long.valueOf(zzidVar.zzF()));
                }
                if (zzidVar.zzac()) {
                    zzW(m, 1, "dynamite_version", Long.valueOf(zzidVar.zzad()));
                }
                if (zzidVar.zzW()) {
                    zzW(m, 1, "config_version", Long.valueOf(zzidVar.zzX()));
                }
                zzW(m, 1, "gmp_app_id", zzidVar.zzP());
                zzW(m, 1, "app_id", zzidVar.zzA());
                zzW(m, 1, "app_version", zzidVar.zzB());
                if (zzidVar.zzU()) {
                    zzW(m, 1, "app_version_major", Integer.valueOf(zzidVar.zzV()));
                }
                zzW(m, 1, "firebase_instance_id", zzidVar.zzT());
                if (zzidVar.zzK()) {
                    zzW(m, 1, "dev_cert_hash", Long.valueOf(zzidVar.zzL()));
                }
                zzW(m, 1, "app_store", zzidVar.zzz());
                if (zzidVar.zzj()) {
                    zzW(m, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.zzk()));
                }
                if (zzidVar.zzl()) {
                    zzW(m, 1, "start_timestamp_millis", Long.valueOf(zzidVar.zzm()));
                }
                if (zzidVar.zzn()) {
                    zzW(m, 1, "end_timestamp_millis", Long.valueOf(zzidVar.zzo()));
                }
                if (zzidVar.zzp()) {
                    zzW(m, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.zzq()));
                }
                if (zzidVar.zzr()) {
                    zzW(m, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.zzs()));
                }
                zzW(m, 1, "app_instance_id", zzidVar.zzJ());
                zzW(m, 1, "resettable_device_id", zzidVar.zzG());
                zzW(m, 1, "ds_id", zzidVar.zzZ());
                if (zzidVar.zzH()) {
                    zzW(m, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.zzI()));
                }
                zzW(m, 1, "os_version", zzidVar.zzu());
                zzW(m, 1, "device_model", zzidVar.zzv());
                zzW(m, 1, "user_default_language", zzidVar.zzw());
                if (zzidVar.zzx()) {
                    zzW(m, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.zzy()));
                }
                if (zzidVar.zzM()) {
                    zzW(m, 1, "bundle_sequential_index", Integer.valueOf(zzidVar.zzN()));
                }
                if (zzidVar.zzau()) {
                    zzW(m, 1, "delivery_index", Integer.valueOf(zzidVar.zzav()));
                }
                if (zzidVar.zzQ()) {
                    zzW(m, 1, "service_upload", Boolean.valueOf(zzidVar.zzR()));
                }
                zzW(m, 1, "health_monitor", zzidVar.zzO());
                if (zzidVar.zzaa()) {
                    zzW(m, 1, "retry_counter", Integer.valueOf(zzidVar.zzab()));
                }
                if (zzidVar.zzae()) {
                    zzW(m, 1, "consent_signals", zzidVar.zzaf());
                }
                if (zzidVar.zzan()) {
                    zzW(m, 1, "is_dma_region", Boolean.valueOf(zzidVar.zzao()));
                }
                if (zzidVar.zzap()) {
                    zzW(m, 1, "core_platform_services", zzidVar.zzaq());
                }
                if (zzidVar.zzal()) {
                    zzW(m, 1, "consent_diagnostics", zzidVar.zzam());
                }
                if (zzidVar.zzai()) {
                    zzW(m, 1, "target_os_version", Long.valueOf(zzidVar.zzaj()));
                }
                zzaif.zza();
                if (zzalVar.zzp(zzidVar.zzA(), zzfy.zzaO)) {
                    zzW(m, 1, "ad_services_version", Integer.valueOf(zzidVar.zzar()));
                    if (zzidVar.zzas() && (zzat = zzidVar.zzat()) != null) {
                        zzQ(2, m);
                        m.append("attribution_eligibility_status {\n");
                        zzW(m, 2, "eligible", Boolean.valueOf(zzat.zza()));
                        zzW(m, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzat.zzb()));
                        zzW(m, 2, "pre_r", Boolean.valueOf(zzat.zzc()));
                        zzW(m, 2, "r_extensions_too_old", Boolean.valueOf(zzat.zzd()));
                        zzW(m, 2, "adservices_extension_too_old", Boolean.valueOf(zzat.zze()));
                        zzW(m, 2, "ad_storage_not_allowed", Boolean.valueOf(zzat.zzf()));
                        zzW(m, 2, "measurement_manager_disabled", Boolean.valueOf(zzat.zzh()));
                        zzQ(2, m);
                        m.append("}\n");
                    }
                }
                if (zzidVar.zzaw()) {
                    zzha zzax = zzidVar.zzax();
                    zzQ(2, m);
                    m.append("ad_campaign_info {\n");
                    if (zzax.zza()) {
                        zzW(m, 2, "deep_link_gclid", zzax.zzb());
                    }
                    if (zzax.zzc()) {
                        zzW(m, 2, "deep_link_gbraid", zzax.zzd());
                    }
                    if (zzax.zze()) {
                        zzW(m, 2, "deep_link_gad_source", zzax.zzf());
                    }
                    if (zzax.zzr()) {
                        zzW(m, 2, "deep_link_url", zzax.zzs());
                    }
                    if (zzax.zzh()) {
                        zzW(m, 2, "deep_link_session_millis", Long.valueOf(zzax.zzi()));
                    }
                    if (zzax.zzj()) {
                        zzW(m, 2, "market_referrer_gclid", zzax.zzk());
                    }
                    if (zzax.zzl()) {
                        zzW(m, 2, "market_referrer_gbraid", zzax.zzm());
                    }
                    if (zzax.zzn()) {
                        zzW(m, 2, "market_referrer_gad_source", zzax.zzo());
                    }
                    if (zzax.zzp()) {
                        zzW(m, 2, "market_referrer_click_millis", Long.valueOf(zzax.zzq()));
                    }
                    zzQ(2, m);
                    m.append("}\n");
                }
                if (zzidVar.zzaA()) {
                    zzW(m, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.zzaB()));
                }
                if (zzidVar.zzay()) {
                    zzis zzaz = zzidVar.zzaz();
                    zzQ(2, m);
                    m.append("sgtm_diagnostics {\n");
                    int zzf = zzaz.zzf();
                    zzW(m, 2, "upload_type", zzf != 1 ? zzf != 2 ? zzf != 3 ? zzf != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    zzW(m, 2, "client_upload_eligibility", FillrEnv$EnumUnboxingLocalUtility.name(zzaz.zza$1()));
                    int zzh = zzaz.zzh();
                    zzW(m, 2, "service_upload_eligibility", zzh != 1 ? zzh != 2 ? zzh != 3 ? zzh != 4 ? zzh != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    zzQ(2, m);
                    m.append("}\n");
                }
                if (zzidVar.zzaC()) {
                    zzho zzaD = zzidVar.zzaD();
                    zzQ(2, m);
                    m.append("consent_info_extra {\n");
                    for (zzhl zzhlVar : zzaD.zza()) {
                        zzQ(3, m);
                        m.append("limited_data_modes {\n");
                        int zzc$1 = zzhlVar.zzc$1();
                        zzW(m, 3, "type", zzc$1 != 1 ? zzc$1 != 2 ? zzc$1 != 3 ? zzc$1 != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int zzd = zzhlVar.zzd();
                        zzW(m, 3, "mode", zzd != 1 ? zzd != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        zzQ(3, m);
                        m.append("}\n");
                    }
                    zzQ(2, m);
                    m.append("}\n");
                }
                zzaef<zziu> zzf2 = zzidVar.zzf();
                if (zzf2 != null) {
                    for (zziu zziuVar : zzf2) {
                        if (zziuVar != null) {
                            zzQ(2, m);
                            m.append("user_property {\n");
                            zzW(m, 2, "set_timestamp_millis", zziuVar.zza() ? Long.valueOf(zziuVar.zzb()) : null);
                            zzW(m, 2, "name", zzgnVar.zzc(zziuVar.zzc()));
                            zzW(m, 2, "string_value", zziuVar.zze());
                            zzW(m, 2, "int_value", zziuVar.zzf() ? Long.valueOf(zziuVar.zzh()) : null);
                            zzW(m, 2, "double_value", zziuVar.zzk() ? Double.valueOf(zziuVar.zzl()) : null);
                            zzQ(2, m);
                            m.append("}\n");
                        }
                    }
                }
                zzaef<zzhg> zzS = zzidVar.zzS();
                if (zzS != null) {
                    for (zzhg zzhgVar : zzS) {
                        if (zzhgVar != null) {
                            zzQ(2, m);
                            m.append("audience_membership {\n");
                            if (zzhgVar.zza()) {
                                zzW(m, 2, "audience_id", Integer.valueOf(zzhgVar.zzb()));
                            }
                            if (zzhgVar.zzf()) {
                                zzW(m, 2, "new_audience", Boolean.valueOf(zzhgVar.zzh()));
                            }
                            zzV(m, "current_data", zzhgVar.zzc());
                            if (zzhgVar.zzd()) {
                                zzV(m, "previous_data", zzhgVar.zze());
                            }
                            zzQ(2, m);
                            m.append("}\n");
                        }
                    }
                }
                List<zzhs> zzc = zzidVar.zzc();
                if (zzc != null) {
                    for (zzhs zzhsVar : zzc) {
                        if (zzhsVar != null) {
                            zzQ(2, m);
                            m.append("event {\n");
                            zzW(m, 2, "name", zzgnVar.zza(zzhsVar.zzd()));
                            if (zzhsVar.zze()) {
                                zzW(m, 2, "timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                            }
                            if (zzalVar.zzp(null, zzfy.zzbe) && zzhsVar.zzl()) {
                                zzW(m, 2, "corrected_timestamp_millis", Long.valueOf(zzhsVar.zzm()));
                            }
                            if (zzhsVar.zzh()) {
                                zzW(m, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.zzi()));
                            }
                            if (zzhsVar.zzj()) {
                                zzW(m, 2, "count", Integer.valueOf(zzhsVar.zzk()));
                            }
                            if (zzhsVar.zzb() != 0) {
                                zzO(m, 2, (zzaef) zzhsVar.zza());
                            }
                            zzQ(2, m);
                            m.append("}\n");
                        }
                    }
                }
                zzQ(1, m);
                m.append("}\n");
            }
        }
        m.append("} // End-of-batch\n");
        return m.toString();
    }

    public final String zzk(zzfn zzfnVar) {
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("\nproperty_filter {\n");
        if (zzfnVar.zza()) {
            zzW(m, 0, "filter_id", Integer.valueOf(zzfnVar.zzb()));
        }
        zzW(m, 0, "property_name", ((zzic) this.$$delegate_0).zzm.zzc(zzfnVar.zzc()));
        String zzS = zzS(zzfnVar.zze(), zzfnVar.zzf(), zzfnVar.zzi());
        if (!zzS.isEmpty()) {
            zzW(m, 0, "filter_type", zzS);
        }
        zzP(m, 1, zzfnVar.zzd());
        m.append("}\n");
        return m.toString();
    }

    public final Parcelable zzl(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (SafeParcelReader$ParseException unused) {
                zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zza("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public final List zzq(zzaee zzaeeVar, List list) {
        int i;
        zzic zzicVar = (zzic) this.$$delegate_0;
        ArrayList arrayList = new ArrayList(zzaeeVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzg.zzb(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzg.zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean zzs(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((zzic) this.$$delegate_0).zzn.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final long zzt(byte[] bArr) {
        zzae.checkNotNull(bArr);
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzpp zzppVar = zzicVar.zzl;
        zzic.zzN(zzppVar);
        zzppVar.zzg();
        MessageDigest zzQ = zzpp.zzQ();
        if (zzQ != null) {
            return zzpp.zzR(zzQ.digest(bArr));
        }
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzd.zza("Failed to get MD5");
        return 0L;
    }

    public final byte[] zzv(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(e, "Failed to gzip content");
            throw e;
        }
    }
}
