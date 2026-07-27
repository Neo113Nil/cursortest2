package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import k2.C4637h;
import w2.InterfaceC5156d;
import x2.InterfaceC5208a;
import x2.InterfaceC5209b;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends InterfaceC5208a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, InterfaceC5209b interfaceC5209b, String str, C4637h c4637h, InterfaceC5156d interfaceC5156d, Bundle bundle);
}
