package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import kotlin.text.CatchingFishFirebaseMVVM;
import kotlin.text.CatchingFishPayPalGlide;
import kotlin.text.CatchingFishSnackbarHilt;

/* loaded from: classes.dex */
public final class CatchingFishPagingLibrary implements ServiceConnection {
    public final InstallReferrerStateListener CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishViewPagerToast CatchingFishSnackbar;

    public CatchingFishPagingLibrary(CatchingFishViewPagerToast catchingFishViewPagerToast, InstallReferrerStateListener installReferrerStateListener) {
        this.CatchingFishSnackbar = catchingFishViewPagerToast;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.CatchingFishParcelableFAB = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        CatchingFishPayPalGlide catchingFishFirebaseMVVM;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = CatchingFishSnackbarHilt.CatchingFishEspressoTesting;
        if (iBinder == null) {
            catchingFishFirebaseMVVM = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            catchingFishFirebaseMVVM = queryLocalInterface instanceof CatchingFishPayPalGlide ? (CatchingFishPayPalGlide) queryLocalInterface : new CatchingFishFirebaseMVVM(iBinder);
        }
        CatchingFishViewPagerToast catchingFishViewPagerToast = this.CatchingFishSnackbar;
        catchingFishViewPagerToast.CatchingFishCoroutine = catchingFishFirebaseMVVM;
        catchingFishViewPagerToast.CatchingFishParcelableFAB = 2;
        this.CatchingFishParcelableFAB.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        CatchingFishViewPagerToast catchingFishViewPagerToast = this.CatchingFishSnackbar;
        catchingFishViewPagerToast.CatchingFishCoroutine = null;
        catchingFishViewPagerToast.CatchingFishParcelableFAB = 0;
        this.CatchingFishParcelableFAB.onInstallReferrerServiceDisconnected();
    }
}
