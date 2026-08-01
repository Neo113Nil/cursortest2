package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import k2.h;
import x2.InterfaceC5190d;
import x2.InterfaceC5191e;
import x2.InterfaceC5194h;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends InterfaceC5191e {
    View getBannerView();

    @Override // x2.InterfaceC5191e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // x2.InterfaceC5191e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // x2.InterfaceC5191e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, InterfaceC5194h interfaceC5194h, Bundle bundle, h hVar, InterfaceC5190d interfaceC5190d, Bundle bundle2);
}
