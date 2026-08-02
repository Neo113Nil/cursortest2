package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class pn5 implements uzm {
    public final /* synthetic */ int a;

    public /* synthetic */ pn5(int i) {
        this.a = i;
    }

    @Override // defpackage.uzm
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.a();
            case 2:
                brf brfVar = ExecutorsRegistrar.a;
                return new kw7(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new xx6("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                brf brfVar2 = ExecutorsRegistrar.a;
                return new kw7(Executors.newCachedThreadPool(new xx6("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                brf brfVar3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new xx6("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
