package kotlin.text;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public abstract class CatchingFishToolbarMockk {
    public final /* synthetic */ com.google.android.gms.common.internal.CatchingFishPagingLibrary CatchingFishCoroutine;
    public final Bundle CatchingFishDaggerWebsocket;
    public Boolean CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;
    public final /* synthetic */ com.google.android.gms.common.internal.CatchingFishPagingLibrary CatchingFishWorkManager;

    public CatchingFishToolbarMockk(com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary, int i, Bundle bundle) {
        this.CatchingFishWorkManager = catchingFishPagingLibrary;
        Boolean bool = Boolean.TRUE;
        this.CatchingFishCoroutine = catchingFishPagingLibrary;
        this.CatchingFishParcelableFAB = bool;
        this.CatchingFishSnackbar = false;
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = bundle;
    }

    public abstract boolean CatchingFishParcelableFAB();

    public abstract void CatchingFishSnackbar(ConnectionResult connectionResult);
}
