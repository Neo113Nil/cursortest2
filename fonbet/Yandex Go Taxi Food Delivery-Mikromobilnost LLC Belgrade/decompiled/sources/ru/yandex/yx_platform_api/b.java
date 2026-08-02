package ru.yandex.yx_platform_api;

import android.content.Context;
import android.location.LocationManager;
import android.os.PowerManager;
import defpackage.sls;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ b(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        LocationManager locationManager_delegate$lambda$0;
        PowerManager powerManager_delegate$lambda$0;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                locationManager_delegate$lambda$0 = LocationEnabledStateChangesReceiver.locationManager_delegate$lambda$0(context);
                return locationManager_delegate$lambda$0;
            default:
                powerManager_delegate$lambda$0 = PowerSaveModeChangesReceiver.powerManager_delegate$lambda$0(context);
                return powerManager_delegate$lambda$0;
        }
    }
}
