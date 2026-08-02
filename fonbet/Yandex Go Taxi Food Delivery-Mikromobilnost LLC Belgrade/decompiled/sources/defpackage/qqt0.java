package defpackage;

import android.content.Context;
import android.os.Vibrator;
import android.os.VibratorManager;

/* loaded from: classes8.dex */
public final class qqt0 {
    public final as21 a;
    public final qmp b;
    public final boolean c;

    public qqt0(as21 as21Var, qmp qmpVar, Context context) {
        Vibrator vibrator;
        this.a = as21Var;
        this.b = qmpVar;
        Vibrator vibrator2 = null;
        if (qke.s == null) {
            if (jx81.e()) {
                VibratorManager h = a82.h(context.getSystemService("vibrator_manager"));
                vibrator = h != null ? h.getDefaultVibrator() : null;
            } else {
                vibrator = (Vibrator) context.getSystemService("vibrator");
            }
            qke.s = vibrator;
        }
        Vibrator vibrator3 = qke.s;
        if (vibrator3 != null && vibrator3.hasVibrator()) {
            vibrator2 = qke.s;
        }
        this.c = vibrator2 != null && vibrator2.hasAmplitudeControl();
    }

    public final boolean a() {
        this.b.getClass();
        return this.a.a("FILED_SPLASH_HAPTIC_ENABLED", true);
    }
}
