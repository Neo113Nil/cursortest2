package com.google.android.gms.internal.time;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzje;
import com.google.android.libraries.places.internal.zzkf;
import com.google.android.libraries.places.internal.zznk;
import com.google.common.collect.RegularImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public abstract class zzbb {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object zza;
    public final Object zzb;
    public final Object zzc;
    public Object zzd;

    public zzbb(Executor executor, zzcb zzcbVar) {
        Objects.requireNonNull(executor);
        this.zzb = executor;
        this.zza = new HashSet();
        this.zzc = new zzcf(zzcbVar);
    }

    public static void zzg(HashMap hashMap, String str, Object obj) {
        String obj2 = obj != null ? obj.toString() : null;
        if (TextUtils.isEmpty(obj2)) {
            return;
        }
        hashMap.put(str, obj2);
    }

    public String toString() {
        String str;
        switch (this.$r8$classId) {
            case 0:
                synchronized (this) {
                    str = "ListenersManager{@" + System.identityHashCode(this) + " logId=" + ((zzcf) this.zzc).zza + ", listeners=" + ((HashSet) this.zza).toString() + "}";
                }
                return str;
            default:
                return super.toString();
        }
    }

    public abstract HashMap zza();

    public abstract void zza(Object obj, Object obj2);

    public abstract String zzb();

    public void zzd(zzak zzakVar) {
        synchronized (this) {
            try {
                ((HashSet) this.zza).add(zzakVar);
                Object obj = this.zzd;
                if (obj != null) {
                    ((Executor) this.zzb).execute(new zzaz((zzs) this, zzakVar, obj, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public HashMap zze() {
        HashMap hashMap = new HashMap();
        Context context = ((zzje) this.zzd).zza;
        String packageName = context.getPackageName();
        String zza = zzkf.zza(context.getPackageManager(), packageName);
        StatusLine builder = RegularImmutableMap.builder();
        if (packageName != null) {
            builder.put("X-Android-Package", packageName);
        }
        if (zza != null) {
            builder.put("X-Android-Cert", zza);
        }
        hashMap.putAll(builder.build(true));
        hashMap.put("X-Places-Android-Sdk", "5.2.0");
        return hashMap;
    }

    public String zzf() {
        String zzb = zzb();
        String str = (String) this.zzc;
        new HashMap();
        Trace.checkArgument("API key cannot be empty.", !TextUtils.isEmpty(str));
        Locale locale = (Locale) this.zzb;
        HashMap hashMap = new HashMap(zza());
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        buildUpon.appendEncodedPath("maps/api/place/");
        buildUpon.appendEncodedPath(zzb);
        buildUpon.appendQueryParameter("key", str);
        if (locale != null) {
            String languageTag = locale.toLanguageTag();
            if (!TextUtils.isEmpty(languageTag)) {
                buildUpon.appendQueryParameter("language", languageTag);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public zzbb(zznk zznkVar, Locale locale, String str, zzje zzjeVar) {
        this.zza = zznkVar;
        this.zzb = locale;
        this.zzc = str;
        this.zzd = zzjeVar;
    }

    /* renamed from: zze, reason: collision with other method in class */
    public void m2027zze() {
        synchronized (this) {
            this.zzd = null;
            ((HashSet) this.zza).clear();
        }
    }

    public void zzf(Object obj) {
        synchronized (this) {
            try {
                zze zzeVar = zzaj.zza;
                zzeVar.getClass();
                Level level = Level.FINE;
                zzeVar.zza(level).zzo((zzcf) this.zzc, Integer.valueOf(((HashSet) this.zza).size()), obj);
                if (Objects.equals(this.zzd, obj)) {
                    zzeVar.zza(level).zzn("[ListenersManager(%s)] Skipping notification for newValue=%s, it is the same as previously notified.", (zzcf) this.zzc, obj);
                    return;
                }
                this.zzd = obj;
                ArrayList arrayList = new ArrayList((HashSet) this.zza);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Executor) this.zzb).execute(new zzaz(this, arrayList.get(i), obj, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
