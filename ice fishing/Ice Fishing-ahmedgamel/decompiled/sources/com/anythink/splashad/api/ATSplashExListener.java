package com.anythink.splashad.api;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* loaded from: classes.dex */
public interface ATSplashExListener extends ATSplashAdListener {
    void onDeeplinkCallback(ATAdInfo aTAdInfo, boolean z6);

    void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo);
}
