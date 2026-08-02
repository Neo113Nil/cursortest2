package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import z2.InterfaceC5227d;
import z2.InterfaceC5228e;
import z2.j;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends InterfaceC5228e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, j jVar, Bundle bundle, InterfaceC5227d interfaceC5227d, Bundle bundle2);

    void showInterstitial();
}
