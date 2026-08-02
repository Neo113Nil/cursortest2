package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.google.android.gms.internal.time.zzbq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class zzx {
    public static zzx zzc;
    public final Obfuscator zza;
    public final HashSet zzb;
    public final IntentFilter zzc$1;
    public final Handler zzd;
    public final Context zzd$1;
    public final zzo zze;
    public zzbq zze$1;
    public final LinkedHashSet zzf;
    public volatile boolean zzf$1;

    public zzx(Context context) {
        zzo zzoVar = zzo.zza;
        Obfuscator obfuscator = new Obfuscator();
        obfuscator.salt = Recorder$$ExternalSyntheticOutline2.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("SplitInstallListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        this.zzb = new HashSet();
        this.zze$1 = null;
        this.zzf$1 = false;
        this.zza = obfuscator;
        this.zzc$1 = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.zzd$1 = applicationContext != null ? applicationContext : context;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzf = new LinkedHashSet();
        this.zze = zzoVar;
    }

    public final void zzf() {
        zzbq zzbqVar;
        if ((this.zzf$1 || !this.zzb.isEmpty()) && this.zze$1 == null) {
            zzbq zzbqVar2 = new zzbq(this, 8);
            this.zze$1 = zzbqVar2;
            int i = Build.VERSION.SDK_INT;
            Context context = this.zzd$1;
            IntentFilter intentFilter = this.zzc$1;
            if (i >= 33) {
                context.registerReceiver(zzbqVar2, intentFilter, 2);
            } else {
                context.registerReceiver(zzbqVar2, intentFilter);
            }
        }
        if (this.zzf$1 || !this.zzb.isEmpty() || (zzbqVar = this.zze$1) == null) {
            return;
        }
        this.zzd$1.unregisterReceiver(zzbqVar);
        this.zze$1 = null;
    }

    public final synchronized void zzk() {
        try {
            Iterator it = new LinkedHashSet(this.zzf).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            synchronized (this) {
                try {
                    Iterator it2 = new HashSet(this.zzb).iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
