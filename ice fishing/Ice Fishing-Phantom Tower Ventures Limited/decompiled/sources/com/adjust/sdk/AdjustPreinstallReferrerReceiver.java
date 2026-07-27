package com.adjust.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class AdjustPreinstallReferrerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra(Constants.EXTRA_SYSTEM_INSTALLER_REFERRER)) == null) {
            return;
        }
        Adjust.getDefaultInstance().sendPreinstallReferrer(stringExtra, context);
    }
}
