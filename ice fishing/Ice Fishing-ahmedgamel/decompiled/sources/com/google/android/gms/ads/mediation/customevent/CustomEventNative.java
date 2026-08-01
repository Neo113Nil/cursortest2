package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import x2.o;
import y2.InterfaceC5229a;
import y2.InterfaceC5232d;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends InterfaceC5229a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, InterfaceC5232d interfaceC5232d, String str, o oVar, Bundle bundle);
}
