package com.datadog.android.api.feature;

import android.content.Context;

/* loaded from: classes4.dex */
public interface Feature {
    String getName();

    void onInitialize(Context context);

    void onStop();
}
