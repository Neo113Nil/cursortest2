package a5;

import android.os.Handler;
import android.os.Looper;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import m7.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f259g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f260h;

    public /* synthetic */ b(int i10, Object obj) {
        this.f259g = i10;
        this.f260h = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f259g) {
            case 0:
                ((Handler) ((c) this.f260h).f261g).post(runnable);
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Handler handler = (Handler) this.f260h;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((a7.c) this.f260h).post(runnable);
                return;
            default:
                ((Executor) this.f260h).execute(new j(runnable, 2));
                return;
        }
    }

    public b() {
        this.f259g = 2;
        a7.c cVar = new a7.c(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f260h = cVar;
    }
}
