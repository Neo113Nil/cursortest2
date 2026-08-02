package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import z2.InterfaceC5228e;
import z2.l;
import z2.n;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends InterfaceC5228e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, l lVar, Bundle bundle, n nVar, Bundle bundle2);
}
