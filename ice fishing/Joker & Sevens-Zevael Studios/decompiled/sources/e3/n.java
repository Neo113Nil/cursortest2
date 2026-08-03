package e3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.ExecutionException;
import o4.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2100g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2101h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2102i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2103j;

    public /* synthetic */ n(int i10) {
        this.f2100g = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        switch (this.f2100g) {
            case 0:
                try {
                    obj = ((f) this.f2101h).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f2103j).post(new dd.i(2, (g) this.f2102i, obj, false));
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                try {
                    z10 = ((Boolean) ((h7.a) this.f2103j).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                    z10 = true;
                }
                ((p4.e) this.f2101h).b((x4.j) this.f2102i, z10);
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f2103j;
                Context context = (Context) this.f2102i;
                Intent intent = (Intent) this.f2101h;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    o.d().a(ConstraintProxyUpdateReceiver.f771a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    y4.j.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    y4.j.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    y4.j.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    y4.j.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            default:
                ((p4.n) this.f2101h).f5498f.h((p4.i) this.f2102i, (a5.c) this.f2103j);
                return;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i10) {
        this.f2100g = i10;
        this.f2101h = obj;
        this.f2102i = obj2;
        this.f2103j = obj3;
    }
}
