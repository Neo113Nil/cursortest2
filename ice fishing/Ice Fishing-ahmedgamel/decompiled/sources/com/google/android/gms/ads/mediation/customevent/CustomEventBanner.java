package com.google.android.gms.ads.mediation.customevent;

import A2.a;
import A2.b;
import android.content.Context;
import android.os.Bundle;
import m2.h;
import z2.InterfaceC5227d;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, h hVar, InterfaceC5227d interfaceC5227d, Bundle bundle);
}
