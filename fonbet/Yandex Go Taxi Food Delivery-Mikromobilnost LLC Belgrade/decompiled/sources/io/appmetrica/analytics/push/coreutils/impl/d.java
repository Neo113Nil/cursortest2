package io.appmetrica.analytics.push.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.commands.Commands;
import io.appmetrica.analytics.push.coreutils.internal.service.PushServiceCommandLauncher;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;

/* loaded from: classes4.dex */
public final class d implements PushServiceCommandLauncher {
    public final Context a;

    public d(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.service.PushServiceCommandLauncher
    public final void launchService(Bundle bundle) {
        try {
            this.a.startService(new Intent().setComponent(new ComponentName(this.a.getPackageName(), "io.appmetrica.analytics.push.internal.service.PushService")).setAction("io.appmetrica.analytics.push.configuration.ACTION_SERVICE_START").putExtras(bundle));
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Launching service for command " + bundle.getString(Commands.EXTRA_COMMAND) + " failed", th);
        }
    }
}
