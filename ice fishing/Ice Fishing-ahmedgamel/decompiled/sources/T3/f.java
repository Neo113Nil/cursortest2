package T3;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import e4.InterfaceC4481a;
import i1.C4586c;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC4481a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3178a;

    public /* synthetic */ f(int i) {
        this.f3178a = i;
    }

    @Override // e4.InterfaceC4481a
    public final Object get() {
        switch (this.f3178a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                n nVar = ExecutorsRegistrar.f36950a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new U3.f(Executors.newFixedThreadPool(4, new U3.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f36953d.get());
            case 3:
                n nVar2 = ExecutorsRegistrar.f36950a;
                return new U3.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new U3.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f36953d.get());
            case 4:
                n nVar3 = ExecutorsRegistrar.f36950a;
                return new U3.f(Executors.newCachedThreadPool(new U3.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f36953d.get());
            case 5:
                n nVar4 = ExecutorsRegistrar.f36950a;
                return Executors.newSingleThreadScheduledExecutor(new U3.a("Firebase Scheduler", 0, null));
            default:
                C4586c c4586c = FirebaseMessaging.f36957k;
                return null;
        }
    }
}
