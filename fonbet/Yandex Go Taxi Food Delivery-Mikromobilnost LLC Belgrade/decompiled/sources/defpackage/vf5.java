package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes.dex */
public final class vf5 extends cl6 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf5(Context context, t951 t951Var, int i) {
        super(context, t951Var);
        this.g = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r9.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // defpackage.e8e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        String str;
        String str2;
        int i = this.g;
        Context context = this.b;
        boolean z = true;
        switch (i) {
            case 0:
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    hgz g = hgz.g();
                    str = wf5.a;
                    g.e(str, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra(ACSPConstants.STATUS, -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    hgz g2 = hgz.g();
                    str2 = xf5.a;
                    g2.e(str2, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                float intExtra2 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                if (registerReceiver2.getIntExtra(ACSPConstants.STATUS, -1) != 1 && intExtra2 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent registerReceiver3 = context.registerReceiver(null, e());
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
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.cl6
    public final IntentFilter e() {
        switch (this.g) {
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.cl6
    public final void f(Intent intent) {
        switch (this.g) {
            case 0:
                String action = intent.getAction();
                if (action != null) {
                    hgz g = hgz.g();
                    String str = wf5.a;
                    g.getClass();
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                b(Boolean.FALSE);
                                break;
                            }
                            break;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                b(Boolean.FALSE);
                                break;
                            }
                            break;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                b(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                b(Boolean.TRUE);
                                break;
                            }
                            break;
                    }
                }
                break;
            case 1:
                if (intent.getAction() != null) {
                    hgz g2 = hgz.g();
                    String str2 = xf5.a;
                    intent.getAction();
                    g2.getClass();
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int hashCode = action2.hashCode();
                        if (hashCode == -1980154005) {
                            if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                b(Boolean.TRUE);
                                break;
                            }
                        } else if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                            b(Boolean.FALSE);
                            break;
                        }
                    }
                }
                break;
            default:
                if (intent.getAction() != null) {
                    hgz g3 = hgz.g();
                    int i = fju0.a;
                    intent.getAction();
                    g3.getClass();
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        int hashCode2 = action3.hashCode();
                        if (hashCode2 == -1181163412) {
                            if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                b(Boolean.FALSE);
                                break;
                            }
                        } else if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                            b(Boolean.TRUE);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
