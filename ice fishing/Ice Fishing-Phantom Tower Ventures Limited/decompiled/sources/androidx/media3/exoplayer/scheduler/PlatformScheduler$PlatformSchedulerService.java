package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context.FrostHunterDrawerLayoutUltraStrike3303;
import android.content.Context.FrostHunterGyroscopeHeroAlpha1995;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.PowerManager;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r6.hasCapability(16) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStartJob(JobParameters jobParameters) {
        int i;
        Intent registerReceiver;
        int intExtra;
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        PersistableBundle extras = jobParameters.getExtras();
        int i2 = extras.getInt("requirements");
        if ((i2 & 2) != 0) {
            i2 |= 1;
        }
        if ((i2 & 1) != 0) {
            Object systemService = getSystemService("connectivity");
            systemService.getClass();
            connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && (activeNetwork = connectivityManager.getActiveNetwork()) != null) {
                try {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities != null) {
                    }
                } catch (SecurityException unused) {
                }
            }
            i = i2 & 3;
            if ((i2 & 8) != 0 && ((registerReceiver = registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
                i |= 8;
            }
            if ((i2 & 4) != 0) {
                Object systemService2 = getSystemService("power");
                systemService2.getClass();
                if (!((PowerManager) systemService2).isDeviceIdleMode()) {
                    i |= 4;
                }
            }
            if ((i2 & 16) != 0 && registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null) {
                i |= 16;
            }
            if (i != 0) {
                String string = extras.getString("service_action");
                string.getClass();
                String string2 = extras.getString("service_package");
                string2.getClass();
                Intent intent = new Intent(string).setPackage(string2);
                String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                if (Build.VERSION.SDK_INT >= 26) {
                    startForegroundService(intent);
                } else {
                    startService(intent);
                }
            } else {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Requirements not met: " + i);
                jobFinished(jobParameters, true);
            }
            return false;
        }
        i = 0;
        if ((i2 & 8) != 0) {
            i |= 8;
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 16) != 0) {
            i |= 16;
        }
        if (i != 0) {
        }
        return false;
        if ((i2 & 2) != 0 && connectivityManager.isActiveNetworkMetered()) {
            i = 2;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i != 0) {
            }
            return false;
        }
        i = 0;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i != 0) {
        }
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
