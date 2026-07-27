package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import w2.InterfaceC5157e;
import w2.m;
import w2.o;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends InterfaceC5157e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, m mVar, Bundle bundle, o oVar, Bundle bundle2);
}
