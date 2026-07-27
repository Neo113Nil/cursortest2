package Q0;

import J0.s;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: f, reason: collision with root package name */
    public final d f2624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2625g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Z2.e eVar, int i) {
        super(context, eVar);
        this.f2625g = i;
        this.f2624f = new d(0, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // Q0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        switch (this.f2625g) {
            case 0:
                Intent registerReceiver = this.f2632b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    s.d().b(b.f2626a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent registerReceiver2 = this.f2632b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    s.d().b(c.f2627a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = registerReceiver2.getIntExtra("status", -1);
                float intExtra3 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                boolean z3 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                Intent registerReceiver3 = this.f2632b.registerReceiver(null, f());
                boolean z6 = true;
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
                    z6 = false;
                }
                return Boolean.valueOf(z6);
        }
    }

    @Override // Q0.f
    public final void d() {
        s.d().a(e.f2630a, getClass().getSimpleName().concat(": registering receiver"));
        this.f2632b.registerReceiver(this.f2624f, f());
    }

    @Override // Q0.f
    public final void e() {
        s.d().a(e.f2630a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f2632b.unregisterReceiver(this.f2624f);
    }

    public final IntentFilter f() {
        switch (this.f2625g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
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
