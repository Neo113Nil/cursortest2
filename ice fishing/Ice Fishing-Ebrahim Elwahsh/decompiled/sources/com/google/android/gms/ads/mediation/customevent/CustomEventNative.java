package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import w2.o;
import x2.InterfaceC5208a;
import x2.InterfaceC5211d;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends InterfaceC5208a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, InterfaceC5211d interfaceC5211d, String str, o oVar, Bundle bundle);
}
