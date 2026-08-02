package com.google.android.gms.ads.mediation.customevent;

import A2.a;
import A2.d;
import android.content.Context;
import android.os.Bundle;
import z2.n;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, n nVar, Bundle bundle);
}
