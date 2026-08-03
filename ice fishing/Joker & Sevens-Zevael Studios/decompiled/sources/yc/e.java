package yc;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8841a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8842b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f8841a = i10;
        this.f8842b = obj;
    }

    public final String toString() {
        switch (this.f8841a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f8842b) + ']';
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "CancelHandler.UserSupplied[" + ((oc.c) this.f8842b).getClass().getSimpleName() + '@' + a0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((k0) this.f8842b) + ']';
        }
    }
}
