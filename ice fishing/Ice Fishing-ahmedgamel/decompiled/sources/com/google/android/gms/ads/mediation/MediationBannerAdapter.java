package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import m2.h;
import z2.InterfaceC5227d;
import z2.InterfaceC5228e;
import z2.InterfaceC5231h;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends InterfaceC5228e {
    View getBannerView();

    @Override // z2.InterfaceC5228e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // z2.InterfaceC5228e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // z2.InterfaceC5228e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, InterfaceC5231h interfaceC5231h, Bundle bundle, h hVar, InterfaceC5227d interfaceC5227d, Bundle bundle2);
}
