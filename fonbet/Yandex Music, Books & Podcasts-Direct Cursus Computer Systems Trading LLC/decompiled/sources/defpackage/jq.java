package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.Logger;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import io.appmetrica.analytics.impl.C0678u0;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.music.YMApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class jq implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ jq(y7l y7lVar) {
        this.a = 4;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 1:
                ctm.i.f.a(yyf.a);
                break;
            case 2:
                Logger.lambda$out$1();
                break;
            case 3:
                Logger.lambda$clear$0();
                break;
            case 4:
            case 5:
                break;
            case 6:
                ju0 ju0Var = YMApplication.d;
                lbr.a();
                break;
            case 7:
                ju0 ju0Var2 = YMApplication.d;
                lbr.a();
                AtomicReference atomicReference = lbr.a;
                gcr gcrVar = gcr.b;
                gcr gcrVar2 = gcr.c;
                while (!atomicReference.compareAndSet(gcrVar, gcrVar2)) {
                    if (atomicReference.get() != gcrVar) {
                        break;
                    }
                }
                lbr.b();
                break;
            default:
                C0678u0.e();
                break;
        }
    }

    public /* synthetic */ jq(int i) {
        this.a = i;
    }
}
