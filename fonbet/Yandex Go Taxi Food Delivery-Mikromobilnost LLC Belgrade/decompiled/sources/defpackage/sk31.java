package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;

/* loaded from: classes10.dex */
public class sk31 implements tsr {
    public ea20 a;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        Vibrator vibrator;
        if (Build.VERSION.SDK_INT < 31) {
            Context context = ssrVar.a;
            vibrator = (Vibrator) context.getSystemService(Vibrator.class);
            if (vibrator == null) {
                vibrator = (Vibrator) context.getSystemService("vibrator");
            }
        } else {
            try {
                vibrator = a82.h(ssrVar.a.getSystemService("vibrator_manager")).getDefaultVibrator();
            } catch (NoClassDefFoundError | NoSuchMethodError unused) {
                Context context2 = ssrVar.a;
                vibrator = (Vibrator) context2.getSystemService(Vibrator.class);
                if (vibrator == null) {
                    vibrator = (Vibrator) context2.getSystemService("vibrator");
                }
            }
        }
        wpy0 wpy0Var = new wpy0(26, new eg01(vibrator));
        ea20 ea20Var = new ea20(ssrVar.c, "vibration");
        this.a = ea20Var;
        ea20Var.b(wpy0Var);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        this.a.b(null);
        this.a = null;
    }
}
