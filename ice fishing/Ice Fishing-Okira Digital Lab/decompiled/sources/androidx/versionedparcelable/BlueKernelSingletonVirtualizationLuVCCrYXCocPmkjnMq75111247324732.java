package androidx.versionedparcelable;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732 {
    public final SharedPreferences ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732(Context context, int i) {
        boolean isEmpty;
        switch (i) {
            case 2:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = sharedPreferences;
                File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            isEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (isEmpty) {
                            return;
                        }
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                        return;
                    }
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        e.getMessage();
                        return;
                    }
                    return;
                }
            default:
                context.getClass();
                this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = context.getSharedPreferences("ice_fish_match", 0);
                return;
        }
    }

    public synchronized ArrayList ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new YellowLoopInjectionFilterUxC1NfPL4BGQHm5Ksb75999053735154(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        try {
            SharedPreferences.Editor edit = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
                        i++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(String str, long j) {
        String RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(j);
        if (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getString("last-used-date", "").equals(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867)) {
            String LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
            if (LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == null) {
                return;
            }
            if (LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.equals(str)) {
                return;
            }
            UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(str, RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
            return;
        }
        long j2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            j2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getStringSet(str, new HashSet()));
        hashSet.add(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867).commit();
    }

    public synchronized String LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(String str) {
        for (Map.Entry<String, ?> entry : this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public synchronized void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        try {
            long j = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(long j) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        instant = new Date(j).toInstant();
        unused = ZoneOffset.UTC;
        atOffset = instant.atOffset(ZoneOffset.UTC);
        localDateTime = atOffset.toLocalDateTime();
        unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        return format;
    }

    public synchronized boolean TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(long j) {
        boolean contains = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.contains("fire-global");
        SharedPreferences sharedPreferences = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (!contains) {
            sharedPreferences.edit().putLong("fire-global", j).commit();
            return true;
        }
        long j2 = sharedPreferences.getLong("fire-global", -1L);
        synchronized (this) {
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(j2).equals(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(j))) {
                return false;
            }
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public synchronized void UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(String str, String str2) {
        YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(str2);
        HashSet hashSet = new HashSet(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.edit().putStringSet(str, hashSet).commit();
    }

    public synchronized void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(String str) {
        try {
            String LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(str);
            if (LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getStringSet(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, new HashSet()));
            hashSet.remove(str);
            boolean isEmpty = hashSet.isEmpty();
            SharedPreferences sharedPreferences = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (isEmpty) {
                sharedPreferences.edit().remove(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).commit();
            } else {
                sharedPreferences.edit().putStringSet(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732(Context context, String str) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }
}
