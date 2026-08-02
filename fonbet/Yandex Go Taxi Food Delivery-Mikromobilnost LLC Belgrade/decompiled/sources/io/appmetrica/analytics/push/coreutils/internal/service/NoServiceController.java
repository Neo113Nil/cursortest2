package io.appmetrica.analytics.push.coreutils.internal.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.commands.Commands;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.internal.service.FakeService;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/service/NoServiceController;", "Lio/appmetrica/analytics/push/coreutils/internal/service/PushServiceCommandLauncher;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "extras", "Lzy11;", "launchService", "(Landroid/os/Bundle;)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes9.dex */
public final class NoServiceController implements PushServiceCommandLauncher {
    private final Context a;

    public NoServiceController(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.service.PushServiceCommandLauncher
    public void launchService(Bundle extras) {
        Intent putExtras = new Intent().setComponent(new ComponentName(this.a.getPackageName(), "io.appmetrica.analytics.push.internal.service.FakeService")).putExtras(extras);
        try {
            FakeService fakeService = FakeService.INSTANCE;
            FakeService.class.getMethod("onStartCommand", Context.class, Intent.class).invoke(null, this.a, putExtras);
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Calling FakeService for command " + extras.getString(Commands.EXTRA_COMMAND) + " failed", th);
        }
    }
}
