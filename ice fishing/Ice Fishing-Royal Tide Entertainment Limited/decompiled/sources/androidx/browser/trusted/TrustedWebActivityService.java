package androidx.browser.trusted;

import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Locale;
import kotlin.text.CatchingFishMVIAdMobToast;
import kotlin.text.CatchingFishMVIBiometric;

/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {
    public NotificationManager CatchingFishReduxKtor;
    public int CatchingFishDaggerWebsocket = -1;
    public final CatchingFishMVIAdMobToast CatchingFishWorkManager = new CatchingFishMVIAdMobToast(this);

    public static String CatchingFishParcelableFAB(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public final int CatchingFishCoroutine() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public abstract CatchingFishMVIBiometric CatchingFishSnackbar();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.CatchingFishWorkManager;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.CatchingFishReduxKtor = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.CatchingFishDaggerWebsocket = -1;
        return super.onUnbind(intent);
    }
}
