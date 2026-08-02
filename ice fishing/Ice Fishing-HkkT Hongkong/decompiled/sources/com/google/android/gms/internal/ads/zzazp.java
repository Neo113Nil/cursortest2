package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzazp extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzazg zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzazp() {
        zzazg zzazgVar = new zzazg();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzazgVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbhs.zzd.zze()).intValue();
        this.zzg = ((Long) zzbhs.zza.zze()).intValue();
        this.zzh = ((Long) zzbhs.zze.zze()).intValue();
        this.zzi = ((Long) zzbhs.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzS)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzT)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzU)).intValue();
        this.zze = ((Long) zzbhs.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzW);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzX)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzY)).booleanValue();
        this.zzp = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzZ)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzo().zzw(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0042, code lost:
    
        if (r3.importance != 100) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0052, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzb().zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0062, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0064, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zze("ContentFetchThread: no activity. Sleeping.");
        zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0072, code lost:
    
        if (r0.getWindow() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007c, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007e, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008f, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzo().zzw(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.zzcec.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00dc->B:16:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        View view;
        while (true) {
            try {
                Context zzb = com.google.android.gms.ads.internal.zzt.zzb().zzb();
                if (zzb != null) {
                    ActivityManager activityManager = (ActivityManager) zzb.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) zzb.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "ContentFetchTask.isInForeground");
            }
            zzcec.zze("ContentFetchTask: sleeping");
            zzf();
            Thread.sleep(this.zze * 1000);
            synchronized (this.zzc) {
                while (this.zzb) {
                    try {
                        zzcec.zze("ContentFetchTask: waiting");
                        this.zzc.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new zzazl(this, view));
        }
        Thread.sleep(this.zze * 1000);
        synchronized (this.zzc) {
        }
    }

    public final zzazf zza() {
        return this.zzd.zza(this.zzp);
    }

    final zzazo zzb(View view, zzazf zzazfVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzazfVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzazo(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzcjk)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.isAtLeastKitKat()) {
                    zzazfVar.zzh();
                    webView.post(new zzazn(this, zzazfVar, webView, globalVisibleRect));
                    return new zzazo(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    zzazo zzb = zzb(viewGroup.getChildAt(i3), zzazfVar);
                    i += zzb.zza;
                    i2 += zzb.zzb;
                }
                return new zzazo(this, i, i2);
            }
        }
        return new zzazo(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r11 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzc(View view) {
        try {
            zzazf zzazfVar = new zzazf(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context zzb = com.google.android.gms.ads.internal.zzt.zzb().zzb();
            if (zzb != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(zzb.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzV), "id", zzb.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzazo zzb2 = zzb(view, zzazfVar);
            zzazfVar.zzm();
            if (zzb2.zza == 0 && zzb2.zzb == 0) {
                return;
            }
            int i = zzb2.zzb;
            if (i == 0) {
                if (zzazfVar.zzc() == 0) {
                    return;
                }
            }
            if (this.zzd.zzd(zzazfVar)) {
                return;
            }
            this.zzd.zzb(zzazfVar);
        } catch (Exception e) {
            zzcec.zzh("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "ContentFetchTask.fetchContent");
        }
    }

    final void zzd(zzazf zzazfVar, WebView webView, String str, boolean z) {
        zzazfVar.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzazfVar.zzl(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzazfVar.zzl(webView.getTitle() + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzazfVar.zzo()) {
                this.zzd.zzc(zzazfVar);
            }
        } catch (JSONException unused) {
            zzcec.zze("Json string may be malformed.");
        } catch (Throwable th) {
            zzcec.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            if (this.zza) {
                zzcec.zze("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = true;
            zzcec.zze("ContentFetchThread: paused, pause = true");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            zzcec.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}
