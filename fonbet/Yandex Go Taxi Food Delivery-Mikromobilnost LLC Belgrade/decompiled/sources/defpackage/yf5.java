package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import com.adjust.sdk.Constants;
import defpackage.xeo;
import defpackage.yf5;
import dev.fluttercommunity.plus.battery.BatteryPlusPlugin$createChargingStateChangeReceiver$1;
import java.util.Locale;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes4.dex */
public final class yf5 implements ca20, zeo, tsr {
    public Context a;
    public BatteryPlusPlugin$createChargingStateChangeReceiver$1 b;
    public ea20 c;
    public afo w;

    public static String b(int i) {
        if (i == 1) {
            return "unknown";
        }
        if (i == 2) {
            return "charging";
        }
        if (i == 3) {
            return "discharging";
        }
        if (i == 4) {
            return "connected_not_charging";
        }
        if (i != 5) {
            return null;
        }
        return "full";
    }

    public final boolean a() {
        return ((PowerManager) this.a.getSystemService("power")).isPowerSaveMode();
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.a = ssrVar.a;
        tt5 tt5Var = ssrVar.c;
        this.c = new ea20(tt5Var, "dev.fluttercommunity.plus/battery");
        afo afoVar = new afo(tt5Var, "dev.fluttercommunity.plus/charging");
        this.w = afoVar;
        afoVar.a(this);
        this.c.b(this);
    }

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        this.a.unregisterReceiver(this.b);
        this.b = null;
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        this.a = null;
        this.c.b(null);
        this.c = null;
        this.w.a(null);
        this.w = null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.BroadcastReceiver, dev.fluttercommunity.plus.battery.BatteryPlusPlugin$createChargingStateChangeReceiver$1] */
    @Override // defpackage.zeo
    public final void onListen(Object obj, final xeo xeoVar) {
        ?? r4 = new BroadcastReceiver() { // from class: dev.fluttercommunity.plus.battery.BatteryPlusPlugin$createChargingStateChangeReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra(ACSPConstants.STATUS, -1);
                yf5 yf5Var = yf5.this;
                xeo xeoVar2 = xeoVar;
                yf5Var.getClass();
                String b = yf5.b(intExtra);
                if (b != null) {
                    xeoVar2.success(b);
                } else {
                    xeoVar2.error("UNAVAILABLE", "Charging status unavailable", null);
                }
            }
        };
        this.b = r4;
        Context context = this.a;
        if (context != null) {
            qke.z(context, r4, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 4);
        }
        String b = b(((BatteryManager) this.a.getSystemService("batterymanager")).getIntProperty(6));
        if (b != null) {
            ((yeo) xeoVar).success(b);
        } else {
            ((yeo) xeoVar).error("UNAVAILABLE", "Charging status unavailable", null);
        }
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Boolean valueOf;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -82096147) {
                if (hashCode != -75204358) {
                    if (hashCode == 144057854 && str.equals("isInBatterySaveMode")) {
                        String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.getDefault());
                        int hashCode2 = lowerCase.hashCode();
                        boolean z = false;
                        if (hashCode2 == -1206476313) {
                            if (lowerCase.equals("huawei")) {
                                int i = Settings.System.getInt(this.a.getContentResolver(), "SmartModeStatus", -1);
                                if (i == -1) {
                                    z = a();
                                } else if (i == 4) {
                                    z = true;
                                }
                                valueOf = Boolean.valueOf(z);
                            }
                            valueOf = Boolean.valueOf(a());
                        } else if (hashCode2 != -759499589) {
                            if (hashCode2 == 1864941562 && lowerCase.equals(Constants.REFERRER_API_SAMSUNG)) {
                                String string = Build.VERSION.SDK_INT < 31 ? Settings.System.getString(this.a.getContentResolver(), "psm_switch") : null;
                                valueOf = Boolean.valueOf(string == null ? a() : string.equals("1"));
                            }
                            valueOf = Boolean.valueOf(a());
                        } else {
                            if (lowerCase.equals(Constants.REFERRER_API_XIAOMI)) {
                                int i2 = Settings.System.getInt(this.a.getContentResolver(), "POWER_SAVE_MODE_OPEN", -1);
                                if (i2 == -1) {
                                    z = a();
                                } else if (i2 == 1) {
                                    z = true;
                                }
                                valueOf = Boolean.valueOf(z);
                            }
                            valueOf = Boolean.valueOf(a());
                        }
                        ((ba20) da20Var).success(valueOf);
                        return;
                    }
                } else if (str.equals("getBatteryState")) {
                    String b = b(((BatteryManager) this.a.getSystemService("batterymanager")).getIntProperty(6));
                    if (b != null) {
                        ((ba20) da20Var).success(b);
                        return;
                    } else {
                        ((ba20) da20Var).error("UNAVAILABLE", "Charging status not available.", null);
                        return;
                    }
                }
            } else if (str.equals("getBatteryLevel")) {
                int intProperty = ((BatteryManager) this.a.getSystemService("batterymanager")).getIntProperty(4);
                if (intProperty != -1) {
                    ((ba20) da20Var).success(Integer.valueOf(intProperty));
                    return;
                } else {
                    ((ba20) da20Var).error("UNAVAILABLE", "Battery level not available.", null);
                    return;
                }
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
