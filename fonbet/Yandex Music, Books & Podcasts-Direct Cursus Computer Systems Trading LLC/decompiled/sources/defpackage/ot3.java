package defpackage;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class ot3 implements pt3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ot3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pt3
    public final void b(Throwable th) {
        switch (this.a) {
            case 0:
                ((ScheduledFuture) this.b).cancel(false);
                break;
            case 1:
                ((Function1) this.b).invoke(th);
                break;
            default:
                ((qa8) this.b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.b).getClass().getSimpleName() + '@' + ff7.B(this) + ']';
            default:
                return "DisposeOnCancel[" + ((qa8) this.b) + ']';
        }
    }
}
