package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes4.dex */
public interface LifecycleFragment {
    void addCallback(String str, zap zapVar);

    zap getCallbackOrNull(Class cls, String str);

    Activity getLifecycleActivity();

    void startActivityForResult(Intent intent, int i);
}
