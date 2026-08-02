package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.constraints.ConstraintsState;
import com.android.volley.Response;
import com.bumptech.glide.util.Util;
import com.google.android.gms.measurement.internal.zzjy;

/* loaded from: classes3.dex */
public final class IndividualNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final /* synthetic */ int $r8$classId = 0;
    public final Object onConstraintState;

    public IndividualNetworkCallback(Response response) {
        this.onConstraintState = response;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.$r8$classId) {
            case 1:
                Util.getUiThreadHandler().post(new zzjy(this, true, 2));
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.$r8$classId) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((Recomposer$$ExternalSyntheticLambda4) this.onConstraintState).invoke(ConstraintsState.ConstraintsMet.INSTANCE);
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.$r8$classId) {
            case 0:
                network.getClass();
                Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
                ((Recomposer$$ExternalSyntheticLambda4) this.onConstraintState).invoke(new ConstraintsState.ConstraintsNotMet(7));
                break;
            default:
                Util.getUiThreadHandler().post(new zzjy(this, false, 2));
                break;
        }
    }

    public IndividualNetworkCallback(Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4) {
        this.onConstraintState = recomposer$$ExternalSyntheticLambda4;
    }
}
