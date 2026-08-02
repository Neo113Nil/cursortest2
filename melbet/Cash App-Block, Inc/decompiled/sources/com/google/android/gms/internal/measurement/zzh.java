package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Trace;
import android.system.Os;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class zzh {
    public static final Feature zza;
    public static final Feature zzd;
    public static final Feature zzi;
    public static final Feature[] zzj;

    static {
        Feature feature = new Feature("commit_to_configuration_v2_api", -1, 1L, true);
        zza = feature;
        Feature feature2 = new Feature("get_serving_version_api", -1, 1L, true);
        Feature feature3 = new Feature("get_experiment_tokens_api", -1, 1L, true);
        Feature feature4 = new Feature("register_flag_update_listener_api", -1, 2L, true);
        zzd = feature4;
        Feature feature5 = new Feature("sync_after_api", -1, 1L, true);
        Feature feature6 = new Feature("sync_after_for_application_api", -1, 1L, true);
        Feature feature7 = new Feature("set_app_wide_properties_api", -1, 1L, true);
        Feature feature8 = new Feature("set_runtime_properties_api", -1, 1L, true);
        Feature feature9 = new Feature("get_storage_info_api", -1, 1L, true);
        zzi = feature9;
        zzj = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9};
    }

    public static zzao zza(Object obj) {
        if (obj == null) {
            return zzao.zzg;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzah((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzaf((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid value type");
                return null;
            }
            zzae zzaeVar = new zzae();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzaeVar.zzn(zzaeVar.zzh(), zza(it.next()));
            }
            return zzaeVar;
        }
        zzal zzalVar = new zzal();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            zzao zza2 = zza(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                zzalVar.zzm((String) obj2, zza2);
            }
        }
        return zzalVar;
    }

    public static zzadf zzb() {
        ClassLoader classLoader = zzh.class.getClassLoader();
        if (zzadf.class.equals(zzadf.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new zzh[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e2) {
                    Logger.getLogger(zzada.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzadf"), (Throwable) e2);
                }
            }
            if (arrayList.size() == 1) {
                return (zzadf) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzadf) zzadf.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e3) {
                OptionalProvider$$ExternalSyntheticLambda0.m(e3);
                return null;
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static IOException zzc(File file, IOException iOException, String str) {
        String concat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            concat = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb2 = new StringBuilder(concat.length() + str3.length());
                sb2.append(concat);
                sb2.append(str3);
                concat = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = "Inoperable file:".concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    public static boolean zzd(zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        Double zzd2 = zzaoVar.zzd();
        return !zzd2.isNaN() && zzd2.doubleValue() >= 0.0d && zzd2.equals(Double.valueOf(Math.floor(zzd2.doubleValue())));
    }

    public static long zze(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static boolean zzf(zzao zzaoVar, zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
            return true;
        }
        if (!(zzaoVar instanceof zzah)) {
            return zzaoVar instanceof zzas ? zzaoVar.zzc().equals(zzaoVar2.zzc()) : zzaoVar instanceof zzaf ? zzaoVar.zze().equals(zzaoVar2.zze()) : zzaoVar == zzaoVar2;
        }
        if (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue())) {
            return false;
        }
        return zzaoVar.zzd().equals(zzaoVar2.zzd());
    }

    public static int zzg(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static double zzi(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static Object zzj(zzao zzaoVar) {
        if (zzao.zzg.equals(zzaoVar)) {
            return null;
        }
        if (zzao.zzf.equals(zzaoVar)) {
            return "";
        }
        if (zzaoVar instanceof zzal) {
            return zzk((zzal) zzaoVar);
        }
        if (!(zzaoVar instanceof zzae)) {
            return !zzaoVar.zzd().isNaN() ? zzaoVar.zzd() : zzaoVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        zzae zzaeVar = (zzae) zzaoVar;
        int i = 0;
        while (i < zzaeVar.zzh()) {
            if (i >= zzaeVar.zzh()) {
                OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object zzj2 = zzj(zzaeVar.zzl(i));
            if (zzj2 != null) {
                arrayList.add(zzj2);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap zzk(zzal zzalVar) {
        HashMap hashMap = new HashMap();
        Iterator it = new ArrayList(zzalVar.zza.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object zzj2 = zzj(zzalVar.zzk(str));
            if (zzj2 != null) {
                hashMap.put(str, zzj2);
            }
        }
        return hashMap;
    }

    public static void zzl(UnleashContext unleashContext) {
        int zzg = zzg(unleashContext.zzh("runtime.counter").zzd().doubleValue() + 1.0d);
        if (zzg <= 1000000) {
            unleashContext.zze("runtime.counter", new zzah(Double.valueOf(zzg)));
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Instructions allowed exceeded");
        }
    }

    public static int zzm(byte[] bArr, int i, zzaef zzaefVar, zzacg zzacgVar) {
        zzadv zzadvVar = (zzadv) zzaefVar;
        int zza2 = zza(bArr, i, zzacgVar);
        int i2 = zzacgVar.zza + zza2;
        while (zza2 < i2) {
            zza2 = zza(bArr, zza2, zzacgVar);
            zzadvVar.zzh(zzacgVar.zza);
        }
        if (zza2 == i2) {
            return zza2;
        }
        a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int zzn(zzafp zzafpVar, int i, byte[] bArr, int i2, int i3, zzaef zzaefVar, zzacg zzacgVar) {
        zzadu zza2 = zzafpVar.zza();
        zzafp zzafpVar2 = zzafpVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        zzacg zzacgVar2 = zzacgVar;
        int zzj2 = zzj(zza2, zzafpVar2, bArr2, i2, i4, zzacgVar2);
        zzafpVar2.zzk(zza2);
        zzacgVar2.zzc = zza2;
        zzaefVar.add(zza2);
        while (zzj2 < i4) {
            zzacg zzacgVar3 = zzacgVar2;
            int i5 = i4;
            int zza3 = zza(bArr2, zzj2, zzacgVar3);
            if (i != zzacgVar3.zza) {
                break;
            }
            byte[] bArr3 = bArr2;
            zzafp zzafpVar3 = zzafpVar2;
            zzadu zza4 = zzafpVar3.zza();
            zzj2 = zzj(zza4, zzafpVar3, bArr3, zza3, i5, zzacgVar3);
            zzafpVar2 = zzafpVar3;
            bArr2 = bArr3;
            i4 = i5;
            zzacgVar2 = zzacgVar3;
            zzafpVar2.zzk(zza4);
            zzacgVar2.zzc = zza4;
            zzaefVar.add(zza4);
        }
        return zzj2;
    }

    public static int zzo(int i, byte[] bArr, int i2, int i3, zzaga zzagaVar, zzacg zzacgVar) {
        if ((i >>> 3) == 0) {
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzc = zzc(bArr, i2, zzacgVar);
            zzagaVar.zzk(i, Long.valueOf(zzacgVar.zzb));
            return zzc;
        }
        if (i4 == 1) {
            zzagaVar.zzk(i, Long.valueOf(zze(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zza2 = zza(bArr, i2, zzacgVar);
            int i5 = zzacgVar.zza;
            if (i5 < 0) {
                a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - zza2) {
                a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                zzagaVar.zzk(i, zzacr.zza);
            } else {
                zzagaVar.zzk(i, zzacr.zzj(zza2, i5, bArr));
            }
            return zza2 + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzagaVar.zzk(i, Integer.valueOf(zzd(i2, bArr)));
                return i2 + 4;
            }
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        zzaga zzb = zzaga.zzb();
        int i7 = zzacgVar.zze + 1;
        zzacgVar.zze = i7;
        if (i7 >= 100) {
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zza3 = zza(bArr, i2, zzacgVar);
            int i9 = zzacgVar.zza;
            if (i9 == i6) {
                i8 = i9;
                i2 = zza3;
                break;
            }
            i2 = zzo(i9, bArr, zza3, i3, zzb, zzacgVar);
            i8 = i9;
        }
        zzacgVar.zze--;
        if (i2 > i3 || i8 != i6) {
            a$$ExternalSyntheticBUOutline0.m$5("Failed to parse the message.");
            return 0;
        }
        zzagaVar.zzk(i, zzb);
        return i2;
    }

    public static int zzp(int i, byte[] bArr, int i2, int i3, zzacg zzacgVar) {
        if ((i >>> 3) == 0) {
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzc(bArr, i2, zzacgVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zzacgVar) + zzacgVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zzacgVar);
            i6 = zzacgVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzp(i6, bArr, i2, i3, zzacgVar);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        a$$ExternalSyntheticBUOutline0.m$5("Failed to parse the message.");
        return 0;
    }

    public static int zzg(byte[] bArr, int i, zzacg zzacgVar) {
        int zza2 = zza(bArr, i, zzacgVar);
        int i2 = zzacgVar.zza;
        if (i2 >= 0) {
            if (i2 > bArr.length - zza2) {
                a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i2 == 0) {
                zzacgVar.zzc = zzacr.zza;
                return zza2;
            }
            zzacgVar.zzc = zzacr.zzj(zza2, i2, bArr);
            return zza2 + i2;
        }
        a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int zzd(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static boolean zzd(zzws zzwsVar) {
        return ((zzvn) zzwsVar).zze != Thread.currentThread();
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzaef zzaefVar, zzacg zzacgVar) {
        zzadv zzadvVar = (zzadv) zzaefVar;
        int zza2 = zza(bArr, i2, zzacgVar);
        zzadvVar.zzh(zzacgVar.zza);
        while (zza2 < i3) {
            int zza3 = zza(bArr, zza2, zzacgVar);
            if (i != zzacgVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zzacgVar);
            zzadvVar.zzh(zzacgVar.zza);
        }
        return zza2;
    }

    public static int zzk(Object obj, zzafp zzafpVar, byte[] bArr, int i, int i2, int i3, zzacg zzacgVar) {
        zzaff zzaffVar = (zzaff) zzafpVar;
        int i4 = zzacgVar.zze + 1;
        zzacgVar.zze = i4;
        if (i4 < 100) {
            int zzi2 = zzaffVar.zzi(obj, bArr, i, i2, i3, zzacgVar);
            zzacgVar.zze--;
            zzacgVar.zzc = obj;
            return zzi2;
        }
        a$$ExternalSyntheticBUOutline0.m$5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static boolean zze(byte b) {
        return b > -65;
    }

    public static zzbk zze(String str) {
        zzbk zzbkVar;
        if (str == null || str.isEmpty()) {
            zzbkVar = null;
        } else {
            zzbkVar = (zzbk) zzbk.zzap.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (zzbkVar != null) {
            return zzbkVar;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Unsupported commandId ", str));
        return null;
    }

    public static void zze(zzws zzwsVar) {
        String str = ((zzvn) zzwsVar).zzd;
        AtomicReference atomicReference = zzvy.zzd;
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static int zzf(byte[] bArr, int i, zzacg zzacgVar) {
        int zza2 = zza(bArr, i, zzacgVar);
        int i2 = zzacgVar.zza;
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            zzacgVar.zzc = "";
            return zza2;
        }
        zzacgVar.zzc = zzagl.zzd(zza2, i2, bArr);
        return zza2 + i2;
    }

    public static int zzj(Object obj, zzafp zzafpVar, byte[] bArr, int i, int i2, zzacg zzacgVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzb(i4, bArr, i3, zzacgVar);
            i4 = zzacgVar.zza;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = zzacgVar.zze + 1;
            zzacgVar.zze = i6;
            if (i6 < 100) {
                int i7 = i5 + i4;
                zzafpVar.zzj(obj, bArr, i5, i7, zzacgVar);
                zzacgVar.zze--;
                zzacgVar.zzc = obj;
                return i7;
            }
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static zzae zzc(zzae zzaeVar, UnleashContext unleashContext, zzan zzanVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator zzg = zzaeVar.zzg();
        while (zzg.hasNext()) {
            int intValue = ((Integer) zzg.next()).intValue();
            if (zzaeVar.zzo(intValue)) {
                zzao zza2 = zzanVar.zza(unleashContext, Arrays.asList(zzaeVar.zzl(intValue), new zzah(Double.valueOf(intValue)), zzaeVar));
                if (zza2.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || zza2.zze().equals(bool2)) {
                    zzaeVar2.zzn(intValue, zza2);
                }
            }
        }
        return zzaeVar2;
    }

    public static int zzc(byte[] bArr, int i, zzacg zzacgVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzacgVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzacgVar.zzb = j2;
        return i3;
    }

    public static void zzc(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m(str, " operation requires at most ", i, " parameters found ", arrayList.size());
    }

    public static void zzc(zzws zzwsVar) {
        if (!zzd(zzwsVar) && ((zzvn) zzwsVar).zza != null) {
            Trace.endSection();
            zzc(((zzvn) zzwsVar).zza);
        } else {
            Trace.endSection();
            Trace.endSection();
        }
    }

    public static int zzb(int i, byte[] bArr, int i2, zzacg zzacgVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzacgVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzacgVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzacgVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzacgVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzacgVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static zzao zzb(zzae zzaeVar, UnleashContext unleashContext, ArrayList arrayList, boolean z) {
        zzao zzaoVar;
        zzb("reduce", arrayList, 1);
        zzc(2, "reduce", arrayList);
        zzao zzb = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0));
        if (zzb instanceof zzai) {
            if (arrayList.size() == 2) {
                zzaoVar = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(1));
                if (zzaoVar instanceof zzag) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed to parse initial value");
                    return null;
                }
            } else {
                if (zzaeVar.zzh() == 0) {
                    a$$ExternalSyntheticBUOutline0.m$1("Empty array with no initial value error");
                    return null;
                }
                zzaoVar = null;
            }
            zzai zzaiVar = (zzai) zzb;
            int zzh = zzaeVar.zzh();
            int i = z ? 0 : zzh - 1;
            int i2 = z ? zzh - 1 : 0;
            int i3 = true == z ? 1 : -1;
            if (zzaoVar == null) {
                zzaoVar = zzaeVar.zzl(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (zzaeVar.zzo(i)) {
                    zzaoVar = zzaiVar.zza(unleashContext, Arrays.asList(zzaoVar, zzaeVar.zzl(i), new zzah(Double.valueOf(i)), zzaeVar));
                    if (zzaoVar instanceof zzag) {
                        a$$ExternalSyntheticBUOutline0.m$1("Reduce operation failed");
                        return null;
                    }
                    i += i3;
                } else {
                    i += i3;
                }
            }
            return zzaoVar;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Callback should be a method");
        return null;
    }

    public static IOException zza(zzru zzruVar, Uri uri, IOException iOException, String str) {
        try {
            zzsr zzsrVar = new zzsr();
            zzsrVar.zza = true;
            File file = (File) zzruVar.zza(uri, zzsrVar);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return zzb(file, iOException, str);
                        }
                        return zzb(file, iOException, str);
                    }
                    if (file.canWrite()) {
                        return zzb(file, iOException, str);
                    }
                    return zzb(file, iOException, str);
                }
                if (file.canRead()) {
                    if (file.canWrite()) {
                        return zzb(file, iOException, str);
                    }
                    return zzb(file, iOException, str);
                }
                if (file.canWrite()) {
                    return zzb(file, iOException, str);
                }
                return zzb(file, iOException, str);
            }
            return zzb(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static int zza(byte[] bArr, int i, zzacg zzacgVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zzacgVar);
        }
        zzacgVar.zza = b;
        return i2;
    }

    public static zzao zzb(zzje zzjeVar) {
        if (zzjeVar == null) {
            return zzao.zzf;
        }
        int zzk = zzjeVar.zzk() - 1;
        if (zzk == 1) {
            if (zzjeVar.zzc()) {
                return new zzas(zzjeVar.zzd());
            }
            return zzao.zzm;
        }
        if (zzk == 2) {
            if (zzjeVar.zzh()) {
                return new zzah(Double.valueOf(zzjeVar.zzi()));
            }
            return new zzah(null);
        }
        if (zzk == 3) {
            if (zzjeVar.zze()) {
                return new zzaf(Boolean.valueOf(zzjeVar.zzf()));
            }
            return new zzaf(null);
        }
        if (zzk == 4) {
            List zza2 = zzjeVar.zza();
            ArrayList arrayList = new ArrayList();
            Iterator it = zza2.iterator();
            while (it.hasNext()) {
                arrayList.add(zzb((zzje) it.next()));
            }
            return new zzap(zzjeVar.zzb(), arrayList);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Unknown type found. Cannot convert entity");
        return null;
    }

    public static int zza(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i != 3) {
                return i != 4 ? 0 : 5;
            }
            return 4;
        }
        return 1;
    }

    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b >= 32 && b <= 126) {
                            sb.append((char) b);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static IOException zzb(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return zzc(file, iOException, str);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return zzc(file, iOException, str);
                    }
                    return zzc(file, iOException, str);
                }
                if (parentFile.canWrite()) {
                    return zzc(file, iOException, str);
                }
                return zzc(file, iOException, str);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return zzc(file, iOException, str);
                }
                return zzc(file, iOException, str);
            }
            if (parentFile.canWrite()) {
                return zzc(file, iOException, str);
            }
            return zzc(file, iOException, str);
        }
        return zzc(file, iOException, str);
    }

    public static void zza(zzws zzwsVar, zzws zzwsVar2) {
        if (zzwsVar != null) {
            if (zzwsVar2 != null) {
                if (((zzvn) zzwsVar).zza == zzwsVar2 && !zzd(zzwsVar)) {
                    Trace.endSection();
                    return;
                } else if (zzwsVar == ((zzvn) zzwsVar2).zza && !zzd(zzwsVar2)) {
                    zze(zzwsVar2);
                    return;
                }
            }
            zzc(zzwsVar);
        }
        if (zzwsVar2 != null) {
            zzb(zzwsVar2);
        }
    }

    public static void zza(ListenableFuture listenableFuture) {
        listenableFuture.addListener(new zzpv(listenableFuture, 1), DirectExecutor.INSTANCE);
    }

    public static void zza(String str, List list, int i) {
        if (list.size() == i) {
            return;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m(str, " operation requires ", i, " parameters found ", list.size());
    }

    public static void zzb(zzws zzwsVar) {
        if (!zzd(zzwsVar) && ((zzvn) zzwsVar).zza != null) {
            zzb(((zzvn) zzwsVar).zza);
            zze(zzwsVar);
        } else {
            Trace.beginSection(((zzvn) zzwsVar).zzc);
            zze(zzwsVar);
        }
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzb(String str, List list, int i) {
        if (list.size() >= i) {
            return;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m(str, " operation requires at least ", i, " parameters found ", list.size());
    }
}
