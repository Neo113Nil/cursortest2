package kotlin.text;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class CatchingFishMoshiJUnit extends CatchingFishToolbarMockk {
    public final /* synthetic */ com.google.android.gms.common.internal.CatchingFishPagingLibrary CatchingFishViewModelScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMoshiJUnit(com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary, int i, Bundle bundle) {
        super(catchingFishPagingLibrary, i, bundle);
        this.CatchingFishViewModelScope = catchingFishPagingLibrary;
    }

    @Override // kotlin.text.CatchingFishToolbarMockk
    public final boolean CatchingFishParcelableFAB() {
        this.CatchingFishViewModelScope.CatchingFishLayout.CatchingFishParcelableFAB(ConnectionResult.CatchingFishLayout);
        return true;
    }

    @Override // kotlin.text.CatchingFishToolbarMockk
    public final void CatchingFishSnackbar(ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishViewModelScope;
        catchingFishPagingLibrary.getClass();
        catchingFishPagingLibrary.CatchingFishLayout.CatchingFishParcelableFAB(connectionResult);
        System.currentTimeMillis();
    }
}
