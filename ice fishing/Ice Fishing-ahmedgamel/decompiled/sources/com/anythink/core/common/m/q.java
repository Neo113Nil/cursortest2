package com.anythink.core.common.m;

import com.anythink.core.api.AdError;

/* loaded from: classes.dex */
public interface q {
    void onLoadCanceled(int i);

    void onLoadError(int i, String str, AdError adError);

    void onLoadFinish(int i, Object obj);

    void onLoadStart(int i);
}
