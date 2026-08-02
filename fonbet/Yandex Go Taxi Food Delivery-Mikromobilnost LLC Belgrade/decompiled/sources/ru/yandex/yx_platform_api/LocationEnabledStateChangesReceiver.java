package ru.yandex.yx_platform_api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import androidx.core.location.j;
import defpackage.i3y;
import defpackage.jl40;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/yx_platform_api/LocationEnabledStateChangesReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "isLocationEnabled", "onLocationStateChanged", "(Z)V", "Landroid/location/LocationManager;", "locationManager$delegate", "Li3y;", "getLocationManager", "()Landroid/location/LocationManager;", "locationManager", "wasLocationEnabled", "Ljava/lang/Boolean;", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
abstract class LocationEnabledStateChangesReceiver extends BroadcastReceiver {

    /* renamed from: locationManager$delegate, reason: from kotlin metadata */
    private final i3y locationManager;
    private Boolean wasLocationEnabled;

    public LocationEnabledStateChangesReceiver(Context context) {
        this.locationManager = kotlin.a.b(LazyThreadSafetyMode.NONE, new b(context, 0));
    }

    private final LocationManager getLocationManager() {
        return (LocationManager) this.locationManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationManager locationManager_delegate$lambda$0(Context context) {
        return (LocationManager) context.getSystemService("location");
    }

    public abstract void onLocationStateChanged(boolean isLocationEnabled);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean isLocationEnabled;
        if ("android.location.MODE_CHANGED".equals(intent.getAction())) {
            if (Build.VERSION.SDK_INT >= 30) {
                isLocationEnabled = intent.getBooleanExtra("android.location.extra.LOCATION_ENABLED", false);
            } else {
                LocationManager locationManager = getLocationManager();
                WeakHashMap weakHashMap = j.a;
                isLocationEnabled = locationManager.isLocationEnabled();
            }
            if (jl40.l(this.wasLocationEnabled, Boolean.valueOf(isLocationEnabled))) {
                return;
            }
            this.wasLocationEnabled = Boolean.valueOf(isLocationEnabled);
            onLocationStateChanged(isLocationEnabled);
        }
    }
}
