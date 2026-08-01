package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import x2.InterfaceC5190d;
import x2.InterfaceC5191e;
import x2.k;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends InterfaceC5191e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, k kVar, Bundle bundle, InterfaceC5190d interfaceC5190d, Bundle bundle2);

    void showInterstitial();
}
