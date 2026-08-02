package io.appmetrica.analytics.push.coreutils.internal;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.service.PushServiceControllerProvider;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/CommandServiceWrapper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "bundle", "", "needService", "Lzy11;", "startCommand", "(Landroid/content/Context;Landroid/os/Bundle;Z)V", "Lio/appmetrica/analytics/push/coreutils/internal/service/PushServiceControllerProvider;", "provider", "setPushServiceControllerProvider", "(Lio/appmetrica/analytics/push/coreutils/internal/service/PushServiceControllerProvider;)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes9.dex */
public final class CommandServiceWrapper {
    private PushServiceControllerProvider a;

    public static /* synthetic */ void startCommand$default(CommandServiceWrapper commandServiceWrapper, Context context, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        commandServiceWrapper.startCommand(context, bundle, z);
    }

    public final void setPushServiceControllerProvider(PushServiceControllerProvider provider) {
        this.a = provider;
    }

    public final void startCommand(Context context, Bundle bundle, boolean needService) {
        PushServiceControllerProvider pushServiceControllerProvider;
        try {
            synchronized (this) {
                pushServiceControllerProvider = this.a;
                if (pushServiceControllerProvider == null) {
                    pushServiceControllerProvider = new PushServiceControllerProvider(context);
                    this.a = pushServiceControllerProvider;
                }
            }
            pushServiceControllerProvider.getPushServiceCommandLauncher(needService).launchService(bundle);
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Start failed", th);
        }
    }
}
