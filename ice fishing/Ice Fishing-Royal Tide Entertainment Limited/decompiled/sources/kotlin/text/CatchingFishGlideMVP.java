package kotlin.text;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class CatchingFishGlideMVP extends CatchingFishToolbarMockk {
    public final /* synthetic */ com.google.android.gms.common.internal.CatchingFishPagingLibrary CatchingFishViewModelFAB;
    public final IBinder CatchingFishViewModelScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGlideMVP(com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary, int i, IBinder iBinder, Bundle bundle) {
        super(catchingFishPagingLibrary, i, bundle);
        this.CatchingFishViewModelFAB = catchingFishPagingLibrary;
        this.CatchingFishViewModelScope = iBinder;
    }

    @Override // kotlin.text.CatchingFishToolbarMockk
    public final boolean CatchingFishParcelableFAB() {
        String interfaceDescriptor;
        com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary;
        IBinder iBinder = this.CatchingFishViewModelScope;
        try {
            CatchingFishToastHiltBundle.CatchingFishAnimationMockk(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            catchingFishPagingLibrary = this.CatchingFishViewModelFAB;
        } catch (RemoteException unused) {
        }
        if (!catchingFishPagingLibrary.CatchingFishFragmentHandler().equals(interfaceDescriptor)) {
            new StringBuilder(catchingFishPagingLibrary.CatchingFishFragmentHandler().length() + 34 + String.valueOf(interfaceDescriptor).length());
            return false;
        }
        IInterface CatchingFishCoroutine = catchingFishPagingLibrary.CatchingFishCoroutine(iBinder);
        if (CatchingFishCoroutine != null && (catchingFishPagingLibrary.CatchingFishAnimationMockk(2, 4, CatchingFishCoroutine) || catchingFishPagingLibrary.CatchingFishAnimationMockk(3, 4, CatchingFishCoroutine))) {
            catchingFishPagingLibrary.CatchingFishJetpackCompose = null;
            CatchingFishEspressoPayPal catchingFishEspressoPayPal = catchingFishPagingLibrary.CatchingFishUnitTesting;
            if (catchingFishEspressoPayPal == null) {
                return true;
            }
            ((CatchingFishJUnitPicasso) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket).CatchingFishCoroutine();
            return true;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishToolbarMockk
    public final void CatchingFishSnackbar(ConnectionResult connectionResult) {
        CatchingFishEspressoPayPal catchingFishEspressoPayPal = this.CatchingFishViewModelFAB.CatchingFishAnimationMockk;
        if (catchingFishEspressoPayPal != null) {
            ((CatchingFishHandlerBundle) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket(connectionResult);
        }
        System.currentTimeMillis();
    }
}
