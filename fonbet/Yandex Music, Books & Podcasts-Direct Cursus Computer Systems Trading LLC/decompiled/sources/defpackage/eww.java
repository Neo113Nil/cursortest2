package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class eww {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ BasePendingResult b;
    public final /* synthetic */ Object c;

    public eww(apo apoVar, BasePendingResult basePendingResult) {
        this.c = apoVar;
        this.b = basePendingResult;
    }

    public final void a(Status status) {
        switch (this.a) {
            case 0:
                ((Map) ((apo) this.c).b).remove(this.b);
                break;
            default:
                if (!status.d()) {
                    ((i8s) this.c).a(n7w.K(status));
                    break;
                } else {
                    BasePendingResult basePendingResult = this.b;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    y1g.I("Result has already been consumed.", !basePendingResult.j);
                    try {
                        if (!basePendingResult.d.await(0L, timeUnit)) {
                            basePendingResult.d(Status.h);
                        }
                    } catch (InterruptedException unused) {
                        basePendingResult.d(Status.f);
                    }
                    y1g.I("Result is not ready.", basePendingResult.e());
                    basePendingResult.i();
                    ((i8s) this.c).b(null);
                    break;
                }
        }
    }

    public eww(BasePendingResult basePendingResult, i8s i8sVar, t7l t7lVar) {
        this.b = basePendingResult;
        this.c = i8sVar;
    }
}
