package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcbn implements zzcbs {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzheb zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzcbp zzi;
    private final zzcbo zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcbn(Context context, zzcei zzceiVar, zzcbp zzcbpVar, String str, zzcbo zzcboVar) {
        Preconditions.checkNotNull(zzcbpVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzcboVar;
        this.zzi = zzcbpVar;
        Iterator it = zzcbpVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzheb zza = zzhfz.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzhec zza2 = zzhed.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zza2.zza(str2);
        }
        zza.zzg((zzhed) zza2.zzal());
        zzhfq zza3 = zzhfr.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzceiVar.zza;
        if (str3 != null) {
            zza3.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzhfr) zza3.zzal());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final zzcbp zza() {
        return this.zzi;
    }

    final /* synthetic */ ListenableFuture zzb(Map map) throws Exception {
        zzhfo zzhfoVar;
        ListenableFuture zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzhfoVar = (zzhfo) this.zze.get(str);
                            }
                            if (zzhfoVar == null) {
                                zzcbr.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzhfoVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbii.zzb.zze()).booleanValue()) {
                    zzcec.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzgen.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgen.zzh(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzhfp) ((zzhfo) it.next()).zzal());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzcbr.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (zzhfp zzhfpVar : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzhfpVar.zza());
                    sb.append("] ");
                    sb.append(zzhfpVar.zze());
                }
                zzcbr.zza(sb.toString());
            }
            ListenableFuture zzb2 = new com.google.android.gms.ads.internal.util.zzbq(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhfz) this.zzd.zzal()).zzax());
            if (zzcbr.zzb()) {
                zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbr.zza("Pinged SB successfully.");
                    }
                }, zzcep.zza);
            }
            zzm = zzgen.zzm(zzb2, new zzfws() { // from class: com.google.android.gms.internal.ads.zzcbl
                @Override // com.google.android.gms.internal.ads.zzfws
                public final Object apply(Object obj) {
                    int i2 = zzcbn.zzb;
                    return null;
                }
            }, zzcep.zzf);
        }
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzd(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzhfo) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzhfo zzc2 = zzhfp.zzc();
            int zza = zzhfn.zza(i);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzheo zza2 = zzher.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhem zza3 = zzhen.zza();
                        zza3.zza(zzgyl.zzw(str2));
                        zza3.zzb(zzgyl.zzw(str3));
                        zza2.zza((zzhen) zza3.zzal());
                    }
                }
            }
            zzc2.zzc((zzher) zza2.zzal());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zzn = zzgen.zzn(zzgen.zzh(Collections.emptyMap()), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzcbi
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final ListenableFuture zza(Object obj) {
                    return zzcbn.this.zzb((Map) obj);
                }
            }, zzcep.zzf);
            ListenableFuture zzo = zzgen.zzo(zzn, 10L, TimeUnit.SECONDS, zzcep.zzd);
            zzgen.zzr(zzn, new zzcbm(this, zzo), zzcep.zzf);
            zzc.add(zzo);
        }
    }

    final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgyi zzt = zzgyl.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzheb zzhebVar = this.zzd;
            zzhfh zza = zzhfj.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzhebVar.zzi((zzhfj) zza.zzal());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    @Override // com.google.android.gms.internal.ads.zzcbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzp();
            final Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e) {
                    e = e;
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (RuntimeException e2) {
                    e = e2;
                    zzcec.zzh("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        zzcec.zzj("Width or height of view is zero");
                    } catch (RuntimeException e3) {
                        zzcec.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzcbr.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbj
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbn.this.zzf(bitmap2);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzcep.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
