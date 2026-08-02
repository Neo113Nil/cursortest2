package I0;

import androidx.work.impl.WorkDatabase;
import i1.C4586c;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1283b;

    public /* synthetic */ f(int i, Object obj) {
        this.f1282a = i;
        this.f1283b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1282a) {
            case 0:
                return new g((JsReplyProxyBoundaryInterface) this.f1283b);
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) ((C4586c) this.f1283b).f38154u;
                Long y7 = workDatabase.l().y("next_alarm_manager_id");
                int longValue = y7 != null ? (int) y7.longValue() : 0;
                workDatabase.l().B(new S0.d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
            default:
                return Z0.m.d(null, (ByteArrayInputStream) this.f1283b);
        }
    }
}
