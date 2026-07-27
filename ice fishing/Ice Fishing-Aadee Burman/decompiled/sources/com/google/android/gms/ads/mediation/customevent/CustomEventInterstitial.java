package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import x2.InterfaceC5190d;
import y2.InterfaceC5229a;
import y2.InterfaceC5231c;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends InterfaceC5229a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, InterfaceC5231c interfaceC5231c, String str, InterfaceC5190d interfaceC5190d, Bundle bundle);

    void showInterstitial();
}
