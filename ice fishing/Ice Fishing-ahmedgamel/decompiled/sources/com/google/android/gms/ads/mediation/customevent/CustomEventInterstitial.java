package com.google.android.gms.ads.mediation.customevent;

import A2.a;
import A2.c;
import android.content.Context;
import android.os.Bundle;
import z2.InterfaceC5227d;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, c cVar, String str, InterfaceC5227d interfaceC5227d, Bundle bundle);

    void showInterstitial();
}
