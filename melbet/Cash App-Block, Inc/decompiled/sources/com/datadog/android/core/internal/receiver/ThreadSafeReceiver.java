package com.datadog.android.core.internal.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class ThreadSafeReceiver extends BroadcastReceiver {
    public final BuildSdkVersionProvider buildSdkVersionProvider;
    public final AtomicBoolean isRegistered;

    public ThreadSafeReceiver() {
        BuildSdkVersionProvider.Companion.getClass();
        this.buildSdkVersionProvider = BuildSdkVersionProvider.Companion.DEFAULT;
        this.isRegistered = new AtomicBoolean(false);
    }

    public final Intent registerReceiver(Context context, IntentFilter intentFilter) {
        context.getClass();
        BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = (BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider;
        Intent registerReceiver = buildSdkVersionProvider$Companion$DEFAULT$1.isAtLeastTiramisu ? context.registerReceiver(this, intentFilter, 4) : buildSdkVersionProvider$Companion$DEFAULT$1.isAtLeastO ? context.registerReceiver(this, intentFilter, 4) : context.registerReceiver(this, intentFilter);
        this.isRegistered.set(true);
        return registerReceiver;
    }
}
