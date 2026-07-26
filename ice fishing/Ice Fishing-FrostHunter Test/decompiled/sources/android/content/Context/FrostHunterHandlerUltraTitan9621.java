package android.content.Context;

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

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterHandlerUltraTitan9621 {
    public final SharedPreferences FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterHandlerUltraTitan9621(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = sharedPreferences;
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
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    public synchronized void FrostHunterAlphaAnimationNeoCosmos5761() {
        try {
            long j = this.FrostHunterAlphaAnimationNeoCosmos5761.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.FrostHunterAlphaAnimationNeoCosmos5761.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.FrostHunterAlphaAnimationNeoCosmos5761.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.FrostHunterAlphaAnimationNeoCosmos5761.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList FrostHunterBundlePulseFusionHero2475() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.FrostHunterAlphaAnimationNeoCosmos5761.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(FrostHunterServiceEliteCelestialThunder1757(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new FrostHunterMediaPlayerBlazeForceNovaX4223(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.FrostHunterAlphaAnimationNeoCosmos5761.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void FrostHunterCameraXPixelTurboCosmos9814(String str, long j) {
        String FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(j);
        if (this.FrostHunterAlphaAnimationNeoCosmos5761.getString("last-used-date", "").equals(FrostHunterServiceEliteCelestialThunder1757)) {
            String FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(FrostHunterServiceEliteCelestialThunder1757);
            if (FrostHunterLifecycleBlazeGammaElite2889 == null) {
                return;
            }
            if (FrostHunterLifecycleBlazeGammaElite2889.equals(str)) {
                return;
            }
            FrostHunterFlowMaxDragonHero5809(str, FrostHunterServiceEliteCelestialThunder1757);
            return;
        }
        long j2 = this.FrostHunterAlphaAnimationNeoCosmos5761.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            FrostHunterAlphaAnimationNeoCosmos5761();
            j2 = this.FrostHunterAlphaAnimationNeoCosmos5761.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.FrostHunterAlphaAnimationNeoCosmos5761.getStringSet(str, new HashSet()));
        hashSet.add(FrostHunterServiceEliteCelestialThunder1757);
        this.FrostHunterAlphaAnimationNeoCosmos5761.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", FrostHunterServiceEliteCelestialThunder1757).commit();
    }

    public synchronized void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        try {
            SharedPreferences.Editor edit = this.FrostHunterAlphaAnimationNeoCosmos5761.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.FrostHunterAlphaAnimationNeoCosmos5761.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(FrostHunterServiceEliteCelestialThunder1757)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(FrostHunterServiceEliteCelestialThunder1757);
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

    public synchronized void FrostHunterFlowMaxDragonHero5809(String str, String str2) {
        FrostHunterLevelListDrawableFusionDragonHero2232(str2);
        HashSet hashSet = new HashSet(this.FrostHunterAlphaAnimationNeoCosmos5761.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.FrostHunterAlphaAnimationNeoCosmos5761.edit().putStringSet(str, hashSet).commit();
    }

    public synchronized void FrostHunterLevelListDrawableFusionDragonHero2232(String str) {
        try {
            String FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(str);
            if (FrostHunterLifecycleBlazeGammaElite2889 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.FrostHunterAlphaAnimationNeoCosmos5761.getStringSet(FrostHunterLifecycleBlazeGammaElite2889, new HashSet()));
            hashSet.remove(str);
            boolean isEmpty = hashSet.isEmpty();
            SharedPreferences sharedPreferences = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (isEmpty) {
                sharedPreferences.edit().remove(FrostHunterLifecycleBlazeGammaElite2889).commit();
            } else {
                sharedPreferences.edit().putStringSet(FrostHunterLifecycleBlazeGammaElite2889, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String FrostHunterLifecycleBlazeGammaElite2889(String str) {
        for (Map.Entry<String, ?> entry : this.FrostHunterAlphaAnimationNeoCosmos5761.getAll().entrySet()) {
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

    public synchronized boolean FrostHunterRemoteConfigSpeedSpeed8566(long j) {
        boolean contains = this.FrostHunterAlphaAnimationNeoCosmos5761.contains("fire-global");
        SharedPreferences sharedPreferences = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!contains) {
            sharedPreferences.edit().putLong("fire-global", j).commit();
            return true;
        }
        long j2 = sharedPreferences.getLong("fire-global", -1L);
        synchronized (this) {
            if (FrostHunterServiceEliteCelestialThunder1757(j2).equals(FrostHunterServiceEliteCelestialThunder1757(j))) {
                return false;
            }
            this.FrostHunterAlphaAnimationNeoCosmos5761.edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public synchronized String FrostHunterServiceEliteCelestialThunder1757(long j) {
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

    public FrostHunterHandlerUltraTitan9621(Context context, String str) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }
}
