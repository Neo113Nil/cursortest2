package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import k2.h;
import x2.InterfaceC5190d;
import y2.InterfaceC5229a;
import y2.InterfaceC5230b;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends InterfaceC5229a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, InterfaceC5230b interfaceC5230b, String str, h hVar, InterfaceC5190d interfaceC5190d, Bundle bundle);
}
