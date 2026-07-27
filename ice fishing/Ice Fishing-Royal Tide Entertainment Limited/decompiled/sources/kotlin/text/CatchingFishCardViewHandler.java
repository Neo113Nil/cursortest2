package kotlin.text;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class CatchingFishCardViewHandler extends androidx.appcompat.app.CatchingFishPagingLibrary {
    public final /* synthetic */ int CatchingFishCoroutine = 0;
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishMockkWidgetKtor CatchingFishReduxKtor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishCardViewHandler(CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor, CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger) {
        super(catchingFishMockkWidgetKtor);
        this.CatchingFishReduxKtor = catchingFishMockkWidgetKtor;
        this.CatchingFishDaggerWebsocket = catchingFishAsyncTaskDagger;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    @Override // androidx.appcompat.app.CatchingFishPagingLibrary
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int CatchingFishCoroutine() {
        Location location;
        boolean z;
        long j;
        switch (this.CatchingFishCoroutine) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return CatchingFishMoshiFlux.CatchingFishParcelableFAB((PowerManager) this.CatchingFishDaggerWebsocket) ? 2 : 1;
            default:
                CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = (CatchingFishAsyncTaskDagger) this.CatchingFishDaggerWebsocket;
                CatchingFishMockkMVP catchingFishMockkMVP = (CatchingFishMockkMVP) catchingFishAsyncTaskDagger.CatchingFishWorkManager;
                LocationManager locationManager = (LocationManager) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
                if (catchingFishMockkMVP.CatchingFishSnackbar > System.currentTimeMillis()) {
                    z = catchingFishMockkMVP.CatchingFishParcelableFAB;
                } else {
                    Context context = (Context) catchingFishAsyncTaskDagger.CatchingFishViewModelScope;
                    Location location2 = null;
                    if (CatchingFishLayoutRoom.CatchingFishLayout(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        if (locationManager.isProviderEnabled("network")) {
                            location = locationManager.getLastKnownLocation("network");
                            if (CatchingFishLayoutRoom.CatchingFishLayout(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                try {
                                    if (locationManager.isProviderEnabled("gps")) {
                                        location2 = locationManager.getLastKnownLocation("gps");
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            if (location2 != null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                                location = location2;
                            }
                            if (location == null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (CatchingFishViewFABWidget.CatchingFishReduxKtor == null) {
                                    CatchingFishViewFABWidget.CatchingFishReduxKtor = new CatchingFishViewFABWidget();
                                }
                                CatchingFishViewFABWidget catchingFishViewFABWidget = CatchingFishViewFABWidget.CatchingFishReduxKtor;
                                catchingFishViewFABWidget.CatchingFishParcelableFAB(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                                catchingFishViewFABWidget.CatchingFishParcelableFAB(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                                z = catchingFishViewFABWidget.CatchingFishCoroutine == 1;
                                long j2 = catchingFishViewFABWidget.CatchingFishSnackbar;
                                long j3 = catchingFishViewFABWidget.CatchingFishParcelableFAB;
                                catchingFishViewFABWidget.CatchingFishParcelableFAB(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                                long j4 = catchingFishViewFABWidget.CatchingFishSnackbar;
                                if (j2 == -1 || j3 == -1) {
                                    j = currentTimeMillis + 43200000;
                                } else {
                                    if (currentTimeMillis > j3) {
                                        j2 = j4;
                                    } else if (currentTimeMillis > j2) {
                                        j2 = j3;
                                    }
                                    j = j2 + 60000;
                                }
                                catchingFishMockkMVP.CatchingFishParcelableFAB = z;
                                catchingFishMockkMVP.CatchingFishSnackbar = j;
                            } else {
                                int i = Calendar.getInstance().get(11);
                                if (i < 6 || i >= 22) {
                                    z = true;
                                }
                            }
                        }
                    }
                    location = null;
                    if (CatchingFishLayoutRoom.CatchingFishLayout(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    }
                    if (location2 != null) {
                    }
                    location = location2;
                    if (location == null) {
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // androidx.appcompat.app.CatchingFishPagingLibrary
    public final void CatchingFishReduxKtor() {
        switch (this.CatchingFishCoroutine) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishReduxKtor.CatchingFishEspressoTesting(true, true);
                break;
            default:
                this.CatchingFishReduxKtor.CatchingFishEspressoTesting(true, true);
                break;
        }
    }

    @Override // androidx.appcompat.app.CatchingFishPagingLibrary
    public final IntentFilter CatchingFishSnackbar() {
        switch (this.CatchingFishCoroutine) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishCardViewHandler(CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor, Context context) {
        super(catchingFishMockkWidgetKtor);
        this.CatchingFishReduxKtor = catchingFishMockkWidgetKtor;
        this.CatchingFishDaggerWebsocket = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
