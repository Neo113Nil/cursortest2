package I0;

import androidx.work.impl.WorkDatabase;
import g1.C4522b;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1258b;

    public /* synthetic */ f(int i, Object obj) {
        this.f1257a = i;
        this.f1258b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1257a) {
            case 0:
                return new g((JsReplyProxyBoundaryInterface) this.f1258b);
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) ((C4522b) this.f1258b).f37625u;
                Long j6 = workDatabase.l().j("next_alarm_manager_id");
                int longValue = j6 != null ? (int) j6.longValue() : 0;
                workDatabase.l().k(new S0.d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
            default:
                return X0.m.d(null, (ByteArrayInputStream) this.f1258b);
        }
    }
}
