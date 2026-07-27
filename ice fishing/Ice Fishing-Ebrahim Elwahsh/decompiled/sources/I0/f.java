package I0;

import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1227b;

    public /* synthetic */ f(int i, Object obj) {
        this.f1226a = i;
        this.f1227b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1226a) {
            case 0:
                return new g((JsReplyProxyBoundaryInterface) this.f1227b);
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) ((h4.c) this.f1227b).f38233u;
                Long g9 = workDatabase.l().g("next_alarm_manager_id");
                int longValue = g9 != null ? (int) g9.longValue() : 0;
                workDatabase.l().i(new S0.d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
            default:
                return X0.m.d(null, (ByteArrayInputStream) this.f1227b);
        }
    }
}
