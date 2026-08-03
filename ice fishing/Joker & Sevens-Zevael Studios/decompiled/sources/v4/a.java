package v4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.w;
import o4.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: f, reason: collision with root package name */
    public final w f7209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7210g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, a5.c cVar, int i10) {
        super(context, cVar);
        this.f7210g = i10;
        this.f7209f = new w(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // v4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        switch (this.f7210g) {
            case 0:
                Intent registerReceiver = this.f7215b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    o.d().b(b.f7211a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Intent registerReceiver2 = this.f7215b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    o.d().b(c.f7212a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = registerReceiver2.getIntExtra("status", -1);
                float intExtra3 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                boolean z10 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                Intent registerReceiver3 = this.f7215b.registerReceiver(null, f());
                boolean z11 = true;
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (hashCode == -730838620) {
                            break;
                        }
                    }
                    z11 = false;
                }
                return Boolean.valueOf(z11);
        }
    }

    @Override // v4.e
    public final void d() {
        o.d().a(d.f7213a, getClass().getSimpleName().concat(": registering receiver"));
        this.f7215b.registerReceiver(this.f7209f, f());
    }

    @Override // v4.e
    public final void e() {
        o.d().a(d.f7213a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f7215b.unregisterReceiver(this.f7209f);
    }

    public final IntentFilter f() {
        switch (this.f7210g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
