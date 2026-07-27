package kotlin.text;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class CatchingFishToolbarGraphQL extends com.google.android.gms.common.internal.CatchingFishPagingLibrary {
    public final CatchingFishBundleHandler CatchingFishCardViewRealm;

    public CatchingFishToolbarGraphQL(Context context, Looper looper, CatchingFishViewWorkManager catchingFishViewWorkManager, CatchingFishBundleHandler catchingFishBundleHandler, CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP, CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP2) {
        super(context, looper, 270, catchingFishViewWorkManager, catchingFishAdMobDaggerMVP, catchingFishAdMobDaggerMVP2);
        this.CatchingFishCardViewRealm = catchingFishBundleHandler;
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final String CatchingFishCloudMessaging() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final IInterface CatchingFishCoroutine(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof CatchingFishContextView ? (CatchingFishContextView) queryLocalInterface : new CatchingFishContextView(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final boolean CatchingFishEspressoTesting() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final String CatchingFishFragmentHandler() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // kotlin.text.CatchingFishMVPUnitTesting
    public final int CatchingFishParcelableFAB() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final Bundle CatchingFishViewModelScope() {
        this.CatchingFishCardViewRealm.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final CatchingFishAppCompatPayPal[] CatchingFishWorkManager() {
        return CatchingFishBiometricBundle.CatchingFishUnitTesting;
    }
}
