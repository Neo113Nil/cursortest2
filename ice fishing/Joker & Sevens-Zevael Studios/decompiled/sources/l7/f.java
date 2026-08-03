package l7;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements w7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4222a;

    @Override // w7.a
    public final Object get() {
        switch (this.f4222a) {
            case 0:
                return Collections.EMPTY_SET;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return null;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                n nVar = ExecutorsRegistrar.f1451a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new m7.f(Executors.newFixedThreadPool(4, new m7.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f1454d.get());
            case 3:
                n nVar2 = ExecutorsRegistrar.f1451a;
                return new m7.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new m7.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f1454d.get());
            case 4:
                n nVar3 = ExecutorsRegistrar.f1451a;
                return new m7.f(Executors.newCachedThreadPool(new m7.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f1454d.get());
            default:
                n nVar4 = ExecutorsRegistrar.f1451a;
                return Executors.newSingleThreadScheduledExecutor(new m7.a("Firebase Scheduler", 0, null));
        }
    }
}
