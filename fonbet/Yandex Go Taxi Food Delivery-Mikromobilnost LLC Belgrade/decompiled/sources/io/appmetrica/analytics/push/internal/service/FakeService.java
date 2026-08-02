package io.appmetrica.analytics.push.internal.service;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.push.coreutils.internal.commands.Commands;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.impl.D;
import io.appmetrica.analytics.push.impl.E;
import io.appmetrica.analytics.push.impl.G;
import io.appmetrica.analytics.push.impl.H2;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/push/internal/service/FakeService;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onStartCommand", "(Landroid/content/Context;Landroid/content/Intent;)V", "push_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class FakeService {
    public static final FakeService INSTANCE = new FakeService();
    private static final E a = new E();
    private static final ExecutorService b = Executors.newSingleThreadExecutor();

    private FakeService() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(D d, Context context, Intent intent) {
        d.a(context, intent.getExtras());
    }

    public static final void onStartCommand(final Context context, final Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(Commands.EXTRA_COMMAND);
            G.a(stringExtra, intent.getLongExtra(Commands.EXTRA_COMMAND_RECEIVED_TIME, -1L), H2.a(intent.getExtras()), "FakeService");
            final D d = (D) a.a.get(stringExtra);
            if (d != null) {
                b.execute(new Runnable() { // from class: io.appmetrica.analytics.push.internal.service.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        FakeService.a(D.this, context, intent);
                    }
                });
            }
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle command ", th);
            PublicLogger.INSTANCE.error(th, "An unexpected error occurred while running the AppMetrica Push SDK. You can report it via https://appmetrica.io/docs/troubleshooting/other.html", new Object[0]);
        }
    }
}
