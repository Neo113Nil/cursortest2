package R3;

import android.os.Build;
import android.os.StrictMode;
import c4.InterfaceC0542a;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import g1.C4523c;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC0542a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2723a;

    public /* synthetic */ f(int i) {
        this.f2723a = i;
    }

    @Override // c4.InterfaceC0542a
    public final Object get() {
        switch (this.f2723a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                n nVar = ExecutorsRegistrar.f36183a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new S3.f(Executors.newFixedThreadPool(4, new S3.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f36186d.get());
            case 3:
                n nVar2 = ExecutorsRegistrar.f36183a;
                return new S3.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new S3.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f36186d.get());
            case 4:
                n nVar3 = ExecutorsRegistrar.f36183a;
                return new S3.f(Executors.newCachedThreadPool(new S3.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f36186d.get());
            case 5:
                n nVar4 = ExecutorsRegistrar.f36183a;
                return Executors.newSingleThreadScheduledExecutor(new S3.a("Firebase Scheduler", 0, null));
            default:
                C4523c c4523c = FirebaseMessaging.f36190k;
                return null;
        }
    }
}
