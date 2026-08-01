package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import x2.InterfaceC5191e;
import x2.m;
import x2.o;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends InterfaceC5191e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, m mVar, Bundle bundle, o oVar, Bundle bundle2);
}
